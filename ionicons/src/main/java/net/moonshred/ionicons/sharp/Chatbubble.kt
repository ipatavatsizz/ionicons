package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Chatbubble: ImageVector
  get() {
    if (_ChatbubbleSharp != null) {
      return _ChatbubbleSharp!!
    }
    _ChatbubbleSharp = ImageVector.Builder(
      name = "Sharp.ChatbubbleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(475.22f, 206.52f)
        curveTo(464.88f, 157.87f, 437.46f, 113.59f, 398f, 81.84f)
        arcTo(227.4f, 227.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 255.82f, 32f)
        curveTo(194.9f, 32f, 138f, 55.47f, 95.46f, 98.09f)
        curveTo(54.35f, 139.33f, 31.82f, 193.78f, 32f, 251.37f)
        arcTo(215.66f, 215.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 67.65f, 370.13f)
        lineTo(72f, 376.18f)
        lineTo(48f, 480f)
        lineToRelative(114.8f, -28.56f)
        reflectiveCurveToRelative(2.3f, 0.77f, 4f, 1.42f)
        reflectiveCurveToRelative(16.33f, 6.26f, 31.85f, 10.6f)
        curveToRelative(12.9f, 3.6f, 39.74f, 9f, 60.77f, 9f)
        curveToRelative(59.65f, 0f, 115.35f, -23.1f, 156.83f, -65.06f)
        curveTo(457.36f, 365.77f, 480f, 310.42f, 480f, 251.49f)
        arcTo(213.5f, 213.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 475.22f, 206.52f)
        close()
      }
    }.build()

    return _ChatbubbleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ChatbubbleSharp: ImageVector? = null
