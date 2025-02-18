package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Tennisball: ImageVector
  get() {
    if (_TennisballSharp != null) {
      return _TennisballSharp!!
    }
    _TennisballSharp = ImageVector.Builder(
      name = "Sharp.TennisballSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(246.4f, 480f)
        arcToRelative(181f, 181f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.22f, -22.86f)
        curveToRelative(0.35f, -4.61f, 0.53f, -9.31f, 0.53f, -14f)
        curveToRelative(0f, -100f, -81.34f, -181.32f, -181.32f, -181.32f)
        arcTo(181.72f, 181.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 265.61f)
        arcTo(224.2f, 224.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 246.4f, 480f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(284.63f, 227.37f)
        arcTo(222.73f, 222.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 219f, 68.83f)
        arcToRelative(
          227.09f,
          227.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          2.62f,
          -34.42f
        )
        arcTo(224.41f, 224.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34.41f, 221.58f)
        arcTo(227.09f, 227.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68.83f, 219f)
        arcToRelative(
          222.73f,
          222.73f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          158.54f,
          65.67f
        )
        arcTo(222.73f, 222.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 293f, 443.17f)
        curveToRelative(0f, 5.74f, -0.22f, 11.54f, -0.65f, 17.23f)
        reflectiveCurveToRelative(-1.11f, 11.51f, -2f, 17.2f)
        arcTo(224.42f, 224.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 477.59f, 290.42f)
        arcTo(227.09f, 227.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 443.17f, 293f)
        arcTo(222.73f, 222.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 284.63f, 227.37f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(443.17f, 250.15f)
        arcTo(181.72f, 181.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 480f, 246.39f)
        arcTo(224.2f, 224.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 265.61f, 32f)
        arcToRelative(
          181.72f,
          181.72f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -3.76f,
          36.83f
        )
        curveTo(261.85f, 168.81f, 343.19f, 250.15f, 443.17f, 250.15f)
        close()
      }
    }.build()

    return _TennisballSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TennisballSharp: ImageVector? = null
