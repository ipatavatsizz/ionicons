package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Podium: ImageVector
  get() {
    if (_PodiumSharp != null) {
      return _PodiumSharp!!
    }
    _PodiumSharp = ImageVector.Builder(
      name = "Sharp.PodiumSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(160f, 32f)
        horizontalLineToRelative(192f)
        verticalLineToRelative(448f)
        horizontalLineToRelative(-192f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 192f)
        horizontalLineToRelative(112f)
        verticalLineToRelative(288f)
        horizontalLineToRelative(-112f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(16f, 128f)
        horizontalLineToRelative(112f)
        verticalLineToRelative(352f)
        horizontalLineToRelative(-112f)
        close()
      }
    }.build()

    return _PodiumSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PodiumSharp: ImageVector? = null
