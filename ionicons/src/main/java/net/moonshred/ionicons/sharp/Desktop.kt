package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Desktop: ImageVector
  get() {
    if (_DesktopSharp != null) {
      return _DesktopSharp!!
    }
    _DesktopSharp = ImageVector.Builder(
      name = "Sharp.DesktopSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 48f)
        horizontalLineTo(32f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 64f)
        verticalLineTo(384f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineTo(200f)
        verticalLineToRelative(32f)
        horizontalLineTo(128f)
        verticalLineToRelative(32f)
        horizontalLineTo(384f)
        verticalLineTo(432f)
        horizontalLineTo(312f)
        verticalLineTo(400f)
        horizontalLineTo(480f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        verticalLineTo(64f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 480f, 48f)
        close()
        moveTo(460f, 84f)
        verticalLineTo(300f)
        horizontalLineTo(52f)
        verticalLineTo(84f)
        close()
        moveTo(240.13f, 354.08f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 13.79f, 13.79f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240.13f, 354.08f)
        close()
      }
    }.build()

    return _DesktopSharp!!
  }

@Suppress("ObjectPropertyName")
private var _DesktopSharp: ImageVector? = null
