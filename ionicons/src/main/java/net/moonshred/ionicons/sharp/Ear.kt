package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Ear: ImageVector
  get() {
    if (_EarSharp != null) {
      return _EarSharp!!
    }
    _EarSharp = ImageVector.Builder(
      name = "Sharp.EarSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(380.48f, 68.09f)
        curveTo(347.09f, 34.5f, 302.88f, 16f, 256f, 16f)
        curveTo(159f, 16f, 80f, 95f, 80f, 192f)
        verticalLineTo(398.57f)
        arcToRelative(
          97.59f,
          97.59f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          28f,
          68.49f
        )
        arcTo(94.49f, 94.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 496f)
        curveToRelative(19.93f, 0f, 41.06f, -7.69f, 62.8f, -22.87f)
        arcToRelative(
          181.46f,
          181.46f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          25.88f,
          -21.86f
        )
        curveTo(327.37f, 390.16f, 432f, 288.06f, 432f, 192f)
        curveTo(432f, 145.51f, 413.71f, 101.51f, 380.48f, 68.09f)
        close()
        moveTo(368f, 200f)
        horizontalLineTo(336f)
        verticalLineTo(184f)
        curveToRelative(0f, -39.7f, -35.89f, -72f, -80f, -72f)
        reflectiveCurveToRelative(-80f, 32.3f, -80f, 72f)
        verticalLineToRelative(30.41f)
        curveToRelative(27.5f, -7.84f, 59.89f, -6.62f, 64.26f, -6.41f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38.62f, 75.9f)
        curveToRelative(-0.3f, 0.41f, -0.61f, 0.81f, -0.95f, 1.2f)
        curveToRelative(-16.55f, 19f, -36f, 45.49f, -38.46f, 55f)
        lineToRelative(-4.07f, 15.47f)
        lineToRelative(-30.94f, -8.14f)
        lineToRelative(4.07f, -15.47f)
        curveToRelative(5.51f, -20.94f, 36.93f, -58.2f, 44.66f, -67.15f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 239.82f, 240f)
        lineToRelative(-0.88f, 0f)
        curveToRelative(-10.67f, -0.58f, -42.66f, -0.25f, -62.12f, 8f)
        lineToRelative(-0.82f, 0.35f)
        verticalLineTo(320f)
        horizontalLineTo(144f)
        verticalLineTo(184f)
        curveToRelative(0f, -57.35f, 50.24f, -104f, 112f, -104f)
        reflectiveCurveToRelative(112f, 46.65f, 112f, 104f)
        close()
      }
    }.build()

    return _EarSharp!!
  }

@Suppress("ObjectPropertyName")
private var _EarSharp: ImageVector? = null
