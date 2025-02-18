package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Boat: ImageVector
  get() {
    if (_BoatSharp != null) {
      return _BoatSharp!!
    }
    _BoatSharp = ImageVector.Builder(
      name = "Sharp.BoatSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(477.77f, 246.42f)
        curveToRelative(-2.13f, -6f, -7.23f, -9.55f, -12.56f, -11.95f)
        lineTo(432f, 221.38f)
        verticalLineTo(92f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20f, -20f)
        horizontalLineTo(336f)
        verticalLineTo(40f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        horizontalLineTo(192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        verticalLineTo(72f)
        horizontalLineTo(100f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 92f)
        verticalLineTo(221.46f)
        lineTo(46.92f, 234.52f)
        curveToRelative(-5.33f, 2.4f, -10.58f, 6f, -12.72f, 12f)
        reflectiveCurveToRelative(-3.16f, 11.81f, -1f, 19f)
        lineTo(84.25f, 415.7f)
        horizontalLineToRelative(1.06f)
        curveToRelative(34.12f, 0f, 64f, -17.41f, 85.31f, -43.82f)
        curveTo(191.94f, 398.29f, 221.8f, 414f, 255.92f, 414f)
        reflectiveCurveToRelative(64f, -15.76f, 85.31f, -42.17f)
        curveToRelative(21.32f, 26.41f, 51.18f, 43.87f, 85.3f, 43.87f)
        horizontalLineToRelative(1.06f)
        lineToRelative(51.25f, -150.17f)
        curveTo(481f, 259.53f, 479.91f, 252.43f, 477.77f, 246.42f)
        close()
        moveTo(256f, 152f)
        lineTo(112f, 208.83f)
        verticalLineTo(108f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
        horizontalLineTo(396f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
        verticalLineTo(208.76f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(345.22f, 407f)
        curveToRelative(-52.25f, 36.26f, -126.35f, 36.25f, -178.6f, 0f)
        curveToRelative(0f, 0f, -45.64f, 63f, -94.64f, 63f)
        lineToRelative(13.33f, 1f)
        curveToRelative(29.86f, 0f, 58.65f, -11.73f, 85.31f, -25.59f)
        arcToRelative(
          185.33f,
          185.33f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          170.6f,
          0f
        )
        curveToRelative(26.66f, 13.87f, 55.45f, 25.6f, 85.31f, 25.6f)
        lineToRelative(13.33f, -1f)
        curveTo(392.21f, 470f, 345.22f, 407f, 345.22f, 407f)
        close()
      }
    }.build()

    return _BoatSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BoatSharp: ImageVector? = null
