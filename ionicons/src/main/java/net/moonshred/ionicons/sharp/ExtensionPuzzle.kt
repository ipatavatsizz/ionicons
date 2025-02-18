package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ExtensionPuzzle: ImageVector
  get() {
    if (_ExtensionPuzzleSharp != null) {
      return _ExtensionPuzzleSharp!!
    }
    _ExtensionPuzzleSharp = ImageVector.Builder(
      name = "Sharp.ExtensionPuzzleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(345.14f, 480f)
        horizontalLineTo(256f)
        verticalLineTo(434.29f)
        arcToRelative(
          31.3f,
          31.3f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -9.59f,
          -22.65f
        )
        curveToRelative(-7.67f, -7.56f, -18.83f, -11.81f, -30.57f, -11.64f)
        arcToRelative(
          44.38f,
          44.38f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -28.45f,
          10.67f
        )
        curveToRelative(-5.2f, 4.6f, -11.39f, 12.56f, -11.39f, 24.42f)
        verticalLineTo(480f)
        horizontalLineTo(87.62f)
        arcTo(55.68f, 55.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 424.38f)
        verticalLineTo(336f)
        horizontalLineTo(77.71f)
        curveToRelative(9.16f, 0f, 18.07f, -3.92f, 25.09f, -11f)
        arcTo(42.06f, 42.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 115f, 295.08f)
        curveTo(114.7f, 273.89f, 97.26f, 256f, 76.91f, 256f)
        horizontalLineTo(32f)
        verticalLineTo(166.66f)
        arcToRelative(
          53.77f,
          53.77f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          16.53f,
          -39f
        )
        arcTo(55.88f, 55.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 87.62f, 112f)
        horizontalLineToRelative(63.24f)
        verticalLineTo(97.52f)
        arcTo(65.53f, 65.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 217.54f, 32f)
        curveToRelative(35.49f, 0.62f, 64.36f, 30.38f, 64.36f, 66.33f)
        verticalLineTo(112f)
        horizontalLineToRelative(63.24f)
        arcTo(54.28f, 54.28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 400f, 166.86f)
        verticalLineTo(230.1f)
        horizontalLineToRelative(13.66f)
        curveToRelative(36.58f, 0f, 66.34f, 29f, 66.34f, 64.64f)
        curveToRelative(0f, 36.61f, -29.39f, 66.4f, -65.52f, 66.4f)
        horizontalLineTo(400f)
        verticalLineToRelative(63.24f)
        curveTo(400f, 455.05f, 375.39f, 480f, 345.14f, 480f)
        close()
      }
    }.build()

    return _ExtensionPuzzleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ExtensionPuzzleSharp: ImageVector? = null
