package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.PhoneLandscape: ImageVector
  get() {
    if (_PhoneLandscapeOutline != null) {
      return _PhoneLandscapeOutline!!
    }
    _PhoneLandscapeOutline = ImageVector.Builder(
      name = "Outline.PhoneLandscapeOutline",
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
        moveTo(16f, 336f)
        lineTo(16f, 176f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 128f)
        lineTo(448f, 128f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 496f, 176f)
        lineTo(496f, 336f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 448f, 384f)
        lineTo(64f, 384f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 336f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(16f, 336f)
        verticalLineTo(312f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
        horizontalLineToRelative(0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        verticalLineTo(224f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        horizontalLineToRelative(0f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
        verticalLineTo(176f)
      }
    }.build()

    return _PhoneLandscapeOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PhoneLandscapeOutline: ImageVector? = null
