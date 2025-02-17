package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Snow: ImageVector
  get() {
    if (_SnowOutline != null) {
      return _SnowOutline!!
    }
    _SnowOutline = ImageVector.Builder(
      name = "Outline.SnowOutline",
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
        moveTo(256f, 32f)
        lineTo(256f, 480f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(313.72f, 80f)
        arcTo(111.47f, 111.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 96f)
        arcToRelative(
          111.47f,
          111.47f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -57.72f,
          -16f
        )
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(198.28f, 432f)
        arcToRelative(
          112.11f,
          112.11f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          115.44f,
          0f
        )
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(449.99f, 144f)
        lineTo(62.01f, 368f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(437.27f, 218f)
        arcToRelative(
          112.09f,
          112.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -57.71f,
          -100f
        )
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(74.73f, 294f)
        arcToRelative(
          112.09f,
          112.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          57.71f,
          100f
        )
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(62.01f, 144f)
        lineTo(449.99f, 368f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(74.73f, 218f)
        arcToRelative(
          112.09f,
          112.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          57.71f,
          -100f
        )
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(437.27f, 294f)
        arcToRelative(
          112.09f,
          112.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -57.71f,
          100f
        )
      }
    }.build()

    return _SnowOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SnowOutline: ImageVector? = null
