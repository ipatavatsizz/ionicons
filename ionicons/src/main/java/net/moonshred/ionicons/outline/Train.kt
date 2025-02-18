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

val Ionicons.Outline.Train: ImageVector
  get() {
    if (_TrainOutline != null) {
      return _TrainOutline!!
    }
    _TrainOutline = ImageVector.Builder(
      name = "Outline.TrainOutline",
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
        moveTo(344f, 48f)
        lineTo(320f, 48f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        lineTo(208f, 32f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        lineTo(168f, 48f)
        arcToRelative(56.16f, 56.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 56f)
        lineTo(112f, 351f)
        curveToRelative(0f, 35.3f, 144f, 65f, 144f, 65f)
        reflectiveCurveToRelative(144f, -29.7f, 144f, -65f)
        lineTo(400f, 104f)
        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 344f, 48f)
        close()
        moveTo(256f, 352f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, -48f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 352f)
        close()
        moveTo(352f, 192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
        lineTo(176f, 208f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
        lineTo(160f, 128f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        lineTo(336f, 112f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 464f)
        lineTo(368f, 464f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(336f, 432f)
        lineTo(384f, 480f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(176f, 432f)
        lineTo(128f, 480f)
      }
    }.build()

    return _TrainOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TrainOutline: ImageVector? = null
