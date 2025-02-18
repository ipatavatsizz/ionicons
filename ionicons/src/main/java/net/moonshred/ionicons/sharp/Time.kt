package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Time: ImageVector
  get() {
    if (_TimeSharp != null) {
      return _TimeSharp!!
    }
    _TimeSharp = ImageVector.Builder(
      name = "Sharp.TimeSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.13f, 48f, 48f, 141.13f, 48f, 256f)
        curveToRelative(0f, 114.69f, 93.32f, 208f, 208f, 208f)
        curveToRelative(114.86f, 0f, 208f, -93.14f, 208f, -208f)
        curveTo(464f, 141.31f, 370.69f, 48f, 256f, 48f)
        close()
        moveTo(364f, 288f)
        horizontalLineTo(244f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
        verticalLineTo(116f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
        horizontalLineToRelative(24f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
        verticalLineTo(256f)
        horizontalLineToRelative(92f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
        verticalLineToRelative(24f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 364f, 288f)
        close()
      }
    }.build()

    return _TimeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TimeSharp: ImageVector? = null
