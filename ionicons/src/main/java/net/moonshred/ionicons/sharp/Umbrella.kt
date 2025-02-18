package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Umbrella: ImageVector
  get() {
    if (_UmbrellaSharp != null) {
      return _UmbrellaSharp!!
    }
    _UmbrellaSharp = ImageVector.Builder(
      name = "Sharp.UmbrellaSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(128.93f, 280f)
        lineToRelative(-0.26f, -0.3f)
        curveToRelative(-0.9f, -0.74f, -1.83f, -1.43f, -2.77f, -2.1f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(383.08f, 280f)
        lineToRelative(2.62f, -2.12f)
        curveToRelative(-0.79f, 0.58f, -1.57f, 1.17f, -2.34f, 1.79f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(463.14f, 186.44f)
        arcTo(224.55f, 224.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 272f, 48.57f)
        verticalLineTo(32f)
        horizontalLineTo(240f)
        verticalLineTo(48.57f)
        arcTo(223.58f, 223.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 272f)
        verticalLineToRelative(22.52f)
        lineToRelative(12.25f, -11.21f)
        arcToRelative(
          62.63f,
          62.63f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          81.43f,
          -5.88f
        )
        lineToRelative(0.22f, 0.17f)
        curveToRelative(0.94f, 0.67f, 1.87f, 1.36f, 2.77f, 2.1f)
        quadToRelative(2.09f, 1.69f, 4f, 3.61f)
        lineTo(144f, 294.63f)
        lineToRelative(11.31f, -11.32f)
        arcToRelative(
          62.59f,
          62.59f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          81.4f,
          -5.78f
        )
        lineTo(240f, 280f)
        verticalLineTo(432f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        verticalLineTo(416f)
        horizontalLineTo(176f)
        verticalLineToRelative(16f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 0f)
        verticalLineTo(280f)
        lineToRelative(3.29f, -2.47f)
        arcToRelative(
          62.59f,
          62.59f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          81.4f,
          5.78f
        )
        lineTo(368f, 294.63f)
        lineToRelative(11.31f, -11.32f)
        quadToRelative(1.95f, -1.94f, 4.05f, -3.64f)
        curveToRelative(0.77f, -0.62f, 1.55f, -1.21f, 2.34f, -1.79f)
        lineToRelative(0.26f, -0.21f)
        curveToRelative(24.63f, -18.47f, 60f, -16.13f, 81.81f, 5.64f)
        lineTo(480f, 294.51f)
        verticalLineTo(272f)
        arcTo(223.62f, 223.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 463.14f, 186.44f)
        close()
      }
    }.build()

    return _UmbrellaSharp!!
  }

@Suppress("ObjectPropertyName")
private var _UmbrellaSharp: ImageVector? = null
