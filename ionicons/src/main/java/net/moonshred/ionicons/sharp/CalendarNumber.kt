package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CalendarNumber: ImageVector
  get() {
    if (_CalendarNumberSharp != null) {
      return _CalendarNumberSharp!!
    }
    _CalendarNumberSharp = ImageVector.Builder(
      name = "Sharp.CalendarNumberSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 456f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineTo(456f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        verticalLineTo(176f)
        horizontalLineTo(32f)
        close()
        moveTo(342.17f, 212f)
        horizontalLineTo(368f)
        verticalLineTo(412f)
        horizontalLineTo(336f)
        verticalLineTo(256.29f)
        lineToRelative(-35.39f, 26.08f)
        lineToRelative(-19f, -25.76f)
        close()
        moveTo(222f, 335.3f)
        curveToRelative(-8.54f, -8.74f, -22.75f, -12.67f, -30.11f, -12.67f)
        horizontalLineToRelative(-16f)
        verticalLineToRelative(-32f)
        horizontalLineToRelative(16f)
        curveToRelative(4.85f, 0f, 17.41f, -2.6f, 25.28f, -10.65f)
        arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.57f, -16.08f)
        curveToRelative(0f, -23.23f, -28.63f, -23.9f, -31.89f, -23.9f)
        curveToRelative(-17.34f, 0f, -23.8f, 10.61f, -24.07f, 11.06f)
        lineToRelative(-8.13f, 13.78f)
        lineToRelative(-27.56f, -16.27f)
        lineToRelative(8.14f, -13.77f)
        curveToRelative(7.64f, -13f, 25.22f, -26.8f, 51.62f, -26.8f)
        curveToRelative(16.44f, 0f, 31.76f, 4.77f, 43.13f, 13.42f)
        curveToRelative(13.39f, 10.2f, 20.76f, 25.28f, 20.76f, 42.48f)
        arcTo(54f, 54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 302.35f)
        curveToRelative(-1.15f, 1.18f, -2.36f, 2.28f, -3.59f, 3.35f)
        arcToRelative(
          66.18f,
          66.18f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          8.42f,
          7.23f
        )
        curveToRelative(10.56f, 10.8f, 16.14f, 25.75f, 16.14f, 43.25f)
        curveToRelative(0f, 18.06f, -7.61f, 34f, -21.42f, 44.92f)
        curveToRelative(-12.17f, 9.61f, -28.75f, 14.9f, -46.7f, 14.9f)
        curveToRelative(-27.87f, 0f, -48.48f, -18.16f, -57.66f, -33.7f)
        lineToRelative(-8.13f, -13.78f)
        lineToRelative(27.56f, -16.27f)
        lineTo(162.78f, 366f)
        curveToRelative(1.08f, 1.84f, 11.15f, 18f, 30.1f, 18f)
        curveToRelative(16.66f, 0f, 36.12f, -7.29f, 36.12f, -27.82f)
        curveTo(229f, 349.93f, 227.78f, 341.23f, 222f, 335.3f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(456f, 64f)
        horizontalLineTo(400.08f)
        verticalLineTo(32f)
        horizontalLineToRelative(-48f)
        verticalLineTo(64f)
        horizontalLineTo(159.92f)
        verticalLineTo(32f)
        horizontalLineToRelative(-48f)
        verticalLineTo(64f)
        horizontalLineTo(56f)
        arcTo(23.8f, 23.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 87.77f)
        verticalLineTo(144f)
        horizontalLineTo(480f)
        verticalLineTo(87.77f)
        arcTo(23.8f, 23.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 456f, 64f)
        close()
      }
    }.build()

    return _CalendarNumberSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CalendarNumberSharp: ImageVector? = null
