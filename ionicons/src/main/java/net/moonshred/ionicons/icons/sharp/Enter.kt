package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Enter: ImageVector
  get() {
    if (_EnterSharp != null) {
      return _EnterSharp!!
    }
    _EnterSharp = ImageVector.Builder(
      name = "Sharp.EnterSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(160f, 240f)
        horizontalLineTo(307.37f)
        lineToRelative(-64f, -64f)
        lineTo(266f, 153.37f)
        lineTo(368.63f, 256f)
        lineTo(266f, 358.63f)
        lineTo(243.37f, 336f)
        lineToRelative(64f, -64f)
        horizontalLineTo(160f)
        verticalLineTo(420f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineTo(468f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        verticalLineTo(92f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
        horizontalLineTo(172f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 12f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 240f)
        horizontalLineToRelative(128f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-128f)
        close()
      }
    }.build()

    return _EnterSharp!!
  }

@Suppress("ObjectPropertyName")
private var _EnterSharp: ImageVector? = null
