package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Text: ImageVector
  get() {
    if (_TextOutline != null) {
      return _TextOutline!!
    }
    _TextOutline = ImageVector.Builder(
      name = "Outline.TextOutline",
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
        moveTo(32f, 415.5f)
        lineToRelative(120f, -320f)
        lineToRelative(120f, 320f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(230f, 303.5f)
        lineTo(74f, 303.5f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(326f, 239.5f)
        curveToRelative(12.19f, -28.69f, 41f, -48f, 74f, -48f)
        horizontalLineToRelative(0f)
        curveToRelative(46f, 0f, 80f, 32f, 80f, 80f)
        verticalLineToRelative(144f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 358.5f)
        curveToRelative(0f, 36f, 26.86f, 58f, 60f, 58f)
        curveToRelative(54f, 0f, 100f, -27f, 100f, -106f)
        verticalLineToRelative(-15f)
        curveToRelative(-20f, 0f, -58f, 1f, -92f, 5f)
        curveTo(355.23f, 304.36f, 320f, 319.5f, 320f, 358.5f)
        close()
      }
    }.build()

    return _TextOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TextOutline: ImageVector? = null
