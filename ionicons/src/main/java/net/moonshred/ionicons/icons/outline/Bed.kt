package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Bed: ImageVector
  get() {
    if (_BedOutline != null) {
      return _BedOutline!!
    }
    _BedOutline = ImageVector.Builder(
      name = "Outline.BedOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(384f, 240f)
        horizontalLineTo(96f)
        verticalLineTo(136f)
        arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, -40f)
        horizontalLineTo(376f)
        arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
        verticalLineTo(240f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 416f)
        verticalLineTo(304f)
        arcToRelative(64.19f, 64.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, -64f)
        horizontalLineTo(400f)
        arcToRelative(64.19f, 64.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
        verticalLineTo(416f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 416f)
        verticalLineToRelative(-8f)
        arcToRelative(24.07f, 24.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
        horizontalLineTo(440f)
        arcToRelative(24.07f, 24.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
        verticalLineToRelative(8f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 240f)
        verticalLineTo(224f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
        horizontalLineToRelative(80f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
        verticalLineToRelative(16f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 240f)
        verticalLineTo(224f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
        horizontalLineToRelative(80f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
        verticalLineToRelative(16f)
      }
    }.build()

    return _BedOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BedOutline: ImageVector? = null
