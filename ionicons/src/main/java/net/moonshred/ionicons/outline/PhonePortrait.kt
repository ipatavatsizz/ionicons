package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.PhonePortrait: ImageVector
  get() {
    if (_PhonePortraitOutline != null) {
      return _PhonePortraitOutline!!
    }
    _PhonePortraitOutline = ImageVector.Builder(
      name = "Outline.PhonePortraitOutline",
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
        moveTo(176f, 16f)
        lineTo(336f, 16f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 384f, 64f)
        lineTo(384f, 448f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 496f)
        lineTo(176f, 496f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 448f)
        lineTo(128f, 64f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 16f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(176f, 16f)
        horizontalLineToRelative(24f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
        horizontalLineToRelative(0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineToRelative(64f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        horizontalLineToRelative(0f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
        horizontalLineToRelative(24f)
      }
    }.build()

    return _PhonePortraitOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PhonePortraitOutline: ImageVector? = null
