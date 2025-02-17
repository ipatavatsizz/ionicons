package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Watch: ImageVector
  get() {
    if (_WatchSharp != null) {
      return _WatchSharp!!
    }
    _WatchSharp = ImageVector.Builder(
      name = "Sharp.WatchSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(144f, 136f)
        lineTo(368f, 136f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 376f, 144f)
        lineTo(376f, 368f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 376f)
        lineTo(144f, 376f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 368f)
        lineTo(136f, 144f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 136f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 96f)
        lineTo(336f, 96f)
        lineTo(336f, 16f)
        lineTo(176f, 16f)
        lineTo(176f, 96f)
        lineTo(128f, 96f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
        lineTo(96f, 384f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
        horizontalLineToRelative(48f)
        verticalLineToRelative(80f)
        lineTo(336f, 496f)
        lineTo(336f, 416f)
        horizontalLineToRelative(48f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
        lineTo(416f, 128f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 384f, 96f)
        close()
        moveTo(392f, 368f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 24f)
        lineTo(144f, 392f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
        lineTo(120f, 144f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
        lineTo(368f, 120f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
        close()
      }
    }.build()

    return _WatchSharp!!
  }

@Suppress("ObjectPropertyName")
private var _WatchSharp: ImageVector? = null
