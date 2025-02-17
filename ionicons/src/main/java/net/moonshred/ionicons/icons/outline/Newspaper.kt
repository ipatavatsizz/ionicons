package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Newspaper: ImageVector
  get() {
    if (_NewspaperOutline != null) {
      return _NewspaperOutline!!
    }
    _NewspaperOutline = ImageVector.Builder(
      name = "Outline.NewspaperOutline",
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
        moveTo(368f, 415.86f)
        verticalLineTo(72f)
        arcToRelative(24.07f, 24.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
        horizontalLineTo(72f)
        arcTo(24.07f, 24.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 72f)
        verticalLineTo(424f)
        arcToRelative(40.12f, 40.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
        horizontalLineTo(416f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(416f, 464f)
        horizontalLineToRelative(0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
        verticalLineTo(128f)
        horizontalLineToRelative(72f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
        verticalLineTo(416f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 464f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(240f, 128f)
        lineTo(304f, 128f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(240f, 192f)
        lineTo(304f, 192f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 256f)
        lineTo(304f, 256f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 320f)
        lineTo(304f, 320f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 384f)
        lineTo(304f, 384f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(176f, 208f)
        horizontalLineTo(112f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
        verticalLineTo(128f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        horizontalLineToRelative(64f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        verticalLineToRelative(64f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 208f)
        close()
      }
    }.build()

    return _NewspaperOutline!!
  }

@Suppress("ObjectPropertyName")
private var _NewspaperOutline: ImageVector? = null
