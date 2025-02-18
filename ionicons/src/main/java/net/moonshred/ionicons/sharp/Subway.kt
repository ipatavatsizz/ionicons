package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Subway: ImageVector
  get() {
    if (_SubwaySharp != null) {
      return _SubwaySharp!!
    }
    _SubwaySharp = ImageVector.Builder(
      name = "Sharp.SubwaySharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(392f, 16f)
        lineTo(120f, 16f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 40f)
        lineTo(96f, 376f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        lineTo(392f, 400f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        lineTo(416f, 40f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 392f, 16f)
        close()
        moveTo(208f, 64f)
        horizontalLineToRelative(95.55f)
        curveToRelative(8.61f, 0f, 16f, 6.62f, 16.43f, 15.23f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 304f, 96f)
        lineTo(208.45f, 96f)
        curveToRelative(-8.61f, 0f, -16f, -6.62f, -16.43f, -15.23f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 64f)
        close()
        moveTo(179.47f, 351.82f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28.35f, -28.35f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 179.47f, 351.82f)
        close()
        moveTo(339.47f, 351.82f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28.35f, -28.35f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 339.47f, 351.82f)
        close()
        moveTo(384f, 144f)
        verticalLineToRelative(64f)
        lineTo(128f, 208f)
        lineTo(128f, 144f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(298f, 416f)
        lineToRelative(31.37f, 32f)
        lineToRelative(-146.74f, 0f)
        lineToRelative(31.37f, -32f)
        lineToRelative(-44f, 0f)
        lineToRelative(-80.57f, 80f)
        lineToRelative(45.2f, 0f)
        lineToRelative(16f, -16f)
        lineToRelative(210.74f, 0f)
        lineToRelative(16f, 16f)
        lineToRelative(45.3f, 0f)
        lineToRelative(-79.67f, -80f)
        lineToRelative(-45f, 0f)
        close()
      }
    }.build()

    return _SubwaySharp!!
  }

@Suppress("ObjectPropertyName")
private var _SubwaySharp: ImageVector? = null
