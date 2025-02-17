package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.BarChart: ImageVector
  get() {
    if (_BarChart != null) {
      return _BarChart!!
    }
    _BarChart = ImageVector.Builder(
      name = "Filled.BarChart",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 496f)
        horizontalLineTo(48f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, -32f)
        verticalLineTo(32f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
        verticalLineTo(464f)
        horizontalLineTo(480f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(156f, 432f)
        horizontalLineTo(116f)
        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -36f, -36f)
        verticalLineTo(244f)
        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, -36f)
        horizontalLineToRelative(40f)
        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, 36f)
        verticalLineTo(396f)
        arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 156f, 432f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(300f, 432f)
        horizontalLineTo(260f)
        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -36f, -36f)
        verticalLineTo(196f)
        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, -36f)
        horizontalLineToRelative(40f)
        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, 36f)
        verticalLineTo(396f)
        arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 300f, 432f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(443.64f, 432f)
        horizontalLineToRelative(-40f)
        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, -36f, -36f)
        verticalLineTo(132f)
        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, -36f)
        horizontalLineToRelative(40f)
        arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36f, 36f)
        verticalLineTo(396f)
        arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 443.64f, 432f)
        close()
      }
    }.build()

    return _BarChart!!
  }

@Suppress("ObjectPropertyName")
private var _BarChart: ImageVector? = null
