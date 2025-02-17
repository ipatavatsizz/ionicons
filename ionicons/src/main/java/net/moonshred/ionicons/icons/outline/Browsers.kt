package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Browsers: ImageVector
  get() {
    if (_BrowsersOutline != null) {
      return _BrowsersOutline!!
    }
    _BrowsersOutline = ImageVector.Builder(
      name = "Outline.BrowsersOutline",
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
        moveTo(96f, 64f)
        lineTo(416f, 64f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 112f)
        lineTo(464f, 400f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 448f)
        lineTo(96f, 448f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 400f)
        lineTo(48f, 112f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 64f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(397.82f, 64f)
        horizontalLineTo(114.18f)
        curveTo(77.69f, 64f, 48f, 94.15f, 48f, 131.2f)
        verticalLineTo(176f)
        horizontalLineTo(64f)
        curveToRelative(0f, -16f, 16f, -32f, 32f, -32f)
        horizontalLineTo(416f)
        curveToRelative(16f, 0f, 32f, 16f, 32f, 32f)
        horizontalLineToRelative(16f)
        verticalLineTo(131.2f)
        curveTo(464f, 94.15f, 434.31f, 64f, 397.82f, 64f)
        close()
      }
    }.build()

    return _BrowsersOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BrowsersOutline: ImageVector? = null
