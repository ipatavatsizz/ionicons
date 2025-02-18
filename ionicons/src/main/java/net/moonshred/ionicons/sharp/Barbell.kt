package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Barbell: ImageVector
  get() {
    if (_BarbellSharp != null) {
      return _BarbellSharp!!
    }
    _BarbellSharp = ImageVector.Builder(
      name = "Sharp.BarbellSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 176f)
        lineToRelative(-58f, 0f)
        lineToRelative(0f, -64f)
        lineToRelative(-76f, 0f)
        lineToRelative(0f, 122f)
        lineToRelative(-212f, 0f)
        lineToRelative(0f, -122f)
        lineToRelative(-76f, 0f)
        lineToRelative(0f, 64f)
        lineToRelative(-58f, 0f)
        lineToRelative(0f, 160f)
        lineToRelative(58f, 0f)
        lineToRelative(0f, 64f)
        lineToRelative(76f, 0f)
        lineToRelative(0f, -122f)
        lineToRelative(212f, 0f)
        lineToRelative(0f, 122f)
        lineToRelative(76f, 0f)
        lineToRelative(0f, -64f)
        lineToRelative(58f, 0f)
        lineToRelative(0f, -160f)
        close()
      }
    }.build()

    return _BarbellSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BarbellSharp: ImageVector? = null
