package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Folder: ImageVector
  get() {
    if (_Folder != null) {
      return _Folder!!
    }
    _Folder = ImageVector.Builder(
      name = "Filled.Folder",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 152f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, -56f)
        horizontalLineTo(220.11f)
        arcToRelative(
          23.89f,
          23.89f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -13.31f,
          -4f
        )
        lineTo(179f, 73.41f)
        arcTo(55.77f, 55.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 147.89f, 64f)
        horizontalLineTo(72f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 56f)
        verticalLineToRelative(48f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
        horizontalLineTo(488f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(16f, 392f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
        horizontalLineTo(440f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, -56f)
        verticalLineTo(216f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
        horizontalLineTo(24f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
        close()
      }
    }.build()

    return _Folder!!
  }

@Suppress("ObjectPropertyName")
private var _Folder: ImageVector? = null
