package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.AmericanFootball: ImageVector
  get() {
    if (_AmericanFootballSharp != null) {
      return _AmericanFootballSharp!!
    }
    _AmericanFootballSharp = ImageVector.Builder(
      name = "Sharp.AmericanFootballSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(120.9f, 120.51f)
        curveToRelative(-44.75f, 44.56f, -67.29f, 101.05f, -78.64f, 145.9f)
        lineTo(244.57f, 467.85f)
        curveToRelative(45.05f, -11.3f, 101.78f, -33.74f, 146.53f, -78.3f)
        reflectiveCurveToRelative(67.29f, -101.05f, 78.64f, -145.91f)
        lineTo(267.43f, 42.21f)
        curveTo(222.38f, 53.51f, 165.65f, 76f, 120.9f, 120.51f)
        close()
        moveTo(379.9f, 378.34f)
        horizontalLineToRelative(0f)
        close()
        moveTo(334.9f, 154.14f)
        lineTo(357.42f, 176.56f)
        lineTo(323.64f, 210.19f)
        lineTo(346.16f, 232.61f)
        lineTo(323.55f, 255f)
        lineTo(301f, 232.61f)
        lineTo(278.52f, 255f)
        lineTo(301f, 277.45f)
        lineToRelative(-22.51f, 22.42f)
        lineTo(256f, 277.45f)
        lineToRelative(-22.52f, 22.42f)
        lineTo(256f, 322.29f)
        lineToRelative(-22.52f, 22.42f)
        lineTo(211f, 322.29f)
        lineToRelative(-33.78f, 33.63f)
        lineTo(154.67f, 333.5f)
        lineToRelative(33.78f, -33.63f)
        lineToRelative(-22.52f, -22.42f)
        lineTo(188.45f, 255f)
        lineTo(211f, 277.45f)
        lineTo(233.48f, 255f)
        lineTo(211f, 232.61f)
        lineToRelative(22.51f, -22.42f)
        lineTo(256f, 232.61f)
        lineToRelative(22.52f, -22.42f)
        lineTo(256f, 187.77f)
        lineToRelative(22.52f, -22.42f)
        lineTo(301f, 187.77f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(478.48f, 198.41f)
        curveTo(485.85f, 143.65f, 464f, 48.05f, 464f, 48.05f)
        reflectiveCurveTo(367.86f, 26.17f, 312.86f, 33.51f)
        curveToRelative(-2.54f, 0.33f, -5.21f, 0.72f, -8f, 1.14f)
        lineTo(477.33f, 206.36f)
        curveTo(477.76f, 203.6f, 478.14f, 200.94f, 478.48f, 198.41f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(33.52f, 311.65f)
        curveTo(26.15f, 366.41f, 48.05f, 464f, 48.05f, 464f)
        reflectiveCurveToRelative(60f, 16f, 99.86f, 16f)
        arcToRelative(
          391.92f,
          391.92f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          51.23f,
          -3.45f
        )
        curveToRelative(2.54f, -0.33f, 5.21f, -0.72f, 8f, -1.15f)
        lineTo(34.67f, 303.7f)
        curveTo(34.24f, 306.46f, 33.86f, 309.12f, 33.52f, 311.65f)
        close()
      }
    }.build()

    return _AmericanFootballSharp!!
  }

@Suppress("ObjectPropertyName")
private var _AmericanFootballSharp: ImageVector? = null
