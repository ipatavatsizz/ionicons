package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.GitCompare: ImageVector
  get() {
    if (_GitCompareSharp != null) {
      return _GitCompareSharp!!
    }
    _GitCompareSharp = ImageVector.Builder(
      name = "Sharp.GitCompareSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(209f, 384f)
        horizontalLineTo(172f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28f, -28f)
        verticalLineTo(152f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, -64f, -1.16f)
        verticalLineTo(356f)
        arcToRelative(92.1f, 92.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 92f, 92f)
        horizontalLineToRelative(37f)
        verticalLineToRelative(55.21f)
        lineTo(294.39f, 416f)
        lineTo(209f, 328.79f)
        close()
        moveTo(113f, 64f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 81f, 96f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 113f, 64f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(432f, 360.61f)
        verticalLineTo(156f)
        arcToRelative(92.1f, 92.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -92f, -92f)
        horizontalLineTo(305f)
        verticalLineTo(9.93f)
        lineTo(217.14f, 96f)
        lineTo(305f, 182.07f)
        verticalLineTo(128f)
        horizontalLineToRelative(35f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 28f)
        verticalLineTo(360.61f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
        close()
        moveTo(400f, 448f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 400f, 448f)
        close()
      }
    }.build()

    return _GitCompareSharp!!
  }

@Suppress("ObjectPropertyName")
private var _GitCompareSharp: ImageVector? = null
