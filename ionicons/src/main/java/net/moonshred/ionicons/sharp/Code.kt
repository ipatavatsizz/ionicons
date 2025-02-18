package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Code: ImageVector
  get() {
    if (_CodeSharp != null) {
      return _CodeSharp!!
    }
    _CodeSharp = ImageVector.Builder(
      name = "Sharp.CodeSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(161.98f, 397.63f)
        lineToRelative(-161.98f, -141.63f)
        lineToRelative(161.98f, -141.63f)
        lineToRelative(27.65f, 31.61f)
        lineToRelative(-125.63f, 110.02f)
        lineToRelative(125.63f, 110.02f)
        lineToRelative(-27.65f, 31.61f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(350.02f, 397.63f)
        lineToRelative(-27.65f, -31.61f)
        lineToRelative(125.63f, -110.02f)
        lineToRelative(-125.63f, -110.02f)
        lineToRelative(27.65f, -31.61f)
        lineToRelative(161.98f, 141.63f)
        lineToRelative(-161.98f, 141.63f)
        close()
      }
    }.build()

    return _CodeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CodeSharp: ImageVector? = null
