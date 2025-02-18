package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Star: ImageVector
  get() {
    if (_StarOutline != null) {
      return _StarOutline!!
    }
    _StarOutline = ImageVector.Builder(
      name = "Outline.StarOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(480f, 208f)
        horizontalLineTo(308f)
        lineTo(256f, 48f)
        lineTo(204f, 208f)
        horizontalLineTo(32f)
        lineToRelative(140f, 96f)
        lineTo(118f, 464f)
        lineTo(256f, 364f)
        lineTo(394f, 464f)
        lineTo(340f, 304f)
        close()
      }
    }.build()

    return _StarOutline!!
  }

@Suppress("ObjectPropertyName")
private var _StarOutline: ImageVector? = null
