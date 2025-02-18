package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.PaperPlane: ImageVector
  get() {
    if (_PaperPlaneSharp != null) {
      return _PaperPlaneSharp!!
    }
    _PaperPlaneSharp = ImageVector.Builder(
      name = "Sharp.PaperPlaneSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 16f)
        lineToRelative(-480.12f, 192f)
        lineToRelative(179.12f, 81f)
        lineToRelative(253f, -225f)
        lineToRelative(-225f, 253f)
        lineToRelative(81f, 179f)
        lineToRelative(192f, -480f)
        close()
      }
    }.build()

    return _PaperPlaneSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PaperPlaneSharp: ImageVector? = null
