package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.EyeOff: ImageVector
  get() {
    if (_EyeOffSharp != null) {
      return _EyeOffSharp!!
    }
    _EyeOffSharp = ImageVector.Builder(
      name = "Sharp.EyeOffSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(64f, 86f)
        lineToRelative(22f, -22f)
        lineToRelative(362f, 362f)
        lineToRelative(-22f, 22f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(259.34f, 192.09f)
        lineToRelative(60.57f, 60.57f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 259.34f, 192.09f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(252.66f, 319.91f)
        lineToRelative(-60.57f, -60.57f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 252.66f, 319.91f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 352f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -92.6f, -121.34f)
        lineTo(94.33f, 161.58f)
        curveTo(66.12f, 187.42f, 39.24f, 221.14f, 16f, 256f)
        curveToRelative(26.42f, 44f, 62.56f, 89.24f, 100.2f, 115.18f)
        curveTo(159.38f, 400.92f, 206.33f, 416f, 255.76f, 416f)
        arcTo(233.47f, 233.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 335f, 402.2f)
        lineToRelative(-53.61f, -53.6f)
        arcTo(95.84f, 95.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 352f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 160f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92.6f, 121.34f)
        lineTo(419.26f, 352f)
        curveToRelative(29.15f, -26.25f, 56.07f, -61.56f, 76.74f, -96f)
        curveToRelative(-26.38f, -43.43f, -62.9f, -88.56f, -101.18f, -114.82f)
        curveTo(351.1f, 111.2f, 304.31f, 96f, 255.76f, 96f)
        arcToRelative(
          222.92f,
          222.92f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -78.21f,
          14.29f
        )
        lineToRelative(53.11f, 53.11f)
        arcTo(95.84f, 95.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 160f)
        close()
      }
    }.build()

    return _EyeOffSharp!!
  }

@Suppress("ObjectPropertyName")
private var _EyeOffSharp: ImageVector? = null
