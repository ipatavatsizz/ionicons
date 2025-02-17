package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.TabletPortrait: ImageVector
  get() {
    if (_TabletPortraitSharp != null) {
      return _TabletPortraitSharp!!
    }
    _TabletPortraitSharp = ImageVector.Builder(
      name = "Sharp.TabletPortraitSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(430f, 0f)
        horizontalLineTo(82f)
        arcTo(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 18f)
        verticalLineTo(494f)
        arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 18f)
        horizontalLineTo(430f)
        arcToRelative(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, -18f)
        verticalLineTo(18f)
        arcTo(18f, 18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 430f, 0f)
        close()
        moveTo(100f, 448f)
        verticalLineTo(64f)
        horizontalLineTo(412f)
        verticalLineTo(448f)
        close()
      }
    }.build()

    return _TabletPortraitSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TabletPortraitSharp: ImageVector? = null
