package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.FolderOpen: ImageVector
  get() {
    if (_FolderOpenSharp != null) {
      return _FolderOpenSharp!!
    }
    _FolderOpenSharp = ImageVector.Builder(
      name = "Sharp.FolderOpenSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(16.08f, 189.4f)
        lineTo(44.66f, 423.27f)
        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72.52f, 448f)
        horizontalLineToRelative(367f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27.86f, -24.73f)
        lineTo(495.92f, 189.4f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 484f, 176f)
        horizontalLineTo(28f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.08f, 189.4f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 124f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -28f, -28f)
        horizontalLineTo(244.84f)
        lineToRelative(-48f, -32f)
        horizontalLineTo(76f)
        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 92f)
        verticalLineToRelative(52f)
        horizontalLineTo(464f)
        close()
      }
    }.build()

    return _FolderOpenSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FolderOpenSharp: ImageVector? = null
