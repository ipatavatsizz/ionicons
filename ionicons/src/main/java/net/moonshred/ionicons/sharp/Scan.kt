package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Scan: ImageVector
  get() {
    if (_ScanSharp != null) {
      return _ScanSharp!!
    }
    _ScanSharp = ImageVector.Builder(
      name = "Sharp.ScanSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(388f, 466f)
        horizontalLineTo(320f)
        verticalLineTo(422f)
        horizontalLineToRelative(68f)
        arcToRelative(34f, 34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34f, -34f)
        verticalLineTo(320f)
        horizontalLineToRelative(44f)
        verticalLineToRelative(68f)
        arcTo(78.09f, 78.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 388f, 466f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(466f, 192f)
        horizontalLineTo(422f)
        verticalLineTo(124f)
        arcToRelative(34f, 34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -34f, -34f)
        horizontalLineTo(320f)
        verticalLineTo(46f)
        horizontalLineToRelative(68f)
        arcToRelative(78.09f, 78.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, 78f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(192f, 466f)
        horizontalLineTo(124f)
        arcToRelative(78.09f, 78.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, -78f, -78f)
        verticalLineTo(320f)
        horizontalLineTo(90f)
        verticalLineToRelative(68f)
        arcToRelative(34f, 34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34f, 34f)
        horizontalLineToRelative(68f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(90f, 192f)
        horizontalLineTo(46f)
        verticalLineTo(124f)
        arcToRelative(78.09f, 78.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 78f, -78f)
        horizontalLineToRelative(68f)
        verticalLineTo(90f)
        horizontalLineTo(124f)
        arcToRelative(34f, 34f, 0f, isMoreThanHalf = false, isPositiveArc = false, -34f, 34f)
        close()
      }
    }.build()

    return _ScanSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ScanSharp: ImageVector? = null
