package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Calculator: ImageVector
  get() {
    if (_CalculatorOutline != null) {
      return _CalculatorOutline!!
    }
    _CalculatorOutline = ImageVector.Builder(
      name = "Outline.CalculatorOutline",
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
        moveTo(144f, 48f)
        lineTo(368f, 48f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 400f, 80f)
        lineTo(400f, 432f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 464f)
        lineTo(144f, 464f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 432f)
        lineTo(112f, 80f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160.01f, 112f)
        horizontalLineToRelative(191.99f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(-191.99f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(168f, 248f)
        moveToRelative(-24f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 248f)
        moveToRelative(-24f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(344f, 248f)
        moveToRelative(-24f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(168f, 328f)
        moveToRelative(-24f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 328f)
        moveToRelative(-24f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(168f, 408f)
        moveToRelative(-24f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 408f)
        moveToRelative(-24f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(344f, 304f)
        lineTo(344f, 304f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 328f)
        lineTo(368f, 408f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 344f, 432f)
        lineTo(344f, 432f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 320f, 408f)
        lineTo(320f, 328f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 344f, 304f)
        close()
      }
    }.build()

    return _CalculatorOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CalculatorOutline: ImageVector? = null
