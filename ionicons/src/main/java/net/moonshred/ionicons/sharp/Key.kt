package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Key: ImageVector
  get() {
    if (_KeySharp != null) {
      return _KeySharp!!
    }
    _KeySharp = ImageVector.Builder(
      name = "Sharp.KeySharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(218.1f, 167.2f)
        curveToRelative(0f, 13f, 0f, 25.6f, 4.1f, 37.4f)
        curveTo(179.1f, 255.2f, 54.7f, 399.1f, 54.7f, 399.1f)
        lineToRelative(2.9f, 36.3f)
        reflectiveCurveToRelative(34.8f, 33f, 40f, 28f)
        curveToRelative(15.4f, -15f, 24.8f, -25.2f, 24.8f, -25.2f)
        lineToRelative(7.24f, -43.35f)
        lineToRelative(47.11f, -3.47f)
        lineToRelative(3.78f, -46.8f)
        lineToRelative(49.63f, -0.95f)
        lineToRelative(0.49f, -50.09f)
        lineToRelative(52.69f, 2.1f)
        lineToRelative(9f, -18.84f)
        curveToRelative(15.5f, 6.7f, 29.6f, 9.4f, 47.7f, 9.4f)
        curveToRelative(68.5f, 0f, 124f, -53.4f, 124f, -119.2f)
        reflectiveCurveTo(408.5f, 48f, 340f, 48f)
        reflectiveCurveTo(218.1f, 101.4f, 218.1f, 167.2f)
        close()
        moveTo(406.85f, 144f)
        arcTo(38.85f, 38.85f, 0f, isMoreThanHalf = true, isPositiveArc = true, 368f, 105.15f)
        arcTo(38.81f, 38.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 406.85f, 144f)
        close()
      }
    }.build()

    return _KeySharp!!
  }

@Suppress("ObjectPropertyName")
private var _KeySharp: ImageVector? = null
