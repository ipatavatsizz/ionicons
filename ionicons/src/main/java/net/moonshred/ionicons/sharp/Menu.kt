package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Menu: ImageVector
  get() {
    if (_MenuSharp != null) {
      return _MenuSharp!!
    }
    _MenuSharp = ImageVector.Builder(
      name = "Sharp.MenuSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(64f, 384f)
        lineTo(448f, 384f)
        lineTo(448f, 341.33f)
        lineTo(64f, 341.33f)
        close()
        moveTo(64f, 277.33f)
        lineTo(448f, 277.33f)
        lineTo(448f, 234.67f)
        lineTo(64f, 234.67f)
        close()
        moveTo(64f, 128f)
        verticalLineToRelative(42.67f)
        lineTo(448f, 170.67f)
        lineTo(448f, 128f)
        close()
      }
    }.build()

    return _MenuSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MenuSharp: ImageVector? = null
