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

val Ionicons.Outline.Crop: ImageVector
  get() {
    if (_CropOutline != null) {
      return _CropOutline!!
    }
    _CropOutline = ImageVector.Builder(
      name = "Outline.CropOutline",
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
        moveTo(144f, 48f)
        verticalLineTo(320f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
        horizontalLineTo(464f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(368f, 304f)
        verticalLineTo(192f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        horizontalLineTo(208f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(368f, 368f)
        lineTo(368f, 464f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 144f)
        lineTo(48f, 144f)
      }
    }.build()

    return _CropOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CropOutline: ImageVector? = null
