package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ArrowUpRightBox: ImageVector
  get() {
    if (_ArrowUpRightBoxSharp != null) {
      return _ArrowUpRightBoxSharp!!
    }
    _ArrowUpRightBoxSharp = ImageVector.Builder(
      name = "Sharp.ArrowUpRightBoxSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(480f, 32f)
        lineTo(480f, 196.36f)
        horizontalLineTo(448f)
        lineTo(448f, 86.63f)
        lineTo(404.36f, 130.26f)
        verticalLineTo(107.64f)
        horizontalLineTo(381.74f)
        lineTo(425.37f, 64f)
        lineTo(315.64f, 64f)
        verticalLineTo(32f)
        lineTo(480f, 32f)
        close()
        moveTo(193.37f, 296f)
        lineTo(381.74f, 107.64f)
        lineTo(32f, 107.64f)
        lineTo(32f, 480f)
        horizontalLineTo(404.36f)
        verticalLineTo(130.26f)
        lineTo(216f, 318.63f)
        lineTo(193.37f, 296f)
        close()
      }
    }.build()

    return _ArrowUpRightBoxSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowUpRightBoxSharp: ImageVector? = null
