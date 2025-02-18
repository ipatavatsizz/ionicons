package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Chatbox: ImageVector
  get() {
    if (_ChatboxSharp != null) {
      return _ChatboxSharp!!
    }
    _ChatboxSharp = ImageVector.Builder(
      name = "Sharp.ChatboxSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(128f, 464f)
        verticalLineTo(384f)
        horizontalLineTo(56f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
        verticalLineTo(72f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 48f)
        horizontalLineTo(456f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
        verticalLineTo(360f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
        horizontalLineTo(245.74f)
        close()
        moveTo(456f, 80f)
        horizontalLineToRelative(0f)
        close()
      }
    }.build()

    return _ChatboxSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ChatboxSharp: ImageVector? = null
