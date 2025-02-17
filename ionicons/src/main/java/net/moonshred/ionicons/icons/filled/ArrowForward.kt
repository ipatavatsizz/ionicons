package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.ArrowForward: ImageVector
  get() {
    if (_ArrowForward != null) {
      return _ArrowForward!!
    }
    _ArrowForward = ImageVector.Builder(
      name = "Filled.ArrowForward",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(268f, 112f)
        lineToRelative(144f, 144f)
        lineToRelative(-144f, 144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(392f, 256f)
        lineTo(100f, 256f)
      }
    }.build()

    return _ArrowForward!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowForward: ImageVector? = null
