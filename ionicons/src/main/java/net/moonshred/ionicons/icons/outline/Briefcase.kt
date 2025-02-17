package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Briefcase: ImageVector
  get() {
    if (_BriefcaseOutline != null) {
      return _BriefcaseOutline!!
    }
    _BriefcaseOutline = ImageVector.Builder(
      name = "Outline.BriefcaseOutline",
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
        moveTo(80f, 128f)
        lineTo(432f, 128f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 480f, 176f)
        lineTo(480f, 400f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 432f, 448f)
        lineTo(80f, 448f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 400f)
        lineTo(32f, 176f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 128f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 128f)
        verticalLineTo(96f)
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
        moveTo(480f, 240f)
        lineTo(32f, 240f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 240f)
        verticalLineToRelative(24f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
        horizontalLineTo(200f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
        verticalLineTo(240f)
      }
    }.build()

    return _BriefcaseOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BriefcaseOutline: ImageVector? = null
