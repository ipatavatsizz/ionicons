package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.CalendarClear: ImageVector
  get() {
    if (_CalendarClearSharp != null) {
      return _CalendarClearSharp!!
    }
    _CalendarClearSharp = ImageVector.Builder(
      name = "Sharp.CalendarClearSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 456f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineTo(456f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        verticalLineTo(192f)
        horizontalLineTo(32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 87.77f)
        arcTo(23.8f, 23.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 456f, 64f)
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
        close()
      }
    }.build()

    return _CalendarClearSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CalendarClearSharp: ImageVector? = null
