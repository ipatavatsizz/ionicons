package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ArrowDownRightBox: ImageVector
  get() {
    if (_ArrowDownRightBoxSharp != null) {
      return _ArrowDownRightBoxSharp!!
    }
    _ArrowDownRightBoxSharp = ImageVector.Builder(
      name = "Sharp.ArrowDownRightBoxSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(480f, 480f)
        lineTo(315.64f, 480f)
        verticalLineTo(448f)
        lineTo(425.37f, 448f)
        lineTo(381.74f, 404.36f)
        horizontalLineTo(404.36f)
        verticalLineTo(381.74f)
        lineTo(448f, 425.37f)
        lineTo(448f, 315.64f)
        horizontalLineTo(480f)
        lineTo(480f, 480f)
        close()
        moveTo(216f, 193.37f)
        lineTo(404.36f, 381.74f)
        lineTo(404.36f, 32f)
        lineTo(32f, 32f)
        verticalLineTo(404.36f)
        horizontalLineTo(381.74f)
        lineTo(193.37f, 216f)
        lineTo(216f, 193.37f)
        close()
      }
    }.build()

    return _ArrowDownRightBoxSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowDownRightBoxSharp: ImageVector? = null
