package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ChevronDown: ImageVector
  get() {
    if (_ChevronDownSharp != null) {
      return _ChevronDownSharp!!
    }
    _ChevronDownSharp = ImageVector.Builder(
      name = "Sharp.ChevronDownSharp",
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
        moveTo(112f, 184f)
        lineToRelative(144f, 144f)
        lineToRelative(144f, -144f)
      }
    }.build()

    return _ChevronDownSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronDownSharp: ImageVector? = null
