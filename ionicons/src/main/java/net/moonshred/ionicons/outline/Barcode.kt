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

val Ionicons.Outline.Barcode: ImageVector
  get() {
    if (_BarcodeOutline != null) {
      return _BarcodeOutline!!
    }
    _BarcodeOutline = ImageVector.Builder(
      name = "Outline.BarcodeOutline",
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
        moveTo(384f, 400.33f)
        lineToRelative(35.13f, -0.33f)
        arcTo(29f, 29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 448f, 371.13f)
        verticalLineTo(140.87f)
        arcTo(29f, 29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 419.13f, 112f)
        lineToRelative(-35.13f, 0.33f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(128f, 112f)
        lineToRelative(-36.8f, 0.33f)
        curveToRelative(-15.88f, 0f, -27.2f, 13f, -27.2f, 28.87f)
        verticalLineTo(371.47f)
        curveToRelative(0f, 15.87f, 11.32f, 28.86f, 27.2f, 28.86f)
        lineTo(128f, 400f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(384f, 192f)
        lineTo(384f, 320f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 160f)
        lineTo(320f, 352f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 176f)
        lineTo(256f, 336f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(192f, 160f)
        lineTo(192f, 352f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(128f, 192f)
        lineTo(128f, 320f)
      }
    }.build()

    return _BarcodeOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BarcodeOutline: ImageVector? = null
