package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.MaleFemale: ImageVector
  get() {
    if (_MaleFemaleOutline != null) {
      return _MaleFemaleOutline!!
    }
    _MaleFemaleOutline = ImageVector.Builder(
      name = "Outline.MaleFemaleOutline",
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
        moveTo(216f, 200f)
        moveToRelative(-136f, 0f)
        arcToRelative(136f, 136f, 0f, isMoreThanHalf = true, isPositiveArc = true, 272f, 0f)
        arcToRelative(136f, 136f, 0f, isMoreThanHalf = true, isPositiveArc = true, -272f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(216f, 352f)
        lineTo(216f, 480f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(272f, 416f)
        lineTo(160f, 416f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(432f, 112f)
        lineToRelative(0f, -80f)
        lineToRelative(-80f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(335.28f, 128.72f)
        lineTo(432f, 32f)
      }
    }.build()

    return _MaleFemaleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MaleFemaleOutline: ImageVector? = null
