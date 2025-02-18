package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Bookmark: ImageVector
  get() {
    if (_Bookmark != null) {
      return _Bookmark!!
    }
    _Bookmark = ImageVector.Builder(
      name = "Filled.Bookmark",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(400f, 480f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.63f, -4f)
        lineTo(256f, 357.41f)
        lineTo(122.63f, 476f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 464f)
        verticalLineTo(96f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, -64f)
        horizontalLineTo(352f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
        verticalLineTo(464f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
        close()
      }
    }.build()

    return _Bookmark!!
  }

@Suppress("ObjectPropertyName")
private var _Bookmark: ImageVector? = null
