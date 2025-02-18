package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ColorPalette: ImageVector
  get() {
    if (_ColorPaletteSharp != null) {
      return _ColorPaletteSharp!!
    }
    _ColorPaletteSharp = ImageVector.Builder(
      name = "Sharp.ColorPaletteSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 352f)
        curveToRelative(-12.6f, -0.84f, -21f, -4f, -28f, -12f)
        curveToRelative(-14f, -16f, -14f, -36f, 5.49f, -52.48f)
        lineToRelative(32.82f, -29.14f)
        curveToRelative(50.27f, -44.41f, 50.27f, -117.21f, 0f, -161.63f)
        curveTo(389.26f, 64.14f, 339.54f, 48f, 287.86f, 48f)
        curveToRelative(-60.34f, 0f, -123.39f, 22f, -172f, 65.11f)
        curveToRelative(-90.46f, 80f, -90.46f, 210.92f, 0f, 290.87f)
        curveToRelative(45f, 39.76f, 105.63f, 59.59f, 165.64f, 60f)
        horizontalLineToRelative(1.84f)
        curveToRelative(60f, 0f, 119.07f, -19.5f, 161.2f, -56.77f)
        curveTo(464f, 390f, 464f, 385f, 444.62f, 355.56f)
        curveTo(440f, 348f, 431f, 353f, 416f, 352f)
        close()
        moveTo(112f, 208f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 112f, 208f)
        close()
        moveTo(152f, 343f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 343f)
        close()
        moveTo(192f, 144f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 144f)
        close()
        moveTo(256f, 415f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, -48f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 415f)
        close()
        moveTo(328f, 176f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 328f, 176f)
        close()
      }
    }.build()

    return _ColorPaletteSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ColorPaletteSharp: ImageVector? = null
