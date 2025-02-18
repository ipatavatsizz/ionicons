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

val Ionicons.Outline.Easel: ImageVector
  get() {
    if (_EaselOutline != null) {
      return _EaselOutline!!
    }
    _EaselOutline = ImageVector.Builder(
      name = "Outline.EaselOutline",
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
        moveTo(80f, 80f)
        lineTo(432f, 80f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 112f)
        lineTo(464f, 320f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 432f, 352f)
        lineTo(80f, 352f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 320f)
        lineTo(48f, 112f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 80f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 416f)
        lineTo(256f, 352f)
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
        moveTo(400f, 464f)
        lineTo(368f, 352f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 464f)
        lineTo(144f, 352f)
      }
    }.build()

    return _EaselOutline!!
  }

@Suppress("ObjectPropertyName")
private var _EaselOutline: ImageVector? = null
