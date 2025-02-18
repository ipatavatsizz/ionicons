package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.PlayForwardCircle: ImageVector
  get() {
    if (_PlayForwardCircleOutline != null) {
      return _PlayForwardCircleOutline!!
    }
    _PlayForwardCircleOutline = ImageVector.Builder(
      name = "Outline.PlayForwardCircleOutline",
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
        moveTo(394.77f, 246.7f)
        lineTo(280.32f, 177.56f)
        arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 264f, 186.87f)
        verticalLineToRelative(53.32f)
        lineTo(160.32f, 177.56f)
        arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 186.87f)
        verticalLineTo(325.13f)
        arcToRelative(
          10.78f,
          10.78f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          16.32f,
          9.31f
        )
        lineTo(264f, 271.81f)
        verticalLineToRelative(53.32f)
        arcToRelative(
          10.78f,
          10.78f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          16.32f,
          9.31f
        )
        lineTo(394.77f, 265.3f)
        arcTo(10.89f, 10.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 394.77f, 246.7f)
        close()
      }
    }.build()

    return _PlayForwardCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PlayForwardCircleOutline: ImageVector? = null
