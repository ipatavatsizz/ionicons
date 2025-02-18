package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Bandage: ImageVector
  get() {
    if (_BandageSharp != null) {
      return _BandageSharp!!
    }
    _BandageSharp = ImageVector.Builder(
      name = "Sharp.BandageSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(27.71f, 337.1f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 56.54f)
        lineToRelative(90.65f, 90.65f)
        horizontalLineToRelative(0f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56.54f, 0f)
        lineToRelative(75.1f, -75.1f)
        lineTo(102.81f, 262f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 147.1f)
        arcToRelative(
          39.87f,
          39.87f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -11.75f,
          -28.38f
        )
        lineToRelative(-91f, -91f)
        arcToRelative(
          40.14f,
          40.14f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -56.75f,
          0f
        )
        lineTo(264f, 100.28f)
        lineTo(411.72f, 248f)
        lineToRelative(72.53f, -72.53f)
        arcTo(39.85f, 39.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 496f, 147.1f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(273.06f, 386.19f)
        lineToRelative(116f, -116f)
        lineTo(241.77f, 123f)
        lineToRelative(-116f, 116f)
        close()
        moveTo(292.69f, 244.69f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 22.62f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 292.69f, 244.69f)
        close()
        moveTo(244.69f, 196.69f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 22.62f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 244.69f, 196.69f)
        close()
        moveTo(244.69f, 292.69f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 22.62f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 244.69f, 292.69f)
        close()
        moveTo(219.31f, 244.69f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -22.62f, 0f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 219.31f, 244.69f)
        close()
      }
    }.build()

    return _BandageSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BandageSharp: ImageVector? = null
