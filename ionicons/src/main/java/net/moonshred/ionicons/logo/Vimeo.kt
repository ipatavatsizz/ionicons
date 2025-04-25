package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Vimeo: ImageVector
  get() {
    if (_Vimeo != null) {
      return _Vimeo!!
    }
    _Vimeo = ImageVector.Builder(
      name = "Logo.Vimeo",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(476.9f, 114f)
        curveToRelative(-5f, -23.39f, -17.51f, -38.78f, -40.61f, -46.27f)
        reflectiveCurveToRelative(-64.92f, -4.5f, -94.12f, 16.79f)
        curveToRelative(-26.79f, 19.51f, -46.26f, 54.42f, -54f, 78.28f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.13f, 5f)
        curveToRelative(10.77f, -3.8f, 21.72f, -7.1f, 34f, -6.45f)
        curveToRelative(15f, 0.8f, 24.51f, 12f, 24.91f, 25.29f)
        curveToRelative(0.3f, 9.79f, -0.2f, 18.69f, -3.6f, 27.68f)
        curveTo(337.87f, 243f, 321f, 270.78f, 301.06f, 295.07f)
        arcToRelative(72.49f, 72.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10f, 9.89f)
        curveToRelative(-10.21f, 8.29f, -18.81f, 6.1f, -25.41f, -5.2f)
        curveToRelative(-5.4f, -9.29f, -9f, -18.88f, -12.2f, -29.08f)
        curveToRelative(-12.4f, -39.67f, -16.81f, -80.84f, -23.81f, -121.52f)
        curveToRelative(-3.3f, -19.48f, -7f, -39.77f, -18f, -56.86f)
        curveToRelative(-11.6f, -17.79f, -28.61f, -24.58f, -50f, -22f)
        curveToRelative(-14.7f, 1.8f, -36.91f, 17.49f, -47.81f, 26.39f)
        curveToRelative(0f, 0f, -56f, 46.87f, -81.82f, 71.35f)
        lineToRelative(21.2f, 27f)
        reflectiveCurveToRelative(17.91f, -12.49f, 27.51f, -18.29f)
        curveToRelative(5.7f, -3.39f, 12.4f, -4.09f, 17.2f, 0.2f)
        curveToRelative(4.51f, 3.9f, 9.61f, 9f, 12.31f, 14.1f)
        curveToRelative(5.7f, 10.69f, 11.2f, 21.88f, 14.7f, 33.37f)
        curveToRelative(13.2f, 44.27f, 25.51f, 88.64f, 37.81f, 133.22f)
        curveToRelative(6.3f, 22.78f, 13.9f, 44.17f, 28f, 63.55f)
        curveToRelative(19.31f, 26.59f, 39.61f, 32.68f, 70.92f, 21.49f)
        curveToRelative(25.41f, -9.09f, 46.61f, -26.18f, 66f, -43.87f)
        curveToRelative(33.11f, -30.18f, 59.12f, -65.36f, 85.52f, -101.14f)
        curveTo(433.59f, 270f, 450.49f, 242f, 464.59f, 210.72f)
        curveTo(478.5f, 179.74f, 484f, 147.26f, 476.9f, 114f)
        close()
      }
    }.build()

    return _Vimeo!!
  }

@Suppress("ObjectPropertyName")
private var _Vimeo: ImageVector? = null
