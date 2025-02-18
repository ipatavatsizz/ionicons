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

val Ionicons.Outline.Thunderstorm: ImageVector
  get() {
    if (_ThunderstormOutline != null) {
      return _ThunderstormOutline!!
    }
    _ThunderstormOutline = ImageVector.Builder(
      name = "Outline.ThunderstormOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(120f, 352f)
        lineTo(96f, 400f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(136f, 432f)
        lineTo(120f, 464f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(400f, 352f)
        lineTo(376f, 400f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(416f, 432f)
        lineTo(400f, 464f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(208f, 304f)
        lineToRelative(-16f, 96f)
        lineToRelative(48f, 0f)
        lineToRelative(0f, 80f)
        lineToRelative(80f, -112f)
        lineToRelative(-48f, 0f)
        lineToRelative(16f, -64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(404.33f, 152.89f)
        horizontalLineTo(392.2f)
        curveTo(384.71f, 84.85f, 326.14f, 32f, 256f, 32f)
        arcToRelative(
          136.39f,
          136.39f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -128.63f,
          90.67f
        )
        horizontalLineTo(122.8f)
        curveToRelative(-49.94f, 0f, -90.8f, 40.8f, -90.8f, 90.66f)
        horizontalLineToRelative(0f)
        curveTo(32f, 263.2f, 72.86f, 304f, 122.8f, 304f)
        horizontalLineTo(404.33f)
        curveTo(446f, 304f, 480f, 270f, 480f, 228.44f)
        horizontalLineToRelative(0f)
        curveTo(480f, 186.89f, 446f, 152.89f, 404.33f, 152.89f)
        close()
      }
    }.build()

    return _ThunderstormOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ThunderstormOutline: ImageVector? = null
