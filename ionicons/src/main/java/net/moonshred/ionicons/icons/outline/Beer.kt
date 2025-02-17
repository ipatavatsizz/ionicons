package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Beer: ImageVector
  get() {
    if (_BeerOutline != null) {
      return _BeerOutline!!
    }
    _BeerOutline = ImageVector.Builder(
      name = "Outline.BeerOutline",
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
        moveTo(352f, 200f)
        verticalLineTo(440f)
        arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, 40f)
        horizontalLineTo(136f)
        arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40f, -40f)
        verticalLineTo(224f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(352f, 224f)
        horizontalLineToRelative(40f)
        arcToRelative(56.16f, 56.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 56f)
        verticalLineToRelative(80f)
        arcToRelative(56.16f, 56.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56f, 56f)
        horizontalLineTo(352f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(224f, 256f)
        lineTo(224f, 416f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(288f, 256f)
        lineTo(288f, 416f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 256f)
        lineTo(160f, 416f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 112f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 96f)
        curveToRelative(-13.25f, 0f, -29.31f, -7.31f, -38f, -16f)
        horizontalLineTo(160f)
        curveToRelative(-8f, 22f, -27f, 32f, -48f, 32f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -96f)
        arcToRelative(47.91f, 47.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 26f, 9f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(91.86f, 132.43f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 60.46f, -52f)
        reflectiveCurveTo(160f, 91f, 160f, 96f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(145.83f, 64.71f)
        curveTo(163.22f, 44.89f, 187.57f, 32f, 216f, 32f)
        curveToRelative(52.38f, 0f, 94f, 42.84f, 94f, 95.21f)
        arcTo(95f, 95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 308.33f, 145f)
      }
    }.build()

    return _BeerOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BeerOutline: ImageVector? = null
