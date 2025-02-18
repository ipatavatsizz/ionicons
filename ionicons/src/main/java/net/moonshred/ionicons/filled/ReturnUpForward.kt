package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.ReturnUpForward: ImageVector
  get() {
    if (_ReturnUpForward != null) {
      return _ReturnUpForward!!
    }
    _ReturnUpForward = ImageVector.Builder(
      name = "Filled.ReturnUpForward",
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

    return _ReturnUpForward!!
  }

@Suppress("ObjectPropertyName")
private var _ReturnUpForward: ImageVector? = null
