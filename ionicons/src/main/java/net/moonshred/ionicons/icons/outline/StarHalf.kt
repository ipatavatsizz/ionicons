package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.StarHalf: ImageVector
  get() {
    if (_StarHalfOutline != null) {
      return _StarHalfOutline!!
    }
    _StarHalfOutline = ImageVector.Builder(
      name = "Outline.StarHalfOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
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
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        lineToRelative(0f, 316f)
        lineToRelative(-138f, 100f)
        lineToRelative(54f, -160f)
        lineToRelative(-140f, -96f)
        lineToRelative(172f, 0f)
        lineToRelative(52f, -160f)
        close()
      }
    }.build()

    return _StarHalfOutline!!
  }

@Suppress("ObjectPropertyName")
private var _StarHalfOutline: ImageVector? = null
