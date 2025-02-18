package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.RadioButtonOn: ImageVector
  get() {
    if (_RadioButtonOnSharp != null) {
      return _RadioButtonOnSharp!!
    }
    _RadioButtonOnSharp = ImageVector.Builder(
      name = "Sharp.RadioButtonOnSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(448f, 256f)
        curveToRelative(0f, -106f, -86f, -192f, -192f, -192f)
        reflectiveCurveTo(64f, 150f, 64f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        reflectiveCurveTo(448f, 362f, 448f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 256f)
        moveToRelative(-144f, 0f)
        arcToRelative(144f, 144f, 0f, isMoreThanHalf = true, isPositiveArc = true, 288f, 0f)
        arcToRelative(144f, 144f, 0f, isMoreThanHalf = true, isPositiveArc = true, -288f, 0f)
      }
    }.build()

    return _RadioButtonOnSharp!!
  }

@Suppress("ObjectPropertyName")
private var _RadioButtonOnSharp: ImageVector? = null
