package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.RadioButtonOn: ImageVector
  get() {
    if (_RadioButtonOnOutline != null) {
      return _RadioButtonOnOutline!!
    }
    _RadioButtonOnOutline = ImageVector.Builder(
      name = "Outline.RadioButtonOnOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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

    return _RadioButtonOnOutline!!
  }

@Suppress("ObjectPropertyName")
private var _RadioButtonOnOutline: ImageVector? = null
