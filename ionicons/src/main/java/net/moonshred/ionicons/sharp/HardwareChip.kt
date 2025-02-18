package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.HardwareChip: ImageVector
  get() {
    if (_HardwareChipSharp != null) {
      return _HardwareChipSharp!!
    }
    _HardwareChipSharp = ImageVector.Builder(
      name = "Sharp.HardwareChipSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(160f, 160f)
        horizontalLineToRelative(192f)
        verticalLineToRelative(192f)
        horizontalLineToRelative(-192f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 198f)
        verticalLineTo(154f)
        horizontalLineTo(448f)
        verticalLineTo(88f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
        horizontalLineTo(358f)
        verticalLineTo(32f)
        horizontalLineTo(314f)
        verticalLineTo(64f)
        horizontalLineTo(278f)
        verticalLineTo(32f)
        horizontalLineTo(234f)
        verticalLineTo(64f)
        horizontalLineTo(198f)
        verticalLineTo(32f)
        horizontalLineTo(154f)
        verticalLineTo(64f)
        horizontalLineTo(88f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 88f)
        verticalLineToRelative(66f)
        horizontalLineTo(32f)
        verticalLineToRelative(44f)
        horizontalLineTo(64f)
        verticalLineToRelative(36f)
        horizontalLineTo(32f)
        verticalLineToRelative(44f)
        horizontalLineTo(64f)
        verticalLineToRelative(36f)
        horizontalLineTo(32f)
        verticalLineToRelative(44f)
        horizontalLineTo(64f)
        verticalLineToRelative(66f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineToRelative(66f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(44f)
        verticalLineTo(448f)
        horizontalLineToRelative(36f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(44f)
        verticalLineTo(448f)
        horizontalLineToRelative(36f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(44f)
        verticalLineTo(448f)
        horizontalLineToRelative(66f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        verticalLineTo(358f)
        horizontalLineToRelative(32f)
        verticalLineTo(314f)
        horizontalLineTo(448f)
        verticalLineTo(278f)
        horizontalLineToRelative(32f)
        verticalLineTo(234f)
        horizontalLineTo(448f)
        verticalLineTo(198f)
        close()
        moveTo(128f, 128f)
        horizontalLineTo(384f)
        verticalLineTo(384f)
        horizontalLineTo(128f)
        close()
      }
    }.build()

    return _HardwareChipSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HardwareChipSharp: ImageVector? = null
