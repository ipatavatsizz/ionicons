package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.CaretDownCircle: ImageVector
  get() {
    if (_CaretDownCircleOutline != null) {
      return _CaretDownCircleOutline!!
    }
    _CaretDownCircleOutline = ImageVector.Builder(
      name = "Outline.CaretDownCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(342.43f, 238.23f)
        lineTo(268.3f, 327.32f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24.6f, 0f)
        lineToRelative(-74.13f, -89.09f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 181.86f, 212f)
        horizontalLineTo(330.14f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 342.43f, 238.23f)
        close()
      }
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
    }.build()

    return _CaretDownCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CaretDownCircleOutline: ImageVector? = null
