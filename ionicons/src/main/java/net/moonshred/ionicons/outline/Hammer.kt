package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Hammer: ImageVector
  get() {
    if (_HammerOutline != null) {
      return _HammerOutline!!
    }
    _HammerOutline = ImageVector.Builder(
      name = "Outline.HammerOutline",
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
        moveTo(277.42f, 247f)
        arcToRelative(
          24.68f,
          24.68f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -4.08f,
          -5.47f
        )
        lineTo(255f, 223.44f)
        arcToRelative(
          21.63f,
          21.63f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -6.56f,
          -4.57f
        )
        arcToRelative(
          20.93f,
          20.93f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -23.28f,
          4.27f
        )
        curveToRelative(-6.36f, 6.26f, -18f, 17.68f, -39f, 38.43f)
        curveTo(146f, 301.3f, 71.43f, 367.89f, 37.71f, 396.29f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.09f, 23.54f)
        lineToRelative(39f, 39.43f)
        arcToRelative(
          16.13f,
          16.13f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          23.67f,
          -0.89f
        )
        curveToRelative(29.24f, -34.37f, 96.3f, -109f, 136f, -148.23f)
        curveToRelative(20.39f, -20.06f, 31.82f, -31.58f, 38.29f, -37.94f)
        arcTo(21.76f, 21.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 277.42f, 247f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(478.43f, 201f)
        lineToRelative(-34.31f, -34f)
        arcToRelative(5.44f, 5.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -1.59f)
        arcToRelative(5.59f, 5.59f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 1.59f)
        horizontalLineToRelative(0f)
        arcToRelative(
          11.41f,
          11.41f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -9.55f,
          3.27f
        )
        curveToRelative(-4.48f, -0.49f, -9.25f, -1.88f, -12.33f, -4.86f)
        curveToRelative(-7f, -6.86f, 1.09f, -20.36f, -5.07f, -29f)
        arcToRelative(
          242.88f,
          242.88f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -23.08f,
          -26.72f
        )
        curveToRelative(-7.06f, -7f, -34.81f, -33.47f, -81.55f, -52.53f)
        arcToRelative(
          123.79f,
          123.79f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -47f,
          -9.24f
        )
        curveToRelative(-26.35f, 0f, -46.61f, 11.76f, -54f, 18.51f)
        curveToRelative(-5.88f, 5.32f, -12f, 13.77f, -12f, 13.77f)
        arcTo(91.29f, 91.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 202.35f, 77f)
        arcToRelative(
          79.53f,
          79.53f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          23.28f,
          -1.49f
        )
        curveTo(241.19f, 76.8f, 259.94f, 84.1f, 270f, 92f)
        curveToRelative(16.21f, 13f, 23.18f, 30.39f, 24.27f, 52.83f)
        curveToRelative(0.8f, 16.69f, -15.23f, 37.76f, -30.44f, 54.94f)
        arcToRelative(7.85f, 7.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.4f, 10.83f)
        lineToRelative(21.24f, 21.23f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.14f, 0.1f)
        curveToRelative(13.93f, -13.51f, 31.09f, -28.47f, 40.82f, -34.46f)
        reflectiveCurveToRelative(17.58f, -7.68f, 21.35f, -8.09f)
        arcTo(35.71f, 35.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 380.08f, 194f)
        arcToRelative(
          13.65f,
          13.65f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          3.08f,
          2.38f
        )
        curveToRelative(6.46f, 6.56f, 6.07f, 17.28f, -0.5f, 23.74f)
        lineToRelative(-2f, 1.89f)
        arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.84f)
        lineToRelative(34.31f, 34f)
        arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 1.58f)
        arcToRelative(5.65f, 5.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -1.58f)
        lineTo(478.43f, 209f)
        arcTo(5.82f, 5.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 478.43f, 201f)
        close()
      }
    }.build()

    return _HammerOutline!!
  }

@Suppress("ObjectPropertyName")
private var _HammerOutline: ImageVector? = null
