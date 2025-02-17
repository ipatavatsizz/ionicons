package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Push: ImageVector
  get() {
    if (_PushSharp != null) {
      return _PushSharp!!
    }
    _PushSharp = ImageVector.Builder(
      name = "Sharp.PushSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 352f)
        verticalLineTo(204.63f)
        lineToRelative(64f, 64f)
        lineTo(358.63f, 246f)
        lineTo(256f, 143.37f)
        lineTo(153.37f, 246f)
        lineTo(176f, 268.63f)
        lineToRelative(64f, -64f)
        verticalLineTo(352f)
        horizontalLineTo(92f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, -12f)
        verticalLineTo(44f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 32f)
        horizontalLineTo(420f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
        verticalLineTo(340f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, 12f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(240f, 352f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(128f)
        horizontalLineToRelative(-32f)
        close()
      }
    }.build()

    return _PushSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PushSharp: ImageVector? = null
