package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.CaretForwardCircle: ImageVector
  get() {
    if (_CaretForwardCircleOutline != null) {
      return _CaretForwardCircleOutline!!
    }
    _CaretForwardCircleOutline = ImageVector.Builder(
      name = "Outline.CaretForwardCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(238.23f, 342.43f)
        lineToRelative(89.09f, -74.13f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -24.6f)
        lineToRelative(-89.09f, -74.13f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212f, 181.86f)
        verticalLineTo(330.14f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 238.23f, 342.43f)
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

    return _CaretForwardCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CaretForwardCircleOutline: ImageVector? = null
