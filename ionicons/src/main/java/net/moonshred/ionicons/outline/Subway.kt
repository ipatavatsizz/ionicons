package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Subway: ImageVector
  get() {
    if (_SubwayOutline != null) {
      return _SubwayOutline!!
    }
    _SubwayOutline = ImageVector.Builder(
      name = "Outline.SubwayOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(160f, 32f)
        lineTo(352f, 32f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 400f, 80f)
        lineTo(400f, 336f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 352f, 384f)
        lineTo(160f, 384f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 336f)
        lineTo(112f, 80f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 32f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(208f, 80f)
        lineTo(304f, 80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 128f)
        lineTo(368f, 128f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 400f, 160f)
        lineTo(400f, 192f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 224f)
        lineTo(144f, 224f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 192f)
        lineTo(112f, 160f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 128f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(176f, 320f)
        moveToRelative(-16f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(336f, 320f)
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

    return _SubwayOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SubwayOutline: ImageVector? = null
