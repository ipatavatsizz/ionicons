package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CameraReverse: ImageVector
  get() {
    if (_CameraReverseSharp != null) {
      return _CameraReverseSharp!!
    }
    _CameraReverseSharp = ImageVector.Builder(
      name = "Sharp.CameraReverseSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(456f, 144f)
        lineTo(373f, 144f)
        curveToRelative(-3f, 0f, -6.72f, -1.94f, -9.62f, -5f)
        lineTo(336.07f, 96.21f)
        curveTo(326f, 80f, 320f, 80f, 302f, 80f)
        lineTo(210f, 80f)
        curveToRelative(-18f, 0f, -23f, 0f, -34.07f, 16.21f)
        lineTo(148.62f, 139f)
        curveToRelative(-2.22f, 2.42f, -5.34f, 5f, -8.62f, 5f)
        lineTo(140f, 128f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
        lineTo(92f, 120f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
        verticalLineToRelative(16f)
        lineTo(56f, 144f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, 24f)
        lineTo(32f, 408f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        lineTo(456f, 432f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        lineTo(480f, 168f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 456f, 144f)
        close()
        moveTo(256f, 368f)
        curveToRelative(-47.82f, 0f, -87.76f, -34.23f, -95f, -80f)
        lineTo(117.37f, 288f)
        lineTo(176f, 229.37f)
        lineTo(234.63f, 288f)
        lineTo(194f, 288f)
        arcToRelative(
          64.07f,
          64.07f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          102.63f,
          33.49f
        )
        lineTo(320f, 343f)
        lineToRelative(-3.68f, 3.72f)
        arcTo(96.64f, 96.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 368f)
        close()
        moveTo(336f, 314.16f)
        lineTo(277.11f, 256f)
        lineTo(318f, 256f)
        arcToRelative(
          64.26f,
          64.26f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -103f,
          -33.36f
        )
        lineTo(192f, 200f)
        lineToRelative(3.14f, -2.45f)
        arcTo(96.19f, 96.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 255.76f, 176f)
        curveToRelative(47.85f, 0f, 87f, 34.19f, 94.24f, 80f)
        horizontalLineToRelative(44.92f)
        close()
      }
    }.build()

    return _CameraReverseSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CameraReverseSharp: ImageVector? = null
