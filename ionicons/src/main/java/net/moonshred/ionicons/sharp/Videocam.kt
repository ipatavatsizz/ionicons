package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Videocam: ImageVector
  get() {
    if (_VideocamSharp != null) {
      return _VideocamSharp!!
    }
    _VideocamSharp = ImageVector.Builder(
      name = "Sharp.VideocamSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 208f)
        verticalLineTo(128f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        horizontalLineTo(32f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        verticalLineTo(384f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineTo(320f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        verticalLineTo(304f)
        lineToRelative(160f, 96f)
        verticalLineTo(112f)
        close()
      }
    }.build()

    return _VideocamSharp!!
  }

@Suppress("ObjectPropertyName")
private var _VideocamSharp: ImageVector? = null
