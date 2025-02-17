package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Rainy: ImageVector
  get() {
    if (_RainySharp != null) {
      return _RainySharp!!
    }
    _RainySharp = ImageVector.Builder(
      name = "Sharp.RainySharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(364f, 336f)
        lineTo(130f, 336f)
        curveToRelative(-29.5f, 0f, -54.92f, -7.83f, -73.53f, -22.64f)
        curveTo(35.23f, 296.44f, 24f, 271.35f, 24f, 240.8f)
        curveToRelative(0f, -26.66f, 10.08f, -49.8f, 29.14f, -66.91f)
        curveToRelative(15.24f, -13.68f, 36.17f, -23.21f, 59f, -26.84f)
        horizontalLineToRelative(0f)
        curveToRelative(0.06f, 0f, 0.08f, 0f, 0.09f, -0.05f)
        curveToRelative(6.44f, -39f, 23.83f, -72.09f, 50.31f, -95.68f)
        arcTo(140.24f, 140.24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 16f)
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
        curveTo(477f, 160.11f, 488f, 187.71f, 488f, 219.2f)
        curveToRelative(0f, 32.85f, -13.13f, 62.87f, -37f, 84.52f)
        curveTo(428.11f, 324.54f, 397.2f, 336f, 364f, 336f)
        close()
        moveTo(383f, 103.82f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(93.82f, 430.42f)
        lineToRelative(49.75f, -74.63f)
        lineToRelative(26.63f, 17.75f)
        lineToRelative(-49.75f, 74.63f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(141.82f, 478.43f)
        lineToRelative(81.75f, -122.63f)
        lineToRelative(26.63f, 17.75f)
        lineToRelative(-81.75f, 122.63f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(253.81f, 430.42f)
        lineToRelative(49.75f, -74.63f)
        lineToRelative(26.63f, 17.75f)
        lineToRelative(-49.75f, 74.63f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(301.81f, 478.43f)
        lineToRelative(81.75f, -122.63f)
        lineToRelative(26.63f, 17.75f)
        lineToRelative(-81.75f, 122.63f)
        close()
      }
    }.build()

    return _RainySharp!!
  }

@Suppress("ObjectPropertyName")
private var _RainySharp: ImageVector? = null
