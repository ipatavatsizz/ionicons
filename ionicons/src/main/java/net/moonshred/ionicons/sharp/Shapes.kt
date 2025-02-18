package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Shapes: ImageVector
  get() {
    if (_ShapesSharp != null) {
      return _ShapesSharp!!
    }
    _ShapesSharp = ImageVector.Builder(
      name = "Sharp.ShapesSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(363.27f, 336f)
        horizontalLineTo(4.73f)
        lineTo(184f, 16f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 160f)
        arcToRelative(
          160.54f,
          160.54f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -32.55f,
          3.36f
        )
        lineToRelative(87.75f, 157f)
        lineTo(417.81f, 368f)
        horizontalLineTo(183.36f)
        curveTo(203.8f, 432.85f, 264.49f, 480f, 336f, 480f)
        curveToRelative(88.22f, 0f, 160f, -71.78f, 160f, -160f)
        reflectiveCurveTo(424.22f, 160f, 336f, 160f)
        close()
      }
    }.build()

    return _ShapesSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ShapesSharp: ImageVector? = null
