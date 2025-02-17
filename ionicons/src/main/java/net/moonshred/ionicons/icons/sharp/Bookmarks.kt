package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Bookmarks: ImageVector
  get() {
    if (_BookmarksSharp != null) {
      return _BookmarksSharp!!
    }
    _BookmarksSharp = ImageVector.Builder(
      name = "Sharp.BookmarksSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(112f, 0f)
        lineToRelative(0f, 48f)
        lineToRelative(304f, 0f)
        lineToRelative(0f, 368f)
        lineToRelative(48f, 32f)
        lineToRelative(0f, -448f)
        lineToRelative(-352f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 80f)
        lineToRelative(0f, 432f)
        lineToRelative(168f, -124f)
        lineToRelative(168f, 124f)
        lineToRelative(0f, -432f)
        lineToRelative(-336f, 0f)
        close()
      }
    }.build()

    return _BookmarksSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BookmarksSharp: ImageVector? = null
