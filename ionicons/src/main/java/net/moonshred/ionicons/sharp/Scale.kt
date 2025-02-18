package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Scale: ImageVector
  get() {
    if (_ScaleSharp != null) {
      return _ScaleSharp!!
    }
    _ScaleSharp = ImageVector.Builder(
      name = "Sharp.ScaleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(432f, 32f)
        horizontalLineTo(80f)
        arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 80f)
        verticalLineTo(432f)
        arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
        horizontalLineTo(432f)
        arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -48f)
        verticalLineTo(80f)
        arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 432f, 32f)
        close()
        moveTo(415.29f, 197f)
        lineToRelative(-52.46f, 61.73f)
        arcToRelative(
          27.83f,
          27.83f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -37.65f,
          4.62f
        )
        curveToRelative(-13f, -9.29f, -39.27f, -24.89f, -69.18f, -24.89f)
        reflectiveCurveToRelative(-56.18f, 15.6f, -69.18f, 24.89f)
        arcToRelative(
          27.84f,
          27.84f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -37.65f,
          -4.62f
        )
        lineTo(96.71f, 197f)
        arcTo(32.12f, 32.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 97.13f, 155f)
        curveToRelative(18.93f, -21.31f, 72.3f, -70.87f, 158.87f, -70.87f)
        reflectiveCurveTo(395.94f, 133.72f, 414.87f, 155f)
        horizontalLineToRelative(0f)
        arcTo(32.12f, 32.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 415.29f, 197f)
        close()
      }
    }.build()

    return _ScaleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ScaleSharp: ImageVector? = null
