package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Share: ImageVector
  get() {
    if (_Share != null) {
      return _Share!!
    }
    _Share = ImageVector.Builder(
      name = "Filled.Share",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(376f, 176f)
        horizontalLineTo(272f)
        verticalLineTo(321f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        verticalLineTo(176f)
        horizontalLineTo(136f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 56f)
        verticalLineTo(424f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
        horizontalLineTo(376f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, -56f)
        verticalLineTo(232f)
        arcTo(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 376f, 176f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 86.63f)
        lineToRelative(52.69f, 52.68f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.62f, -22.62f)
        lineToRelative(-80f, -80f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22.62f, 0f)
        lineToRelative(-80f, 80f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.62f, 22.62f)
        lineTo(240f, 86.63f)
        verticalLineTo(176f)
        horizontalLineToRelative(32f)
        close()
      }
    }.build()

    return _Share!!
  }

@Suppress("ObjectPropertyName")
private var _Share: ImageVector? = null
