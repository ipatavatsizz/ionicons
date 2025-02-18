package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ScanCircle: ImageVector
  get() {
    if (_ScanCircleSharp != null) {
      return _ScanCircleSharp!!
    }
    _ScanCircleSharp = ImageVector.Builder(
      name = "Sharp.ScanCircleSharp",
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
        moveTo(232f, 368f)
        lineTo(188f, 368f)
        arcToRelative(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -44f, -44f)
        lineTo(144f, 280f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(44f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineToRelative(44f)
        close()
        moveTo(232f, 176f)
        lineTo(188f, 176f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 12f)
        verticalLineToRelative(44f)
        lineTo(144f, 232f)
        lineTo(144f, 188f)
        arcToRelative(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, -44f)
        horizontalLineToRelative(44f)
        close()
        moveTo(368f, 324f)
        arcToRelative(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -44f, 44f)
        lineTo(280f, 368f)
        lineTo(280f, 336f)
        horizontalLineToRelative(44f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        lineTo(336f, 280f)
        horizontalLineToRelative(32f)
        close()
        moveTo(368f, 232f)
        lineTo(336f, 232f)
        lineTo(336f, 188f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
        lineTo(280f, 176f)
        lineTo(280f, 144f)
        horizontalLineToRelative(44f)
        arcToRelative(44.05f, 44.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, 44f)
        close()
      }
    }.build()

    return _ScanCircleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ScanCircleSharp: ImageVector? = null
