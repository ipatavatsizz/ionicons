package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Aperture: ImageVector
  get() {
    if (_ApertureSharp != null) {
      return _ApertureSharp!!
    }
    _ApertureSharp = ImageVector.Builder(
      name = "Sharp.ApertureSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(216f, 48f)
        lineToRelative(129.49f, 128.18f)
        lineToRelative(0f, -128.18f)
        lineToRelative(-129.49f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(181.47f, 58.38f)
        lineToRelative(-101.47f, 75.62f)
        lineToRelative(176f, 0f)
        lineToRelative(-74.53f, -75.62f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 344f)
        lineToRelative(128f, 0f)
        lineToRelative(0f, -128f)
        lineToRelative(-128f, 128f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(454f, 182f)
        lineToRelative(-76f, -102f)
        lineToRelative(0f, 176f)
        lineToRelative(76f, -74f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 166f)
        lineToRelative(0f, 128f)
        lineToRelative(128f, -128f)
        lineToRelative(-128f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(330f, 454f)
        lineToRelative(102f, -76f)
        lineToRelative(-176f, 0f)
        lineToRelative(74f, 76f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(58f, 330f)
        lineToRelative(76f, 102f)
        lineToRelative(0f, -176f)
        lineToRelative(-76f, 74f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(345.49f, 222.12f)
        lineToRelative(-55.55f, -55.46f)
        horizontalLineTo(222.06f)
        lineToRelative(-55.55f, 55.46f)
        verticalLineToRelative(67.76f)
        lineToRelative(55.62f, 55.52f)
        curveToRelative(0.44f, 0f, 0.88f, -0.06f, 1.33f, -0.06f)
        horizontalLineToRelative(66.48f)
        lineToRelative(55.55f, -55.46f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(165.98f, 336.09f)
        lineToRelative(0.02f, 127.91f)
        lineToRelative(128f, 0f)
        lineToRelative(-128.02f, -127.91f)
        close()
      }
    }.build()

    return _ApertureSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ApertureSharp: ImageVector? = null
