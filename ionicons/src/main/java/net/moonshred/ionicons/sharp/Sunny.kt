package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Sunny: ImageVector
  get() {
    if (_SunnySharp != null) {
      return _SunnySharp!!
    }
    _SunnySharp = ImageVector.Builder(
      name = "Sharp.SunnySharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(234f, 26f)
        horizontalLineToRelative(44f)
        verticalLineToRelative(92f)
        horizontalLineToRelative(-44f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(234f, 394f)
        horizontalLineToRelative(44f)
        verticalLineToRelative(92f)
        horizontalLineToRelative(-44f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(338.03f, 142.86f)
        lineToRelative(65.05f, -65.05f)
        lineToRelative(31.11f, 31.11f)
        lineToRelative(-65.05f, 65.05f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(77.82f, 403.07f)
        lineToRelative(65.05f, -65.05f)
        lineToRelative(31.11f, 31.11f)
        lineToRelative(-65.05f, 65.05f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(394f, 234f)
        horizontalLineToRelative(92f)
        verticalLineToRelative(44f)
        horizontalLineToRelative(-92f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(26f, 234f)
        horizontalLineToRelative(92f)
        verticalLineToRelative(44f)
        horizontalLineToRelative(-92f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(338.03f, 369.14f)
        lineToRelative(31.11f, -31.11f)
        lineToRelative(65.05f, 65.05f)
        lineToRelative(-31.11f, 31.11f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(77.8f, 108.92f)
        lineToRelative(31.11f, -31.11f)
        lineToRelative(65.05f, 65.05f)
        lineToRelative(-31.11f, 31.11f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 358f)
        arcTo(102f, 102f, 0f, isMoreThanHalf = true, isPositiveArc = true, 358f, 256f)
        arcTo(102.12f, 102.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 358f)
        close()
      }
    }.build()

    return _SunnySharp!!
  }

@Suppress("ObjectPropertyName")
private var _SunnySharp: ImageVector? = null
