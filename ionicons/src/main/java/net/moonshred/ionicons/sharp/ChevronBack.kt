package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ChevronBack: ImageVector
  get() {
    if (_ChevronBackSharp != null) {
      return _ChevronBackSharp!!
    }
    _ChevronBackSharp = ImageVector.Builder(
      name = "Sharp.ChevronBackSharp",
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
        moveTo(328f, 112f)
        lineToRelative(-144f, 144f)
        lineToRelative(144f, 144f)
      }
    }.build()

    return _ChevronBackSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronBackSharp: ImageVector? = null
