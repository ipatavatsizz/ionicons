package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Clipboard: ImageVector
  get() {
    if (_ClipboardOutline != null) {
      return _ClipboardOutline!!
    }
    _ClipboardOutline = ImageVector.Builder(
      name = "Outline.ClipboardOutline",
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
        moveTo(336f, 64f)
        horizontalLineToRelative(32f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
        verticalLineTo(432f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 48f)
        horizontalLineTo(144f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
        verticalLineTo(112f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, -48f)
        horizontalLineToRelative(32f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(202.13f, 32f)
        lineTo(309.87f, 32f)
        arcTo(26.13f, 26.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 58.13f)
        lineTo(336f, 69.87f)
        arcTo(26.13f, 26.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 309.87f, 96f)
        lineTo(202.13f, 96f)
        arcTo(26.13f, 26.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 69.87f)
        lineTo(176f, 58.13f)
        arcTo(26.13f, 26.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 202.13f, 32f)
        close()
      }
    }.build()

    return _ClipboardOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ClipboardOutline: ImageVector? = null
