package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Ribbon: ImageVector
  get() {
    if (_RibbonOutline != null) {
      return _RibbonOutline!!
    }
    _RibbonOutline = ImageVector.Builder(
      name = "Outline.RibbonOutline",
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
        moveTo(256f, 160f)
        moveToRelative(-128f, 0f)
        arcToRelative(128f, 128f, 0f, isMoreThanHalf = true, isPositiveArc = true, 256f, 0f)
        arcToRelative(128f, 128f, 0f, isMoreThanHalf = true, isPositiveArc = true, -256f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(143.65f, 227.82f)
        lineTo(48f, 400f)
        lineToRelative(86.86f, -0.42f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.82f, 7.8f)
        lineTo(192f, 480f)
        lineToRelative(88.33f, -194.32f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(366.54f, 224f)
        lineTo(464f, 400f)
        lineToRelative(-86.86f, -0.42f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -13.82f, 7.8f)
        lineTo(320f, 480f)
        lineTo(256f, 339.2f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 160f)
        moveToRelative(-64f, 0f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 0f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, -128f, 0f)
      }
    }.build()

    return _RibbonOutline!!
  }

@Suppress("ObjectPropertyName")
private var _RibbonOutline: ImageVector? = null
