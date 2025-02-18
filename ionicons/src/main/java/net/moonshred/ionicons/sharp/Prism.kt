package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Prism: ImageVector
  get() {
    if (_PrismSharp != null) {
      return _PrismSharp!!
    }
    _PrismSharp = ImageVector.Builder(
      name = "Sharp.PrismSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 16f)
        lineTo(16f, 352f)
        lineTo(256f, 496f)
        lineTo(496f, 352f)
        close()
        moveTo(236f, 112.82f)
        lineTo(236f, 437.35f)
        lineTo(73.73f, 340f)
        close()
      }
    }.build()

    return _PrismSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PrismSharp: ImageVector? = null
