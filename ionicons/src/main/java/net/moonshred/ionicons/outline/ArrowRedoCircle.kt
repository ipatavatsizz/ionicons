package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.ArrowRedoCircle: ImageVector
  get() {
    if (_ArrowRedoCircleOutline != null) {
      return _ArrowRedoCircleOutline!!
    }
    _ArrowRedoCircleOutline = ImageVector.Builder(
      name = "Outline.ArrowRedoCircleOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(266.91f, 327.74f)
        verticalLineTo(290.42f)
        curveToRelative(-57.07f, 0f, -84.51f, 13.47f, -108.58f, 38.68f)
        curveToRelative(-5.4f, 5.65f, -15f, 1.32f, -14.29f, -6.43f)
        curveToRelative(5.45f, -61.45f, 34.14f, -117.09f, 122.87f, -117.09f)
        verticalLineTo(168.26f)
        arcToRelative(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, -6f)
        lineTo(365.42f, 242f)
        arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.94f)
        lineTo(281f, 333.71f)
        arcTo(8.32f, 8.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 266.91f, 327.74f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(64f, 256f)
        curveToRelative(0f, 106f, 86f, 192f, 192f, 192f)
        reflectiveCurveToRelative(192f, -86f, 192f, -192f)
        reflectiveCurveTo(362f, 64f, 256f, 64f)
        reflectiveCurveTo(64f, 150f, 64f, 256f)
        close()
      }
    }.build()

    return _ArrowRedoCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowRedoCircleOutline: ImageVector? = null
