package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ArrowDown: ImageVector
  get() {
    if (_ArrowDownSharp != null) {
      return _ArrowDownSharp!!
    }
    _ArrowDownSharp = ImageVector.Builder(
      name = "Sharp.ArrowDownSharp",
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
        moveTo(112f, 268f)
        lineToRelative(144f, 144f)
        lineToRelative(144f, -144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(256f, 392f)
        lineTo(256f, 100f)
      }
    }.build()

    return _ArrowDownSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowDownSharp: ImageVector? = null
