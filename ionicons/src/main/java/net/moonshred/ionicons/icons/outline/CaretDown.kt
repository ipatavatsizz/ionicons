package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.CaretDown: ImageVector
  get() {
    if (_CaretDownOutline != null) {
      return _CaretDownOutline!!
    }
    _CaretDownOutline = ImageVector.Builder(
      name = "Outline.CaretDownOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(98f, 190.06f)
        lineTo(237.78f, 353.18f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36.44f, 0f)
        lineTo(414f, 190.06f)
        curveToRelative(13.34f, -15.57f, 2.28f, -39.62f, -18.22f, -39.62f)
        horizontalLineTo(116.18f)
        curveTo(95.68f, 150.44f, 84.62f, 174.49f, 98f, 190.06f)
        close()
      }
    }.build()

    return _CaretDownOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CaretDownOutline: ImageVector? = null
