package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.PlayBackCircle: ImageVector
  get() {
    if (_PlayBackCircleOutline != null) {
      return _PlayBackCircleOutline!!
    }
    _PlayBackCircleOutline = ImageVector.Builder(
      name = "Outline.PlayBackCircleOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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
        moveTo(117.23f, 246.7f)
        lineToRelative(114.45f, -69.14f)
        arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 186.87f)
        verticalLineToRelative(53.32f)
        lineToRelative(103.68f, -62.63f)
        arcTo(10.78f, 10.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 186.87f)
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
        lineTo(248f, 271.81f)
        verticalLineToRelative(53.32f)
        arcToRelative(
          10.78f,
          10.78f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -16.32f,
          9.31f
        )
        lineTo(117.23f, 265.3f)
        arcTo(10.89f, 10.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 117.23f, 246.7f)
        close()
      }
    }.build()

    return _PlayBackCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PlayBackCircleOutline: ImageVector? = null
