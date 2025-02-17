package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Basketball: ImageVector
  get() {
    if (_BasketballOutline != null) {
      return _BasketballOutline!!
    }
    _BasketballOutline = ImageVector.Builder(
      name = "Outline.BasketballOutline",
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
        moveTo(256f, 256f)
        moveToRelative(-192f, 0f)
        arcToRelative(192f, 192f, 0f, isMoreThanHalf = true, isPositiveArc = true, 384f, 0f)
        arcToRelative(192f, 192f, 0f, isMoreThanHalf = true, isPositiveArc = true, -384f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(432.94f, 255.05f)
        arcTo(192f, 192f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256.63f, 74.35f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(255f, 433.61f)
        arcTo(192f, 192f, 0f, isMoreThanHalf = false, isPositiveArc = false, 74.29f, 256.69f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(120.24f, 120.24f)
        lineTo(391.76f, 391.76f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(120.24f, 391.76f)
        lineTo(391.76f, 120.24f)
      }
    }.build()

    return _BasketballOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BasketballOutline: ImageVector? = null
