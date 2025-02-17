package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Nutrition: ImageVector
  get() {
    if (_NutritionSharp != null) {
      return _NutritionSharp!!
    }
    _NutritionSharp = ImageVector.Builder(
      name = "Sharp.NutritionSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(438.71f, 159.43f)
        curveToRelative(-17.6f, -28.31f, -45.5f, -43.8f, -85.28f, -47.37f)
        curveToRelative(-22.82f, -2f, -50.23f, 4.94f, -72.25f, 10.55f)
        curveTo(271.26f, 125.14f, 260f, 128f, 256f, 128f)
        reflectiveCurveToRelative(-15.18f, -2.86f, -25f, -5.39f)
        curveToRelative(-22.08f, -5.65f, -49.56f, -12.69f, -72.45f, -10.54f)
        curveToRelative(-38.53f, 3.61f, -66f, 19.19f, -84f, 47.62f)
        reflectiveCurveTo(48f, 229f, 48f, 288f)
        curveToRelative(0f, 61.28f, 29.53f, 114.58f, 47.13f, 140.89f)
        curveTo(116.82f, 461.34f, 149.25f, 496f, 175.2f, 496f)
        curveToRelative(18.57f, 0f, 34.12f, -7.23f, 47.82f, -13.64f)
        curveTo(243f, 473f, 256f, 472f, 256f, 472f)
        reflectiveCurveToRelative(11f, 0f, 31.94f, 10.11f)
        curveTo(301.65f, 488.73f, 317.3f, 496f, 336.8f, 496f)
        curveToRelative(26.58f, 0f, 59.08f, -34.69f, 80.63f, -67.15f)
        curveTo(434.82f, 402.65f, 464f, 349.52f, 464f, 288f)
        curveTo(464f, 228f, 456f, 187.17f, 438.71f, 159.43f)
        close()
        moveTo(216f, 352f)
        curveToRelative(-13.25f, 0f, -24f, -21.49f, -24f, -48f)
        reflectiveCurveToRelative(10.75f, -48f, 24f, -48f)
        reflectiveCurveToRelative(24f, 21.49f, 24f, 48f)
        reflectiveCurveTo(229.25f, 352f, 216f, 352f)
        close()
        moveTo(296f, 352f)
        curveToRelative(-13.25f, 0f, -24f, -21.49f, -24f, -48f)
        reflectiveCurveToRelative(10.75f, -48f, 24f, -48f)
        reflectiveCurveToRelative(24f, 21.49f, 24f, 48f)
        reflectiveCurveTo(309.25f, 352f, 296f, 352f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(323.72f, 82.76f)
        curveTo(353.68f, 52.82f, 352f, 16.18f, 352f, 16.14f)
        horizontalLineToRelative(0f)
        reflectiveCurveToRelative(-35.77f, -3.76f, -67.23f, 27.67f)
        reflectiveCurveTo(256.06f, 112f, 256.06f, 112f)
        reflectiveCurveTo(293.74f, 112.71f, 323.72f, 82.76f)
        close()
      }
    }.build()

    return _NutritionSharp!!
  }

@Suppress("ObjectPropertyName")
private var _NutritionSharp: ImageVector? = null
