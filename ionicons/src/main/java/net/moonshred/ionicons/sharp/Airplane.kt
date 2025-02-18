package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Airplane: ImageVector
  get() {
    if (_AirplaneSharp != null) {
      return _AirplaneSharp!!
    }
    _AirplaneSharp = ImageVector.Builder(
      name = "Sharp.AirplaneSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(407.72f, 208f)
        curveToRelative(-2.72f, 0f, -14.44f, 0.08f, -18.67f, 0.31f)
        lineToRelative(-57.77f, 1.52f)
        lineTo(198.06f, 48f)
        lineTo(135.25f, 48f)
        lineToRelative(74.59f, 164.61f)
        lineToRelative(-97.31f, 1.44f)
        lineTo(68.25f, 160f)
        lineTo(16.14f, 160f)
        lineToRelative(20.61f, 94.18f)
        curveToRelative(0.15f, 0.54f, 0.33f, 1.07f, 0.53f, 1.59f)
        arcToRelative(0.26f, 0.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 0.15f)
        arcToRelative(
          15.42f,
          15.42f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.53f,
          1.58f
        )
        lineTo(15.86f, 352f)
        lineTo(67.64f, 352f)
        lineToRelative(45.45f, -55f)
        lineToRelative(96.77f, 2.17f)
        lineTo(135.24f, 464f)
        horizontalLineToRelative(63f)
        lineToRelative(133f, -161.75f)
        lineToRelative(57.77f, 1.54f)
        curveToRelative(4.29f, 0.23f, 16f, 0.31f, 18.66f, 0.31f)
        curveToRelative(24.35f, 0f, 44.27f, -3.34f, 59.21f, -9.94f)
        curveTo(492.22f, 283f, 496f, 265.46f, 496f, 256f)
        curveTo(496f, 225.94f, 463f, 208f, 407.72f, 208f)
        close()
        moveTo(336.43f, 295.9f)
        verticalLineToRelative(0f)
        close()
      }
    }.build()

    return _AirplaneSharp!!
  }

@Suppress("ObjectPropertyName")
private var _AirplaneSharp: ImageVector? = null
