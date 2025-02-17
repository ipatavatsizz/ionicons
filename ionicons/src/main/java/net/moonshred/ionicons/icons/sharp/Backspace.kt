package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Backspace: ImageVector
  get() {
    if (_BackspaceSharp != null) {
      return _BackspaceSharp!!
    }
    _BackspaceSharp = ImageVector.Builder(
      name = "Sharp.BackspaceSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(144f, 96f)
        lineTo(32f, 256f)
        lineTo(144f, 416f)
        horizontalLineTo(448f)
        verticalLineTo(96f)
        close()
        moveTo(359.3f, 322.34f)
        lineTo(336.67f, 345f)
        lineToRelative(-65f, -65f)
        lineToRelative(-65f, 65f)
        lineTo(184f, 322.34f)
        lineToRelative(65f, -65f)
        lineToRelative(-65f, -65f)
        lineToRelative(22.63f, -22.63f)
        lineToRelative(65f, 65f)
        lineToRelative(65f, -65f)
        lineToRelative(22.63f, 22.63f)
        lineToRelative(-65f, 65f)
        close()
      }
    }.build()

    return _BackspaceSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BackspaceSharp: ImageVector? = null
