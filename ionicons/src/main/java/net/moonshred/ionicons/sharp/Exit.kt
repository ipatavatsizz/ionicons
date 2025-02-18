package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Exit: ImageVector
  get() {
    if (_ExitSharp != null) {
      return _ExitSharp!!
    }
    _ExitSharp = ImageVector.Builder(
      name = "Sharp.ExitSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(335.69f, 272f)
        horizontalLineToRelative(-161f)
        verticalLineTo(240f)
        horizontalLineToRelative(161f)
        verticalLineTo(92f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
        horizontalLineToRelative(-280f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 12f)
        verticalLineTo(420f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineToRelative(280f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(419.06f, 272f)
        lineToRelative(-64f, 64f)
        lineToRelative(22.63f, 22.63f)
        lineToRelative(102.62f, -102.63f)
        lineToRelative(-102.62f, -102.63f)
        lineToRelative(-22.63f, 22.63f)
        lineToRelative(64f, 64f)
        lineToRelative(-83.37f, 0f)
        lineToRelative(0f, 32f)
        lineToRelative(83.37f, 0f)
        close()
      }
    }.build()

    return _ExitSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ExitSharp: ImageVector? = null
