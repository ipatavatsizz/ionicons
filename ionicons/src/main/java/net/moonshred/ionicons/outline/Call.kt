package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Call: ImageVector
  get() {
    if (_CallOutline != null) {
      return _CallOutline!!
    }
    _CallOutline = ImageVector.Builder(
      name = "Outline.CallOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(451f, 374f)
        curveToRelative(-15.88f, -16f, -54.34f, -39.35f, -73f, -48.76f)
        curveTo(353.7f, 313f, 351.7f, 312f, 332.6f, 326.19f)
        curveToRelative(-12.74f, 9.47f, -21.21f, 17.93f, -36.12f, 14.75f)
        reflectiveCurveToRelative(-47.31f, -21.11f, -75.68f, -49.39f)
        reflectiveCurveToRelative(-47.34f, -61.62f, -50.53f, -76.48f)
        reflectiveCurveToRelative(5.41f, -23.23f, 14.79f, -36f)
        curveToRelative(13.22f, -18f, 12.22f, -21f, 0.92f, -45.3f)
        curveToRelative(-8.81f, -18.9f, -32.84f, -57f, -48.9f, -72.8f)
        curveTo(119.9f, 44f, 119.9f, 47f, 108.83f, 51.6f)
        arcTo(160.15f, 160.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 83f, 65.37f)
        curveTo(67f, 76f, 58.12f, 84.83f, 51.91f, 98.1f)
        reflectiveCurveToRelative(-9f, 44.38f, 23.07f, 102.64f)
        reflectiveCurveToRelative(54.57f, 88.05f, 101.14f, 134.49f)
        reflectiveCurveTo(258.5f, 406.64f, 310.85f, 436f)
        curveToRelative(64.76f, 36.27f, 89.6f, 29.2f, 102.91f, 23f)
        reflectiveCurveToRelative(22.18f, -15f, 32.83f, -31f)
        arcToRelative(
          159.09f,
          159.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          13.8f,
          -25.8f
        )
        curveTo(465f, 391.17f, 468f, 391.17f, 451f, 374f)
        close()
      }
    }.build()

    return _CallOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CallOutline: ImageVector? = null
