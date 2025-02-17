package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Restaurant: ImageVector
  get() {
    if (_RestaurantSharp != null) {
      return _RestaurantSharp!!
    }
    _RestaurantSharp = ImageVector.Builder(
      name = "Sharp.RestaurantSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(342.7f, 223.94f)
        horizontalLineToRelative(14.87f)
        arcToRelative(
          79.48f,
          79.48f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          56.58f,
          -23.44f
        )
        lineTo(496f, 118f)
        lineTo(473.78f, 95.6f)
        lineTo(390.2f, 179.18f)
        lineToRelative(-17.37f, -17.37f)
        lineToRelative(83.58f, -83.59f)
        lineToRelative(-23f, -22.31f)
        lineToRelative(-83.27f, 83.26f)
        lineTo(332.82f, 121.8f)
        lineTo(416.4f, 38.21f)
        lineTo(394f, 16f)
        lineTo(311.5f, 97.85f)
        arcToRelative(
          79.49f,
          79.49f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -23.44f,
          56.59f
        )
        verticalLineTo(169.3f)
        lineToRelative(-43.13f, 43.13f)
        lineTo(48f, 16f)
        curveTo(3.72f, 70.87f, 29.87f, 171.71f, 79.72f, 221.57f)
        lineToRelative(85.5f, 85.5f)
        curveToRelative(26.55f, 26.55f, 31.82f, 28.92f, 61.94f, 16.8f)
        curveToRelative(6.49f, -2.61f, 8.85f, -2.32f, 14.9f, 3.72f)
        lineToRelative(13f, 12.13f)
        curveToRelative(2.93f, 3f, 3f, 3.88f, 3f, 9.62f)
        verticalLineToRelative(5.54f)
        curveToRelative(0f, 21.08f, 13.48f, 33.2f, 22.36f, 42.24f)
        lineTo(384f, 496f)
        lineToRelative(72f, -72f)
        lineTo(299.57f, 267.07f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(227.37f, 354.59f)
        curveToRelative(-29.82f, 6.11f, -48.11f, 11.74f, -83.08f, -23.23f)
        curveToRelative(-0.56f, -0.56f, -1.14f, -1.1f, -1.7f, -1.66f)
        lineToRelative(-19.5f, -19.5f)
        lineTo(16f, 416f)
        lineToRelative(80f, 80f)
        lineTo(240f, 352f)
        close()
      }
    }.build()

    return _RestaurantSharp!!
  }

@Suppress("ObjectPropertyName")
private var _RestaurantSharp: ImageVector? = null
