package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Film: ImageVector
  get() {
    if (_FilmSharp != null) {
      return _FilmSharp!!
    }
    _FilmSharp = ImageVector.Builder(
      name = "Sharp.FilmSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 80f)
        lineTo(32f, 80f)
        lineTo(32f, 432f)
        lineTo(480f, 432f)
        close()
        moveTo(112f, 352f)
        verticalLineToRelative(48f)
        lineTo(64f, 400f)
        lineTo(64f, 352f)
        close()
        moveTo(112f, 272f)
        verticalLineToRelative(48f)
        lineTo(64f, 320f)
        lineTo(64f, 272f)
        close()
        moveTo(112f, 192f)
        verticalLineToRelative(48f)
        lineTo(64f, 240f)
        lineTo(64f, 192f)
        close()
        moveTo(112f, 112f)
        verticalLineToRelative(48f)
        lineTo(64f, 160f)
        lineTo(64f, 112f)
        close()
        moveTo(368f, 272f)
        lineTo(144f, 272f)
        lineTo(144f, 240f)
        lineTo(368f, 240f)
        close()
        moveTo(448f, 352f)
        verticalLineToRelative(48f)
        lineTo(400f, 400f)
        lineTo(400f, 352f)
        close()
        moveTo(448f, 272f)
        verticalLineToRelative(48f)
        lineTo(400f, 320f)
        lineTo(400f, 272f)
        close()
        moveTo(448f, 192f)
        verticalLineToRelative(48f)
        lineTo(400f, 240f)
        lineTo(400f, 192f)
        close()
        moveTo(448f, 112f)
        verticalLineToRelative(48f)
        lineTo(400f, 160f)
        lineTo(400f, 112f)
        close()
      }
    }.build()

    return _FilmSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FilmSharp: ImageVector? = null
