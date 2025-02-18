package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.AtCircle: ImageVector
  get() {
    if (_AtCircleSharp != null) {
      return _AtCircleSharp!!
    }
    _AtCircleSharp = ImageVector.Builder(
      name = "Sharp.AtCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256.41f, 48.74f)
        curveToRelative(-114.85f, 0f, -208f, 93.11f, -208f, 208f)
        reflectiveCurveToRelative(93.12f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.12f, 208f, -208f)
        reflectiveCurveTo(371.25f, 48.74f, 256.41f, 48.74f)
        close()
        moveTo(381.22f, 252f)
        curveToRelative(-2.85f, 32.63f, -16.78f, 49.7f, -28f, 58.26f)
        reflectiveCurveToRelative(-24.69f, 12.34f, -36.33f, 10.26f)
        arcToRelative(
          41.63f,
          41.63f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -27f,
          -17.52f
        )
        arcToRelative(
          60.84f,
          60.84f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -43.72f,
          17.9f
        )
        arcToRelative(
          51.65f,
          51.65f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -38.55f,
          -16.83f
        )
        curveToRelative(-11.39f, -12.42f, -17f, -30.36f, -15.33f, -49.23f)
        curveToRelative(3.05f, -35f, 30.92f, -57.39f, 56.87f, -61.48f)
        curveToRelative(27.21f, -4.29f, 52.24f, 6.54f, 62.91f, 19.46f)
        lineToRelative(3.84f, 4.66f)
        lineToRelative(-6.34f, 50.38f)
        curveToRelative(-1.19f, 14.34f, 3.29f, 23.48f, 12.29f, 25.1f)
        curveToRelative(2.39f, 0.42f, 8.11f, -0.13f, 14.38f, -4.93f)
        curveToRelative(6.72f, -5.15f, 15.14f, -16f, 17.1f, -38.47f)
        curveToRelative(2.32f, -26.55f, -4.35f, -49.19f, -19.28f, -65.49f)
        curveToRelative(-15.5f, -16.9f, -39.1f, -25.84f, -68.24f, -25.84f)
        curveToRelative(-54f, 0f, -101.81f, 44.43f, -106.57f, 99f)
        curveToRelative(-2.29f, 26.2f, 5.66f, 50.68f, 22.39f, 68.93f)
        curveTo(198f, 344f, 221f, 353.88f, 246.29f, 353.88f)
        curveToRelative(19f, 0f, 30.61f, -2.05f, 49.49f, -8.78f)
        lineTo(309f, 340.41f)
        lineToRelative(9.39f, 26.37f)
        lineToRelative(-13.19f, 4.7f)
        curveToRelative(-21.82f, 7.77f, -36.68f, 10.4f, -58.88f, 10.4f)
        curveToRelative(-33.28f, 0f, -63.57f, -13.06f, -85.3f, -36.77f)
        curveToRelative(-22.09f, -24.11f, -32.62f, -56.17f, -29.65f, -90.29f)
        curveToRelative(2.91f, -33.33f, 18.46f, -64.63f, 43.77f, -88.12f)
        reflectiveCurveToRelative(57.57f, -36.49f, 90.7f, -36.49f)
        curveToRelative(37.2f, 0f, 67.94f, 12.08f, 88.88f, 34.93f)
        curveTo(374.77f, 187.05f, 384.2f, 217.89f, 381.22f, 252f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(253.51f, 221f)
        curveToRelative(-14.83f, 2.33f, -31.55f, 15.84f, -33.34f, 36.26f)
        curveToRelative(-1f, 11.06f, 2f, 21.22f, 8.08f, 27.87f)
        arcToRelative(
          23.63f,
          23.63f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          17.91f,
          7.75f
        )
        curveToRelative(19.7f, 0f, 33.8f, -14.79f, 36.8f, -38.59f)
        lineToRelative(1.75f, -13.89f)
        horizontalLineToRelative(0.09f)
        lineToRelative(1.65f, -13.11f)
        arcToRelative(
          49.63f,
          49.63f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -32.94f,
          -6.3f
        )
        close()
      }
    }.build()

    return _AtCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _AtCircleSharp: ImageVector? = null
