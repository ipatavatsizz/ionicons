package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Share: ImageVector
  get() {
    if (_ShareSharp != null) {
      return _ShareSharp!!
    }
    _ShareSharp = ImageVector.Builder(
      name = "Sharp.ShareSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 176f)
        verticalLineTo(337f)
        horizontalLineTo(240f)
        verticalLineTo(176f)
        horizontalLineTo(92f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 12f)
        verticalLineTo(468f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineTo(420f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        verticalLineTo(188f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 92.63f)
        lineToRelative(64f, 64f)
        lineToRelative(22.63f, -22.63f)
        lineToRelative(-102.63f, -102.63f)
        lineToRelative(-102.63f, 102.63f)
        lineToRelative(22.63f, 22.63f)
        lineToRelative(64f, -64f)
        lineToRelative(0f, 83.37f)
        lineToRelative(32f, 0f)
        lineToRelative(0f, -83.37f)
        close()
      }
    }.build()

    return _ShareSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ShareSharp: ImageVector? = null
