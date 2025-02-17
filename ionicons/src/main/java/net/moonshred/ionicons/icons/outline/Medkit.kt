package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Medkit: ImageVector
  get() {
    if (_MedkitOutline != null) {
      return _MedkitOutline!!
    }
    _MedkitOutline = ImageVector.Builder(
      name = "Outline.MedkitOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(80f, 112f)
        lineTo(432f, 112f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 480f, 160f)
        lineTo(480f, 416f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 432f, 464f)
        lineTo(80f, 464f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 416f)
        lineTo(32f, 160f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 112f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 112f)
        verticalLineTo(80f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, -32f)
        horizontalLineTo(336f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 32f)
        verticalLineToRelative(32f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 208f)
        lineTo(256f, 368f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(336f, 288f)
        lineTo(176f, 288f)
      }
    }.build()

    return _MedkitOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MedkitOutline: ImageVector? = null
