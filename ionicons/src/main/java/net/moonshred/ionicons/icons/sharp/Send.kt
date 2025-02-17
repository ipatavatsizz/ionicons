package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Send: ImageVector
  get() {
    if (_SendSharp != null) {
      return _SendSharp!!
    }
    _SendSharp = ImageVector.Builder(
      name = "Sharp.SendSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(16f, 464f)
        lineTo(496f, 256f)
        lineTo(16f, 48f)
        verticalLineTo(208f)
        lineToRelative(320f, 48f)
        lineTo(16f, 304f)
        close()
      }
    }.build()

    return _SendSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SendSharp: ImageVector? = null
