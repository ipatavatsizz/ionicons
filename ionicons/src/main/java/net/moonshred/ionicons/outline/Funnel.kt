package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Funnel: ImageVector
  get() {
    if (_FunnelOutline != null) {
      return _FunnelOutline!!
    }
    _FunnelOutline = ImageVector.Builder(
      name = "Outline.FunnelOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(35.4f, 87.12f)
        lineTo(204.05f, 283.56f)
        arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 294f)
        verticalLineTo(413.32f)
        arcToRelative(7.93f, 7.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.39f, 7.59f)
        lineToRelative(80.15f, 26.67f)
        arcTo(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 304f, 440f)
        verticalLineTo(294f)
        arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 308f, 283.56f)
        lineTo(476.6f, 87.12f)
        arcTo(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 466f, 64f)
        horizontalLineTo(46.05f)
        arcTo(14f, 14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 35.4f, 87.12f)
        close()
      }
    }.build()

    return _FunnelOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FunnelOutline: ImageVector? = null
