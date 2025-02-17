package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Grid: ImageVector
  get() {
    if (_GridOutline != null) {
      return _GridOutline!!
    }
    _GridOutline = ImageVector.Builder(
      name = "Outline.GridOutline",
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
        moveTo(68f, 48f)
        lineTo(204f, 48f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 68f)
        lineTo(224f, 204f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 204f, 224f)
        lineTo(68f, 224f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 204f)
        lineTo(48f, 68f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(308f, 48f)
        lineTo(444f, 48f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 68f)
        lineTo(464f, 204f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 444f, 224f)
        lineTo(308f, 224f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 288f, 204f)
        lineTo(288f, 68f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 308f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(68f, 288f)
        lineTo(204f, 288f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 308f)
        lineTo(224f, 444f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 204f, 464f)
        lineTo(68f, 464f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 444f)
        lineTo(48f, 308f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68f, 288f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(308f, 288f)
        lineTo(444f, 288f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 308f)
        lineTo(464f, 444f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 444f, 464f)
        lineTo(308f, 464f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 288f, 444f)
        lineTo(288f, 308f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 308f, 288f)
        close()
      }
    }.build()

    return _GridOutline!!
  }

@Suppress("ObjectPropertyName")
private var _GridOutline: ImageVector? = null
