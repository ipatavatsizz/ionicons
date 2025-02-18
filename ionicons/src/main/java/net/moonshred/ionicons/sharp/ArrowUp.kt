package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ArrowUp: ImageVector
  get() {
    if (_ArrowUpSharp != null) {
      return _ArrowUpSharp!!
    }
    _ArrowUpSharp = ImageVector.Builder(
      name = "Sharp.ArrowUpSharp",
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
        moveTo(112f, 244f)
        lineToRelative(144f, -144f)
        lineToRelative(144f, 144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(256f, 120f)
        lineTo(256f, 412f)
      }
    }.build()

    return _ArrowUpSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowUpSharp: ImageVector? = null
