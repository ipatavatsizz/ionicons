package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.MicCircle: ImageVector
  get() {
    if (_MicCircleSharp != null) {
      return _MicCircleSharp!!
    }
    _MicCircleSharp = ImageVector.Builder(
      name = "Sharp.MicCircleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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
        moveTo(208f, 176f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, -48f)
        horizontalLineToRelative(0f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
        verticalLineToRelative(64f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 48f)
        horizontalLineToRelative(0f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, -48f)
        close()
        moveTo(352f, 248.22f)
        curveToRelative(0f, 23.36f, -10.94f, 45.61f, -30.79f, 62.66f)
        arcTo(103.71f, 103.71f, 0f, isMoreThanHalf = false, isPositiveArc = true, 272f, 334.26f)
        lineTo(272f, 352f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(32f)
        lineTo(208f, 384f)
        lineTo(208f, 352f)
        horizontalLineToRelative(32f)
        lineTo(240f, 334.26f)
        arcToRelative(
          103.71f,
          103.71f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -49.21f,
          -23.38f
        )
        curveTo(170.94f, 293.83f, 160f, 271.58f, 160f, 248.22f)
        lineTo(160f, 208.3f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(39.92f)
        curveToRelative(0f, 25.66f, 28f, 55.48f, 64f, 55.48f)
        curveToRelative(29.6f, 0f, 64f, -24.23f, 64f, -55.48f)
        lineTo(320f, 208.3f)
        horizontalLineToRelative(32f)
        close()
      }
    }.build()

    return _MicCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MicCircleSharp: ImageVector? = null
