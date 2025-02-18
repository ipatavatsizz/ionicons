package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Open: ImageVector
  get() {
    if (_OpenSharp != null) {
      return _OpenSharp!!
    }
    _OpenSharp = ImageVector.Builder(
      name = "Sharp.OpenSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(201.37f, 288f)
        lineToRelative(176f, -176f)
        lineToRelative(-329.37f, 0f)
        lineToRelative(0f, 352f)
        lineToRelative(352f, 0f)
        lineToRelative(0f, -329.37f)
        lineToRelative(-176f, 176f)
        lineToRelative(-22.63f, -22.63f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(320f, 48f)
        lineToRelative(0f, 32f)
        lineToRelative(89.37f, 0f)
        lineToRelative(-32f, 32f)
        lineToRelative(22.63f, 22.63f)
        lineToRelative(32f, -32f)
        lineToRelative(0f, 89.37f)
        lineToRelative(32f, 0f)
        lineToRelative(0f, -144f)
        lineToRelative(-144f, 0f)
        close()
      }
    }.build()

    return _OpenSharp!!
  }

@Suppress("ObjectPropertyName")
private var _OpenSharp: ImageVector? = null
