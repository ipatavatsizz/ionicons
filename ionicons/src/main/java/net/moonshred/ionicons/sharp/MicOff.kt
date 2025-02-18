package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.MicOff: ImageVector
  get() {
    if (_MicOffSharp != null) {
      return _MicOffSharp!!
    }
    _MicOffSharp = ImageVector.Builder(
      name = "Sharp.MicOffSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(432f, 400f)
        lineTo(96f, 64f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(368f, 192f)
        verticalLineToRelative(48f)
        arcToRelative(
          111.74f,
          111.74f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -2.93f,
          25.45f
        )
        lineTo(390.65f, 291f)
        arcTo(143.07f, 143.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 400f, 240f)
        verticalLineTo(192f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 432f)
        verticalLineTo(383.11f)
        arcToRelative(
          143.11f,
          143.11f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          56.65f,
          -18.83f
        )
        lineTo(305f, 340.65f)
        arcTo(112.13f, 112.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 240f)
        verticalLineTo(192f)
        horizontalLineTo(112f)
        verticalLineToRelative(48f)
        curveToRelative(0f, 74f, 56.1f, 135.12f, 128f, 143.11f)
        verticalLineTo(432f)
        horizontalLineTo(176f)
        verticalLineToRelative(32f)
        horizontalLineTo(336f)
        verticalLineTo(432f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 236.37f)
        verticalLineTo(128f)
        curveToRelative(0f, -44.86f, -35.14f, -80f, -80f, -80f)
        arcToRelative(
          79.68f,
          79.68f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -69f,
          39.34f
        )
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(176f, 211.63f)
        verticalLineTo(239f)
        arcToRelative(
          80.89f,
          80.89f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          23.45f,
          56.9f
        )
        arcToRelative(
          78.55f,
          78.55f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          81f,
          20.21f
        )
        close()
      }
    }.build()

    return _MicOffSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MicOffSharp: ImageVector? = null
