package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Terminal: ImageVector
  get() {
    if (_TerminalSharp != null) {
      return _TerminalSharp!!
    }
    _TerminalSharp = ImageVector.Builder(
      name = "Sharp.TerminalSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(16f, 44f)
        verticalLineTo(468f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineTo(484f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        verticalLineTo(44f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
        horizontalLineTo(28f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 44f)
        close()
        moveTo(73.51f, 237.5f)
        lineTo(150.39f, 176f)
        lineTo(73.51f, 114.5f)
        lineToRelative(20f, -25f)
        lineTo(201.61f, 176f)
        lineTo(93.5f, 262.49f)
        close()
        moveTo(272f, 256f)
        horizontalLineTo(176f)
        verticalLineTo(224f)
        horizontalLineToRelative(96f)
        close()
      }
    }.build()

    return _TerminalSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TerminalSharp: ImageVector? = null
