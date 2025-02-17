package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Today: ImageVector
  get() {
    if (_TodayOutline != null) {
      return _TodayOutline!!
    }
    _TodayOutline = ImageVector.Builder(
      name = "Outline.TodayOutline",
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
        moveTo(96f, 80f)
        lineTo(416f, 80f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 128f)
        lineTo(464f, 416f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 464f)
        lineTo(96f, 464f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 416f)
        lineTo(48f, 128f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 80f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(128f, 48f)
        lineTo(128f, 80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(384f, 48f)
        lineTo(384f, 80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(125f, 224f)
        lineTo(195f, 224f)
        arcTo(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 237f)
        lineTo(208f, 307f)
        arcTo(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 195f, 320f)
        lineTo(125f, 320f)
        arcTo(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 307f)
        lineTo(112f, 237f)
        arcTo(13f, 13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 125f, 224f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(464f, 160f)
        lineTo(48f, 160f)
      }
    }.build()

    return _TodayOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TodayOutline: ImageVector? = null
