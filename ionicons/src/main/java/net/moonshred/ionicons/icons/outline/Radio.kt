package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Radio: ImageVector
  get() {
    if (_RadioOutline != null) {
      return _RadioOutline!!
    }
    _RadioOutline = ImageVector.Builder(
      name = "Outline.RadioOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 256.02f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(184.25f, 192.25f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 127.52f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(327.77f, 319.77f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -127.52f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(133.28f, 141.28f)
        arcToRelative(168f, 168f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 229.44f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(378.72f, 370.72f)
        arcToRelative(168f, 168f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -229.44f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(435f, 416f)
        arcToRelative(
          240.34f,
          240.34f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0f,
          -320f
        )
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(77f, 96f)
        arcToRelative(240.34f, 240.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 320f)
      }
    }.build()

    return _RadioOutline!!
  }

@Suppress("ObjectPropertyName")
private var _RadioOutline: ImageVector? = null
