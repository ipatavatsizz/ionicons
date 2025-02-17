package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Browsers: ImageVector
  get() {
    if (_BrowsersSharp != null) {
      return _BrowsersSharp!!
    }
    _BrowsersSharp = ImageVector.Builder(
      name = "Sharp.BrowsersSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 64f)
        verticalLineTo(448f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineTo(464f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        verticalLineTo(64f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        horizontalLineTo(48f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 64f)
        close()
        moveTo(440f, 428f)
        horizontalLineTo(72f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
        verticalLineTo(152f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
        horizontalLineTo(440f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
        verticalLineTo(424f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 440f, 428f)
        close()
      }
    }.build()

    return _BrowsersSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BrowsersSharp: ImageVector? = null
