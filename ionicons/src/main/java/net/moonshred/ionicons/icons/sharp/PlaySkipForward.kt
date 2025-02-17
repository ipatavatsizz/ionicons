package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.PlaySkipForward: ImageVector
  get() {
    if (_PlaySkipForwardSharp != null) {
      return _PlaySkipForwardSharp!!
    }
    _PlaySkipForwardSharp = ImageVector.Builder(
      name = "Sharp.PlaySkipForwardSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(368.53f, 64f)
        lineToRelative(0f, 163.52f)
        lineToRelative(-272.53f, -163.52f)
        lineToRelative(0f, 384f)
        lineToRelative(272.53f, -163.52f)
        lineToRelative(0f, 163.52f)
        lineToRelative(47.47f, 0f)
        lineToRelative(0f, -384f)
        lineToRelative(-47.47f, 0f)
        close()
      }
    }.build()

    return _PlaySkipForwardSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PlaySkipForwardSharp: ImageVector? = null
