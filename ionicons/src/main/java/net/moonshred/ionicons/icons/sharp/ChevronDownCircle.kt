package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ChevronDownCircle: ImageVector
  get() {
    if (_ChevronDownCircleSharp != null) {
      return _ChevronDownCircleSharp!!
    }
    _ChevronDownCircleSharp = ImageVector.Builder(
      name = "Sharp.ChevronDownCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 464f)
        curveToRelative(114.87f, 0f, 208f, -93.13f, 208f, -208f)
        reflectiveCurveTo(370.87f, 48f, 256f, 48f)
        reflectiveCurveTo(48f, 141.13f, 48f, 256f)
        reflectiveCurveTo(141.13f, 464f, 256f, 464f)
        close()
        moveTo(160f, 193.37f)
        lineToRelative(96f, 96f)
        lineToRelative(96f, -96f)
        lineTo(374.63f, 216f)
        lineTo(256f, 334.63f)
        lineTo(137.37f, 216f)
        close()
      }
    }.build()

    return _ChevronDownCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronDownCircleSharp: ImageVector? = null
