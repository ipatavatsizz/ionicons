package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Flash: ImageVector
  get() {
    if (_FlashSharp != null) {
      return _FlashSharp!!
    }
    _FlashSharp = ImageVector.Builder(
      name = "Sharp.FlashSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(432f, 208f)
        horizontalLineTo(288f)
        lineTo(320f, 16f)
        lineTo(80f, 304f)
        horizontalLineTo(224f)
        lineTo(192f, 496f)
        close()
      }
    }.build()

    return _FlashSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FlashSharp: ImageVector? = null
