package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Egg: ImageVector
  get() {
    if (_EggSharp != null) {
      return _EggSharp!!
    }
    _EggSharp = ImageVector.Builder(
      name = "Sharp.EggSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(418.39f, 381.05f)
        curveToRelative(-8.08f, 21.68f, -19.76f, 40.1f, -34.72f, 54.75f)
        curveToRelative(-14.38f, 14.07f, -32.1f, 24.95f, -52.67f, 32.34f)
        curveTo(309.08f, 476f, 283.85f, 480f, 256f, 480f)
        reflectiveCurveToRelative(-53.08f, -4f, -75f, -11.86f)
        curveToRelative(-20.57f, -7.39f, -38.29f, -18.27f, -52.67f, -32.34f)
        curveToRelative(-15f, -14.65f, -26.64f, -33.07f, -34.72f, -54.75f)
        curveTo(84.58f, 356.82f, 80f, 328.53f, 80f, 296.94f)
        curveToRelative(0f, -30.28f, 6.68f, -62.57f, 19.86f, -96f)
        arcTo(371f, 371f, 0f, isMoreThanHalf = false, isPositiveArc = true, 151f, 111.42f)
        curveTo(195.78f, 53.56f, 241f, 32f, 256f, 32f)
        reflectiveCurveToRelative(62.67f, 22.4f, 105f, 79.42f)
        curveToRelative(18.33f, 24.71f, 38.87f, 58.34f, 51.17f, 89.54f)
        curveToRelative(13.18f, 33.41f, 19.86f, 65.7f, 19.86f, 96f)
        curveTo(432f, 328.53f, 427.42f, 356.82f, 418.39f, 381.05f)
        close()
      }
    }.build()

    return _EggSharp!!
  }

@Suppress("ObjectPropertyName")
private var _EggSharp: ImageVector? = null
