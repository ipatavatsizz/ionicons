package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Hourglass: ImageVector
  get() {
    if (_HourglassSharp != null) {
      return _HourglassSharp!!
    }
    _HourglassSharp = ImageVector.Builder(
      name = "Sharp.HourglassSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 32f)
        horizontalLineTo(96f)
        verticalLineTo(144f)
        lineTo(204f, 256f)
        lineTo(96f, 368f)
        verticalLineTo(480f)
        horizontalLineTo(416f)
        verticalLineTo(368f)
        lineTo(308f, 256f)
        lineTo(416f, 144f)
        close()
        moveTo(272f, 224f)
        verticalLineTo(336f)
        lineToRelative(91f, 96f)
        horizontalLineTo(148f)
        lineToRelative(92f, -96f)
        verticalLineTo(224f)
        lineToRelative(-80f, -80f)
        horizontalLineTo(352f)
        close()
      }
    }.build()

    return _HourglassSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HourglassSharp: ImageVector? = null
