package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ChevronForward: ImageVector
  get() {
    if (_ChevronForwardSharp != null) {
      return _ChevronForwardSharp!!
    }
    _ChevronForwardSharp = ImageVector.Builder(
      name = "Sharp.ChevronForwardSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(184f, 112f)
        lineToRelative(144f, 144f)
        lineToRelative(-144f, 144f)
      }
    }.build()

    return _ChevronForwardSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronForwardSharp: ImageVector? = null
