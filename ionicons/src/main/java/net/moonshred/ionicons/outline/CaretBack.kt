package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.CaretBack: ImageVector
  get() {
    if (_CaretBackOutline != null) {
      return _CaretBackOutline!!
    }
    _CaretBackOutline = ImageVector.Builder(
      name = "Outline.CaretBackOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(321.94f, 98f)
        lineTo(158.82f, 237.78f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 36.44f)
        lineTo(321.94f, 414f)
        curveToRelative(15.57f, 13.34f, 39.62f, 2.28f, 39.62f, -18.22f)
        verticalLineTo(116.18f)
        curveTo(361.56f, 95.68f, 337.51f, 84.62f, 321.94f, 98f)
        close()
      }
    }.build()

    return _CaretBackOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CaretBackOutline: ImageVector? = null
