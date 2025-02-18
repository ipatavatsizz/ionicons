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

val Ionicons.Outline.Rainy: ImageVector
  get() {
    if (_RainyOutline != null) {
      return _RainyOutline!!
    }
    _RainyOutline = ImageVector.Builder(
      name = "Outline.RainyOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(114.61f, 162.85f)
        arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 149.6f)
        curveTo(140.09f, 76.17f, 193.63f, 32f, 256f, 32f)
        curveToRelative(57.93f, 0f, 96.62f, 37.75f, 112.2f, 77.74f)
        arcToRelative(
          15.84f,
          15.84f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          12.2f,
          9.87f
        )
        curveToRelative(50f, 8.15f, 91.6f, 41.54f, 91.6f, 99.59f)
        curveTo(472f, 278.6f, 423.4f, 320f, 364f, 320f)
        horizontalLineTo(130f)
        curveToRelative(-49.5f, 0f, -90f, -24.7f, -90f, -79.2f)
        curveTo(40f, 192.33f, 78.67f, 168.58f, 114.61f, 162.85f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 384f)
        lineTo(112f, 432f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(224f, 384f)
        lineTo(160f, 480f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(304f, 384f)
        lineTo(272f, 432f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(384f, 384f)
        lineTo(320f, 480f)
      }
    }.build()

    return _RainyOutline!!
  }

@Suppress("ObjectPropertyName")
private var _RainyOutline: ImageVector? = null
