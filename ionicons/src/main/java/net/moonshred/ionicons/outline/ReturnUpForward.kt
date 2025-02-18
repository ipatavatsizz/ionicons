package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ReturnUpForward: ImageVector
  get() {
    if (_ReturnUpForwardOutline != null) {
      return _ReturnUpForwardOutline!!
    }
    _ReturnUpForwardOutline = ImageVector.Builder(
      name = "Outline.ReturnUpForwardOutline",
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
        moveTo(400f, 160f)
        lineToRelative(64f, 64f)
        lineToRelative(-64f, 64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(448f, 224f)
        horizontalLineTo(154f)
        curveTo(95.24f, 224f, 48f, 273.33f, 48f, 332f)
        verticalLineToRelative(20f)
      }
    }.build()

    return _ReturnUpForwardOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ReturnUpForwardOutline: ImageVector? = null
