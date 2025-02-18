package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.PartlySunny: ImageVector
  get() {
    if (_PartlySunnySharp != null) {
      return _PartlySunnySharp!!
    }
    _PartlySunnySharp = ImageVector.Builder(
      name = "Sharp.PartlySunnySharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(340f, 480f)
        lineTo(106f, 480f)
        curveToRelative(-29.5f, 0f, -54.92f, -7.83f, -73.53f, -22.64f)
        curveTo(11.23f, 440.44f, 0f, 415.35f, 0f, 384.8f)
        curveToRelative(0f, -26.66f, 10.08f, -49.8f, 29.14f, -66.91f)
        curveToRelative(15.24f, -13.68f, 36.17f, -23.21f, 59f, -26.84f)
        horizontalLineToRelative(0f)
        curveToRelative(0.06f, 0f, 0.08f, 0f, 0.09f, -0.05f)
        curveToRelative(6.44f, -39f, 23.83f, -72.09f, 50.31f, -95.68f)
        arcTo(140.24f, 140.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 160f)
        curveToRelative(30.23f, 0f, 58.48f, 9.39f, 81.71f, 27.17f)
        arcToRelative(
          142.69f,
          142.69f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          45.36f,
          60.66f
        )
        curveToRelative(29.41f, 4.82f, 54.72f, 17.11f, 73.19f, 35.54f)
        curveTo(453f, 304.11f, 464f, 331.71f, 464f, 363.2f)
        curveToRelative(0f, 32.85f, -13.13f, 62.87f, -37f, 84.52f)
        curveTo(404.11f, 468.54f, 373.2f, 480f, 340f, 480f)
        close()
        moveTo(359f, 247.82f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(381.5f, 219.89f)
        arcToRelative(
          169.23f,
          169.23f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          45.44f,
          19f
        )
        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 281f, 129.33f)
        quadToRelative(-2.85f, 2f, -5.54f, 4.2f)
        arcToRelative(
          162.47f,
          162.47f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          57.73f,
          28.23f
        )
        arcTo(174.53f, 174.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 381.5f, 219.89f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 192f)
        horizontalLineToRelative(64f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-64f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(320f, 32f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(-32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(255.35f, 129.63f)
        lineToRelative(12.45f, -12.45f)
        lineTo(223.18f, 72.55f)
        lineTo(200.55f, 95.18f)
        lineToRelative(33.17f, 33.17f)
        horizontalLineToRelative(0.6f)
        arcTo(172f, 172f, 0f, isMoreThanHalf = false, isPositiveArc = true, 255.35f, 129.63f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(404.2f, 117.17f)
        lineToRelative(44.63f, -44.63f)
        lineToRelative(22.63f, 22.63f)
        lineToRelative(-44.63f, 44.63f)
        close()
      }
    }.build()

    return _PartlySunnySharp!!
  }

@Suppress("ObjectPropertyName")
private var _PartlySunnySharp: ImageVector? = null
