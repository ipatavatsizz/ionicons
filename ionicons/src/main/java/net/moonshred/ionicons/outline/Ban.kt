package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Ban: ImageVector
  get() {
    if (_BanOutline != null) {
      return _BanOutline!!
    }
    _BanOutline = ImageVector.Builder(
      name = "Outline.BanOutline",
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
        moveTo(108.92f, 108.92f)
        lineTo(403.08f, 403.08f)
      }
    }.build()

    return _BanOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BanOutline: ImageVector? = null
