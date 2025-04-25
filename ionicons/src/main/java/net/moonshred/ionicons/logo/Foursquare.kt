package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Foursquare: ImageVector
  get() {
    if (_Foursquare != null) {
      return _Foursquare!!
    }
    _Foursquare = ImageVector.Builder(
      name = "Logo.Foursquare",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(376.76f, 32f)
        lineTo(138.54f, 32f)
        curveTo(105.67f, 32f, 96f, 56.8f, 96f, 72.41f)
        lineTo(96f, 452.05f)
        curveToRelative(0f, 17.59f, 9.42f, 24.12f, 14.72f, 26.27f)
        reflectiveCurveToRelative(19.91f, 4f, 28.67f, -6.17f)
        curveToRelative(0f, 0f, 112.47f, -130.89f, 114.4f, -132.83f)
        curveToRelative(2.92f, -2.93f, 2.92f, -2.93f, 5.84f, -2.93f)
        lineTo(332.4f, 336.39f)
        curveToRelative(30.58f, 0f, 35.49f, -21.87f, 38.69f, -34.75f)
        curveToRelative(2.65f, -10.79f, 32.48f, -164f, 42.45f, -212.56f)
        curveTo(421.14f, 52f, 411.74f, 32f, 376.76f, 32f)
        close()
        moveTo(371.09f, 301.64f)
        curveToRelative(2.65f, -10.79f, 32.48f, -164f, 42.45f, -212.56f)
        moveToRelative(-50.85f, 7.59f)
        lineToRelative(-10f, 51.73f)
        curveToRelative(-1.19f, 5.65f, -8.28f, 11.6f, -14.86f, 11.6f)
        lineTo(241.91f, 160f)
        curveToRelative(-10.44f, 0f, -17.91f, 6.14f, -17.91f, 16.6f)
        verticalLineToRelative(13.45f)
        curveToRelative(0f, 10.47f, 7.52f, 17.89f, 18f, 17.89f)
        horizontalLineToRelative(81.85f)
        curveToRelative(7.38f, 0f, 14.61f, 8.11f, 13f, 16f)
        reflectiveCurveToRelative(-9.09f, 46.57f, -10f, 50.89f)
        reflectiveCurveToRelative(-5.84f, 11.72f, -14.61f, 11.72f)
        lineTo(248f, 286.55f)
        curveToRelative(-11.7f, 0f, -15.24f, 1.54f, -23.07f, 11.3f)
        reflectiveCurveToRelative(-78.26f, 94.59f, -78.26f, 94.59f)
        curveToRelative(-0.71f, 0.82f, -1.41f, 0.58f, -1.41f, -0.31f)
        lineTo(145.26f, 95.9f)
        curveToRelative(0f, -6.69f, 5.8f, -14.53f, 14.48f, -14.53f)
        lineTo(350.88f, 81.37f)
        arcTo(12.42f, 12.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 362.69f, 96.67f)
        close()
      }
    }.build()

    return _Foursquare!!
  }

@Suppress("ObjectPropertyName")
private var _Foursquare: ImageVector? = null
