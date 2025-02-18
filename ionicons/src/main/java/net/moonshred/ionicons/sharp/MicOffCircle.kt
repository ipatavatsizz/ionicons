package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.MicOffCircle: ImageVector
  get() {
    if (_MicOffCircleSharp != null) {
      return _MicOffCircleSharp!!
    }
    _MicOffCircleSharp = ImageVector.Builder(
      name = "Sharp.MicOffCircleSharp",
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
        moveTo(320f, 248.22f)
        lineTo(320f, 208f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(40.22f)
        arcToRelative(
          77.53f,
          77.53f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -13.37f,
          43.11f
        )
        lineTo(316f, 266.4f)
        arcTo(44.11f, 44.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 320f, 248.22f)
        close()
        moveTo(256f, 128f)
        horizontalLineToRelative(0f)
        arcToRelative(48.14f, 48.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
        verticalLineToRelative(64f)
        arcToRelative(
          48.07f,
          48.07f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -1.44f,
          11.64f
        )
        lineToRelative(-89f, -97.92f)
        arcTo(48.13f, 48.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 128f)
        close()
        moveTo(304f, 384f)
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
        lineTo(160f, 208f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(40.22f)
        curveToRelative(0f, 25.66f, 28f, 55.48f, 64f, 55.48f)
        arcToRelative(56.91f, 56.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, -0.45f)
        lineToRelative(24.52f, 27f)
        arcToRelative(99.57f, 99.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.5f, 4f)
        lineTo(272.02f, 352f)
        horizontalLineToRelative(32f)
        close()
        moveTo(208.09f, 242.87f)
        lineToRelative(40.5f, 44.55f)
        arcTo(48.2f, 48.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208.09f, 242.87f)
        close()
        moveTo(344.16f, 367.76f)
        lineToRelative(-200.5f, -218.5f)
        lineToRelative(23.68f, -21.52f)
        lineToRelative(200.5f, 218.5f)
        close()
      }
    }.build()

    return _MicOffCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MicOffCircleSharp: ImageVector? = null
