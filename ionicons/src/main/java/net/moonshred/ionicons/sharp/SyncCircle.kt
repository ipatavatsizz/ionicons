package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.SyncCircle: ImageVector
  get() {
    if (_SyncCircleSharp != null) {
      return _SyncCircleSharp!!
    }
    _SyncCircleSharp = ImageVector.Builder(
      name = "Sharp.SyncCircleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.13f, 48f, 48f, 141.13f, 48f, 256f)
        reflectiveCurveToRelative(93.13f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.13f, 208f, -208f)
        reflectiveCurveTo(370.87f, 48f, 256f, 48f)
        close()
        moveTo(256f, 368f)
        arcToRelative(
          112.19f,
          112.19f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -111.27f,
          -98.23f
        )
        lineToRelative(-8.86f, 8.86f)
        lineTo(113.24f, 256f)
        lineToRelative(46f, -46f)
        lineToRelative(47.55f, 45.48f)
        lineToRelative(-22.12f, 23.12f)
        lineToRelative(-7.2f, -6.88f)
        arcToRelative(
          80.26f,
          80.26f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          138.48f,
          37.5f
        )
        lineToRelative(23.77f, 21.41f)
        arcTo(112.82f, 112.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 368f)
        close()
        moveTo(352.79f, 302f)
        lineTo(305.24f, 256.5f)
        lineToRelative(22.12f, -23.12f)
        lineToRelative(6.86f, 6.55f)
        arcTo(80.2f, 80.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 196f, 202.64f)
        lineToRelative(-23.82f, -21.37f)
        arcTo(112.18f, 112.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 367f, 242.49f)
        lineToRelative(9.11f, -9.12f)
        lineTo(398.76f, 256f)
        close()
      }
    }.build()

    return _SyncCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SyncCircleSharp: ImageVector? = null
