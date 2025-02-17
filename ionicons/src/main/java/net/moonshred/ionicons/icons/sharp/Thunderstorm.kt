package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Thunderstorm: ImageVector
  get() {
    if (_ThunderstormSharp != null) {
      return _ThunderstormSharp!!
    }
    _ThunderstormSharp = ImageVector.Builder(
      name = "Sharp.ThunderstormSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(405.84f, 136.9f)
        arcTo(151.25f, 151.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 358.24f, 55f)
        arcToRelative(
          153f,
          153f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -241.81f,
          51.86f
        )
        curveTo(60.5f, 110.16f, 16f, 156.65f, 16f, 213.33f)
        curveTo(16f, 272.15f, 63.91f, 320f, 122.8f, 320f)
        horizontalLineToRelative(72.31f)
        lineTo(176f, 416f)
        horizontalLineToRelative(48f)
        verticalLineToRelative(80f)
        lineTo(336f, 352f)
        horizontalLineTo(292.49f)
        lineToRelative(8f, -32f)
        horizontalLineTo(404.33f)
        arcToRelative(
          91.56f,
          91.56f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          1.51f,
          -183.1f
        )
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(74.53f, 407.18f)
        lineToRelative(38.32f, -76.62f)
        lineToRelative(28.62f, 14.31f)
        lineToRelative(-38.32f, 76.62f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(98.52f, 471.19f)
        lineToRelative(30.32f, -60.62f)
        lineToRelative(28.62f, 14.31f)
        lineToRelative(-30.32f, 60.62f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(354.54f, 407.19f)
        lineToRelative(38.32f, -76.62f)
        lineToRelative(28.62f, 14.31f)
        lineToRelative(-38.32f, 76.62f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(378.54f, 471.2f)
        lineToRelative(30.32f, -60.62f)
        lineToRelative(28.62f, 14.31f)
        lineToRelative(-30.32f, 60.62f)
        close()
      }
    }.build()

    return _ThunderstormSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ThunderstormSharp: ImageVector? = null
