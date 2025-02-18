package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.CloudCircle: ImageVector
  get() {
    if (_CloudCircleSharp != null) {
      return _CloudCircleSharp!!
    }
    _CloudCircleSharp = ImageVector.Builder(
      name = "Sharp.CloudCircleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.13f, 48f, 48f, 141.13f, 48f, 256f)
        reflectiveCurveToRelative(93.13f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.13f, 208f, -208f)
        reflectiveCurveTo(370.87f, 48f, 256f, 48f)
        close()
        moveTo(326f, 328f)
        lineTo(196f, 328f)
        curveToRelative(-33f, 0f, -60f, -23f, -60f, -56f)
        curveToRelative(0f, -34.21f, 26f, -53f, 56f, -56f)
        curveToRelative(7.28f, -23.9f, 29.5f, -48f, 64f, -48f)
        curveToRelative(36.5f, 0f, 67.55f, 27.23f, 72f, 72f)
        curveToRelative(21.49f, 1.12f, 48f, 14.09f, 48f, 44f)
        curveTo(376f, 314.28f, 353.5f, 328f, 326f, 328f)
        close()
      }
    }.build()

    return _CloudCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CloudCircleSharp: ImageVector? = null
