package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Folder: ImageVector
  get() {
    if (_FolderSharp != null) {
      return _FolderSharp!!
    }
    _FolderSharp = ImageVector.Builder(
      name = "Sharp.FolderSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(16f, 420f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28f, 28f)
        horizontalLineTo(468f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28f, -28f)
        verticalLineTo(208f)
        horizontalLineTo(16f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 124f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -28f, -28f)
        horizontalLineTo(212.84f)
        lineToRelative(-48f, -32f)
        horizontalLineTo(44f)
        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 92f)
        verticalLineToRelative(84f)
        horizontalLineTo(496f)
        close()
      }
    }.build()

    return _FolderSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FolderSharp: ImageVector? = null
