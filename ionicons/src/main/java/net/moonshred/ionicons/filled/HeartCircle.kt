package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.HeartCircle: ImageVector
  get() {
    if (_HeartCircle != null) {
      return _HeartCircle!!
    }
    _HeartCircle = ImageVector.Builder(
      name = "Filled.HeartCircle",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.31f, 48f, 48f, 141.31f, 48f, 256f)
        reflectiveCurveToRelative(93.31f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.31f, 208f, -208f)
        reflectiveCurveTo(370.69f, 48f, 256f, 48f)
        close()
        moveTo(330.69f, 300.82f)
        curveToRelative(-9.38f, 11.44f, -26.4f, 29.73f, -65.7f, 56.41f)
        arcToRelative(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -18f, 0f)
        curveToRelative(-39.3f, -26.68f, -56.32f, -45f, -65.7f, -56.41f)
        curveToRelative(-20f, -24.37f, -29.58f, -49.4f, -29.3f, -76.5f)
        curveToRelative(0.31f, -31.06f, 25.22f, -56.33f, 55.53f, -56.33f)
        curveToRelative(20.4f, 0f, 35f, 10.63f, 44.1f, 20.41f)
        arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.72f, 0f)
        curveToRelative(9.11f, -9.78f, 23.7f, -20.41f, 44.1f, -20.41f)
        curveToRelative(30.31f, 0f, 55.22f, 25.27f, 55.53f, 56.33f)
        curveTo(360.27f, 251.42f, 350.68f, 276.45f, 330.69f, 300.82f)
        close()
      }
    }.build()

    return _HeartCircle!!
  }

@Suppress("ObjectPropertyName")
private var _HeartCircle: ImageVector? = null
