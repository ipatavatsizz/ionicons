package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Diamond: ImageVector
  get() {
    if (_DiamondSharp != null) {
      return _DiamondSharp!!
    }
    _DiamondSharp = ImageVector.Builder(
      name = "Sharp.DiamondSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(396.31f, 32f)
        lineToRelative(-132.31f, 0f)
        lineToRelative(84.19f, 112.26f)
        lineToRelative(48.12f, -112.26f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(115.69f, 32f)
        lineToRelative(48.12f, 112.26f)
        lineToRelative(84.19f, -112.26f)
        lineToRelative(-132.31f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 74.67f)
        lineToRelative(-64f, 85.33f)
        lineToRelative(128f, 0f)
        lineToRelative(-64f, -85.33f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(422.95f, 51.06f)
        lineToRelative(-46.69f, 108.94f)
        lineToRelative(111.74f, 0f)
        lineToRelative(-65.05f, -108.94f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(89.05f, 51.06f)
        lineToRelative(-66.05f, 108.94f)
        lineToRelative(112.74f, 0f)
        lineToRelative(-46.69f, -108.94f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(146.68f, 192f)
        lineToRelative(-122.68f, 0f)
        lineToRelative(222.8f, 288f)
        lineToRelative(0.53f, 0f)
        lineToRelative(-100.65f, -288f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(365.32f, 192f)
        lineToRelative(-100.65f, 288f)
        lineToRelative(0.53f, 0f)
        lineToRelative(222.8f, -288f)
        lineToRelative(-122.68f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(329.39f, 192f)
        lineToRelative(-146.78f, 0f)
        lineToRelative(73.39f, 208f)
        lineToRelative(73.39f, -208f)
        close()
      }
    }.build()

    return _DiamondSharp!!
  }

@Suppress("ObjectPropertyName")
private var _DiamondSharp: ImageVector? = null
