package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.PlaySkipForwardCircle: ImageVector
  get() {
    if (_PlaySkipForwardCircleOutline != null) {
      return _PlaySkipForwardCircleOutline!!
    }
    _PlaySkipForwardCircleOutline = ImageVector.Builder(
      name = "Outline.PlaySkipForwardCircleOutline",
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
        moveTo(320f, 176f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        verticalLineToRelative(53f)
        lineTo(192.32f, 177.56f)
        arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 186.87f)
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
        lineTo(304f, 267f)
        verticalLineToRelative(53f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 0f)
        verticalLineTo(192f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 320f, 176f)
        close()
      }
    }.build()

    return _PlaySkipForwardCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PlaySkipForwardCircleOutline: ImageVector? = null
