package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.TrailSign: ImageVector
  get() {
    if (_TrailSignOutline != null) {
      return _TrailSignOutline!!
    }
    _TrailSignOutline = ImageVector.Builder(
      name = "Outline.TrailSignOutline",
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
        moveTo(256f, 400f)
        lineTo(256f, 464f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 208f)
        lineTo(256f, 272f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 48f)
        lineTo(256f, 80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(416f, 208f)
        horizontalLineTo(102.63f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -4.69f)
        lineTo(32f, 144f)
        lineTo(91.31f, 84.69f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 102.63f, 80f)
        horizontalLineTo(416f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        verticalLineToRelative(96f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 208f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(96f, 400f)
        horizontalLineTo(409.37f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -4.69f)
        lineTo(480f, 336f)
        lineToRelative(-59.31f, -59.31f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 409.37f, 272f)
        horizontalLineTo(96f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        verticalLineToRelative(96f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 400f)
        close()
      }
    }.build()

    return _TrailSignOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TrailSignOutline: ImageVector? = null
