package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Save: ImageVector
  get() {
    if (_SaveSharp != null) {
      return _SaveSharp!!
    }
    _SaveSharp = ImageVector.Builder(
      name = "Sharp.SaveSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(380.44f, 32f)
        horizontalLineTo(64f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 64f)
        verticalLineTo(448f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
        horizontalLineTo(448f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
        verticalLineTo(131.56f)
        close()
        moveTo(112f, 176f)
        verticalLineTo(112f)
        horizontalLineTo(304f)
        verticalLineToRelative(64f)
        close()
        moveTo(335.91f, 355.76f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = true, -83.66f, -83.67f)
        arcTo(80.21f, 80.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 335.91f, 355.76f)
        close()
      }
    }.build()

    return _SaveSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SaveSharp: ImageVector? = null
