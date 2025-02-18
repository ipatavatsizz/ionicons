package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.SearchCircle: ImageVector
  get() {
    if (_SearchCircle != null) {
      return _SearchCircle!!
    }
    _SearchCircle = ImageVector.Builder(
      name = "Filled.SearchCircle",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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
        moveTo(347.31f, 347.31f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.62f, 0f)
        lineToRelative(-42.84f, -42.83f)
        arcToRelative(
          88.08f,
          88.08f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = true,
          22.63f,
          -22.63f
        )
        lineToRelative(42.83f, 42.84f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 347.31f, 347.31f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(232f, 232f)
        moveToRelative(-56f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 112f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -112f, 0f)
      }
    }.build()

    return _SearchCircle!!
  }

@Suppress("ObjectPropertyName")
private var _SearchCircle: ImageVector? = null
