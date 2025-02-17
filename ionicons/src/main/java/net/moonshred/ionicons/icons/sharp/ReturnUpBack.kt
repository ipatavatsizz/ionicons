package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ReturnUpBack: ImageVector
  get() {
    if (_ReturnUpBackSharp != null) {
      return _ReturnUpBackSharp!!
    }
    _ReturnUpBackSharp = ImageVector.Builder(
      name = "Sharp.ReturnUpBackSharp",
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
        moveTo(112f, 160f)
        lineToRelative(-64f, 64f)
        lineToRelative(64f, 64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(64f, 224f)
        lineToRelative(400f, 0f)
        lineToRelative(0f, 128f)
      }
    }.build()

    return _ReturnUpBackSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ReturnUpBackSharp: ImageVector? = null
