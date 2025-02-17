package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Open: ImageVector
  get() {
    if (_Open != null) {
      return _Open!!
    }
    _Open = ImageVector.Builder(
      name = "Filled.Open",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(224f, 304f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.31f, -27.31f)
        lineTo(370.63f, 118.75f)
        arcTo(55.7f, 55.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 344f, 112f)
        horizontalLineTo(104f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, 56f)
        verticalLineTo(408f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
        horizontalLineTo(344f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, -56f)
        verticalLineTo(168f)
        arcToRelative(
          55.7f,
          55.7f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -6.75f,
          -26.63f
        )
        lineTo(235.31f, 299.31f)
        arcTo(15.92f, 15.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 304f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 48f)
        horizontalLineTo(336f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 32f)
        horizontalLineToRelative(73.37f)
        lineToRelative(-38.74f, 38.75f)
        arcToRelative(
          56.35f,
          56.35f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          22.62f,
          22.62f
        )
        lineTo(432f, 102.63f)
        verticalLineTo(176f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 0f)
        verticalLineTo(64f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 448f, 48f)
        close()
      }
    }.build()

    return _Open!!
  }

@Suppress("ObjectPropertyName")
private var _Open: ImageVector? = null
