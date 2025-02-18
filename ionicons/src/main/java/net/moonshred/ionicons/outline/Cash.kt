package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Cash: ImageVector
  get() {
    if (_CashOutline != null) {
      return _CashOutline!!
    }
    _CashOutline = ImageVector.Builder(
      name = "Outline.CashOutline",
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
        moveTo(464f, 336f)
        lineTo(48f, 336f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 320f)
        lineTo(32f, 96f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 80f)
        lineTo(464f, 80f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 480f, 96f)
        lineTo(480f, 320f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 336f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 384f)
        lineTo(448f, 384f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(96f, 432f)
        lineTo(416f, 432f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 208f)
        moveToRelative(-80f, 0f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, 160f, 0f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, -160f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(480f, 160f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, -80f, -80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(32f, 160f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, -80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(480f, 256f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, 80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(32f, 256f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 80f)
      }
    }.build()

    return _CashOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CashOutline: ImageVector? = null
