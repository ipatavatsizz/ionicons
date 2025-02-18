package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Camera: ImageVector
  get() {
    if (_CameraSharp != null) {
      return _CameraSharp!!
    }
    _CameraSharp = ImageVector.Builder(
      name = "Sharp.CameraSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 272f)
        moveToRelative(-64f, 0f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 0f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, -128f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(456f, 144f)
        horizontalLineTo(373f)
        curveToRelative(-3f, 0f, -6.72f, -1.94f, -9.62f, -5f)
        lineToRelative(-27.28f, -42.8f)
        curveTo(325f, 80f, 320f, 80f, 302f, 80f)
        horizontalLineTo(210f)
        curveToRelative(-18f, 0f, -24f, 0f, -34.07f, 16.21f)
        lineTo(148.62f, 139f)
        curveToRelative(-2.22f, 2.42f, -5.34f, 5f, -8.62f, 5f)
        verticalLineTo(128f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
        horizontalLineTo(92f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
        verticalLineToRelative(16f)
        horizontalLineTo(56f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, 24f)
        verticalLineTo(408f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineTo(456f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        verticalLineTo(168f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 456f, 144f)
        close()
        moveTo(260.51f, 367.9f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 91.39f, -91.39f)
        arcTo(96.11f, 96.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 260.51f, 367.9f)
        close()
      }
    }.build()

    return _CameraSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CameraSharp: ImageVector? = null
