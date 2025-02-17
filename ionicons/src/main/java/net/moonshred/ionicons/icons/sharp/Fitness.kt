package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Fitness: ImageVector
  get() {
    if (_FitnessSharp != null) {
      return _FitnessSharp!!
    }
    _FitnessSharp = ImageVector.Builder(
      name = "Sharp.FitnessSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 272f)
        horizontalLineTo(442.66f)
        arcToRelative(
          261.41f,
          261.41f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -18.25f,
          32f
        )
        horizontalLineTo(480f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 240f)
        verticalLineToRelative(32f)
        horizontalLineTo(69.34f)
        arcToRelative(
          225.1f,
          225.1f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -12.4f,
          -32f
        )
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(304f, 259.78f)
        lineTo(252.27f, 363.24f)
        lineToRelative(-48f, -160f)
        lineTo(169.89f, 272f)
        horizontalLineTo(69.34f)
        curveToRelative(10f, 20.92f, 23.5f, 41.41f, 40.63f, 61.68f)
        curveToRelative(40.12f, 47.46f, 94.25f, 79.75f, 137f, 108.32f)
        lineToRelative(9f, 6f)
        lineToRelative(9f, -6f)
        curveToRelative(42.78f, -28.57f, 96.91f, -60.86f, 137f, -108.32f)
        arcTo(322.78f, 322.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 424.41f, 304f)
        horizontalLineToRelative(-98.3f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(211.73f, 116.76f)
        lineToRelative(48f, 160f)
        lineTo(304f, 188.22f)
        lineTo(345.89f, 272f)
        horizontalLineToRelative(96.77f)
        arcTo(213.13f, 213.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 464f, 176.65f)
        curveTo(463.37f, 114.54f, 413.54f, 64f, 352.92f, 64f)
        curveToRelative(-48.11f, 0f, -80.1f, 28f, -96.92f, 48.21f)
        curveTo(239.18f, 92f, 207.19f, 64f, 159.08f, 64f)
        curveTo(98.46f, 64f, 48.63f, 114.54f, 48f, 176.65f)
        arcTo(211.23f, 211.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56.94f, 240f)
        horizontalLineToRelative(93.17f)
        close()
      }
    }.build()

    return _FitnessSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FitnessSharp: ImageVector? = null
