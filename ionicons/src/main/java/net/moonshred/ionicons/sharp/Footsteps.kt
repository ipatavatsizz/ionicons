package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Footsteps: ImageVector
  get() {
    if (_FootstepsSharp != null) {
      return _FootstepsSharp!!
    }
    _FootstepsSharp = ImageVector.Builder(
      name = "Sharp.FootstepsSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(130.54f, 358.31f)
        curveToRelative(-12.83f, 1.88f, -33.95f, 5.38f, -48f, -10.56f)
        reflectiveCurveTo(56.34f, 293.32f, 51f, 258.92f)
        curveToRelative(-7.88f, -50.7f, -0.06f, -93.43f, 22f, -120.31f)
        curveToRelative(13f, -15.83f, 30.06f, -25f, 49.34f, -26.46f)
        curveToRelative(16.51f, -1.27f, 41.18f, 5.19f, 65f, 43.19f)
        curveToRelative(14.92f, 23.81f, 26.27f, 55.44f, 31.14f, 86.77f)
        horizontalLineToRelative(0f)
        curveToRelative(5.88f, 37.82f, 11.61f, 78.18f, -8.44f, 92.65f)
        curveToRelative(-11.31f, 8.17f, -19.43f, 11f, -38.62f, 15.57f)
        curveTo(155.64f, 354.08f, 143.38f, 356.42f, 130.54f, 358.31f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(107.72f, 390.84f)
        lineToRelative(108.89f, -22.46f)
        curveToRelative(9.2f, -1.9f, 16.58f, 3.16f, 20f, 18.32f)
        curveToRelative(11.22f, 49.76f, -4.86f, 109.3f, -55.22f, 109.3f)
        curveToRelative(-47.69f, 0f, -79.47f, -54.36f, -84.66f, -83.58f)
        curveTo(94.36f, 399.17f, 97.74f, 392.89f, 107.72f, 390.84f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(340.59f, 254.34f)
        curveToRelative(-19.19f, -4.55f, -27.31f, -7.4f, -38.62f, -15.57f)
        curveToRelative(-20.05f, -14.47f, -14.32f, -54.83f, -8.44f, -92.65f)
        horizontalLineToRelative(0f)
        curveToRelative(4.87f, -31.33f, 16.22f, -63f, 31.14f, -86.77f)
        curveToRelative(23.8f, -38f, 48.47f, -44.46f, 65f, -43.19f)
        curveTo(408.93f, 17.63f, 426f, 26.78f, 439f, 42.61f)
        curveToRelative(22.08f, 26.88f, 29.9f, 69.61f, 22f, 120.31f)
        curveToRelative(-5.35f, 34.4f, -17.46f, 72.76f, -31.59f, 88.83f)
        reflectiveCurveToRelative(-35.13f, 12.44f, -48f, 10.56f)
        reflectiveCurveTo(356.36f, 258.08f, 340.59f, 254.34f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(404.28f, 294.84f)
        lineTo(295.39f, 272.38f)
        curveToRelative(-9.2f, -1.9f, -16.58f, 3.16f, -20f, 18.32f)
        curveTo(264.18f, 340.46f, 280.26f, 400f, 330.62f, 400f)
        curveToRelative(47.69f, 0f, 79.47f, -54.36f, 84.66f, -83.58f)
        curveTo(417.64f, 303.17f, 414.26f, 296.89f, 404.28f, 294.84f)
        close()
      }
    }.build()

    return _FootstepsSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FootstepsSharp: ImageVector? = null
