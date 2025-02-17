package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.PersonCircle: ImageVector
  get() {
    if (_PersonCircleSharp != null) {
      return _PersonCircleSharp!!
    }
    _PersonCircleSharp = ImageVector.Builder(
      name = "Sharp.PersonCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
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
        moveTo(258f, 144f)
        arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72f, 72f)
        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 258f, 144f)
        close()
        moveTo(256f, 432f)
        arcToRelative(
          175.55f,
          175.55f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -129.18f,
          -56.6f
        )
        curveTo(135.66f, 329.62f, 215.06f, 320f, 256f, 320f)
        reflectiveCurveToRelative(120.34f, 9.62f, 129.18f, 55.39f)
        arcTo(175.52f, 175.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 432f)
        close()
      }
    }.build()

    return _PersonCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PersonCircleSharp: ImageVector? = null
