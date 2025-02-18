package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.VolumeMute: ImageVector
  get() {
    if (_VolumeMuteSharp != null) {
      return _VolumeMuteSharp!!
    }
    _VolumeMuteSharp = ImageVector.Builder(
      name = "Sharp.VolumeMuteSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(416f, 432f)
        lineTo(64f, 80f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(352f, 256f)
        curveToRelative(0f, -24.56f, -5.81f, -47.88f, -17.75f, -71.27f)
        lineTo(327f, 170.47f)
        lineTo(298.48f, 185f)
        lineToRelative(7.27f, 14.25f)
        curveTo(315.34f, 218.06f, 320f, 236.62f, 320f, 256f)
        arcToRelative(
          112.91f,
          112.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -0.63f,
          11.74f
        )
        lineToRelative(27.32f, 27.32f)
        arcTo(148.8f, 148.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 352f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 256f)
        curveToRelative(0f, -51.19f, -13.08f, -83.89f, -34.18f, -120.06f)
        lineToRelative(-8.06f, -13.82f)
        lineToRelative(-27.64f, 16.12f)
        lineToRelative(8.06f, 13.82f)
        curveTo(373.07f, 184.44f, 384f, 211.83f, 384f, 256f)
        curveToRelative(0f, 25.93f, -3.89f, 46.21f, -11f, 65.33f)
        lineToRelative(24.5f, 24.51f)
        curveTo(409.19f, 319.68f, 416f, 292.42f, 416f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 256f)
        curveToRelative(0f, -74.26f, -20.19f, -121.11f, -50.51f, -168.61f)
        lineTo(420.88f, 73.9f)
        lineToRelative(-27f, 17.22f)
        lineToRelative(8.61f, 13.49f)
        curveTo(429.82f, 147.38f, 448f, 189.5f, 448f, 256f)
        curveToRelative(0f, 48.76f, -9.4f, 84f, -24.82f, 115.55f)
        lineToRelative(23.7f, 23.7f)
        curveTo(470.16f, 351.39f, 480f, 309f, 480f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 72f)
        lineToRelative(-73.6f, 58.78f)
        lineToRelative(73.6f, 73.59f)
        lineToRelative(0f, -132.37f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 176.1f)
        lineToRelative(0f, 159.8f)
        lineToRelative(93.65f, 0f)
        lineToRelative(130.35f, 104.1f)
        lineToRelative(0f, -100.37f)
        lineToRelative(-163.53f, -163.53f)
        lineToRelative(-60.47f, 0f)
        close()
      }
    }.build()

    return _VolumeMuteSharp!!
  }

@Suppress("ObjectPropertyName")
private var _VolumeMuteSharp: ImageVector? = null
