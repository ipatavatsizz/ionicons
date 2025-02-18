package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Pricetag: ImageVector
  get() {
    if (_PricetagSharp != null) {
      return _PricetagSharp!!
    }
    _PricetagSharp = ImageVector.Builder(
      name = "Sharp.PricetagSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(304f, 32f)
        lineTo(16f, 320f)
        lineTo(192f, 496f)
        lineTo(480f, 208f)
        lineTo(480f, 32f)
        close()
        moveTo(384f, 160f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 384f, 160f)
        close()
      }
    }.build()

    return _PricetagSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PricetagSharp: ImageVector? = null
