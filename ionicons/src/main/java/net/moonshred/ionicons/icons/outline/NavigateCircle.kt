package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.NavigateCircle: ImageVector
  get() {
    if (_NavigateCircleOutline != null) {
      return _NavigateCircleOutline!!
    }
    _NavigateCircleOutline = ImageVector.Builder(
      name = "Outline.NavigateCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336.76f, 161f)
        lineTo(150.23f, 243.35f)
        curveToRelative(-10.47f, 4.8f, -6.95f, 20.67f, 4.57f, 20.67f)
        horizontalLineTo(244f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
        verticalLineTo(357.2f)
        curveToRelative(0f, 11.52f, 16f, 15f, 20.78f, 4.56f)
        lineTo(351f, 175.24f)
        arcTo(10.73f, 10.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 336.76f, 161f)
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

    return _NavigateCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _NavigateCircleOutline: ImageVector? = null
