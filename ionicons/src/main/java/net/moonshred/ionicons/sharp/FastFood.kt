package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.FastFood: ImageVector
  get() {
    if (_FastFoodSharp != null) {
      return _FastFoodSharp!!
    }
    _FastFoodSharp = ImageVector.Builder(
      name = "Sharp.FastFoodSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 352f)
        horizontalLineTo(184.36f)
        lineToRelative(-41f, 35f)
        lineToRelative(-41f, -35f)
        horizontalLineTo(16f)
        verticalLineToRelative(24f)
        curveToRelative(0f, 30.59f, 21.13f, 55.51f, 47.26f, 56f)
        curveToRelative(2.43f, 15.12f, 8.31f, 28.78f, 17.16f, 39.47f)
        curveTo(93.51f, 487.28f, 112.54f, 496f, 134f, 496f)
        horizontalLineTo(266f)
        curveToRelative(21.46f, 0f, 40.49f, -8.72f, 53.58f, -24.55f)
        curveToRelative(8.85f, -10.69f, 14.73f, -24.35f, 17.16f, -39.47f)
        curveToRelative(13.88f, -0.25f, 26.35f, -7.4f, 35f, -18.63f)
        arcTo(61.26f, 61.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 384f, 376f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(105f, 320f)
        horizontalLineToRelative(0f)
        lineToRelative(38.33f, 28.19f)
        lineTo(182f, 320f)
        horizontalLineTo(384f)
        verticalLineToRelative(-8f)
        arcToRelative(
          40.07f,
          40.07f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -32f,
          -39.2f
        )
        curveToRelative(-0.82f, -29.69f, -13f, -54.54f, -35.51f, -72f)
        curveTo(295.67f, 184.56f, 267.85f, 176f, 236f, 176f)
        horizontalLineTo(164f)
        curveToRelative(-68.22f, 0f, -114.43f, 38.77f, -116f, 96.8f)
        arcTo(40.07f, 40.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 312f)
        verticalLineToRelative(8f)
        horizontalLineToRelative(89f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(463.08f, 96f)
        horizontalLineTo(388.49f)
        lineToRelative(8.92f, -35.66f)
        lineTo(442f, 45f)
        lineTo(432f, 16f)
        lineTo(370f, 36f)
        lineTo(355.51f, 96f)
        horizontalLineTo(208f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(18.75f)
        lineToRelative(1.86f, 16f)
        horizontalLineTo(236f)
        curveToRelative(39f, 0f, 73.66f, 10.9f, 100.12f, 31.52f)
        arcTo(121.9f, 121.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 371f, 218.07f)
        arcToRelative(
          124.16f,
          124.16f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          10.73f,
          32.65f
        )
        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 27.89f, 90.9f)
        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 376f)
        curveToRelative(0f, 22.34f, -7.6f, 43.63f, -21.4f, 59.95f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -31.83f, 22.95f)
        arcToRelative(
          109.21f,
          109.21f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -18.53f,
          33f
        )
        curveToRelative(-1.18f, 1.42f, -2.39f, 2.81f, -3.63f, 4.15f)
        horizontalLineTo(416f)
        curveToRelative(16f, 0f, 23f, -8f, 25f, -23f)
        lineToRelative(36.4f, -345f)
        horizontalLineTo(496f)
        verticalLineTo(96f)
        close()
      }
    }.build()

    return _FastFoodSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FastFoodSharp: ImageVector? = null
