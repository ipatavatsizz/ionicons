package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Easel: ImageVector
  get() {
    if (_EaselSharp != null) {
      return _EaselSharp!!
    }
    _EaselSharp = ImageVector.Builder(
      name = "Sharp.EaselSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(468f, 64f)
        horizontalLineTo(278f)
        verticalLineTo(32f)
        horizontalLineTo(234f)
        verticalLineTo(64f)
        horizontalLineTo(44f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 76f)
        verticalLineTo(356f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineToRelative(78.19f)
        lineTo(89.93f, 470.46f)
        lineToRelative(36.53f, 9.61f)
        lineTo(161.74f, 368f)
        horizontalLineTo(234f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(44f)
        verticalLineTo(368f)
        horizontalLineToRelative(71.84f)
        lineToRelative(31f, 111.7f)
        lineToRelative(36.83f, -8.57f)
        lineTo(389.05f, 368f)
        horizontalLineTo(468f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        verticalLineTo(76f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 468f, 64f)
        close()
        moveTo(442f, 330f)
        horizontalLineTo(70f)
        verticalLineTo(102f)
        horizontalLineTo(442f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(88f, 120f)
        horizontalLineToRelative(336f)
        verticalLineToRelative(192f)
        horizontalLineToRelative(-336f)
        close()
      }
    }.build()

    return _EaselSharp!!
  }

@Suppress("ObjectPropertyName")
private var _EaselSharp: ImageVector? = null
