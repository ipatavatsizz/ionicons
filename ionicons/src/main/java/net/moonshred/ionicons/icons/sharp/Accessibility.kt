package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Accessibility: ImageVector
  get() {
    if (_AccessibilitySharp != null) {
      return _AccessibilitySharp!!
    }
    _AccessibilitySharp = ImageVector.Builder(
      name = "Sharp.AccessibilitySharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 112f)
        curveToRelative(-66.82f, 17.92f, -119.55f, 32f, -192f, 32f)
        reflectiveCurveTo(130.82f, 129.92f, 64f, 112f)
        lineTo(48f, 163f)
        curveToRelative(48f, 20.53f, 96.71f, 35.16f, 147.2f, 53.2f)
        lineTo(144f, 496f)
        lineToRelative(56.4f, 16f)
        lineTo(246f, 336f)
        horizontalLineToRelative(20f)
        lineToRelative(45.6f, 176f)
        lineTo(368f, 496f)
        lineTo(316.8f, 216.2f)
        curveTo(367.26f, 199.93f, 416f, 183.53f, 464f, 164f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 112f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, -56f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 112f)
        close()
      }
    }.build()

    return _AccessibilitySharp!!
  }

@Suppress("ObjectPropertyName")
private var _AccessibilitySharp: ImageVector? = null
