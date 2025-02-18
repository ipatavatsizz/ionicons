package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.ArrowUpLeftBox: ImageVector
  get() {
    if (_ArrowUpLeftBox != null) {
      return _ArrowUpLeftBox!!
    }
    _ArrowUpLeftBox = ImageVector.Builder(
      name = "Filled.ArrowUpLeftBox",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(32f, 180.36f)
        lineTo(32f, 48f)
        curveTo(32f, 43.76f, 33.69f, 39.69f, 36.69f, 36.69f)
        curveTo(39.69f, 33.69f, 43.76f, 32f, 48f, 32f)
        horizontalLineTo(180.36f)
        curveTo(189.2f, 32f, 196.36f, 39.16f, 196.36f, 48f)
        curveTo(196.36f, 56.84f, 189.2f, 64f, 180.36f, 64f)
        horizontalLineTo(86.63f)
        lineTo(137.76f, 115.13f)
        curveTo(133.04f, 117.75f, 128.67f, 121.03f, 124.78f, 124.91f)
        curveTo(120.95f, 128.75f, 117.7f, 133.07f, 115.09f, 137.72f)
        lineTo(64f, 86.63f)
        lineTo(64f, 180.36f)
        curveTo(64f, 189.2f, 56.84f, 196.36f, 48f, 196.36f)
        curveTo(39.16f, 196.36f, 32f, 189.2f, 32f, 180.36f)
        close()
        moveTo(115.09f, 137.72f)
        curveTo(110.25f, 146.38f, 107.64f, 156.21f, 107.64f, 166.31f)
        lineTo(107.64f, 421.45f)
        curveTo(107.64f, 436.98f, 113.81f, 451.87f, 124.78f, 462.85f)
        curveTo(135.76f, 473.83f, 150.65f, 480f, 166.18f, 480f)
        horizontalLineTo(421.45f)
        curveTo(436.98f, 480f, 451.87f, 473.83f, 462.85f, 462.85f)
        curveTo(473.83f, 451.87f, 480f, 436.98f, 480f, 421.45f)
        verticalLineTo(166.18f)
        curveTo(480f, 150.65f, 473.83f, 135.76f, 462.85f, 124.78f)
        curveTo(451.87f, 113.81f, 436.98f, 107.64f, 421.45f, 107.64f)
        horizontalLineTo(166.18f)
        curveTo(165.37f, 107.64f, 164.58f, 107.7f, 163.8f, 107.81f)
        curveTo(154.61f, 108.18f, 145.69f, 110.72f, 137.76f, 115.13f)
        lineTo(307.31f, 284.69f)
        curveTo(313.56f, 290.93f, 313.56f, 301.07f, 307.31f, 307.31f)
        curveTo(301.07f, 313.56f, 290.93f, 313.56f, 284.69f, 307.31f)
        lineTo(115.09f, 137.72f)
        close()
      }
    }.build()

    return _ArrowUpLeftBox!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowUpLeftBox: ImageVector? = null
