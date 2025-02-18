package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Analytics: ImageVector
  get() {
    if (_AnalyticsSharp != null) {
      return _AnalyticsSharp!!
    }
    _AnalyticsSharp = ImageVector.Builder(
      name = "Sharp.AnalyticsSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(450f, 128f)
        arcToRelative(46f, 46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -44.11f, 59f)
        lineToRelative(-71.37f, 71.36f)
        arcToRelative(45.88f, 45.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -29f, 0f)
        lineToRelative(-52.91f, -52.91f)
        arcToRelative(46f, 46f, 0f, isMoreThanHalf = true, isPositiveArc = false, -89.12f, 0f)
        lineTo(75f, 293.88f)
        arcTo(46.08f, 46.08f, 0f, isMoreThanHalf = true, isPositiveArc = false, 106.11f, 325f)
        lineToRelative(87.37f, -87.36f)
        arcToRelative(45.85f, 45.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29f, 0f)
        lineToRelative(52.92f, 52.92f)
        arcToRelative(46f, 46f, 0f, isMoreThanHalf = true, isPositiveArc = false, 89.12f, 0f)
        lineTo(437f, 218.12f)
        arcTo(46f, 46f, 0f, isMoreThanHalf = true, isPositiveArc = false, 450f, 128f)
        close()
      }
    }.build()

    return _AnalyticsSharp!!
  }

@Suppress("ObjectPropertyName")
private var _AnalyticsSharp: ImageVector? = null
