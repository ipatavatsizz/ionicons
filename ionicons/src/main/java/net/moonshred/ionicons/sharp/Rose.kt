package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Rose: ImageVector
  get() {
    if (_RoseSharp != null) {
      return _RoseSharp!!
    }
    _RoseSharp = ImageVector.Builder(
      name = "Sharp.RoseSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 112f)
        reflectiveCurveToRelative(-17.62f, 0f, -30.51f, 1.39f)
        curveToRelative(-19f, 2f, -42.06f, 8f, -59.73f, 13.22f)
        curveTo(322.7f, 137f, 288.43f, 150.53f, 249.91f, 169.2f)
        curveToRelative(-18.62f, 9.05f, -26f, 13.35f, -48f, 26.13f)
        lineTo(197.41f, 198f)
        curveToRelative(-32.95f, 19f, -57.09f, 40f, -73.79f, 64.3f)
        curveTo(105.29f, 288.89f, 96f, 320f, 96f, 354.64f)
        curveToRelative(0f, 40.74f, 15.71f, 77.1f, 44.24f, 102.37f)
        curveTo(169f, 482.52f, 209.06f, 496f, 256f, 496f)
        curveToRelative(46.76f, 0f, 86.89f, -14.32f, 116f, -41.43f)
        curveToRelative(28.35f, -26.35f, 44f, -63.39f, 44f, -104.29f)
        curveToRelative(0f, -25f, -6.19f, -47f, -12.17f, -68.22f)
        curveToRelative(-12.59f, -44.69f, -23.46f, -83.29f, 24.71f, -144.13f)
        curveTo(432.75f, 132.62f, 448f, 112f, 448f, 112f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(219f, 119.55f)
        curveTo(168.47f, 92.08f, 104.72f, 80f, 80f, 80f)
        curveToRelative(0f, 0f, 23.23f, 28.19f, 29.15f, 55.4f)
        reflectiveCurveToRelative(6.54f, 48.61f, 2.91f, 88.6f)
        curveToRelative(17.94f, -20.48f, 40.59f, -37.15f, 69.32f, -53.73f)
        lineToRelative(4.48f, -2.6f)
        curveTo(208f, 154.8f, 216.23f, 150f, 236f, 140.41f)
        curveToRelative(2.88f, -1.4f, 5.74f, -2.76f, 8.58f, -4.11f)
        arcTo(170.77f, 170.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 219f, 119.55f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(345.25f, 48f)
        reflectiveCurveToRelative(-42.53f, 0.36f, -86.12f, 21.3f)
        arcToRelative(
          280.36f,
          280.36f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -32.27f,
          18.27f
        )
        quadToRelative(3.73f, 1.89f, 7.4f, 3.88f)
        curveToRelative(3.44f, 1.87f, 7.09f, 4f, 10.9f, 6.29f)
        arcToRelative(
          189.7f,
          189.7f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          31.46f,
          24.16f
        )
        curveToRelative(24.57f, -10.41f, 73f, -26.1f, 90.77f, -31.28f)
        curveTo(359.39f, 71.47f, 345.25f, 48f, 345.25f, 48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(176f, 16f)
        curveToRelative(-16f, 10.83f, -33.24f, 41.1f, -33.24f, 41.1f)
        arcToRelative(
          494.22f,
          494.22f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          48.92f,
          15.25f
        )
        lineToRelative(17.65f, -11.56f)
        curveToRelative(8.18f, -5.35f, 16.55f, -10.29f, 25f, -14.77f)
        curveTo(234.31f, 46f, 202.59f, 24.17f, 176f, 16f)
        close()
      }
    }.build()

    return _RoseSharp!!
  }

@Suppress("ObjectPropertyName")
private var _RoseSharp: ImageVector? = null
