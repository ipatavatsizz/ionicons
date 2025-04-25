package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Xing: ImageVector
  get() {
    if (_Xing != null) {
      return _Xing!!
    }
    _Xing = ImageVector.Builder(
      name = "Logo.Xing",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(313.8f, 303.9f)
        lineTo(469f, 32f)
        horizontalLineTo(365f)
        lineTo(209.4f, 303.8f)
        arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.7f)
        lineToRelative(98.9f, 173.8f)
        curveToRelative(0.4f, 0.7f, 0.8f, 0.7f, 1.6f, 0.7f)
        horizontalLineTo(413f)
        lineTo(313.7f, 305.3f)
        arcTo(1.74f, 1.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 313.8f, 303.9f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(221.9f, 216.2f)
        lineTo(163f, 113f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -1f)
        horizontalLineTo(65f)
        lineToRelative(58.9f, 104.4f)
        arcToRelative(1.13f, 1.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.1f, 0.8f)
        lineTo(43f, 352f)
        horizontalLineToRelative(96.8f)
        arcToRelative(1.54f, 1.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -0.9f)
        lineToRelative(80.5f, -133.7f)
        arcTo(2.44f, 2.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 221.9f, 216.2f)
        close()
      }
    }.build()

    return _Xing!!
  }

@Suppress("ObjectPropertyName")
private var _Xing: ImageVector? = null
