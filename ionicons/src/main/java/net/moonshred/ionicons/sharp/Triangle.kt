package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Triangle: ImageVector
  get() {
    if (_TriangleSharp != null) {
      return _TriangleSharp!!
    }
    _TriangleSharp = ImageVector.Builder(
      name = "Sharp.TriangleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 32f)
        lineToRelative(-236f, 432f)
        lineToRelative(472f, 0f)
        lineToRelative(-236f, -432f)
        close()
      }
    }.build()

    return _TriangleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TriangleSharp: ImageVector? = null
