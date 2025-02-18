package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.PlaySkipBackCircle: ImageVector
  get() {
    if (_PlaySkipBackCircleOutline != null) {
      return _PlaySkipBackCircleOutline!!
    }
    _PlaySkipBackCircleOutline = ImageVector.Builder(
      name = "Outline.PlaySkipBackCircleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 448f)
        curveToRelative(106f, 0f, 192f, -86f, 192f, -192f)
        reflectiveCurveTo(362f, 64f, 256f, 64f)
        reflectiveCurveTo(64f, 150f, 64f, 256f)
        reflectiveCurveTo(150f, 448f, 256f, 448f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(192f, 176f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        verticalLineToRelative(53f)
        lineToRelative(111.68f, -67.46f)
        arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 186.87f)
        verticalLineTo(325.13f)
        arcToRelative(
          10.78f,
          10.78f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -16.32f,
          9.31f
        )
        lineTo(208f, 267f)
        verticalLineToRelative(53f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        verticalLineTo(192f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 176f)
        close()
      }
    }.build()

    return _PlaySkipBackCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PlaySkipBackCircleOutline: ImageVector? = null
