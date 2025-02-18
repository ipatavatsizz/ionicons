package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ChevronExpand: ImageVector
  get() {
    if (_ChevronExpandSharp != null) {
      return _ChevronExpandSharp!!
    }
    _ChevronExpandSharp = ImageVector.Builder(
      name = "Sharp.ChevronExpandSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(136f, 208f)
        lineTo(256f, 104f)
        lineTo(376f, 208f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(136f, 304f)
        lineTo(256f, 408f)
        lineTo(376f, 304f)
      }
    }.build()

    return _ChevronExpandSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronExpandSharp: ImageVector? = null
