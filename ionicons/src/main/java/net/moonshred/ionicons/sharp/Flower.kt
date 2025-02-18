package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Flower: ImageVector
  get() {
    if (_FlowerSharp != null) {
      return _FlowerSharp!!
    }
    _FlowerSharp = ImageVector.Builder(
      name = "Sharp.FlowerSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 256f)
        moveToRelative(-43f, 0f)
        arcToRelative(43f, 43f, 0f, isMoreThanHalf = true, isPositiveArc = true, 86f, 0f)
        arcToRelative(43f, 43f, 0f, isMoreThanHalf = true, isPositiveArc = true, -86f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(475.93f, 303.91f)
        arcToRelative(
          67.49f,
          67.49f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -47.62f,
          -115.6f
        )
        curveToRelative(-2.88f, 0f, -6.2f, 0.14f, -9.93f, 0.43f)
        curveToRelative(2.75f, -2.36f, 5.23f, -4.62f, 7.33f, -6.71f)
        arcTo(67.83f, 67.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 378f, 66.33f)
        horizontalLineToRelative(-0.25f)
        arcToRelative(
          67.27f,
          67.27f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -47.82f,
          20f
        )
        curveToRelative(-2.11f, 2.11f, -4.37f, 4.59f, -6.72f, 7.33f)
        curveToRelative(0.29f, -3.75f, 0.44f, -7.07f, 0.44f, -9.93f)
        arcToRelative(
          67.69f,
          67.69f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = false,
          -135.38f,
          0f
        )
        curveToRelative(0f, 2.87f, 0.15f, 6.19f, 0.44f, 9.93f)
        curveToRelative(-2.36f, -2.74f, -4.62f, -5.22f, -6.72f, -7.33f)
        arcToRelative(
          67.27f,
          67.27f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -47.82f,
          -20f
        )
        horizontalLineTo(134f)
        arcTo(67.9f, 67.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 86.29f, 182f)
        curveToRelative(2.1f, 2.09f, 4.58f, 4.35f, 7.34f, 6.72f)
        curveToRelative(-3.74f, -0.29f, -7.06f, -0.44f, -9.94f, -0.44f)
        arcToRelative(
          67.69f,
          67.69f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0f,
          135.38f
        )
        curveToRelative(2.86f, 0f, 6.18f, -0.15f, 9.93f, -0.44f)
        curveToRelative(-2.74f, 2.35f, -5.22f, 4.61f, -7.33f, 6.72f)
        arcToRelative(
          67.55f,
          67.55f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          47.82f,
          115.42f
        )
        horizontalLineToRelative(0.25f)
        arcTo(67.32f, 67.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 182f, 425.71f)
        curveToRelative(2.09f, -2.1f, 4.35f, -4.58f, 6.71f, -7.33f)
        curveToRelative(-0.28f, 3.73f, -0.43f, 7.05f, -0.43f, 9.93f)
        arcToRelative(
          67.69f,
          67.69f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          135.38f,
          0f
        )
        curveToRelative(0f, -2.87f, -0.15f, -6.19f, -0.44f, -9.94f)
        curveToRelative(2.36f, 2.75f, 4.62f, 5.24f, 6.72f, 7.34f)
        arcToRelative(
          67.32f,
          67.32f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          47.67f,
          19.68f
        )
        horizontalLineToRelative(0.25f)
        arcTo(67.5f, 67.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 425.71f, 330f)
        curveToRelative(-2.11f, -2.11f, -4.59f, -4.37f, -7.33f, -6.72f)
        curveToRelative(3.75f, 0.29f, 7.07f, 0.44f, 9.93f, 0.44f)
        arcTo(67.27f, 67.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 475.93f, 303.91f)
        close()
        moveTo(256f, 341f)
        arcToRelative(85f, 85f, 0f, isMoreThanHalf = true, isPositiveArc = true, 85f, -85f)
        arcTo(85.1f, 85.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 341f)
        close()
      }
    }.build()

    return _FlowerSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FlowerSharp: ImageVector? = null
