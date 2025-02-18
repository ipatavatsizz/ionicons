package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Square: ImageVector
  get() {
    if (_SquareSharp != null) {
      return _SquareSharp!!
    }
    _SquareSharp = ImageVector.Builder(
      name = "Sharp.SquareSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 48f)
        horizontalLineToRelative(416f)
        verticalLineToRelative(416f)
        horizontalLineToRelative(-416f)
        close()
      }
    }.build()

    return _SquareSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SquareSharp: ImageVector? = null
