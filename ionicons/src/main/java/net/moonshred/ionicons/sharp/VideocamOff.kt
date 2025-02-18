package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.VideocamOff: ImageVector
  get() {
    if (_VideocamOffSharp != null) {
      return _VideocamOffSharp!!
    }
    _VideocamOffSharp = ImageVector.Builder(
      name = "Sharp.VideocamOffSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(57.38f, 80f)
        lineToRelative(22.63f, -22.63f)
        lineToRelative(358.63f, 358.63f)
        lineToRelative(-22.63f, 22.63f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 112f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        verticalLineTo(384f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineTo(320f)
        arcToRelative(15.89f, 15.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.34f, -3f)
        lineToRelative(-285f, -285f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 208f)
        verticalLineTo(128f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        horizontalLineTo(179.63f)
        lineTo(425.07f, 357.44f)
        lineTo(496f, 400f)
        verticalLineTo(112f)
        close()
      }
    }.build()

    return _VideocamOffSharp!!
  }

@Suppress("ObjectPropertyName")
private var _VideocamOffSharp: ImageVector? = null
