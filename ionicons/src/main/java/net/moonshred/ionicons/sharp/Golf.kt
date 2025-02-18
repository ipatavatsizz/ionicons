package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Golf: ImageVector
  get() {
    if (_GolfSharp != null) {
      return _GolfSharp!!
    }
    _GolfSharp = ImageVector.Builder(
      name = "Sharp.GolfSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(240f, 16f)
        verticalLineTo(191.66f)
        curveToRelative(0f, 0.23f, 0f, 0.47f, 0f, 0.7f)
        verticalLineTo(320.47f)
        quadToRelative(8f, -0.47f, 16f, -0.47f)
        reflectiveQuadToRelative(16f, 0.47f)
        verticalLineTo(202.3f)
        lineTo(448f, 112f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(462.91f, 457.5f)
        curveToRelative(-8.54f, -42.85f, -35f, -78.74f, -76.62f, -103.8f)
        curveTo(353.86f, 334.15f, 313.76f, 322.4f, 272f, 320f)
        verticalLineToRelative(95.79f)
        horizontalLineTo(240f)
        verticalLineTo(320f)
        curveToRelative(-41.79f, 2.4f, -81.89f, 14.15f, -114.32f, 33.7f)
        curveToRelative(-41.59f, 25.06f, -68.08f, 60.95f, -76.62f, 103.8f)
        curveToRelative(-2f, 9.81f, -0.68f, 38.5f, -0.68f, 38.5f)
        horizontalLineTo(463.59f)
        reflectiveCurveTo(464.87f, 467.31f, 462.91f, 457.5f)
        close()
      }
    }.build()

    return _GolfSharp!!
  }

@Suppress("ObjectPropertyName")
private var _GolfSharp: ImageVector? = null
