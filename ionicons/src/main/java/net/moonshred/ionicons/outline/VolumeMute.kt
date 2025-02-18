package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.VolumeMute: ImageVector
  get() {
    if (_VolumeMuteOutline != null) {
      return _VolumeMuteOutline!!
    }
    _VolumeMuteOutline = ImageVector.Builder(
      name = "Outline.VolumeMuteOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(416f, 432f)
        lineTo(64f, 80f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(224f, 136.92f)
        verticalLineToRelative(33.8f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.17f, 2.82f)
        lineToRelative(24f, 24f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.83f, -2.82f)
        verticalLineTo(120.57f)
        arcToRelative(
          24.53f,
          24.53f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -12.67f,
          -21.72f
        )
        arcToRelative(
          23.91f,
          23.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -25.55f,
          1.83f
        )
        arcToRelative(
          8.27f,
          8.27f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.66f,
          0.51f
        )
        lineToRelative(-31.94f, 26.15f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.29f, 5.92f)
        lineToRelative(17.05f, 17.06f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.37f, 0.26f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(224f, 375.08f)
        lineToRelative(-78.07f, -63.92f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 125.65f, 304f)
        horizontalLineTo(64f)
        verticalLineTo(208f)
        horizontalLineToRelative(50.72f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.82f, -6.83f)
        lineToRelative(-24f, -24f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 90.72f, 176f)
        horizontalLineTo(56f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, 24f)
        verticalLineTo(312f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineToRelative(69.76f)
        lineToRelative(91.36f, 74.8f)
        arcToRelative(8.27f, 8.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.66f, 0.51f)
        arcTo(23.93f, 23.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 243.63f, 413f)
        arcTo(24.49f, 24.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 391.45f)
        verticalLineTo(341.28f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.17f, -2.82f)
        lineToRelative(-24f, -24f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.83f, 2.82f)
        close()
        moveTo(125.82f, 336f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(352f, 256f)
        curveToRelative(0f, -24.56f, -5.81f, -47.88f, -17.75f, -71.27f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -28.5f, 14.54f)
        curveTo(315.34f, 218.06f, 320f, 236.62f, 320f, 256f)
        quadToRelative(0f, 4f, -0.31f, 8.13f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.32f, 6.25f)
        lineToRelative(19.66f, 19.67f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.75f, -2f)
        arcTo(146.89f, 146.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 352f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 256f)
        curveToRelative(0f, -51.19f, -13.08f, -83.89f, -34.18f, -120.06f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -27.64f, 16.12f)
        curveTo(373.07f, 184.44f, 384f, 211.83f, 384f, 256f)
        curveToRelative(0f, 23.83f, -3.29f, 42.88f, -9.37f, 60.65f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.9f, 8.26f)
        lineToRelative(16.77f, 16.76f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.52f, -1.27f)
        curveTo(410.09f, 315.88f, 416f, 289.91f, 416f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 256f)
        curveToRelative(0f, -74.26f, -20.19f, -121.11f, -50.51f, -168.61f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, -27f, 17.22f)
        curveTo(429.82f, 147.38f, 448f, 189.5f, 448f, 256f)
        curveToRelative(0f, 47.45f, -8.9f, 82.12f, -23.59f, 113f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.77f, 4.55f)
        lineTo(443f, 391.39f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.4f, -1f)
        curveTo(470.88f, 348.22f, 480f, 307f, 480f, 256f)
        close()
      }
    }.build()

    return _VolumeMuteOutline!!
  }

@Suppress("ObjectPropertyName")
private var _VolumeMuteOutline: ImageVector? = null
