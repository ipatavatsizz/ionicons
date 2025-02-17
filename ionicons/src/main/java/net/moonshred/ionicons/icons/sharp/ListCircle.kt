package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ListCircle: ImageVector
  get() {
    if (_ListCircleSharp != null) {
      return _ListCircleSharp!!
    }
    _ListCircleSharp = ImageVector.Builder(
      name = "Sharp.ListCircleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.31f, 48f, 48f, 141.31f, 48f, 256f)
        reflectiveCurveToRelative(93.31f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.31f, 208f, -208f)
        reflectiveCurveTo(370.69f, 48f, 256f, 48f)
        close()
        moveTo(192f, 335.5f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
        lineTo(160f, 351.5f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
        verticalLineToRelative(-16f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        horizontalLineToRelative(16f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        close()
        moveTo(192f, 264.5f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
        lineTo(160f, 280.5f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
        verticalLineToRelative(-16f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        horizontalLineToRelative(16f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        close()
        moveTo(192f, 192.5f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
        lineTo(160f, 208.5f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
        verticalLineToRelative(-16f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        horizontalLineToRelative(16f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        close()
        moveTo(368f, 343.5f)
        lineTo(212.67f, 343.5f)
        verticalLineToRelative(-32f)
        lineTo(368f, 311.5f)
        close()
        moveTo(368f, 272.5f)
        lineTo(212.67f, 272.5f)
        verticalLineToRelative(-32f)
        lineTo(368f, 240.5f)
        close()
        moveTo(368f, 200.5f)
        lineTo(212.67f, 200.5f)
        verticalLineToRelative(-32f)
        lineTo(368f, 168.5f)
        close()
      }
    }.build()

    return _ListCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ListCircleSharp: ImageVector? = null
