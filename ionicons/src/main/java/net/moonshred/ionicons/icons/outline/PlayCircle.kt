package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.PlayCircle: ImageVector
  get() {
    if (_PlayCircleOutline != null) {
      return _PlayCircleOutline!!
    }
    _PlayCircleOutline = ImageVector.Builder(
      name = "Outline.PlayCircleOutline",
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
        moveTo(216.32f, 334.44f)
        lineTo(330.77f, 265.3f)
        arcToRelative(10.89f, 10.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -18.6f)
        lineTo(216.32f, 177.56f)
        arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 186.87f)
        verticalLineTo(325.13f)
        arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216.32f, 334.44f)
        close()
      }
    }.build()

    return _PlayCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PlayCircleOutline: ImageVector? = null
