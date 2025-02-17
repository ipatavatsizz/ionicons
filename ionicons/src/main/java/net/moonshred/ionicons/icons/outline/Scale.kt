package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Scale: ImageVector
  get() {
    if (_ScaleOutline != null) {
      return _ScaleOutline!!
    }
    _ScaleOutline = ImageVector.Builder(
      name = "Outline.ScaleOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 48f)
        lineTo(368f, 48f)
        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 144f)
        lineTo(464f, 368f)
        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 464f)
        lineTo(144f, 464f)
        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 368f)
        lineTo(48f, 144f)
        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 48f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(388.94f, 151.56f)
        curveToRelative(-24.46f, -22.28f, -68.72f, -51.4f, -132.94f, -51.4f)
        reflectiveCurveToRelative(-108.48f, 29.12f, -132.94f, 51.4f)
        arcTo(34.66f, 34.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 120f, 199.64f)
        lineToRelative(33.32f, 39.21f)
        arcToRelative(
          26.07f,
          26.07f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          33.6f,
          5.21f
        )
        curveToRelative(15.92f, -9.83f, 40.91f, -21.64f, 69.1f, -21.64f)
        reflectiveCurveToRelative(53.18f, 11.81f, 69.1f, 21.64f)
        arcToRelative(
          26.07f,
          26.07f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          33.6f,
          -5.21f
        )
        lineTo(392f, 199.64f)
        arcTo(34.66f, 34.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 388.94f, 151.56f)
        close()
      }
    }.build()

    return _ScaleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ScaleOutline: ImageVector? = null
