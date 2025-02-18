package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.VolumeOff: ImageVector
  get() {
    if (_VolumeOffSharp != null) {
      return _VolumeOffSharp!!
    }
    _VolumeOffSharp = ImageVector.Builder(
      name = "Sharp.VolumeOffSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(237.65f, 176.1f)
        lineToRelative(-93.65f, 0f)
        lineToRelative(0f, 159.8f)
        lineToRelative(93.65f, 0f)
        lineToRelative(130.35f, 104.1f)
        lineToRelative(0f, -368f)
        lineToRelative(-130.35f, 104.1f)
        close()
      }
    }.build()

    return _VolumeOffSharp!!
  }

@Suppress("ObjectPropertyName")
private var _VolumeOffSharp: ImageVector? = null
