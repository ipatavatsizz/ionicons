package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Clipboard: ImageVector
  get() {
    if (_ClipboardSharp != null) {
      return _ClipboardSharp!!
    }
    _ClipboardSharp = ImageVector.Builder(
      name = "Sharp.ClipboardSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(420f, 48f)
        lineTo(352f, 48f)
        lineTo(352f, 28f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
        lineTo(172f, 16f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 12f)
        lineTo(160f, 48f)
        lineTo(92f, 48f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 60f)
        lineTo(80f, 484f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        lineTo(420f, 496f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        lineTo(432f, 60f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 420f, 48f)
        close()
        moveTo(335.87f, 112f)
        lineTo(176.13f, 112f)
        lineTo(176.13f, 80f)
        lineTo(335.87f, 80f)
        close()
      }
    }.build()

    return _ClipboardSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ClipboardSharp: ImageVector? = null
