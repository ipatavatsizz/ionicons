package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Stopwatch: ImageVector
  get() {
    if (_StopwatchSharp != null) {
      return _StopwatchSharp!!
    }
    _StopwatchSharp = ImageVector.Builder(
      name = "Sharp.StopwatchSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(280f, 81.5f)
        verticalLineTo(48f)
        horizontalLineTo(232f)
        verticalLineTo(81.5f)
        arcToRelative(
          191f,
          191f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -84.43f,
          32.13f
        )
        lineTo(120f, 86f)
        lineTo(86f, 120f)
        lineToRelative(25.59f, 25.59f)
        arcTo(191.17f, 191.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 272f)
        curveToRelative(0f, 105.87f, 86.13f, 192f, 192f, 192f)
        reflectiveCurveToRelative(192f, -86.13f, 192f, -192f)
        curveTo(448f, 174.26f, 374.58f, 93.34f, 280f, 81.5f)
        close()
        moveTo(256f, 320f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -93.25f)
        verticalLineTo(136f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(90.75f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 320f)
        close()
      }
    }.build()

    return _StopwatchSharp!!
  }

@Suppress("ObjectPropertyName")
private var _StopwatchSharp: ImageVector? = null
