package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ArrowForward: ImageVector
  get() {
    if (_ArrowForwardSharp != null) {
      return _ArrowForwardSharp!!
    }
    _ArrowForwardSharp = ImageVector.Builder(
      name = "Sharp.ArrowForwardSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(268f, 112f)
        lineToRelative(144f, 144f)
        lineToRelative(-144f, 144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(392f, 256f)
        lineTo(100f, 256f)
      }
    }.build()

    return _ArrowForwardSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowForwardSharp: ImageVector? = null
