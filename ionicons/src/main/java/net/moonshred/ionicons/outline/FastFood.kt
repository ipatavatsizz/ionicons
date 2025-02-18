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

val Ionicons.Outline.FastFood: ImageVector
  get() {
    if (_FastFoodOutline != null) {
      return _FastFoodOutline!!
    }
    _FastFoodOutline = ImageVector.Builder(
      name = "Outline.FastFoodOutline",
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
        moveTo(322f, 416f)
        curveToRelative(0f, 35.35f, -20.65f, 64f, -56f, 64f)
        horizontalLineTo(134f)
        curveToRelative(-35.35f, 0f, -56f, -28.65f, -56f, -64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(336f, 336f)
        curveToRelative(17.67f, 0f, 32f, 17.91f, 32f, 40f)
        horizontalLineToRelative(0f)
        curveToRelative(0f, 22.09f, -14.33f, 40f, -32f, 40f)
        horizontalLineTo(64f)
        curveToRelative(-17.67f, 0f, -32f, -17.91f, -32f, -40f)
        horizontalLineToRelative(0f)
        curveToRelative(0f, -22.09f, 14.33f, -40f, 32f, -40f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(344f, 336f)
        horizontalLineTo(179.31f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.65f, 2.34f)
        lineToRelative(-26.83f, 26.83f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.66f, 0f)
        lineToRelative(-26.83f, -26.83f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.65f, -2.34f)
        horizontalLineTo(56f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
        horizontalLineToRelative(0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
        horizontalLineTo(344f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
        horizontalLineToRelative(0f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 344f, 336f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(64f, 276f)
        verticalLineToRelative(-0.22f)
        curveToRelative(0f, -55f, 45f, -83.78f, 100f, -83.78f)
        horizontalLineToRelative(72f)
        curveToRelative(55f, 0f, 100f, 29f, 100f, 84f)
        verticalLineToRelative(-0.22f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(241f, 112f)
        lineTo(248.44f, 175.97f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(256f, 480f)
        horizontalLineTo(395.31f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.91f, -29.61f)
        lineTo(463f, 112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(368f, 112f)
        lineToRelative(16f, -64f)
        lineToRelative(47f, -16f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(224f, 112f)
        lineTo(480f, 112f)
      }
    }.build()

    return _FastFoodOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FastFoodOutline: ImageVector? = null
