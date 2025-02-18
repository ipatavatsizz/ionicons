package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Pause: ImageVector
  get() {
    if (_PauseSharp != null) {
      return _PauseSharp!!
    }
    _PauseSharp = ImageVector.Builder(
      name = "Sharp.PauseSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(224f, 432f)
        horizontalLineTo(144f)
        verticalLineTo(80f)
        horizontalLineToRelative(80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(368f, 432f)
        horizontalLineTo(288f)
        verticalLineTo(80f)
        horizontalLineToRelative(80f)
        close()
      }
    }.build()

    return _PauseSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PauseSharp: ImageVector? = null
