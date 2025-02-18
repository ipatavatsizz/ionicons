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

val Ionicons.Outline.CalendarNumber: ImageVector
  get() {
    if (_CalendarNumberOutline != null) {
      return _CalendarNumberOutline!!
    }
    _CalendarNumberOutline = ImageVector.Builder(
      name = "Outline.CalendarNumberOutline",
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
        moveTo(464f, 160f)
        lineTo(48f, 160f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(304f, 260f)
        lineToRelative(43.42f, -32f)
        lineToRelative(4.58f, 0f)
        lineToRelative(0f, 168f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(191.87f, 306.63f)
        curveToRelative(9.11f, 0f, 25.79f, -4.28f, 36.72f, -15.47f)
        arcToRelative(
          37.9f,
          37.9f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          11.13f,
          -27.26f
        )
        curveToRelative(0f, -26.12f, -22.59f, -39.9f, -47.89f, -39.9f)
        curveToRelative(-21.4f, 0f, -33.52f, 11.61f, -37.85f, 18.93f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(149f, 374.16f)
        curveToRelative(4.88f, 8.27f, 19.71f, 25.84f, 43.88f, 25.84f)
        curveToRelative(28.59f, 0f, 52.12f, -15.94f, 52.12f, -43.82f)
        curveToRelative(0f, -12.62f, -3.66f, -24f, -11.58f, -32.07f)
        curveToRelative(-12.36f, -12.64f, -31.25f, -17.48f, -41.55f, -17.48f)
      }
    }.build()

    return _CalendarNumberOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CalendarNumberOutline: ImageVector? = null
