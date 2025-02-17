package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Pricetags: ImageVector
  get() {
    if (_PricetagsSharp != null) {
      return _PricetagsSharp!!
    }
    _PricetagsSharp = ImageVector.Builder(
      name = "Sharp.PricetagsSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(288f, 16f)
        lineTo(0f, 304f)
        lineTo(176f, 480f)
        lineTo(464f, 192f)
        lineTo(464f, 16f)
        close()
        moveTo(368f, 144f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 144f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 64f)
        lineToRelative(0f, 144f)
        lineToRelative(-263.1f, 263.1f)
        lineToRelative(25.1f, 24.9f)
        lineToRelative(270f, -272f)
        lineToRelative(0f, -160f)
        lineToRelative(-32f, 0f)
        close()
      }
    }.build()

    return _PricetagsSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PricetagsSharp: ImageVector? = null
