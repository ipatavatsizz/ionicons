package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Infinite: ImageVector
  get() {
    if (_InfiniteSharp != null) {
      return _InfiniteSharp!!
    }
    _InfiniteSharp = ImageVector.Builder(
      name = "Sharp.InfiniteSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(382f, 136f)
        curveToRelative(-40.87f, 0f, -73.46f, 20.53f, -93.6f, 37.76f)
        lineToRelative(-0.71f, 0.61f)
        lineToRelative(-11.47f, 12.47f)
        lineToRelative(25.32f, 41.61f)
        lineToRelative(18.74f, -18.79f)
        curveTo(339.89f, 193.1f, 361.78f, 184f, 382f, 184f)
        curveToRelative(40.8f, 0f, 74f, 32.3f, 74f, 72f)
        reflectiveCurveToRelative(-33.2f, 72f, -74f, 72f)
        curveToRelative(-62f, 0f, -104.14f, -81.95f, -104.56f, -82.78f)
        horizontalLineToRelative(0f)
        curveTo(275f, 240.29f, 221.56f, 136f, 130f, 136f)
        curveTo(62.73f, 136f, 8f, 189.83f, 8f, 256f)
        reflectiveCurveTo(62.73f, 376f, 130f, 376f)
        curveToRelative(32.95f, 0f, 65.38f, -13.11f, 93.79f, -37.92f)
        lineToRelative(0.61f, -0.54f)
        lineToRelative(11.38f, -12.38f)
        lineToRelative(-25.33f, -41.61f)
        lineToRelative(-18.83f, 18.88f)
        curveTo(172f, 319.4f, 151.26f, 328f, 130f, 328f)
        curveToRelative(-40.8f, 0f, -74f, -32.3f, -74f, -72f)
        reflectiveCurveToRelative(33.2f, -72f, 74f, -72f)
        curveToRelative(62f, 0f, 104.14f, 81.95f, 104.56f, 82.78f)
        horizontalLineToRelative(0f)
        curveTo(237f, 271.71f, 290.44f, 376f, 382f, 376f)
        curveToRelative(67.27f, 0f, 122f, -53.83f, 122f, -120f)
        reflectiveCurveTo(449.27f, 136f, 382f, 136f)
        close()
      }
    }.build()

    return _InfiniteSharp!!
  }

@Suppress("ObjectPropertyName")
private var _InfiniteSharp: ImageVector? = null
