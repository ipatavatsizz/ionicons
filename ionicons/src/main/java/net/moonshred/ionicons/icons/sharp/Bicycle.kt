package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Bicycle: ImageVector
  get() {
    if (_BicycleSharp != null) {
      return _BicycleSharp!!
    }
    _BicycleSharp = ImageVector.Builder(
      name = "Sharp.BicycleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(320f, 192f)
        lineToRelative(-29.5f, -60.1f)
        curveTo(284.32f, 118f, 284.32f, 118f, 264f, 118f)
        curveToRelative(-13.26f, 0f, -14.76f, 0f, -23f, 7.3f)
        lineToRelative(-71.7f, 69.1f)
        curveTo(161f, 202.85f, 160f, 203.85f, 160f, 221f)
        curveToRelative(0f, 12.67f, 3.78f, 14.61f, 18.51f, 22.9f)
        lineTo(240f, 278f)
        verticalLineToRelative(90f)
        horizontalLineToRelative(32f)
        verticalLineTo(254f)
        reflectiveCurveToRelative(-29f, -17f, -48.3f, -30f)
        lineToRelative(48.9f, -51.5f)
        curveToRelative(18.7f, 28.5f, 27.3f, 51.5f, 38f, 51.5f)
        horizontalLineTo(384f)
        verticalLineTo(192f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(388f, 448f)
        arcToRelative(92f, 92f, 0f, isMoreThanHalf = true, isPositiveArc = true, 92f, -92f)
        arcTo(92.1f, 92.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 388f, 448f)
        close()
        moveTo(388f, 296f)
        arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = false, 60f, 60f)
        arcTo(60.07f, 60.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 388f, 296f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(124f, 448f)
        arcToRelative(92f, 92f, 0f, isMoreThanHalf = true, isPositiveArc = true, 92f, -92f)
        arcTo(92.1f, 92.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 124f, 448f)
        close()
        moveTo(124f, 296f)
        arcToRelative(60f, 60f, 0f, isMoreThanHalf = true, isPositiveArc = false, 60f, 60f)
        arcTo(60.07f, 60.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 124f, 296f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(320f, 128f)
        arcToRelative(
          31.89f,
          31.89f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          32f,
          -32.1f
        )
        arcTo(31.55f, 31.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 320.2f, 64f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.2f, 64f)
        close()
      }
    }.build()

    return _BicycleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BicycleSharp: ImageVector? = null
