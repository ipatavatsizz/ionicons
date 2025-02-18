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

val Ionicons.Outline.Football: ImageVector
  get() {
    if (_FootballOutline != null) {
      return _FootballOutline!!
    }
    _FootballOutline = ImageVector.Builder(
      name = "Outline.FootballOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(256f, 256f)
        moveToRelative(-192f, 0f)
        arcToRelative(192f, 192f, 0f, isMoreThanHalf = true, isPositiveArc = true, 384f, 0f)
        arcToRelative(192f, 192f, 0f, isMoreThanHalf = true, isPositiveArc = true, -384f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 175.15f)
        lineToRelative(-76.09f, 63.83f)
        lineToRelative(20.09f, 81.02f)
        lineToRelative(56f, 0f)
        lineToRelative(56f, 0f)
        lineToRelative(20.09f, -81.02f)
        lineToRelative(-76.09f, -63.83f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(332.09f, 238.98f)
        lineToRelative(52.87f, -22.4f)
        lineToRelative(25.78f, -73.26f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(447f, 269.97f)
        lineTo(384.96f, 216.58f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(179.91f, 238.98f)
        lineToRelative(-52.87f, -22.4f)
        lineToRelative(-25.78f, -73.26f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(65f, 269.97f)
        lineTo(127.04f, 216.58f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 175.15f)
        lineToRelative(0f, -57.57f)
        lineToRelative(64f, -42.64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(192f, 74.93f)
        lineTo(256f, 117.58f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(312f, 320f)
        lineToRelative(28f, 48f)
        lineToRelative(-28f, 71f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(410.74f, 368f)
        lineTo(342f, 368f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(200f, 320f)
        lineToRelative(-28f, 48f)
        lineToRelative(28.37f, 71.5f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(101.63f, 368f)
        lineTo(172f, 368f)
      }
    }.build()

    return _FootballOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FootballOutline: ImageVector? = null
