package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Today: ImageVector
  get() {
    if (_TodaySharp != null) {
      return _TodaySharp!!
    }
    _TodaySharp = ImageVector.Builder(
      name = "Sharp.TodaySharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 456f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        lineTo(456f, 480f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        lineTo(480f, 176f)
        lineTo(32f, 176f)
        close()
        moveTo(112f, 217.14f)
        arcToRelative(9.14f, 9.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.14f, -9.14f)
        lineTo(230.86f, 208f)
        arcToRelative(9.14f, 9.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.14f, 9.14f)
        lineTo(240f, 326.86f)
        arcToRelative(9.14f, 9.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, -9.14f, 9.14f)
        lineTo(121.14f, 336f)
        arcToRelative(
          9.14f,
          9.14f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -9.14f,
          -9.14f
        )
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(456f, 64f)
        horizontalLineTo(400.08f)
        verticalLineTo(32f)
        horizontalLineToRelative(-48f)
        verticalLineTo(64f)
        horizontalLineTo(159.92f)
        verticalLineTo(32f)
        horizontalLineToRelative(-48f)
        verticalLineTo(64f)
        horizontalLineTo(56f)
        arcTo(23.8f, 23.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 87.77f)
        verticalLineTo(144f)
        horizontalLineTo(480f)
        verticalLineTo(87.77f)
        arcTo(23.8f, 23.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 456f, 64f)
        close()
      }
    }.build()

    return _TodaySharp!!
  }

@Suppress("ObjectPropertyName")
private var _TodaySharp: ImageVector? = null
