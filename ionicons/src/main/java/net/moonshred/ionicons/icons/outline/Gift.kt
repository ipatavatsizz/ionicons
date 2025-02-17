package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Gift: ImageVector
  get() {
    if (_GiftOutline != null) {
      return _GiftOutline!!
    }
    _GiftOutline = ImageVector.Builder(
      name = "Outline.GiftOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(256f, 104f)
        verticalLineToRelative(56f)
        horizontalLineToRelative(56f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = false, -56f, -56f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(256f, 104f)
        curveToRelative(0f, 15.46f, 0f, 56f, 0f, 56f)
        horizontalLineTo(200f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, -56f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(96f, 160f)
        lineTo(416f, 160f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 448f, 192f)
        lineTo(448f, 240f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 272f)
        lineTo(96f, 272f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 240f)
        lineTo(64f, 192f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 160f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(416f, 272f)
        verticalLineTo(416f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 48f)
        horizontalLineTo(144f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
        verticalLineTo(272f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 160f)
        lineTo(256f, 464f)
      }
    }.build()

    return _GiftOutline!!
  }

@Suppress("ObjectPropertyName")
private var _GiftOutline: ImageVector? = null
