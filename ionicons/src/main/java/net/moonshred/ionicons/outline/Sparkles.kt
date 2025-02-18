package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Sparkles: ImageVector
  get() {
    if (_SparklesOutline != null) {
      return _SparklesOutline!!
    }
    _SparklesOutline = ImageVector.Builder(
      name = "Outline.SparklesOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(259.92f, 262.91f)
        lineTo(216.4f, 149.77f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16.8f, 0f)
        lineTo(156.08f, 262.91f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.17f, 5.17f)
        lineTo(37.77f, 311.6f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16.8f)
        lineToRelative(113.14f, 43.52f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.17f, 5.17f)
        lineTo(199.6f, 490.23f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.8f, 0f)
        lineToRelative(43.52f, -113.14f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.17f, -5.17f)
        lineTo(378.23f, 328.4f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16.8f)
        lineTo(265.09f, 268.08f)
        arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 259.92f, 262.91f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(108f, 68f)
        lineToRelative(-20f, -52f)
        lineToRelative(-20f, 52f)
        lineToRelative(-52f, 20f)
        lineToRelative(52f, 20f)
        lineToRelative(20f, 52f)
        lineToRelative(20f, -52f)
        lineToRelative(52f, -20f)
        lineToRelative(-52f, -20f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(426.67f, 117.33f)
        lineToRelative(-26.67f, -69.33f)
        lineToRelative(-26.67f, 69.33f)
        lineToRelative(-69.33f, 26.67f)
        lineToRelative(69.33f, 26.67f)
        lineToRelative(26.67f, 69.33f)
        lineToRelative(26.67f, -69.33f)
        lineToRelative(69.33f, -26.67f)
        lineToRelative(-69.33f, -26.67f)
        close()
      }
    }.build()

    return _SparklesOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SparklesOutline: ImageVector? = null
