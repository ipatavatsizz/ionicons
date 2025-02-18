package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Images: ImageVector
  get() {
    if (_ImagesSharp != null) {
      return _ImagesSharp!!
    }
    _ImagesSharp = ImageVector.Builder(
      name = "Sharp.ImagesSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(80f, 132f)
        lineTo(80f, 460f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
        lineTo(492f, 480f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, -20f)
        lineTo(512f, 132f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20f, -20f)
        lineTo(100f, 112f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 132f)
        close()
        moveTo(373.14f, 173.33f)
        arcToRelative(46f, 46f, 0f, isMoreThanHalf = true, isPositiveArc = true, -46.28f, 46f)
        arcTo(46.19f, 46.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 373.14f, 173.33f)
        close()
        moveTo(111.73f, 449.33f)
        lineTo(111.73f, 353.85f)
        lineToRelative(122.76f, -110.2f)
        lineTo(328.27f, 337f)
        lineToRelative(-113f, 112.33f)
        close()
        moveTo(480f, 449.33f)
        lineTo(259f, 449.33f)
        lineToRelative(144.58f, -144f)
        lineTo(480f, 370.59f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(20f, 32f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 52f)
        verticalLineTo(396f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
        horizontalLineTo(48f)
        verticalLineTo(100f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68f, 80f)
        horizontalLineTo(448f)
        verticalLineTo(52f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -20f, -20f)
        close()
      }
    }.build()

    return _ImagesSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ImagesSharp: ImageVector? = null
