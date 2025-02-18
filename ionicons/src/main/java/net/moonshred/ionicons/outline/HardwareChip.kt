package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.HardwareChip: ImageVector
  get() {
    if (_HardwareChipOutline != null) {
      return _HardwareChipOutline!!
    }
    _HardwareChipOutline = ImageVector.Builder(
      name = "Outline.HardwareChipOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(128f, 80f)
        lineTo(384f, 80f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 432f, 128f)
        lineTo(432f, 384f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 384f, 432f)
        lineTo(128f, 432f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 384f)
        lineTo(80f, 128f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 80f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 144f)
        lineTo(352f, 144f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 160f)
        lineTo(368f, 352f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 352f, 368f)
        lineTo(160f, 368f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 352f)
        lineTo(144f, 160f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 144f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 80f)
        lineTo(256f, 48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(336f, 80f)
        lineTo(336f, 48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(176f, 80f)
        lineTo(176f, 48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 464f)
        lineTo(256f, 432f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(336f, 464f)
        lineTo(336f, 432f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(176f, 464f)
        lineTo(176f, 432f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(432f, 256f)
        lineTo(464f, 256f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(432f, 336f)
        lineTo(464f, 336f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(432f, 176f)
        lineTo(464f, 176f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 256f)
        lineTo(80f, 256f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 336f)
        lineTo(80f, 336f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 176f)
        lineTo(80f, 176f)
      }
    }.build()

    return _HardwareChipOutline!!
  }

@Suppress("ObjectPropertyName")
private var _HardwareChipOutline: ImageVector? = null
