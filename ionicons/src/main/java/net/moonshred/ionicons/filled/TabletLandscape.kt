package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.TabletLandscape: ImageVector
  get() {
    if (_TabletLandscape != null) {
      return _TabletLandscape!!
    }
    _TabletLandscape = ImageVector.Builder(
      name = "Filled.TabletLandscape",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(512f, 128f)
        verticalLineTo(384f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 64f)
        horizontalLineTo(64f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 384f)
        verticalLineTo(128f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
        horizontalLineTo(448f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 512f, 128f)
        close()
        moveTo(32f, 384f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
        horizontalLineTo(448f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
        verticalLineTo(128f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, -32f)
        horizontalLineTo(64f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(0f, 128f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
        horizontalLineTo(448f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
        verticalLineTo(384f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 64f)
        horizontalLineTo(64f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 384f)
        verticalLineTo(128f)
        moveTo(480f, 384f)
        verticalLineTo(128f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, -32f)
        horizontalLineTo(64f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
        verticalLineTo(384f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
        horizontalLineTo(448f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
        moveToRelative(-16f, 0f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
        horizontalLineTo(64f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
        verticalLineTo(128f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        horizontalLineTo(448f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        verticalLineTo(384f)
        close()
      }
    }.build()

    return _TabletLandscape!!
  }

@Suppress("ObjectPropertyName")
private var _TabletLandscape: ImageVector? = null
