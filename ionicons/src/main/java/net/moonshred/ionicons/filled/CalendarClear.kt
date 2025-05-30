package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.CalendarClear: ImageVector
  get() {
    if (_CalendarClear != null) {
      return _CalendarClear!!
    }
    _CalendarClear = ImageVector.Builder(
      name = "Filled.CalendarClear",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 128f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, -64f)
        horizontalLineTo(400f)
        verticalLineTo(48.45f)
        curveToRelative(0f, -8.61f, -6.62f, -16f, -15.23f, -16.43f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 368f, 48f)
        verticalLineTo(64f)
        horizontalLineTo(144f)
        verticalLineTo(48.45f)
        curveToRelative(0f, -8.61f, -6.62f, -16f, -15.23f, -16.43f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 112f, 48f)
        verticalLineTo(64f)
        horizontalLineTo(96f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 64f)
        verticalLineToRelative(12f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
        horizontalLineTo(476f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 416f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
        horizontalLineTo(416f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
        verticalLineTo(180f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
        horizontalLineTo(36f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
        close()
      }
    }.build()

    return _CalendarClear!!
  }

@Suppress("ObjectPropertyName")
private var _CalendarClear: ImageVector? = null
