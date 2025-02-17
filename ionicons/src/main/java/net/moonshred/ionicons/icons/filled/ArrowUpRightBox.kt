package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.ArrowUpRightBox: ImageVector
  get() {
    if (_ArrowUpRightBox != null) {
      return _ArrowUpRightBox!!
    }
    _ArrowUpRightBox = ImageVector.Builder(
      name = "Filled.ArrowUpRightBox",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(331.64f, 32f)
        lineTo(464f, 32f)
        curveTo(468.24f, 32f, 472.31f, 33.69f, 475.31f, 36.69f)
        curveTo(478.31f, 39.69f, 480f, 43.76f, 480f, 48f)
        verticalLineTo(180.36f)
        curveTo(480f, 189.2f, 472.84f, 196.36f, 464f, 196.36f)
        curveTo(455.16f, 196.36f, 448f, 189.2f, 448f, 180.36f)
        verticalLineTo(86.63f)
        lineTo(396.87f, 137.76f)
        curveTo(394.25f, 133.04f, 390.97f, 128.67f, 387.09f, 124.78f)
        curveTo(383.25f, 120.95f, 378.93f, 117.7f, 374.28f, 115.09f)
        lineTo(425.37f, 64f)
        lineTo(331.64f, 64f)
        curveTo(322.8f, 64f, 315.64f, 56.84f, 315.64f, 48f)
        curveTo(315.64f, 39.16f, 322.8f, 32f, 331.64f, 32f)
        close()
        moveTo(374.28f, 115.09f)
        curveTo(365.62f, 110.25f, 355.79f, 107.64f, 345.69f, 107.64f)
        horizontalLineTo(90.55f)
        curveTo(75.02f, 107.64f, 60.13f, 113.81f, 49.15f, 124.78f)
        curveTo(38.17f, 135.76f, 32f, 150.65f, 32f, 166.18f)
        verticalLineTo(421.45f)
        curveTo(32f, 436.98f, 38.17f, 451.87f, 49.15f, 462.85f)
        curveTo(60.13f, 473.83f, 75.02f, 480f, 90.55f, 480f)
        horizontalLineTo(345.82f)
        curveTo(361.35f, 480f, 376.24f, 473.83f, 387.22f, 462.85f)
        curveTo(398.2f, 451.87f, 404.36f, 436.98f, 404.36f, 421.45f)
        verticalLineTo(166.18f)
        curveTo(404.36f, 165.37f, 404.3f, 164.58f, 404.19f, 163.8f)
        curveTo(403.82f, 154.61f, 401.28f, 145.69f, 396.87f, 137.76f)
        lineTo(227.31f, 307.31f)
        curveTo(221.07f, 313.56f, 210.93f, 313.56f, 204.69f, 307.31f)
        curveTo(198.44f, 301.07f, 198.44f, 290.93f, 204.69f, 284.69f)
        lineTo(374.28f, 115.09f)
        close()
      }
    }.build()

    return _ArrowUpRightBox!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowUpRightBox: ImageVector? = null
