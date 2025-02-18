package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.CaretBackCircle: ImageVector
  get() {
    if (_CaretBackCircleOutline != null) {
      return _CaretBackCircleOutline!!
    }
    _CaretBackCircleOutline = ImageVector.Builder(
      name = "Outline.CaretBackCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(273.77f, 169.57f)
        lineTo(184.68f, 243.7f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 24.6f)
        lineToRelative(89.09f, 74.13f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 300f, 330.14f)
        verticalLineTo(181.86f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 273.77f, 169.57f)
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

    return _CaretBackCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CaretBackCircleOutline: ImageVector? = null
