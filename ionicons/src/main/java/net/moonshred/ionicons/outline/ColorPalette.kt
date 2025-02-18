package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ColorPalette: ImageVector
  get() {
    if (_ColorPaletteOutline != null) {
      return _ColorPaletteOutline!!
    }
    _ColorPaletteOutline = ImageVector.Builder(
      name = "Outline.ColorPaletteOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(430.11f, 347.9f)
        curveToRelative(-6.6f, -6.1f, -16.3f, -7.6f, -24.6f, -9f)
        curveToRelative(-11.5f, -1.9f, -15.9f, -4f, -22.6f, -10f)
        curveToRelative(-14.3f, -12.7f, -14.3f, -31.1f, 0f, -43.8f)
        lineToRelative(30.3f, -26.9f)
        curveToRelative(46.4f, -41f, 46.4f, -108.2f, 0f, -149.2f)
        curveToRelative(-34.2f, -30.1f, -80.1f, -45f, -127.8f, -45f)
        curveToRelative(-55.7f, 0f, -113.9f, 20.3f, -158.8f, 60.1f)
        curveToRelative(-83.5f, 73.8f, -83.5f, 194.7f, 0f, 268.5f)
        curveToRelative(41.5f, 36.7f, 97.5f, 55f, 152.9f, 55.4f)
        horizontalLineToRelative(1.7f)
        curveToRelative(55.4f, 0f, 110f, -17.9f, 148.8f, -52.4f)
        curveTo(444.41f, 382.9f, 442f, 359f, 430.11f, 347.9f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(144f, 208f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(152f, 311f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(224f, 144f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 367f)
        moveToRelative(-48f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -96f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(328f, 144f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
    }.build()

    return _ColorPaletteOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ColorPaletteOutline: ImageVector? = null
