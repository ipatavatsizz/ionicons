package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Backspace: ImageVector
  get() {
    if (_BackspaceOutline != null) {
      return _BackspaceOutline!!
    }
    _BackspaceOutline = ImageVector.Builder(
      name = "Outline.BackspaceOutline",
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
        moveTo(135.19f, 390.14f)
        arcTo(28.79f, 28.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 156.87f, 400f)
        horizontalLineTo(403.13f)
        arcTo(29f, 29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 432f, 371.13f)
        verticalLineTo(140.87f)
        arcTo(29f, 29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 403.13f, 112f)
        horizontalLineTo(156.87f)
        arcToRelative(
          28.84f,
          28.84f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -21.67f,
          9.84f
        )
        verticalLineToRelative(0f)
        lineTo(46.33f, 256f)
        lineToRelative(88.86f, 134.11f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(336.67f, 192.33f)
        lineTo(206.66f, 322.34f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(336.67f, 322.34f)
        lineTo(206.66f, 192.33f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(336.67f, 192.33f)
        lineTo(206.66f, 322.34f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(336.67f, 322.34f)
        lineTo(206.66f, 192.33f)
      }
    }.build()

    return _BackspaceOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BackspaceOutline: ImageVector? = null
