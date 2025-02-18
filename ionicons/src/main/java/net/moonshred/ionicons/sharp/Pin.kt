package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Pin: ImageVector
  get() {
    if (_PinSharp != null) {
      return _PinSharp!!
    }
    _PinSharp = ImageVector.Builder(
      name = "Sharp.PinSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(339f, 99f)
        arcToRelative(83f, 83f, 0f, isMoreThanHalf = true, isPositiveArc = false, -102f, 80.8f)
        lineTo(237f, 464f)
        lineToRelative(19f, 32f)
        lineToRelative(19f, -32f)
        lineTo(275f, 179.8f)
        arcTo(83.28f, 83.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 339f, 99f)
        close()
        moveTo(280f, 93f)
        arcToRelative(21f, 21f, 0f, isMoreThanHalf = true, isPositiveArc = true, 21f, -21f)
        arcTo(21f, 21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 280f, 93f)
        close()
      }
    }.build()

    return _PinSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PinSharp: ImageVector? = null
