package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.School: ImageVector
  get() {
    if (_SchoolSharp != null) {
      return _SchoolSharp!!
    }
    _SchoolSharp = ImageVector.Builder(
      name = "Sharp.SchoolSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 370.43f)
        lineToRelative(-160f, -91.43f)
        lineToRelative(0f, 98.42f)
        lineToRelative(160f, 88.88f)
        lineToRelative(160f, -88.88f)
        lineToRelative(0f, -98.42f)
        lineToRelative(-160f, 91.43f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(512.25f, 192f)
        lineToRelative(-256.25f, -146.43f)
        lineToRelative(-256.25f, 146.43f)
        lineToRelative(256.25f, 146.43f)
        lineToRelative(208f, -118.86f)
        lineToRelative(0f, 164.43f)
        lineToRelative(48f, 0f)
        lineToRelative(0f, -191.86f)
        lineToRelative(0.25f, -0.14f)
        close()
      }
    }.build()

    return _SchoolSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SchoolSharp: ImageVector? = null
