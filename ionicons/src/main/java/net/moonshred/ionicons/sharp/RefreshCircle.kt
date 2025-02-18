package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.RefreshCircle: ImageVector
  get() {
    if (_RefreshCircleSharp != null) {
      return _RefreshCircleSharp!!
    }
    _RefreshCircleSharp = ImageVector.Builder(
      name = "Sharp.RefreshCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.31f, 48f, 48f, 141.32f, 48f, 256f)
        curveToRelative(0f, 114.86f, 93.14f, 208f, 208f, 208f)
        curveToRelative(114.69f, 0f, 208f, -93.31f, 208f, -208f)
        curveTo(464f, 141.13f, 370.87f, 48f, 256f, 48f)
        close()
        moveTo(350f, 267f)
        arcToRelative(94f, 94f, 0f, isMoreThanHalf = true, isPositiveArc = true, -94f, -94f)
        horizontalLineToRelative(4.21f)
        lineToRelative(-24f, -24f)
        lineTo(256f, 129.2f)
        lineTo(315.8f, 189f)
        lineTo(256f, 248.8f)
        lineTo(236.2f, 229f)
        lineToRelative(27.92f, -27.92f)
        curveTo(261.72f, 201f, 259f, 201f, 256f, 201f)
        arcToRelative(66f, 66f, 0f, isMoreThanHalf = true, isPositiveArc = false, 66f, 66f)
        lineTo(322f, 253f)
        horizontalLineToRelative(28f)
        close()
      }
    }.build()

    return _RefreshCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _RefreshCircleSharp: ImageVector? = null
