package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ColorFilter: ImageVector
  get() {
    if (_ColorFilterSharp != null) {
      return _ColorFilterSharp!!
    }
    _ColorFilterSharp = ImageVector.Builder(
      name = "Sharp.ColorFilterSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 185f)
        arcToRelative(
          167.85f,
          167.85f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          134.9f,
          -18.28f
        )
        curveTo(382.36f, 99.83f, 325.12f, 48f, 256f, 48f)
        reflectiveCurveTo(129.64f, 99.83f, 121.1f, 166.67f)
        arcTo(167.85f, 167.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 185f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 331.73f)
        arcToRelative(
          167.51f,
          167.51f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -52.37f,
          118.08f
        )
        arcTo(135f, 135f, 0f, isMoreThanHalf = false, isPositiveArc = false, 344f, 464f)
        curveToRelative(75f, 0f, 136f, -61f, 136f, -136f)
        arcToRelative(
          136f,
          136f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -59.06f,
          -112.08f
        )
        arcTo(168.53f, 168.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 331.73f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(283.58f, 206.19f)
        arcToRelative(
          167.87f,
          167.87f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          49.36f,
          89.89f
        )
        arcTo(136.14f, 136.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 391f, 200.38f)
        arcToRelative(
          135.87f,
          135.87f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -107.43f,
          5.81f
        )
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(176.05f, 331.73f)
        arcToRelative(
          168.53f,
          168.53f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -85f,
          -115.81f
        )
        arcTo(136f, 136f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 328f)
        curveToRelative(0f, 75f, 61f, 136f, 136f, 136f)
        arcToRelative(
          135f,
          135f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          60.42f,
          -14.19f
        )
        arcTo(167.51f, 167.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176.05f, 331.73f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(179.06f, 296.08f)
        arcToRelative(
          167.87f,
          167.87f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          49.36f,
          -89.89f
        )
        arcTo(135.87f, 135.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 121f, 200.38f)
        arcTo(136.14f, 136.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 179.06f, 296.08f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(302.9f, 345.33f)
        arcToRelative(
          168.22f,
          168.22f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -93.8f,
          0f
        )
        arcTo(135.9f, 135.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 431.6f)
        arcTo(135.9f, 135.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 302.9f, 345.33f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(209f, 311.62f)
        arcToRelative(136f, 136f, 0f, isMoreThanHalf = false, isPositiveArc = false, 94f, 0f)
        arcToRelative(
          135.93f,
          135.93f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -47f,
          -87.22f
        )
        arcTo(135.93f, 135.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 209f, 311.62f)
        close()
      }
    }.build()

    return _ColorFilterSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ColorFilterSharp: ImageVector? = null
