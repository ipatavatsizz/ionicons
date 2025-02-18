package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Cut: ImageVector
  get() {
    if (_CutOutline != null) {
      return _CutOutline!!
    }
    _CutOutline = ImageVector.Builder(
      name = "Outline.CutOutline",
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
        moveTo(104f, 152f)
        moveToRelative(-56f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 112f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -112f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(104f, 360f)
        moveToRelative(-56f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 112f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -112f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(157f, 175f)
        lineTo(146f, 190f)
        lineTo(183f, 205f)
        reflectiveCurveToRelative(3.46f, -6.42f, 7f, -10f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(154.17f, 334.43f)
        lineTo(460f, 162f)
        curveToRelative(-2.5f, -6.7f, -28f, -12f, -64f, -4f)
        curveToRelative(-29.12f, 6.47f, -121.16f, 29.05f, -159.16f, 56.05f)
        curveTo(205.85f, 236.06f, 227f, 272f, 192f, 298f)
        curveToRelative(-25.61f, 19f, -44.43f, 22.82f, -44.43f, 22.82f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(344.47f, 278.24f)
        lineTo(295f, 306.67f)
        curveToRelative(14.23f, 6.74f, 65.54f, 33.27f, 117f, 36.33f)
        curveToRelative(14.92f, 0.89f, 30f, 0.39f, 39f, -6f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 240f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
    }.build()

    return _CutOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CutOutline: ImageVector? = null
