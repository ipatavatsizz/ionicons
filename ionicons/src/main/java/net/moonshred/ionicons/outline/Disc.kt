package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Disc: ImageVector
  get() {
    if (_DiscOutline != null) {
      return _DiscOutline!!
    }
    _DiscOutline = ImageVector.Builder(
      name = "Outline.DiscOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 256f)
        moveToRelative(-208f, 0f)
        arcToRelative(208f, 208f, 0f, isMoreThanHalf = true, isPositiveArc = true, 416f, 0f)
        arcToRelative(208f, 208f, 0f, isMoreThanHalf = true, isPositiveArc = true, -416f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 256f)
        moveToRelative(-96f, 0f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 256f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
    }.build()

    return _DiscOutline!!
  }

@Suppress("ObjectPropertyName")
private var _DiscOutline: ImageVector? = null
