package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.PeopleCircle: ImageVector
  get() {
    if (_PeopleCircleSharp != null) {
      return _PeopleCircleSharp!!
    }
    _PeopleCircleSharp = ImageVector.Builder(
      name = "Sharp.PeopleCircleSharp",
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
        moveTo(325.3f, 144.17f)
        arcToRelative(72.5f, 72.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -72.6f, 72.5f)
        arcTo(72.55f, 72.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 325.3f, 144.17f)
        close()
        moveTo(170.2f, 170.53f)
        arcToRelative(
          59.32f,
          59.32f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = true,
          -59.4f,
          59.32f
        )
        arcTo(59.35f, 59.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 170.2f, 170.53f)
        close()
        moveTo(94.35f, 325.53f)
        curveToRelative(24.5f, -13.29f, 55.87f, -19.94f, 75.85f, -19.94f)
        curveToRelative(15f, 0f, 34.32f, 3f, 53.33f, 10.2f)
        arcToRelative(
          133.05f,
          133.05f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -34f,
          27.11f
        )
        curveToRelative(-13.19f, 15f, -20.76f, 32.92f, -20.76f, 50.83f)
        verticalLineToRelative(15f)
        arcTo(177.06f, 177.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 94.35f, 325.58f)
        close()
        moveTo(256f, 432f)
        arcToRelative(
          175.12f,
          175.12f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -59.4f,
          -10.33f
        )
        lineTo(196.6f, 394.62f)
        curveToRelative(0f, -52.59f, 85.75f, -79.09f, 128.7f, -79.09f)
        curveToRelative(23f, 0f, 58.38f, 7.63f, 86.21f, 22.81f)
        arcTo(176.14f, 176.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 432f)
        close()
      }
    }.build()

    return _PeopleCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PeopleCircleSharp: ImageVector? = null
