package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CloudyNight: ImageVector
  get() {
    if (_CloudyNightSharp != null) {
      return _CloudyNightSharp!!
    }
    _CloudyNightSharp = ImageVector.Builder(
      name = "Sharp.CloudyNightSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(340f, 480f)
        horizontalLineTo(106f)
        curveToRelative(-29.5f, 0f, -54.92f, -7.83f, -73.53f, -22.64f)
        curveTo(11.23f, 440.44f, 0f, 415.35f, 0f, 384.8f)
        curveToRelative(0f, -29.44f, 12.09f, -54.25f, 35f, -71.74f)
        curveToRelative(14.55f, -11.13f, 33.41f, -18.87f, 53.2f, -22f)
        curveToRelative(6.06f, -36.92f, 21.92f, -68.53f, 46.29f, -92f)
        arcTo(139.82f, 139.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 160f)
        curveToRelative(32.33f, 0f, 62.15f, 10.65f, 86.24f, 30.79f)
        arcToRelative(
          142.41f,
          142.41f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          40.83f,
          57.05f
        )
        curveToRelative(27.18f, 4.48f, 51.59f, 15.68f, 69.56f, 32.08f)
        curveTo(451.77f, 301f, 464f, 329.82f, 464f, 363.2f)
        curveToRelative(0f, 32.85f, -13.13f, 62.87f, -37f, 84.52f)
        curveTo(404.11f, 468.54f, 373.2f, 480f, 340f, 480f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(381.55f, 219.93f)
        curveToRelative(26.5f, 6.93f, 50f, 19.32f, 68.65f, 36.34f)
        quadToRelative(3.89f, 3.56f, 7.47f, 7.34f)
        curveToRelative(25.41f, -18.4f, 45.47f, -44.92f, 54.33f, -71.38f)
        curveToRelative(-16.24f, 7.07f, -35.31f, 9.85f, -54.15f, 9.85f)
        curveToRelative(-73.42f, 0f, -115.93f, -42.51f, -115.93f, -115.93f)
        curveToRelative(0f, -18.84f, 2.78f, -37.91f, 9.85f, -54.15f)
        curveToRelative(-40.41f, 13.53f, -81f, 53.19f, -92.52f, 98.13f)
        arcToRelative(
          162.61f,
          162.61f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          79.52f,
          36.12f
        )
        arcTo(173f, 173f, 0f, isMoreThanHalf = false, isPositiveArc = true, 381.55f, 219.93f)
        close()
      }
    }.build()

    return _CloudyNightSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CloudyNightSharp: ImageVector? = null
