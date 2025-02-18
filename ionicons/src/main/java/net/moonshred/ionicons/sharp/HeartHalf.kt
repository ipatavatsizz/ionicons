package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.HeartHalf: ImageVector
  get() {
    if (_HeartHalfSharp != null) {
      return _HeartHalfSharp!!
    }
    _HeartHalfSharp = ImageVector.Builder(
      name = "Sharp.HeartHalfSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(352.92f, 64f)
        curveToRelative(-48.11f, 0f, -80.1f, 28f, -96.92f, 48.21f)
        curveTo(239.18f, 92f, 207.19f, 64f, 159.08f, 64f)
        curveTo(98.46f, 64f, 48.63f, 114.54f, 48f, 176.65f)
        curveToRelative(-0.56f, 55.68f, 19.71f, 107f, 62f, 157f)
        curveToRelative(40.12f, 47.46f, 94.25f, 79.75f, 137f, 108.32f)
        lineToRelative(9f, 6f)
        lineToRelative(9f, -6f)
        curveToRelative(42.78f, -28.57f, 96.91f, -60.86f, 137f, -108.32f)
        curveToRelative(42.25f, -50f, 62.52f, -101.35f, 62f, -157f)
        curveTo(463.37f, 114.54f, 413.54f, 64f, 352.92f, 64f)
        close()
        moveTo(377.59f, 313f)
        curveToRelative(-31.78f, 37.6f, -74.68f, 65.75f, -112.52f, 90.59f)
        lineToRelative(-9.07f, 6f)
        lineTo(256f, 162.23f)
        lineToRelative(24.59f, -29.54f)
        curveTo(294.53f, 116f, 318.38f, 96f, 352.92f, 96f)
        curveToRelative(43.15f, 0f, 78.62f, 36.32f, 79.07f, 81f)
        arcToRelative(
          178.63f,
          178.63f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -12.69f,
          68.59f
        )
        curveTo(410.27f, 268.43f, 396.63f, 290.5f, 377.59f, 313f)
        close()
      }
    }.build()

    return _HeartHalfSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HeartHalfSharp: ImageVector? = null
