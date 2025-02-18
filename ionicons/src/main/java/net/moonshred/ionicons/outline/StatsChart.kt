package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.StatsChart: ImageVector
  get() {
    if (_StatsChartOutline != null) {
      return _StatsChartOutline!!
    }
    _StatsChartOutline = ImageVector.Builder(
      name = "Outline.StatsChartOutline",
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
        moveTo(72f, 320f)
        lineTo(104f, 320f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 328f)
        lineTo(112f, 472f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 480f)
        lineTo(72f, 480f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 472f)
        lineTo(64f, 328f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 320f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(296f, 224f)
        lineTo(328f, 224f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 232f)
        lineTo(336f, 472f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 328f, 480f)
        lineTo(296f, 480f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 288f, 472f)
        lineTo(288f, 232f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 296f, 224f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(408f, 112f)
        lineTo(440f, 112f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 448f, 120f)
        lineTo(448f, 472f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 440f, 480f)
        lineTo(408f, 480f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 400f, 472f)
        lineTo(400f, 120f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 408f, 112f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(184f, 32f)
        lineTo(216f, 32f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 40f)
        lineTo(224f, 472f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 480f)
        lineTo(184f, 480f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 472f)
        lineTo(176f, 40f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 32f)
        close()
      }
    }.build()

    return _StatsChartOutline!!
  }

@Suppress("ObjectPropertyName")
private var _StatsChartOutline: ImageVector? = null
