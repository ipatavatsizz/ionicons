package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.TrendingUp: ImageVector
  get() {
    if (_TrendingUpOutline != null) {
      return _TrendingUpOutline!!
    }
    _TrendingUpOutline = ImageVector.Builder(
      name = "Outline.TrendingUpOutline",
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
        moveTo(352f, 144f)
        lineToRelative(112f, 0f)
        lineToRelative(0f, 112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 368f)
        lineTo(169.37f, 246.63f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 45.26f, 0f)
        lineToRelative(50.74f, 50.74f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 45.26f, 0f)
        lineTo(448f, 160f)
      }
    }.build()

    return _TrendingUpOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TrendingUpOutline: ImageVector? = null
