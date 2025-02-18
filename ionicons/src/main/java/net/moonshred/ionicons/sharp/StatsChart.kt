package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.StatsChart: ImageVector
  get() {
    if (_StatsChartSharp != null) {
      return _StatsChartSharp!!
    }
    _StatsChartSharp = ImageVector.Builder(
      name = "Sharp.StatsChartSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(128f, 496f)
        horizontalLineTo(48f)
        verticalLineTo(304f)
        horizontalLineToRelative(80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(352f, 496f)
        horizontalLineTo(272f)
        verticalLineTo(208f)
        horizontalLineToRelative(80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 496f)
        horizontalLineTo(384f)
        verticalLineTo(96f)
        horizontalLineToRelative(80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(240f, 496f)
        horizontalLineTo(160f)
        verticalLineTo(16f)
        horizontalLineToRelative(80f)
        close()
      }
    }.build()

    return _StatsChartSharp!!
  }

@Suppress("ObjectPropertyName")
private var _StatsChartSharp: ImageVector? = null
