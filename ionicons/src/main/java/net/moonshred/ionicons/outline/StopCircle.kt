package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.StopCircle: ImageVector
  get() {
    if (_StopCircleOutline != null) {
      return _StopCircleOutline!!
    }
    _StopCircleOutline = ImageVector.Builder(
      name = "Outline.StopCircleOutline",
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
        moveTo(310.4f, 336f)
        horizontalLineTo(201.6f)
        arcTo(25.62f, 25.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 310.4f)
        verticalLineTo(201.6f)
        arcTo(25.62f, 25.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 201.6f, 176f)
        horizontalLineTo(310.4f)
        arcTo(25.62f, 25.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 201.6f)
        verticalLineTo(310.4f)
        arcTo(25.62f, 25.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 310.4f, 336f)
        close()
      }
    }.build()

    return _StopCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _StopCircleOutline: ImageVector? = null
