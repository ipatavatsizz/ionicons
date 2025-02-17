package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Laptop: ImageVector
  get() {
    if (_Laptop != null) {
      return _Laptop!!
    }
    _Laptop = ImageVector.Builder(
      name = "Filled.Laptop",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 400f)
        horizontalLineTo(467.66f)
        arcTo(47.92f, 47.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 480f, 367.86f)
        verticalLineTo(128.14f)
        arcTo(48.2f, 48.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 431.86f, 80f)
        horizontalLineTo(80.14f)
        arcTo(48.2f, 48.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 128.14f)
        verticalLineTo(367.86f)
        arcTo(47.92f, 47.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 44.34f, 400f)
        horizontalLineTo(16f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 32f)
        horizontalLineTo(496f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -32f)
        close()
      }
    }.build()

    return _Laptop!!
  }

@Suppress("ObjectPropertyName")
private var _Laptop: ImageVector? = null
