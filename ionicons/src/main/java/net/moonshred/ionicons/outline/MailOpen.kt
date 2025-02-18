package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.MailOpen: ImageVector
  get() {
    if (_MailOpenOutline != null) {
      return _MailOpenOutline!!
    }
    _MailOpenOutline = ImageVector.Builder(
      name = "Outline.MailOpenOutline",
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
        moveTo(441.6f, 171.61f)
        lineTo(266.87f, 85.37f)
        arcToRelative(
          24.57f,
          24.57f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -21.74f,
          0f
        )
        lineTo(70.4f, 171.61f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 207.39f)
        verticalLineTo(392f)
        curveToRelative(0f, 22.09f, 18.14f, 40f, 40.52f, 40f)
        horizontalLineToRelative(335f)
        curveToRelative(22.38f, 0f, 40.52f, -17.91f, 40.52f, -40f)
        verticalLineTo(207.39f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 441.6f, 171.61f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(397.33f, 368f)
        lineTo(268.07f, 267.46f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -29.47f, 0f)
        lineTo(109.33f, 368f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(309.33f, 295f)
        lineTo(445.33f, 192f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(61.33f, 192f)
        lineTo(200.33f, 297f)
      }
    }.build()

    return _MailOpenOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MailOpenOutline: ImageVector? = null
