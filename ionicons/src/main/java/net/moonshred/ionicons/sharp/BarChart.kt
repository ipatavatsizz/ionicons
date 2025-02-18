package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.BarChart: ImageVector
  get() {
    if (_BarChartSharp != null) {
      return _BarChartSharp!!
    }
    _BarChartSharp = ImageVector.Builder(
      name = "Sharp.BarChartSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 496f)
        lineToRelative(-480f, 0f)
        lineToRelative(0f, -480f)
        lineToRelative(32f, 0f)
        lineToRelative(0f, 448f)
        lineToRelative(448f, 0f)
        lineToRelative(0f, 32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(192f, 432f)
        horizontalLineTo(80f)
        verticalLineTo(208f)
        horizontalLineTo(192f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 432f)
        horizontalLineTo(224f)
        verticalLineTo(160f)
        horizontalLineTo(336f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(479.64f, 432f)
        horizontalLineToRelative(-112f)
        verticalLineTo(96f)
        horizontalLineToRelative(112f)
        close()
      }
    }.build()

    return _BarChartSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BarChartSharp: ImageVector? = null
