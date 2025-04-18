package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Cart: ImageVector
  get() {
    if (_Cart != null) {
      return _Cart!!
    }
    _Cart = ImageVector.Builder(
      name = "Filled.Cart",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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
        moveTo(456.8f, 120.78f)
        arcTo(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 438.24f, 112f)
        horizontalLineTo(133.89f)
        lineToRelative(-6.13f, -34.78f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 64f)
        horizontalLineTo(48f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 32f)
        horizontalLineTo(98.58f)
        lineToRelative(45.66f, 258.78f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 368f)
        horizontalLineTo(416f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -32f)
        horizontalLineTo(173.42f)
        lineToRelative(-5.64f, -32f)
        horizontalLineTo(409.44f)
        arcTo(24.07f, 24.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 433f, 284.71f)
        lineToRelative(28.8f, -144f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 456.8f, 120.78f)
        close()
      }
    }.build()

    return _Cart!!
  }

@Suppress("ObjectPropertyName")
private var _Cart: ImageVector? = null
