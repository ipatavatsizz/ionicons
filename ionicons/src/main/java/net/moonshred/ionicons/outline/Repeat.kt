package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Repeat: ImageVector
  get() {
    if (_RepeatOutline != null) {
      return _RepeatOutline!!
    }
    _RepeatOutline = ImageVector.Builder(
      name = "Outline.RepeatOutline",
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
        moveTo(320f, 120f)
        lineToRelative(48f, 48f)
        lineToRelative(-48f, 48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(352f, 168f)
        horizontalLineTo(144f)
        arcToRelative(80.24f, 80.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -80f, 80f)
        verticalLineToRelative(16f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(192f, 392f)
        lineToRelative(-48f, -48f)
        lineToRelative(48f, -48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 344f)
        horizontalLineTo(368f)
        arcToRelative(80.24f, 80.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, -80f)
        verticalLineTo(248f)
      }
    }.build()

    return _RepeatOutline!!
  }

@Suppress("ObjectPropertyName")
private var _RepeatOutline: ImageVector? = null
