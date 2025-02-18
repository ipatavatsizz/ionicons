package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Cash: ImageVector
  get() {
    if (_CashSharp != null) {
      return _CashSharp!!
    }
    _CashSharp = ImageVector.Builder(
      name = "Sharp.CashSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 368f)
        horizontalLineToRelative(416f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-416f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(80f, 416f)
        horizontalLineToRelative(352f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-352f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 176f)
        arcToRelative(96.11f, 96.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -96f, -96f)
        verticalLineTo(64f)
        horizontalLineTo(128f)
        verticalLineTo(80f)
        arcToRelative(96.11f, 96.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, -96f, 96f)
        horizontalLineTo(16f)
        verticalLineToRelative(64f)
        horizontalLineTo(32f)
        arcToRelative(96.11f, 96.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 96f)
        verticalLineToRelative(16f)
        horizontalLineTo(384f)
        verticalLineTo(336f)
        arcToRelative(96.11f, 96.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, -96f)
        horizontalLineToRelative(16f)
        verticalLineTo(176f)
        close()
        moveTo(256f, 304f)
        arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, -96f)
        arcTo(96.11f, 96.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 304f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(96f, 80f)
        verticalLineTo(64f)
        horizontalLineTo(16f)
        verticalLineToRelative(80f)
        horizontalLineTo(32f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 272f)
        horizontalLineTo(16f)
        verticalLineToRelative(80f)
        horizontalLineTo(96f)
        verticalLineTo(336f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 272f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 144f)
        horizontalLineToRelative(16f)
        verticalLineTo(64f)
        horizontalLineTo(416f)
        verticalLineTo(80f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 480f, 144f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 336f)
        verticalLineToRelative(16f)
        horizontalLineToRelative(80f)
        verticalLineTo(272f)
        horizontalLineTo(480f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 416f, 336f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 208f)
        moveToRelative(-64f, 0f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 128f, 0f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, -128f, 0f)
      }
    }.build()

    return _CashSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CashSharp: ImageVector? = null
