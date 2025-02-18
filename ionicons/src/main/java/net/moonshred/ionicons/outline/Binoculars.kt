package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Binoculars: ImageVector
  get() {
    if (_BinocularsOutline != null) {
      return _BinocularsOutline!!
    }
    _BinocularsOutline = ImageVector.Builder(
      name = "Outline.BinocularsOutline",
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
        moveTo(392f, 344f)
        moveToRelative(-88f, 0f)
        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 176f, 0f)
        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, -176f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(120f, 344f)
        moveToRelative(-88f, 0f)
        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 176f, 0f)
        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, -176f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(208f, 344f)
        verticalLineTo(128f)
        curveTo(208f, 101.5f, 192f, 80f, 164f, 80f)
        curveTo(129f, 80f, 117.5f, 101.5f, 107f, 128f)
        curveTo(107f, 128f, 58.5f, 255.83f, 36f, 317.5f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(208f, 184f)
        curveTo(208f, 184f, 224.5f, 176f, 256f, 176f)
        curveTo(287.5f, 176f, 304f, 184f, 304f, 184f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(208f, 272f)
        curveTo(208f, 272f, 224.5f, 264f, 256f, 264f)
        curveTo(287.5f, 264f, 304f, 272f, 304f, 272f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(304f, 344f)
        verticalLineTo(128f)
        curveTo(304f, 101.5f, 320f, 80f, 348f, 80f)
        curveTo(383f, 80f, 394.5f, 101.5f, 405f, 128f)
        curveTo(405f, 128f, 453.5f, 255.83f, 476f, 317.5f)
      }
    }.build()

    return _BinocularsOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BinocularsOutline: ImageVector? = null
