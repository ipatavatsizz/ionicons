package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Chatbox: ImageVector
  get() {
    if (_Chatbox != null) {
      return _Chatbox!!
    }
    _Chatbox = ImageVector.Builder(
      name = "Filled.Chatbox",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(144f, 464f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
        verticalLineTo(384f)
        horizontalLineTo(104f)
        arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -72f, -72f)
        verticalLineTo(120f)
        arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, -72f)
        horizontalLineTo(408f)
        arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 72f)
        verticalLineTo(312f)
        arcToRelative(72.08f, 72.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -72f, 72f)
        horizontalLineTo(245.74f)
        lineToRelative(-91.49f, 76.29f)
        arcTo(16.05f, 16.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 464f)
        close()
      }
    }.build()

    return _Chatbox!!
  }

@Suppress("ObjectPropertyName")
private var _Chatbox: ImageVector? = null
