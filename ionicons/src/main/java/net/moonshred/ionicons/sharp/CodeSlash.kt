package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CodeSlash: ImageVector
  get() {
    if (_CodeSlashSharp != null) {
      return _CodeSlashSharp!!
    }
    _CodeSlashSharp = ImageVector.Builder(
      name = "Sharp.CodeSlashSharp",
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
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(222.15f, 442f)
        lineToRelative(-40.15f, -11.92f)
        lineToRelative(107.85f, -360.08f)
        lineToRelative(40.15f, 11.92f)
        lineToRelative(-107.85f, 360.08f)
        close()
      }
    }.build()

    return _CodeSlashSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CodeSlashSharp: ImageVector? = null
