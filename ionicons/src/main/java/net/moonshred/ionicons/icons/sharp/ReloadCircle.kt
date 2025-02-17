package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ReloadCircle: ImageVector
  get() {
    if (_ReloadCircleSharp != null) {
      return _ReloadCircleSharp!!
    }
    _ReloadCircleSharp = ImageVector.Builder(
      name = "Sharp.ReloadCircleSharp",
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
        moveTo(376f, 238.77f)
        horizontalLineTo(287f)
        lineToRelative(36.88f, -36.88f)
        lineToRelative(-5.6f, -6.51f)
        arcToRelative(
          87.38f,
          87.38f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = false,
          -62.94f,
          148f
        )
        arcToRelative(
          87.55f,
          87.55f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          82.42f,
          -58.25f
        )
        lineTo(343.13f, 270f)
        lineToRelative(30.17f, 10.67f)
        lineTo(368f, 295.8f)
        arcTo(119.4f, 119.4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 255.38f, 136.62f)
        arcToRelative(
          118.34f,
          118.34f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          86.36f,
          36.95f
        )
        lineToRelative(0.56f, 0.62f)
        lineToRelative(4.31f, 5f)
        lineTo(376f, 149.81f)
        close()
      }
    }.build()

    return _ReloadCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ReloadCircleSharp: ImageVector? = null
