package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Trophy: ImageVector
  get() {
    if (_TrophySharp != null) {
      return _TrophySharp!!
    }
    _TrophySharp = ImageVector.Builder(
      name = "Sharp.TrophySharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(399.9f, 80f)
        reflectiveCurveToRelative(0f, -27.88f, 0f, -48f)
        lineTo(112f, 32f)
        lineTo(112f, 80f)
        lineTo(32f, 80f)
        verticalLineToRelative(38f)
        curveToRelative(0f, 32f, 9.5f, 62.79f, 26.76f, 86.61f)
        curveToRelative(13.33f, 18.4f, 34.17f, 31.1f, 52.91f, 37.21f)
        curveToRelative(5.44f, 29.29f, 20.2f, 57.13f, 50.19f, 79.83f)
        curveToRelative(22f, 16.66f, 48.45f, 28.87f, 72.14f, 33.86f)
        lineTo(234f, 436f)
        lineTo(160f, 436f)
        verticalLineToRelative(44f)
        lineTo(352f, 480f)
        lineTo(352f, 436f)
        lineTo(278f, 436f)
        lineTo(278f, 355.51f)
        curveToRelative(23.69f, -5f, 50.13f, -17.2f, 72.14f, -33.86f)
        curveToRelative(30f, -22.7f, 44.75f, -50.54f, 50.19f, -79.83f)
        curveToRelative(18.74f, -6.11f, 39.58f, -18.81f, 52.91f, -37.21f)
        curveTo(470.5f, 180.79f, 480f, 150f, 480f, 118f)
        lineTo(480f, 80f)
        close()
        moveTo(94.4f, 178.8f)
        curveTo(83.72f, 164.12f, 77.23f, 144.4f, 76.16f, 124f)
        lineTo(112f, 124f)
        verticalLineToRelative(67.37f)
        curveTo(108.06f, 190.23f, 99.08f, 185.25f, 94.4f, 178.8f)
        close()
        moveTo(417.6f, 178.8f)
        curveTo(413f, 185.41f, 406f, 191.38f, 400f, 191.38f)
        curveToRelative(0f, -22.4f, 0f, -46.29f, -0.05f, -67.38f)
        horizontalLineToRelative(35.9f)
        curveTo(434.77f, 144.4f, 428f, 163.9f, 417.6f, 178.8f)
        close()
      }
    }.build()

    return _TrophySharp!!
  }

@Suppress("ObjectPropertyName")
private var _TrophySharp: ImageVector? = null
