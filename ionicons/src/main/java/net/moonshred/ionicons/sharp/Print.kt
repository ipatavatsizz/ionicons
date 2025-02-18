package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Print: ImageVector
  get() {
    if (_PrintSharp != null) {
      return _PrintSharp!!
    }
    _PrintSharp = ImageVector.Builder(
      name = "Sharp.PrintSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(400f, 96f)
        verticalLineTo(56f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
        horizontalLineTo(120f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
        verticalLineTo(96f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(408f, 112f)
        horizontalLineTo(104f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 56f)
        verticalLineTo(376f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
        horizontalLineToRelative(56f)
        verticalLineToRelative(72f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
        horizontalLineTo(392f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
        verticalLineTo(384f)
        horizontalLineToRelative(56f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
        verticalLineTo(168f)
        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 408f, 112f)
        close()
        moveTo(360f, 420f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
        horizontalLineTo(156f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
        verticalLineTo(268f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
        horizontalLineTo(356f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
        close()
        moveTo(394f, 207.92f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, -22f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 394f, 207.92f)
        close()
      }
    }.build()

    return _PrintSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PrintSharp: ImageVector? = null
