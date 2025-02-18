package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Map: ImageVector
  get() {
    if (_MapSharp != null) {
      return _MapSharp!!
    }
    _MapSharp = ImageVector.Builder(
      name = "Sharp.MapSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(327.71f, 130.93f)
        lineTo(184f, 39f)
        lineTo(32f, 144f)
        verticalLineTo(480f)
        lineToRelative(152.29f, -98.93f)
        lineTo(328f, 473f)
        lineTo(480f, 368f)
        verticalLineTo(32f)
        close()
        moveTo(312f, 421f)
        lineTo(200f, 349f)
        verticalLineTo(91f)
        lineToRelative(112f, 72f)
        close()
      }
    }.build()

    return _MapSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MapSharp: ImageVector? = null
