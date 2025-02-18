package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Toggle: ImageVector
  get() {
    if (_ToggleSharp != null) {
      return _ToggleSharp!!
    }
    _ToggleSharp = ImageVector.Builder(
      name = "Sharp.ToggleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(368f, 112f)
        lineTo(144f, 112f)
        arcToRelative(144f, 144f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 288f)
        lineTo(368f, 400f)
        arcToRelative(144f, 144f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -288f)
        close()
        moveTo(368f, 342f)
        arcToRelative(86f, 86f, 0f, isMoreThanHalf = true, isPositiveArc = true, 86f, -86f)
        arcTo(85.88f, 85.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 342f)
        close()
      }
    }.build()

    return _ToggleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ToggleSharp: ImageVector? = null
