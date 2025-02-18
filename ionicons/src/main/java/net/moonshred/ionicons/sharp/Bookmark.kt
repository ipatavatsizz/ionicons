package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Bookmark: ImageVector
  get() {
    if (_BookmarkSharp != null) {
      return _BookmarkSharp!!
    }
    _BookmarkSharp = ImageVector.Builder(
      name = "Sharp.BookmarkSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 480f)
        lineTo(256f, 357.41f)
        lineTo(96f, 480f)
        verticalLineTo(32f)
        horizontalLineTo(416f)
        close()
      }
    }.build()

    return _BookmarkSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BookmarkSharp: ImageVector? = null
