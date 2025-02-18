package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.MaleFemale: ImageVector
  get() {
    if (_MaleFemaleSharp != null) {
      return _MaleFemaleSharp!!
    }
    _MaleFemaleSharp = ImageVector.Builder(
      name = "Sharp.MaleFemaleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(330f, 16f)
        verticalLineTo(60f)
        horizontalLineToRelative(42.89f)
        lineToRelative(-37.1f, 37.09f)
        arcTo(157.67f, 157.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 42f)
        curveTo(128.88f, 42f, 58f, 112.88f, 58f, 200f)
        curveToRelative(0f, 79.66f, 59.26f, 145.72f, 136f, 156.46f)
        verticalLineTo(394f)
        horizontalLineTo(144f)
        verticalLineToRelative(44f)
        horizontalLineToRelative(50f)
        verticalLineToRelative(58f)
        horizontalLineToRelative(44f)
        verticalLineTo(438f)
        horizontalLineToRelative(50f)
        verticalLineTo(394f)
        horizontalLineTo(238f)
        verticalLineTo(356.46f)
        curveToRelative(76.74f, -10.74f, 136f, -76.8f, 136f, -156.46f)
        arcToRelative(
          157.23f,
          157.23f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -14f,
          -64.93f
        )
        lineToRelative(44f, -44f)
        verticalLineTo(134f)
        horizontalLineToRelative(44f)
        verticalLineTo(16f)
        close()
        moveTo(216f, 314f)
        arcTo(114f, 114f, 0f, isMoreThanHalf = true, isPositiveArc = true, 330f, 200f)
        arcTo(114.13f, 114.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 314f)
        close()
      }
    }.build()

    return _MaleFemaleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MaleFemaleSharp: ImageVector? = null
