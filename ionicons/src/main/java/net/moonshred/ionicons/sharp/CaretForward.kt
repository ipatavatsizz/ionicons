package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CaretForward: ImageVector
  get() {
    if (_CaretForwardSharp != null) {
      return _CaretForwardSharp!!
    }
    _CaretForwardSharp = ImageVector.Builder(
      name = "Sharp.CaretForwardSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(144f, 448f)
        lineToRelative(224f, -192f)
        lineToRelative(-224f, -192f)
        lineToRelative(0f, 384f)
        close()
      }
    }.build()

    return _CaretForwardSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CaretForwardSharp: ImageVector? = null
