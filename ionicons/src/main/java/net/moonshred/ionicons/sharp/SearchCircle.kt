package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.SearchCircle: ImageVector
  get() {
    if (_SearchCircleSharp != null) {
      return _SearchCircleSharp!!
    }
    _SearchCircleSharp = ImageVector.Builder(
      name = "Sharp.SearchCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 64f)
        curveTo(150.13f, 64f, 64f, 150.13f, 64f, 256f)
        reflectiveCurveToRelative(86.13f, 192f, 192f, 192f)
        reflectiveCurveToRelative(192f, -86.13f, 192f, -192f)
        reflectiveCurveTo(361.87f, 64f, 256f, 64f)
        close()
        moveTo(336f, 358.63f)
        lineTo(281.85f, 304.48f)
        arcToRelative(
          88.08f,
          88.08f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = true,
          22.63f,
          -22.63f
        )
        lineTo(358.63f, 336f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(232f, 232f)
        moveToRelative(-56f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 112f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -112f, 0f)
      }
    }.build()

    return _SearchCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SearchCircleSharp: ImageVector? = null
