package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.HeartDislikeCircle: ImageVector
  get() {
    if (_HeartDislikeCircleSharp != null) {
      return _HeartDislikeCircleSharp!!
    }
    _HeartDislikeCircleSharp = ImageVector.Builder(
      name = "Sharp.HeartDislikeCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.31f, 48f, 48f, 141.31f, 48f, 256f)
        reflectiveCurveToRelative(93.31f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.31f, 208f, -208f)
        reflectiveCurveTo(370.69f, 48f, 256f, 48f)
        close()
        moveTo(319.73f, 358.36f)
        lineTo(136.59f, 176.06f)
        lineToRelative(22.74f, -22.51f)
        lineTo(342.52f, 335.91f)
        close()
        moveTo(256.22f, 363.22f)
        curveToRelative(-35.36f, -25f, -66.31f, -51.92f, -74.91f, -62.4f)
        curveToRelative(-20f, -24.37f, -29.58f, -49.4f, -29.3f, -76.5f)
        arcToRelative(
          58.27f,
          58.27f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          0.85f,
          -9.31f
        )
        lineToRelative(130.21f, 129.4f)
        curveTo(279.64f, 347f, 266.86f, 355.86f, 256.22f, 363.22f)
        close()
        moveTo(330.69f, 300.82f)
        lineTo(330.38f, 301.2f)
        lineTo(197.33f, 169f)
        arcToRelative(53.8f, 53.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.21f, -1f)
        arcToRelative(
          59.34f,
          59.34f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          44.1f,
          19.41f
        )
        lineTo(256f, 192f)
        lineToRelative(4.36f, -4.6f)
        arcTo(59.34f, 59.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 304.46f, 168f)
        curveToRelative(30.31f, 0f, 55.22f, 25.27f, 55.53f, 56.33f)
        curveTo(360.27f, 251.42f, 350.68f, 276.45f, 330.69f, 300.82f)
        close()
      }
    }.build()

    return _HeartDislikeCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HeartDislikeCircleSharp: ImageVector? = null
