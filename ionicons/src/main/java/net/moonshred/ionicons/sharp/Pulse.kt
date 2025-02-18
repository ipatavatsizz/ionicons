package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Pulse: ImageVector
  get() {
    if (_PulseSharp != null) {
      return _PulseSharp!!
    }
    _PulseSharp = ImageVector.Builder(
      name = "Sharp.PulseSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(426f, 266f)
        arcToRelative(
          54.07f,
          54.07f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -49.3f,
          32f
        )
        horizontalLineTo(351.86f)
        lineToRelative(-27f, -81f)
        arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -42f, 0.92f)
        lineTo(245.66f, 348.12f)
        lineToRelative(-48f, -281.74f)
        arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -43f, -1.72f)
        lineTo(94.82f, 298f)
        horizontalLineTo(32f)
        verticalLineToRelative(44f)
        horizontalLineToRelative(80f)
        arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.34f, -16.66f)
        lineTo(171.69f, 172f)
        lineTo(218.3f, 445.62f)
        arcTo(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 238.76f, 464f)
        curveToRelative(0.42f, 0f, 0.82f, 0f, 1.24f, 0f)
        arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.15f, -16f)
        lineToRelative(44.47f, -149.62f)
        lineTo(315.13f, 327f)
        arcTo(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 336f, 342f)
        horizontalLineToRelative(40.7f)
        arcTo(54f, 54f, 0f, isMoreThanHalf = true, isPositiveArc = false, 426f, 266f)
        close()
      }
    }.build()

    return _PulseSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PulseSharp: ImageVector? = null
