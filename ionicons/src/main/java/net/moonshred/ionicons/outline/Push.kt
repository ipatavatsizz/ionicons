package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Push: ImageVector
  get() {
    if (_PushOutline != null) {
      return _PushOutline!!
    }
    _PushOutline = ImageVector.Builder(
      name = "Outline.PushOutline",
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
        moveTo(336f, 336f)
        horizontalLineToRelative(40f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
        verticalLineTo(88f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, -40f)
        horizontalLineTo(136f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 88f)
        verticalLineTo(296f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
        horizontalLineToRelative(40f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(176f, 240f)
        lineToRelative(80f, -80f)
        lineToRelative(80f, 80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 464f)
        lineTo(256f, 176f)
      }
    }.build()

    return _PushOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PushOutline: ImageVector? = null
