package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Play: ImageVector
  get() {
    if (_PlaySharp != null) {
      return _PlaySharp!!
    }
    _PlaySharp = ImageVector.Builder(
      name = "Sharp.PlaySharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(96f, 448f)
        lineToRelative(320f, -192f)
        lineToRelative(-320f, -192f)
        lineToRelative(0f, 384f)
        close()
      }
    }.build()

    return _PlaySharp!!
  }

@Suppress("ObjectPropertyName")
private var _PlaySharp: ImageVector? = null
