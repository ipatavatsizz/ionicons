package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Basket: ImageVector
  get() {
    if (_BasketSharp != null) {
      return _BasketSharp!!
    }
    _BasketSharp = ImageVector.Builder(
      name = "Sharp.BasketSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(339.2f, 217.6f)
        lineTo(256f, 106.67f)
        lineTo(172.8f, 217.6f)
        lineToRelative(-25.6f, -19.2f)
        lineToRelative(96f, -128f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 25.6f, 0f)
        lineToRelative(96f, 128f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(441.59f, 192f)
        horizontalLineTo(70.41f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.68f, 14.77f)
        lineTo(112.59f, 434f)
        horizontalLineTo(399.41f)
        lineToRelative(53.86f, -227.23f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 441.59f, 192f)
        close()
        moveTo(256f, 351.66f)
        arcTo(37.71f, 37.71f, 0f, isMoreThanHalf = true, isPositiveArc = true, 293.89f, 314f)
        arcTo(37.88f, 37.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 351.66f)
        close()
      }
    }.build()

    return _BasketSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BasketSharp: ImageVector? = null
