package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Water: ImageVector
  get() {
    if (_WaterSharp != null) {
      return _WaterSharp!!
    }
    _WaterSharp = ImageVector.Builder(
      name = "Sharp.WaterSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 43.91f)
        reflectiveCurveToRelative(-144f, 158.3f, -144f, 270.3f)
        curveToRelative(0f, 88.36f, 55.64f, 144f, 144f, 144f)
        reflectiveCurveToRelative(144f, -55.64f, 144f, -144f)
        curveTo(400f, 202.21f, 256f, 43.91f, 256f, 43.91f)
        close()
        moveTo(272f, 406.21f)
        verticalLineToRelative(-24f)
        arcToRelative(60.07f, 60.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 60f, -60f)
        horizontalLineToRelative(24f)
        arcTo(84.09f, 84.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 272f, 406.21f)
        close()
      }
    }.build()

    return _WaterSharp!!
  }

@Suppress("ObjectPropertyName")
private var _WaterSharp: ImageVector? = null
