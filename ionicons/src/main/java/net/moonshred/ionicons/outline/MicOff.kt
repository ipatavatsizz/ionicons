package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.MicOff: ImageVector
  get() {
    if (_MicOffOutline != null) {
      return _MicOffOutline!!
    }
    _MicOffOutline = ImageVector.Builder(
      name = "Outline.MicOffOutline",
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
        moveTo(432f, 400f)
        lineTo(96f, 64f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(400f, 240f)
        verticalLineTo(208.45f)
        curveToRelative(0f, -8.61f, -6.62f, -16f, -15.23f, -16.43f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 368f, 208f)
        verticalLineToRelative(32f)
        arcToRelative(
          111.58f,
          111.58f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -2.45f,
          23.31f
        )
        arcToRelative(4.05f, 4.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.07f, 3.69f)
        lineToRelative(21.82f, 21.81f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.29f, -0.72f)
        arcTo(143.27f, 143.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 400f, 240f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 352f)
        arcTo(112.36f, 112.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 240f)
        verticalLineTo(208.45f)
        curveToRelative(0f, -8.61f, -6.62f, -16f, -15.23f, -16.43f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 208f)
        verticalLineToRelative(32f)
        curveToRelative(0f, 74f, 56.1f, 135.12f, 128f, 143.11f)
        verticalLineTo(432f)
        horizontalLineTo(192.45f)
        curveToRelative(-8.61f, 0f, -16f, 6.62f, -16.43f, 15.23f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 464f)
        horizontalLineTo(319.55f)
        curveToRelative(8.61f, 0f, 16f, -6.62f, 16.43f, -15.23f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 320f, 432f)
        horizontalLineTo(272f)
        verticalLineTo(383.11f)
        arcToRelative(
          143.08f,
          143.08f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          52f,
          -16.22f
        )
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.91f, -6.35f)
        lineTo(307f, 342.63f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.51f, -0.78f)
        arcTo(110.78f, 110.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 352f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 80f)
        arcToRelative(47.18f, 47.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
        verticalLineToRelative(74.72f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.17f, 2.82f)
        lineTo(332.59f, 233f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.41f, -1.42f)
        verticalLineTo(128.91f)
        curveTo(336f, 85f, 301f, 48.6f, 257.14f, 48f)
        arcToRelative(
          79.66f,
          79.66f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -68.47f,
          36.57f
        )
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.54f, 5f)
        lineToRelative(19.54f, 19.54f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.25f, -0.63f)
        arcTo(47.44f, 47.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(207.27f, 242.9f)
        lineTo(179.41f, 215f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.41f, 1.42f)
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
          77.8f,
          21.19f
        )
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.86f, -3.35f)
        lineTo(253.2f, 288.83f)
        arcToRelative(
          4.08f,
          4.08f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -2.42f,
          -1.15f
        )
        curveToRelative(-21.65f, -2.52f, -39.48f, -20.44f, -42.37f, -42.43f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 207.27f, 242.9f)
        close()
      }
    }.build()

    return _MicOffOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MicOffOutline: ImageVector? = null
