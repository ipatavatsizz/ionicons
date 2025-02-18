package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.LogIn: ImageVector
  get() {
    if (_LogInSharp != null) {
      return _LogInSharp!!
    }
    _LogInSharp = ImageVector.Builder(
      name = "Sharp.LogInSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(432f, 80f)
        horizontalLineTo(192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        verticalLineTo(240f)
        horizontalLineTo(329.37f)
        lineToRelative(-64f, -64f)
        lineTo(288f, 153.37f)
        lineToRelative(91.31f, 91.32f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 22.62f)
        lineTo(288f, 358.63f)
        lineTo(265.37f, 336f)
        lineToRelative(64f, -64f)
        horizontalLineTo(176f)
        verticalLineTo(416f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineTo(432f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        verticalLineTo(96f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 432f, 80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(64f, 240f)
        horizontalLineToRelative(112f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-112f)
        close()
      }
    }.build()

    return _LogInSharp!!
  }

@Suppress("ObjectPropertyName")
private var _LogInSharp: ImageVector? = null
