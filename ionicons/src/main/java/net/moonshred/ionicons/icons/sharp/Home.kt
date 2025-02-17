package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Home: ImageVector
  get() {
    if (_HomeSharp != null) {
      return _HomeSharp!!
    }
    _HomeSharp = ImageVector.Builder(
      name = "Sharp.HomeSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 174.74f)
        lineToRelative(0f, -126.74f)
        lineToRelative(-80f, 0f)
        lineToRelative(0f, 58.45f)
        lineToRelative(-80f, -74.45f)
        lineToRelative(-256f, 240f)
        lineToRelative(64f, 0f)
        lineToRelative(0f, 208f)
        lineToRelative(144f, 0f)
        lineToRelative(0f, -160f)
        lineToRelative(96f, 0f)
        lineToRelative(0f, 160f)
        lineToRelative(144f, 0f)
        lineToRelative(0f, -208f)
        lineToRelative(64f, 0f)
        lineToRelative(-96f, -97.26f)
        close()
      }
    }.build()

    return _HomeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HomeSharp: ImageVector? = null
