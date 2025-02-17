package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Stop: ImageVector
  get() {
    if (_StopSharp != null) {
      return _StopSharp!!
    }
    _StopSharp = ImageVector.Builder(
      name = "Sharp.StopSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(80f, 80f)
        horizontalLineToRelative(352f)
        verticalLineToRelative(352f)
        horizontalLineToRelative(-352f)
        close()
      }
    }.build()

    return _StopSharp!!
  }

@Suppress("ObjectPropertyName")
private var _StopSharp: ImageVector? = null
