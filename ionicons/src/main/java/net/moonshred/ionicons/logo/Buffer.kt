package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Buffer: ImageVector
  get() {
    if (_Buffer != null) {
      return _Buffer!!
    }
    _Buffer = ImageVector.Builder(
      name = "Logo.Buffer",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(39.93f, 149.25f)
        lineToRelative(197.4f, 95.32f)
        curveToRelative(5.14f, 2.45f, 12f, 3.73f, 18.79f, 3.73f)
        reflectiveCurveToRelative(13.65f, -1.28f, 18.78f, -3.73f)
        lineToRelative(197.4f, -95.32f)
        curveToRelative(10.38f, -5f, 10.38f, -13.18f, 0f, -18.2f)
        lineTo(274.9f, 35.73f)
        curveToRelative(-5.13f, -2.45f, -12f, -3.73f, -18.78f, -3.73f)
        reflectiveCurveToRelative(-13.65f, 1.28f, -18.79f, 3.73f)
        lineTo(39.93f, 131.05f)
        curveTo(29.55f, 136.07f, 29.55f, 144.23f, 39.93f, 149.25f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(472.3f, 246.9f)
        reflectiveCurveToRelative(-36.05f, -17.38f, -40.83f, -19.72f)
        reflectiveCurveToRelative(-6.07f, -2.21f, -11.09f, 0.12f)
        reflectiveCurveToRelative(-145.6f, 70.23f, -145.6f, 70.23f)
        arcTo(45.71f, 45.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 301.27f)
        curveToRelative(-6.77f, 0f, -13.65f, -1.29f, -18.78f, -3.74f)
        curveToRelative(0f, 0f, -136.85f, -66f, -143.27f, -69.18f)
        curveTo(87f, 225f, 85f, 225f, 78.67f, 228f)
        lineToRelative(-39f, 18.78f)
        curveToRelative(-10.38f, 5f, -10.38f, 13.19f, 0f, 18.2f)
        lineTo(237.1f, 360.3f)
        curveToRelative(5.13f, 2.45f, 12f, 3.73f, 18.78f, 3.73f)
        reflectiveCurveToRelative(13.65f, -1.28f, 18.79f, -3.73f)
        lineTo(472.07f, 265f)
        curveTo(482.68f, 260.08f, 482.68f, 251.92f, 472.3f, 246.9f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(472.3f, 362.75f)
        reflectiveCurveTo(436.25f, 345.37f, 431.47f, 343f)
        reflectiveCurveToRelative(-6.07f, -2.21f, -11.09f, 0.12f)
        reflectiveCurveTo(274.9f, 413.5f, 274.9f, 413.5f)
        arcToRelative(
          45.74f,
          45.74f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -18.78f,
          3.73f
        )
        curveToRelative(-6.77f, 0f, -13.65f, -1.28f, -18.79f, -3.73f)
        curveToRelative(0f, 0f, -136.85f, -66f, -143.26f, -69.18f)
        curveToRelative(-7f, -3.39f, -9f, -3.39f, -15.29f, -0.35f)
        lineToRelative(-39f, 18.78f)
        curveToRelative(-10.39f, 5f, -10.39f, 13.18f, 0f, 18.2f)
        lineToRelative(197.4f, 95.32f)
        curveToRelative(5.13f, 2.56f, 12f, 3.73f, 18.78f, 3.73f)
        reflectiveCurveToRelative(13.65f, -1.28f, 18.78f, -3.73f)
        lineTo(472.18f, 381f)
        curveTo(482.68f, 375.93f, 482.68f, 367.77f, 472.3f, 362.75f)
        close()
      }
    }.build()

    return _Buffer!!
  }

@Suppress("ObjectPropertyName")
private var _Buffer: ImageVector? = null
