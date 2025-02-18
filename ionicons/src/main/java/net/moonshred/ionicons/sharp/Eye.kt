package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Eye: ImageVector
  get() {
    if (_EyeSharp != null) {
      return _EyeSharp!!
    }
    _EyeSharp = ImageVector.Builder(
      name = "Sharp.EyeSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 256f)
        moveToRelative(-64f, 0f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 0f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, -128f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(394.82f, 141.18f)
        curveTo(351.1f, 111.2f, 304.31f, 96f, 255.76f, 96f)
        curveToRelative(-43.69f, 0f, -86.28f, 13f, -126.59f, 38.48f)
        curveTo(88.52f, 160.23f, 48.67f, 207f, 16f, 256f)
        curveToRelative(26.42f, 44f, 62.56f, 89.24f, 100.2f, 115.18f)
        curveTo(159.38f, 400.92f, 206.33f, 416f, 255.76f, 416f)
        curveToRelative(49f, 0f, 95.85f, -15.07f, 139.3f, -44.79f)
        curveTo(433.31f, 345f, 469.71f, 299.82f, 496f, 256f)
        curveTo(469.62f, 212.57f, 433.1f, 167.44f, 394.82f, 141.18f)
        close()
        moveTo(256f, 352f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, -96f)
        arcTo(96.11f, 96.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 352f)
        close()
      }
    }.build()

    return _EyeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _EyeSharp: ImageVector? = null
