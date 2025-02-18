package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Telescope: ImageVector
  get() {
    if (_TelescopeSharp != null) {
      return _TelescopeSharp!!
    }
    _TelescopeSharp = ImageVector.Builder(
      name = "Sharp.TelescopeSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(1.41f, 292.9f)
        lineToRelative(44.82f, 76.97f)
        lineToRelative(98.14f, -56.38f)
        lineToRelative(-44.73f, -77.37f)
        lineToRelative(-98.23f, 56.78f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(287.87f, 252.34f)
        lineToRelative(23.67f, -13.81f)
        lineToRelative(-63.42f, -110f)
        lineToRelative(-132.92f, 77f)
        curveTo(133.75f, 237.51f, 176f, 310f, 176f, 310f)
        lineToRelative(15.53f, -8.32f)
        curveToRelative(0.24f, -0.13f, 0.55f, 0f, 0.83f, 0f)
        lineTo(102.65f, 496f)
        horizontalLineToRelative(35.16f)
        lineToRelative(99.05f, -214.25f)
        lineToRelative(23.24f, -13.4f)
        lineTo(358f, 464f)
        horizontalLineToRelative(36f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(262.08f, 96f)
        curveToRelative(24.81f, 42.23f, 60.25f, 104.25f, 86.4f, 148.76f)
        lineTo(510.79f, 151f)
        lineTo(424.07f, 1.41f)
        close()
      }
    }.build()

    return _TelescopeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TelescopeSharp: ImageVector? = null
