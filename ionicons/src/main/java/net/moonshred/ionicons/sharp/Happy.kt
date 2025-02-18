package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Happy: ImageVector
  get() {
    if (_HappySharp != null) {
      return _HappySharp!!
    }
    _HappySharp = ImageVector.Builder(
      name = "Sharp.HappySharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(414.39f, 97.61f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = true, isPositiveArc = false, 97.61f, 414.39f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = true, isPositiveArc = false, 414.39f, 97.61f)
        close()
        moveTo(328f, 208f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 24f)
        arcTo(23.94f, 23.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 328f, 208f)
        close()
        moveTo(184f, 208f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 24f)
        arcTo(23.94f, 23.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 208f)
        close()
        moveTo(256.05f, 384f)
        curveToRelative(-45.42f, 0f, -83.75f, -29.49f, -95.72f, -69.83f)
        curveTo(159.29f, 310.65f, 158f, 304f, 158f, 304f)
        lineTo(354f, 304f)
        reflectiveCurveToRelative(-1.31f, 6.69f, -2.33f, 10.17f)
        curveTo(339.89f, 354.53f, 301.47f, 384f, 256.05f, 384f)
        close()
      }
    }.build()

    return _HappySharp!!
  }

@Suppress("ObjectPropertyName")
private var _HappySharp: ImageVector? = null
