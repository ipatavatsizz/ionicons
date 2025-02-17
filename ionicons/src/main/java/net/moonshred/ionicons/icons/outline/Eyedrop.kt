package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Eyedrop: ImageVector
  get() {
    if (_EyedropOutline != null) {
      return _EyedropOutline!!
    }
    _EyedropOutline = ImageVector.Builder(
      name = "Outline.EyedropOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(262.51f, 204.22f)
        lineTo(70f, 396.69f)
        curveTo(57.56f, 409.15f, 48f, 464f, 48f, 464f)
        reflectiveCurveToRelative(54.38f, -9.09f, 67.31f, -22f)
        lineTo(307.8f, 249.51f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(285.14f, 136.28f)
        lineTo(375.71f, 226.86f)
        arcTo(
          32.03f,
          32.03f,
          134.99f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          375.72f,
          272.15f
        )
        lineTo(375.72f, 272.15f)
        arcTo(
          32.03f,
          32.03f,
          134.99f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          330.42f,
          272.15f
        )
        lineTo(239.85f, 181.57f)
        arcTo(
          32.03f,
          32.03f,
          134.99f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          239.85f,
          136.28f
        )
        lineTo(239.85f, 136.28f)
        arcTo(
          32.03f,
          32.03f,
          134.99f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          285.14f,
          136.28f
        )
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(289.91f, 141f)
        reflectiveCurveToRelative(20.57f, 8.57f, 37.22f, -8.08f)
        lineTo(381.8f, 62.29f)
        curveToRelative(18.5f, -19.41f, 49.26f, -18.69f, 67.94f, 0f)
        horizontalLineToRelative(0f)
        curveToRelative(18.68f, 18.68f, 19.34f, 48.81f, 0f, 67.93f)
        lineToRelative(-70.68f, 54.67f)
        curveToRelative(-15.65f, 15.65f, -8.08f, 37.22f, -8.08f, 37.22f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(115.31f, 442f)
        reflectiveCurveToRelative(-26.48f, 17.34f, -44.56f, -0.73f)
        reflectiveCurveTo(70f, 396.69f, 70f, 396.69f)
      }
    }.build()

    return _EyedropOutline!!
  }

@Suppress("ObjectPropertyName")
private var _EyedropOutline: ImageVector? = null
