package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ReturnDownForward: ImageVector
  get() {
    if (_ReturnDownForwardSharp != null) {
      return _ReturnDownForwardSharp!!
    }
    _ReturnDownForwardSharp = ImageVector.Builder(
      name = "Sharp.ReturnDownForwardSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(400f, 352f)
        lineToRelative(64f, -64f)
        lineToRelative(-64f, -64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(448f, 288f)
        lineToRelative(-400f, 0f)
        lineToRelative(0f, -128f)
      }
    }.build()

    return _ReturnDownForwardSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ReturnDownForwardSharp: ImageVector? = null
