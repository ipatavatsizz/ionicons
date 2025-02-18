package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ReturnDownForward: ImageVector
  get() {
    if (_ReturnDownForwardOutline != null) {
      return _ReturnDownForwardOutline!!
    }
    _ReturnDownForwardOutline = ImageVector.Builder(
      name = "Outline.ReturnDownForwardOutline",
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
        moveTo(400f, 352f)
        lineToRelative(64f, -64f)
        lineToRelative(-64f, -64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(448f, 288f)
        horizontalLineTo(154f)
        curveTo(95.24f, 288f, 48f, 238.67f, 48f, 180f)
        verticalLineTo(160f)
      }
    }.build()

    return _ReturnDownForwardOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ReturnDownForwardOutline: ImageVector? = null
