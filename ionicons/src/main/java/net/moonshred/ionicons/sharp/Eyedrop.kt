package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Eyedrop: ImageVector
  get() {
    if (_EyedropSharp != null) {
      return _EyedropSharp!!
    }
    _EyedropSharp = ImageVector.Builder(
      name = "Sharp.EyedropSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 96.22f)
        arcToRelative(
          63.84f,
          63.84f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -18.95f,
          -45.61f
        )
        arcToRelative(65f, 65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.71f, -19f)
        horizontalLineToRelative(-0.76f)
        arcToRelative(
          61.78f,
          61.78f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -44.22f,
          19.09f
        )
        lineToRelative(-74.88f, 74.88f)
        lineTo(261.6f, 91.72f)
        lineToRelative(-34.07f, 33.91f)
        lineToRelative(-33.85f, 34f)
        lineToRelative(44f, 44f)
        lineTo(32f, 409.37f)
        verticalLineTo(480f)
        horizontalLineToRelative(70.63f)
        lineToRelative(205.7f, -205.71f)
        lineTo(352f, 317.94f)
        lineToRelative(11.31f, -11.19f)
        curveToRelative(0.11f, -0.1f, 10.42f, -10.31f, 22.79f, -22.68f)
        lineToRelative(33.85f, -34f)
        lineToRelative(-33.89f, -33.89f)
        lineTo(461f, 141.23f)
        arcTo(63.18f, 63.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 480f, 96.22f)
        close()
        moveTo(245f, 292.35f)
        lineTo(219.65f, 267f)
        lineToRelative(40.68f, -40.69f)
        lineToRelative(25.38f, 25.38f)
        close()
      }
    }.build()

    return _EyedropSharp!!
  }

@Suppress("ObjectPropertyName")
private var _EyedropSharp: ImageVector? = null
