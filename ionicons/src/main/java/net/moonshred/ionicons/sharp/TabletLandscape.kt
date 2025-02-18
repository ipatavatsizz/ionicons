package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.TabletLandscape: ImageVector
  get() {
    if (_TabletLandscapeSharp != null) {
      return _TabletLandscapeSharp!!
    }
    _TabletLandscapeSharp = ImageVector.Builder(
      name = "Sharp.TabletLandscapeSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(0f, 82f)
        verticalLineTo(430f)
        arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18f)
        horizontalLineTo(494f)
        arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, -18f)
        verticalLineTo(82f)
        arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18f, -18f)
        horizontalLineTo(18f)
        arcTo(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 82f)
        close()
        moveTo(448f, 412f)
        horizontalLineTo(64f)
        verticalLineTo(100f)
        horizontalLineTo(448f)
        close()
      }
    }.build()

    return _TabletLandscapeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TabletLandscapeSharp: ImageVector? = null
