package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.PieChart: ImageVector
  get() {
    if (_PieChartSharp != null) {
      return _PieChartSharp!!
    }
    _PieChartSharp = ImageVector.Builder(
      name = "Sharp.PieChartSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(58f, 362.09f)
        lineTo(51.49f, 347.5f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 32f)
        horizontalLineToRelative(16f)
        verticalLineTo(266.37f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(304f, 66.46f)
        verticalLineTo(287.11f)
        lineTo(94.62f, 380.78f)
        arcTo(208.31f, 208.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 272f, 480f)
        curveToRelative(114.69f, 0f, 208f, -93.31f, 208f, -208f)
        curveTo(480f, 168.19f, 403.55f, 81.9f, 304f, 66.46f)
        close()
      }
    }.build()

    return _PieChartSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PieChartSharp: ImageVector? = null
