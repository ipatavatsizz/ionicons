package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ColorWand: ImageVector
  get() {
    if (_ColorWandSharp != null) {
      return _ColorWandSharp!!
    }
    _ColorWandSharp = ImageVector.Builder(
      name = "Sharp.ColorWandSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(133.44f, 200.65f)
        lineToRelative(67.2f, -67.2f)
        lineToRelative(78.14f, 78.14f)
        lineToRelative(-67.2f, 67.2f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(301.41f, 234.21f)
        lineToRelative(-67.19f, 67.2f)
        lineToRelative(177.78f, 178.59f)
        lineToRelative(68f, -68f)
        lineToRelative(-178.59f, -177.79f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 176f)
        horizontalLineToRelative(80f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(67.62f, 90.25f)
        lineToRelative(22.63f, -22.63f)
        lineToRelative(56.57f, 56.57f)
        lineToRelative(-22.63f, 22.63f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(176f, 32f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(80f)
        horizontalLineToRelative(-32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(237.32f, 124.19f)
        lineToRelative(56.57f, -56.57f)
        lineToRelative(22.63f, 22.63f)
        lineToRelative(-56.57f, 56.57f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(67.62f, 293.89f)
        lineToRelative(56.57f, -56.57f)
        lineToRelative(22.63f, 22.63f)
        lineToRelative(-56.57f, 56.57f)
        close()
      }
    }.build()

    return _ColorWandSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ColorWandSharp: ImageVector? = null
