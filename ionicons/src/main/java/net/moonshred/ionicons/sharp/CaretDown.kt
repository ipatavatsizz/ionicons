package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CaretDown: ImageVector
  get() {
    if (_CaretDownSharp != null) {
      return _CaretDownSharp!!
    }
    _CaretDownSharp = ImageVector.Builder(
      name = "Sharp.CaretDownSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(64f, 144f)
        lineToRelative(192f, 224f)
        lineToRelative(192f, -224f)
        lineToRelative(-384f, 0f)
        close()
      }
    }.build()

    return _CaretDownSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CaretDownSharp: ImageVector? = null
