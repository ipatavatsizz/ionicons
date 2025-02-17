package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Barbell: ImageVector
  get() {
    if (_BarbellOutline != null) {
      return _BarbellOutline!!
    }
    _BarbellOutline = ImageVector.Builder(
      name = "Outline.BarbellOutline",
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
        moveTo(48f, 256f)
        lineTo(464f, 256f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(400f, 128f)
        lineTo(400f, 128f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 144f)
        lineTo(416f, 368f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 400f, 384f)
        lineTo(400f, 384f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 384f, 368f)
        lineTo(384f, 144f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 400f, 128f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 128f)
        lineTo(112f, 128f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 144f)
        lineTo(128f, 368f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 384f)
        lineTo(112f, 384f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 368f)
        lineTo(96f, 144f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 128f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(40f, 192f)
        lineTo(40f, 192f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 200f)
        lineTo(48f, 312f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 320f)
        lineTo(40f, 320f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 312f)
        lineTo(32f, 200f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 192f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(472f, 192f)
        lineTo(472f, 192f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 480f, 200f)
        lineTo(480f, 312f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 472f, 320f)
        lineTo(472f, 320f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 312f)
        lineTo(464f, 200f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 472f, 192f)
        close()
      }
    }.build()

    return _BarbellOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BarbellOutline: ImageVector? = null
