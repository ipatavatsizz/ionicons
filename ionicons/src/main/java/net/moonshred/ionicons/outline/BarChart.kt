package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.BarChart: ImageVector
  get() {
    if (_BarChartOutline != null) {
      return _BarChartOutline!!
    }
    _BarChartOutline = ImageVector.Builder(
      name = "Outline.BarChartOutline",
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
        moveTo(32f, 32f)
        verticalLineTo(464f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineTo(480f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(116f, 224f)
        lineTo(156f, 224f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 244f)
        lineTo(176f, 396f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 416f)
        lineTo(116f, 416f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 396f)
        lineTo(96f, 244f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 116f, 224f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(260f, 176f)
        lineTo(300f, 176f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 320f, 196f)
        lineTo(320f, 396f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 300f, 416f)
        lineTo(260f, 416f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 396f)
        lineTo(240f, 196f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 260f, 176f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(403.64f, 112f)
        lineTo(443.64f, 112f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 463.64f, 132f)
        lineTo(463.64f, 396f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 443.64f, 416f)
        lineTo(403.64f, 416f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 383.64f, 396f)
        lineTo(383.64f, 132f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 403.64f, 112f)
        close()
      }
    }.build()

    return _BarChartOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BarChartOutline: ImageVector? = null
