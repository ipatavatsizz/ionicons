package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Podium: ImageVector
  get() {
    if (_Podium != null) {
      return _Podium!!
    }
    _Podium = ImageVector.Builder(
      name = "Filled.Podium",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(320f, 32f)
        horizontalLineTo(192f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
        verticalLineTo(476f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
        horizontalLineTo(348f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
        verticalLineTo(64f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 320f, 32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 192f)
        horizontalLineTo(392f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
        verticalLineTo(472f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
        horizontalLineToRelative(80f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        verticalLineTo(224f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 464f, 192f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 128f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
        verticalLineTo(456f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineToRelative(80f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
        verticalLineTo(136f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
        close()
      }
    }.build()

    return _Podium!!
  }

@Suppress("ObjectPropertyName")
private var _Podium: ImageVector? = null
