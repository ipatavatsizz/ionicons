package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ArrowDownLeftBox: ImageVector
  get() {
    if (_ArrowDownLeftBoxSharp != null) {
      return _ArrowDownLeftBoxSharp!!
    }
    _ArrowDownLeftBoxSharp = ImageVector.Builder(
      name = "Sharp.ArrowDownLeftBoxSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(32f, 480f)
        lineTo(32f, 315.64f)
        lineTo(64f, 315.64f)
        lineTo(64f, 425.37f)
        lineTo(107.64f, 381.74f)
        lineTo(107.64f, 404.36f)
        lineTo(130.26f, 404.36f)
        lineTo(86.63f, 448f)
        lineTo(196.36f, 448f)
        lineTo(196.36f, 480f)
        lineTo(32f, 480f)
        close()
        moveTo(318.63f, 216f)
        lineTo(130.26f, 404.36f)
        lineTo(480f, 404.36f)
        lineTo(480f, 32f)
        lineTo(107.64f, 32f)
        lineTo(107.64f, 381.74f)
        lineTo(296f, 193.37f)
        lineTo(318.63f, 216f)
        close()
      }
    }.build()

    return _ArrowDownLeftBoxSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowDownLeftBoxSharp: ImageVector? = null
