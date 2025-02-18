package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Layers: ImageVector
  get() {
    if (_LayersSharp != null) {
      return _LayersSharp!!
    }
    _LayersSharp = ImageVector.Builder(
      name = "Sharp.LayersSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 150f)
        lineToRelative(-224f, -102f)
        lineToRelative(-224f, 102f)
        lineToRelative(224f, 104f)
        lineToRelative(224f, -104f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(255.71f, 392.95f)
        lineToRelative(-144.81f, -66.2f)
        lineToRelative(-78.9f, 35.25f)
        lineToRelative(224f, 102f)
        lineToRelative(224f, -102f)
        lineToRelative(-78.69f, -35.3f)
        lineToRelative(-145.6f, 66.25f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 256f)
        lineToRelative(-75.53f, -33.53f)
        lineTo(256.1f, 290.6f)
        lineTo(107.33f, 222.43f)
        lineTo(32f, 256f)
        lineTo(256f, 358f)
        lineTo(480f, 256f)
        reflectiveCurveTo(480f, 256f, 480f, 256f)
        close()
      }
    }.build()

    return _LayersSharp!!
  }

@Suppress("ObjectPropertyName")
private var _LayersSharp: ImageVector? = null
