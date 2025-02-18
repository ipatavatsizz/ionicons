package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Cellular: ImageVector
  get() {
    if (_Cellular != null) {
      return _Cellular!!
    }
    _Cellular = ImageVector.Builder(
      name = "Filled.Cellular",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(472f, 432f)
        horizontalLineTo(424f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
        verticalLineTo(104f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
        horizontalLineToRelative(48f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
        verticalLineTo(408f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 472f, 432f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(344f, 432f)
        horizontalLineTo(296f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
        verticalLineTo(184f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
        horizontalLineToRelative(48f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
        verticalLineTo(408f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 344f, 432f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(216f, 432f)
        horizontalLineTo(168f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
        verticalLineTo(248f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
        horizontalLineToRelative(48f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
        verticalLineTo(408f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 432f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(88f, 432f)
        horizontalLineTo(40f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -24f)
        verticalLineTo(312f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
        horizontalLineTo(88f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
        verticalLineToRelative(96f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 432f)
        close()
      }
    }.build()

    return _Cellular!!
  }

@Suppress("ObjectPropertyName")
private var _Cellular: ImageVector? = null
