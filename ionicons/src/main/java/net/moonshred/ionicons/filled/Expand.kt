package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Expand: ImageVector
  get() {
    if (_Expand != null) {
      return _Expand!!
    }
    _Expand = ImageVector.Builder(
      name = "Filled.Expand",
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
        moveTo(432f, 320f)
        lineToRelative(0f, 112f)
        lineToRelative(-112f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(421.8f, 421.77f)
        lineTo(304f, 304f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(80f, 192f)
        lineToRelative(0f, -112f)
        lineToRelative(112f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(90.2f, 90.23f)
        lineTo(208f, 208f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 80f)
        lineToRelative(112f, 0f)
        lineToRelative(0f, 112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(421.77f, 90.2f)
        lineTo(304f, 208f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(192f, 432f)
        lineToRelative(-112f, 0f)
        lineToRelative(0f, -112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(90.23f, 421.8f)
        lineTo(208f, 304f)
      }
    }.build()

    return _Expand!!
  }

@Suppress("ObjectPropertyName")
private var _Expand: ImageVector? = null
