package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.CarSport: ImageVector
  get() {
    if (_CarSportOutline != null) {
      return _CarSportOutline!!
    }
    _CarSportOutline = ImageVector.Builder(
      name = "Outline.CarSportOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(469.71f, 234.6f)
        curveToRelative(-7.33f, -9.73f, -34.56f, -16.43f, -46.08f, -33.94f)
        reflectiveCurveToRelative(-20.95f, -55.43f, -50.27f, -70f)
        reflectiveCurveTo(288f, 112f, 256f, 112f)
        reflectiveCurveToRelative(-88f, 4f, -117.36f, 18.63f)
        reflectiveCurveToRelative(-38.75f, 52.52f, -50.27f, 70f)
        reflectiveCurveTo(49.62f, 224.87f, 42.29f, 234.6f)
        reflectiveCurveTo(29.8f, 305.84f, 32.94f, 336f)
        reflectiveCurveToRelative(9f, 48f, 9f, 48f)
        horizontalLineToRelative(86f)
        curveToRelative(14.08f, 0f, 18.66f, -5.29f, 47.46f, -8f)
        curveTo(207f, 373f, 238f, 372f, 256f, 372f)
        reflectiveCurveToRelative(50f, 1f, 81.58f, 4f)
        curveToRelative(28.8f, 2.73f, 33.53f, 8f, 47.46f, 8f)
        horizontalLineToRelative(85f)
        reflectiveCurveToRelative(5.86f, -17.84f, 9f, -48f)
        reflectiveCurveTo(477f, 244.33f, 469.71f, 234.6f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(400f, 384f)
        horizontalLineToRelative(56f)
        verticalLineToRelative(16f)
        horizontalLineToRelative(-56f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(56f, 384f)
        horizontalLineToRelative(56f)
        verticalLineToRelative(16f)
        horizontalLineToRelative(-56f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(364.47f, 309.16f)
        curveToRelative(-5.91f, -6.83f, -25.17f, -12.53f, -50.67f, -16.35f)
        reflectiveCurveTo(279f, 288f, 256.2f, 288f)
        reflectiveCurveToRelative(-33.17f, 1.64f, -57.61f, 4.81f)
        reflectiveCurveToRelative(-42.79f, 8.81f, -50.66f, 16.35f)
        curveTo(136.12f, 320.6f, 153.42f, 333.44f, 167f, 335f)
        curveToRelative(13.16f, 1.5f, 39.47f, 0.95f, 89.31f, 0.95f)
        reflectiveCurveToRelative(76.15f, 0.55f, 89.31f, -0.95f)
        curveTo(359.18f, 333.35f, 375.24f, 321.4f, 364.47f, 309.16f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(431.57f, 243.05f)
        arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.1f, -3f)
        curveToRelative(-11.81f, -0.42f, -23.8f, 0.42f, -45.07f, 6.69f)
        arcToRelative(
          93.88f,
          93.88f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -30.08f,
          15.06f
        )
        curveToRelative(-2.28f, 1.78f, -1.47f, 6.59f, 1.39f, 7.1f)
        arcTo(455.32f, 455.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 407.53f, 272f)
        curveToRelative(10.59f, 0f, 21.52f, -3f, 23.55f, -12.44f)
        arcTo(52.41f, 52.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 431.57f, 243.05f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(80.43f, 243.05f)
        arcToRelative(3.23f, 3.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.1f, -3f)
        curveToRelative(11.81f, -0.42f, 23.8f, 0.42f, 45.07f, 6.69f)
        arcToRelative(
          93.88f,
          93.88f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          30.08f,
          15.06f
        )
        curveToRelative(2.28f, 1.78f, 1.47f, 6.59f, -1.39f, 7.1f)
        arcTo(455.32f, 455.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104.47f, 272f)
        curveToRelative(-10.59f, 0f, -21.52f, -3f, -23.55f, -12.44f)
        arcTo(52.41f, 52.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80.43f, 243.05f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(432f, 192f)
        lineTo(448f, 192f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 192f)
        lineTo(80f, 192f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(78f, 211f)
        reflectiveCurveToRelative(46.35f, -12f, 178f, -12f)
        reflectiveCurveToRelative(178f, 12f, 178f, 12f)
      }
    }.build()

    return _CarSportOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CarSportOutline: ImageVector? = null
