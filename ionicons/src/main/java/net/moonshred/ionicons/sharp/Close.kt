package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Close: ImageVector
  get() {
    if (_CloseSharp != null) {
      return _CloseSharp!!
    }
    _CloseSharp = ImageVector.Builder(
      name = "Sharp.CloseSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(400f, 145.49f)
        lineToRelative(-33.49f, -33.49f)
        lineToRelative(-110.51f, 110.51f)
        lineToRelative(-110.51f, -110.51f)
        lineToRelative(-33.49f, 33.49f)
        lineToRelative(110.51f, 110.51f)
        lineToRelative(-110.51f, 110.51f)
        lineToRelative(33.49f, 33.49f)
        lineToRelative(110.51f, -110.51f)
        lineToRelative(110.51f, 110.51f)
        lineToRelative(33.49f, -33.49f)
        lineToRelative(-110.51f, -110.51f)
        lineToRelative(110.51f, -110.51f)
        close()
      }
    }.build()

    return _CloseSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CloseSharp: ImageVector? = null
