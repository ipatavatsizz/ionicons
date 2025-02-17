package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.PieChart: ImageVector
  get() {
    if (_PieChart != null) {
      return _PieChart!!
    }
    _PieChart = ImageVector.Builder(
      name = "Filled.PieChart",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(66.1f, 357f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.61f, -9.46f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 32f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        verticalLineTo(256f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.47f, 14.61f)
        lineTo(72.63f, 355.56f)
        arcTo(15.93f, 15.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 66.1f, 357f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(313.59f, 68.18f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 304f, 76f)
        verticalLineTo(256f)
        arcToRelative(
          48.07f,
          48.07f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -28.4f,
          43.82f
        )
        lineTo(103.13f, 377f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.35f, 11.81f)
        arcToRelative(
          208.42f,
          208.42f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          48.46f,
          50.41f
        )
        arcTo(206.32f, 206.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 272f, 480f)
        curveToRelative(114.69f, 0f, 208f, -93.31f, 208f, -208f)
        curveTo(480f, 171.55f, 408.42f, 87.5f, 313.59f, 68.18f)
        close()
      }
    }.build()

    return _PieChart!!
  }

@Suppress("ObjectPropertyName")
private var _PieChart: ImageVector? = null
