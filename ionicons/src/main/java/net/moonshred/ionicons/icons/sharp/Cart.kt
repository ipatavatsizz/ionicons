package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Cart: ImageVector
  get() {
    if (_CartSharp != null) {
      return _CartSharp!!
    }
    _CartSharp = ImageVector.Builder(
      name = "Sharp.CartSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(176f, 416f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(400f, 416f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(167.78f, 304f)
        lineToRelative(261.34f, 0f)
        lineToRelative(38.4f, -192f)
        lineToRelative(-333.63f, 0f)
        lineToRelative(-8.47f, -48f)
        lineToRelative(-93.42f, 0f)
        lineToRelative(0f, 32f)
        lineToRelative(66.58f, 0f)
        lineToRelative(48f, 272f)
        lineToRelative(285.42f, 0f)
        lineToRelative(0f, -32f)
        lineToRelative(-258.58f, 0f)
        lineToRelative(-5.64f, -32f)
        close()
      }
    }.build()

    return _CartSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CartSharp: ImageVector? = null
