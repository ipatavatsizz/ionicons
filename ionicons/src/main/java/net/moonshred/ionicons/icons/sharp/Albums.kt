package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Albums: ImageVector
  get() {
    if (_AlbumsSharp != null) {
      return _AlbumsSharp!!
    }
    _AlbumsSharp = ImageVector.Builder(
      name = "Sharp.AlbumsSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(128f, 64f)
        horizontalLineToRelative(256f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(96f, 112f)
        horizontalLineToRelative(320f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-320f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 448f)
        horizontalLineTo(48f)
        verticalLineTo(160f)
        horizontalLineTo(464f)
        close()
      }
    }.build()

    return _AlbumsSharp!!
  }

@Suppress("ObjectPropertyName")
private var _AlbumsSharp: ImageVector? = null
