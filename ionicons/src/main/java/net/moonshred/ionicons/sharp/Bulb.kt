package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Bulb: ImageVector
  get() {
    if (_BulbSharp != null) {
      return _BulbSharp!!
    }
    _BulbSharp = ImageVector.Builder(
      name = "Sharp.BulbSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(208f, 464f)
        horizontalLineToRelative(96f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-96f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(192f, 416f)
        horizontalLineToRelative(128f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-128f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(369.42f, 62.69f)
        curveTo(339.35f, 32.58f, 299.07f, 16f, 256f, 16f)
        arcTo(159.62f, 159.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 176f)
        curveToRelative(0f, 46.62f, 17.87f, 90.23f, 49f, 119.64f)
        lineToRelative(4.36f, 4.09f)
        curveTo(167.37f, 316.57f, 192f, 339.64f, 192f, 360f)
        verticalLineToRelative(40f)
        horizontalLineToRelative(48f)
        verticalLineTo(269.11f)
        lineTo(195.72f, 244f)
        lineTo(214f, 217.72f)
        lineTo(256f, 240f)
        lineToRelative(41.29f, -22.39f)
        lineToRelative(19.1f, 25.68f)
        lineToRelative(-44.39f, 26f)
        verticalLineTo(400f)
        horizontalLineToRelative(48f)
        verticalLineTo(360f)
        curveToRelative(0f, -19.88f, 24.36f, -42.93f, 42.15f, -59.77f)
        lineToRelative(4.91f, -4.66f)
        curveTo(399.08f, 265f, 416f, 223.61f, 416f, 176f)
        arcTo(159.16f, 159.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 369.42f, 62.69f)
        close()
      }
    }.build()

    return _BulbSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BulbSharp: ImageVector? = null
