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

val Ionicons.Outline.Car: ImageVector
  get() {
    if (_CarOutline != null) {
      return _CarOutline!!
    }
    _CarOutline = ImageVector.Builder(
      name = "Outline.CarOutline",
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
        moveTo(80f, 224f)
        lineToRelative(37.78f, -88.15f)
        curveTo(123.93f, 121.5f, 139.6f, 112f, 157.11f, 112f)
        horizontalLineTo(354.89f)
        curveToRelative(17.51f, 0f, 33.18f, 9.5f, 39.33f, 23.85f)
        lineTo(432f, 224f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(80f, 224f)
        horizontalLineToRelative(352f)
        verticalLineToRelative(144f)
        horizontalLineToRelative(-352f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 368f)
        lineToRelative(0f, 32f)
        lineToRelative(-32f, 0f)
        lineToRelative(0f, -32f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(432f, 368f)
        lineToRelative(0f, 32f)
        lineToRelative(-32f, 0f)
        lineToRelative(0f, -32f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 288f)
        moveToRelative(-16f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(368f, 288f)
        moveToRelative(-16f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
      }
    }.build()

    return _CarOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CarOutline: ImageVector? = null
