package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Search: ImageVector
  get() {
    if (_SearchSharp != null) {
      return _SearchSharp!!
    }
    _SearchSharp = ImageVector.Builder(
      name = "Sharp.SearchSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 428f)
        lineTo(339.92f, 303.9f)
        arcToRelative(
          160.48f,
          160.48f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          30.72f,
          -94.58f
        )
        curveTo(370.64f, 120.37f, 298.27f, 48f, 209.32f, 48f)
        reflectiveCurveTo(48f, 120.37f, 48f, 209.32f)
        reflectiveCurveToRelative(72.37f, 161.32f, 161.32f, 161.32f)
        arcToRelative(
          160.48f,
          160.48f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          94.58f,
          -30.72f
        )
        lineTo(428f, 464f)
        close()
        moveTo(209.32f, 319.69f)
        arcTo(110.38f, 110.38f, 0f, isMoreThanHalf = true, isPositiveArc = true, 319.69f, 209.32f)
        arcTo(110.5f, 110.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 209.32f, 319.69f)
        close()
      }
    }.build()

    return _SearchSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SearchSharp: ImageVector? = null
