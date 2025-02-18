package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Briefcase: ImageVector
  get() {
    if (_BriefcaseSharp != null) {
      return _BriefcaseSharp!!
    }
    _BriefcaseSharp = ImageVector.Builder(
      name = "Sharp.BriefcaseSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 288f)
        horizontalLineTo(176f)
        verticalLineTo(256f)
        horizontalLineTo(16f)
        verticalLineTo(452f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineTo(484f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        verticalLineTo(256f)
        horizontalLineTo(336f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 124f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
        horizontalLineTo(384f)
        verticalLineTo(56f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
        horizontalLineTo(136f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
        verticalLineToRelative(56f)
        horizontalLineTo(28f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 12f)
        verticalLineTo(224f)
        horizontalLineTo(496f)
        close()
        moveTo(344f, 112f)
        horizontalLineTo(168f)
        verticalLineTo(88f)
        horizontalLineTo(344f)
        close()
      }
    }.build()

    return _BriefcaseSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BriefcaseSharp: ImageVector? = null
