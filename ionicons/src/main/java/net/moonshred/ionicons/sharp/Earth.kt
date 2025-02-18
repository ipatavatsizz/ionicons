package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Earth: ImageVector
  get() {
    if (_EarthSharp != null) {
      return _EarthSharp!!
    }
    _EarthSharp = ImageVector.Builder(
      name = "Sharp.EarthSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(267f, 474f)
        lineToRelative(-0.8f, -0.13f)
        arcTo(0.85f, 0.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 267f, 474f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448.9f, 187.78f)
        arcToRelative(
          5.51f,
          5.51f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -10.67f,
          -0.63f
        )
        horizontalLineToRelative(0f)
        arcTo(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 433f, 191f)
        horizontalLineTo(417.53f)
        arcToRelative(
          5.48f,
          5.48f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -2.84f,
          -0.79f
        )
        lineToRelative(-22.38f, -13.42f)
        arcToRelative(
          5.48f,
          5.48f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -2.84f,
          -0.79f
        )
        horizontalLineToRelative(-35.8f)
        arcToRelative(
          5.48f,
          5.48f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -3.06f,
          0.93f
        )
        lineToRelative(-44.15f, 29.43f)
        arcTo(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 304f, 211f)
        verticalLineToRelative(41.74f)
        arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.92f, 4.87f)
        lineToRelative(57.89f, 30.9f)
        arcToRelative(5.55f, 5.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.92f, 4.8f)
        lineTo(368f, 316.8f)
        arcToRelative(5.53f, 5.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.85f, 4.75f)
        lineToRelative(23.26f, 12.87f)
        arcToRelative(5.54f, 5.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.85f, 4.83f)
        verticalLineToRelative(48.6f)
        arcToRelative(5.52f, 5.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.17f, 4.14f)
        curveToRelative(9.38f, -8.26f, 22.83f, -20.32f, 24.62f, -23.08f)
        quadToRelative(4.44f, -6.87f, 8.33f, -14.07f)
        arcToRelative(
          207.39f,
          207.39f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          13.6f,
          -31f
        )
        curveTo(465.36f, 287.13f, 455.34f, 221.14f, 448.9f, 187.78f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(286.4f, 302.8f)
        lineToRelative(-61.33f, -46f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.4f, -0.8f)
        horizontalLineToRelative(-29.1f)
        arcToRelative(
          3.78f,
          3.78f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -2.68f,
          -1.11f
        )
        lineToRelative(-13.72f, -13.72f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, -1.17f)
        horizontalLineTo(121.15f)
        arcToRelative(
          3.79f,
          3.79f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -2.68f,
          -6.47f
        )
        lineToRelative(8.42f, -8.42f)
        arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.68f, -1.11f)
        horizontalLineToRelative(32.37f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.7f, -5.83f)
        lineToRelative(6.89f, -24.5f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2.47f)
        lineTo(206f, 177.06f)
        arcToRelative(
          3.79f,
          3.79f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          2.05f,
          -3.37f
        )
        verticalLineToRelative(-12.5f)
        arcToRelative(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.68f, -2.17f)
        lineTo(223.33f, 138f)
        arcToRelative(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.78f, -1.38f)
        lineToRelative(20.43f, -7.67f)
        arcToRelative(
          3.79f,
          3.79f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          2.46f,
          -3.55f
        )
        verticalLineTo(114f)
        arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.69f, -3.16f)
        lineTo(225.83f, 97.22f)
        arcTo(3.83f, 3.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 222f, 97f)
        lineToRelative(-27.88f, 13.94f)
        arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -0.41f)
        lineTo(176.9f, 100.08f)
        arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.1f, -6f)
        lineToRelative(10.74f, -7.91f)
        arcToRelative(
          3.78f,
          3.78f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.09f,
          -6.16f
        )
        lineTo(170.92f, 68.34f)
        arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -0.22f)
        curveToRelative(-6.05f, 3.31f, -23.8f, 13.11f, -30.1f, 17.52f)
        arcToRelative(
          209.48f,
          209.48f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -68.16f,
          80f
        )
        curveToRelative(-1.82f, 3.76f, -4.07f, 7.59f, -4.29f, 11.72f)
        reflectiveCurveToRelative(-3.46f, 13.35f, -4.81f, 17.08f)
        arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.24f, 3.1f)
        lineToRelative(35.69f, 65.58f)
        arcToRelative(3.74f, 3.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.38f, 1.44f)
        lineToRelative(37.55f, 22.54f)
        arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.81f, 2.73f)
        lineToRelative(7.52f, 54.54f)
        arcToRelative(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.61f, 2.61f)
        lineToRelative(29.3f, 20.14f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.65f, 2.48f)
        lineToRelative(15.54f, 73.8f)
        arcToRelative(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.49f, 1.22f)
        curveToRelative(1.46f, 2.36f, 7.28f, 11f, 14.3f, 12.28f)
        curveToRelative(-0.65f, 0.18f, -1.23f, 0.59f, -1.88f, 0.78f)
        arcToRelative(47.63f, 47.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 1.16f)
        curveToRelative(2f, 0.54f, 4f, 1f, 6f, 1.43f)
        curveToRelative(3.13f, 0.62f, 3.44f, 1.1f, 4.94f, -1.68f)
        curveToRelative(2f, -3.72f, 4.29f, -5f, 6f, -5.46f)
        arcToRelative(3.85f, 3.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.89f, -2.9f)
        lineToRelative(10.07f, -46.68f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.6f, -2.42f)
        lineToRelative(45f, -31.9f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.69f, -3.27f)
        verticalLineTo(306f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 286.4f, 302.8f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(262f, 48f)
        reflectiveCurveToRelative(-3.65f, 0.21f, -4.39f, 0.23f)
        quadToRelative(-8.13f, 0.24f, -16.22f, 1.12f)
        arcTo(207.45f, 207.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 184.21f, 64f)
        curveToRelative(2.43f, 1.68f, -1.75f, 3.22f, -1.75f, 3.22f)
        lineTo(189f, 80f)
        horizontalLineToRelative(35f)
        lineToRelative(24f, 12f)
        lineToRelative(21f, -12f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(354.23f, 120.06f)
        lineToRelative(16.11f, -14f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.94f, -6.65f)
        lineToRelative(-18.81f, -8.73f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.3f, 1.9f)
        lineToRelative(-7.75f, 16.21f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.49f, 5.11f)
        lineToRelative(10.46f, 6.54f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 354.23f, 120.06f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(429.64f, 140.67f)
        lineToRelative(-5.83f, -9f)
        curveToRelative(-0.09f, -0.14f, -0.17f, -0.28f, -0.25f, -0.43f)
        curveToRelative(-1.05f, -2.15f, -9.74f, -19.7f, -17f, -26.51f)
        curveToRelative(-5.45f, -5.15f, -7f, -3.67f, -7.43f, -2.53f)
        arcToRelative(3.77f, 3.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.19f, 1.6f)
        lineTo(369.1f, 127.11f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.51f, 0.89f)
        horizontalLineTo(351.66f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.83f, 1.17f)
        lineToRelative(-12f, 12f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.66f)
        lineToRelative(12f, 12f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.83f, 1.17f)
        horizontalLineToRelative(75.17f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4.17f)
        lineToRelative(-0.55f, -13.15f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 429.64f, 140.67f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 72f)
        arcToRelative(184f, 184f, 0f, isMoreThanHalf = true, isPositiveArc = true, -130.1f, 53.9f)
        arcTo(182.77f, 182.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 72f)
        moveToRelative(0f, -40f)
        curveTo(132.3f, 32f, 32f, 132.3f, 32f, 256f)
        reflectiveCurveTo(132.3f, 480f, 256f, 480f)
        reflectiveCurveTo(480f, 379.7f, 480f, 256f)
        reflectiveCurveTo(379.7f, 32f, 256f, 32f)
        close()
      }
    }.build()

    return _EarthSharp!!
  }

@Suppress("ObjectPropertyName")
private var _EarthSharp: ImageVector? = null
