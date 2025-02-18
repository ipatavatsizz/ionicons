package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Trash: ImageVector
  get() {
    if (_TrashOutline != null) {
      return _TrashOutline!!
    }
    _TrashOutline = ImageVector.Builder(
      name = "Outline.TrashOutline",
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
        moveTo(112f, 112f)
        lineToRelative(20f, 320f)
        curveToRelative(0.95f, 18.49f, 14.4f, 32f, 32f, 32f)
        horizontalLineTo(348f)
        curveToRelative(17.67f, 0f, 30.87f, -13.51f, 32f, -32f)
        lineToRelative(20f, -320f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(80f, 112f)
        lineTo(432f, 112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(192f, 112f)
        verticalLineTo(72f)
        horizontalLineToRelative(0f)
        arcToRelative(23.93f, 23.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
        horizontalLineToRelative(80f)
        arcToRelative(23.93f, 23.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
        horizontalLineToRelative(0f)
        verticalLineToRelative(40f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 176f)
        lineTo(256f, 400f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(184f, 176f)
        lineTo(192f, 400f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(328f, 176f)
        lineTo(320f, 400f)
      }
    }.build()

    return _TrashOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TrashOutline: ImageVector? = null
