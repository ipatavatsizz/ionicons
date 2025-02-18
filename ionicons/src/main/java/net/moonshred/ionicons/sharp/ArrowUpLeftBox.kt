package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ArrowUpLeftBox: ImageVector
  get() {
    if (_ArrowUpLeftBoxSharp != null) {
      return _ArrowUpLeftBoxSharp!!
    }
    _ArrowUpLeftBoxSharp = ImageVector.Builder(
      name = "Sharp.ArrowUpLeftBoxSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(32f, 32f)
        lineTo(196.36f, 32f)
        lineTo(196.36f, 64f)
        lineTo(86.63f, 64f)
        lineTo(130.26f, 107.64f)
        horizontalLineTo(107.64f)
        verticalLineTo(130.26f)
        lineTo(64f, 86.63f)
        lineTo(64f, 196.36f)
        horizontalLineTo(32f)
        lineTo(32f, 32f)
        close()
        moveTo(296f, 318.63f)
        lineTo(107.64f, 130.26f)
        lineTo(107.64f, 480f)
        lineTo(480f, 480f)
        lineTo(480f, 107.64f)
        lineTo(130.26f, 107.64f)
        lineTo(318.63f, 296f)
        lineTo(296f, 318.63f)
        close()
      }
    }.build()

    return _ArrowUpLeftBoxSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowUpLeftBoxSharp: ImageVector? = null
