package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Star: ImageVector
  get() {
    if (_StarSharp != null) {
      return _StarSharp!!
    }
    _StarSharp = ImageVector.Builder(
      name = "Sharp.StarSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 203.3f)
        horizontalLineTo(312.36f)
        lineTo(256f, 32f)
        lineTo(199.64f, 203.3f)
        horizontalLineTo(16f)
        lineTo(166.21f, 308.7f)
        lineTo(107.71f, 480f)
        lineTo(256f, 373.84f)
        lineTo(404.29f, 480f)
        lineTo(345.68f, 308.7f)
        close()
      }
    }.build()

    return _StarSharp!!
  }

@Suppress("ObjectPropertyName")
private var _StarSharp: ImageVector? = null
