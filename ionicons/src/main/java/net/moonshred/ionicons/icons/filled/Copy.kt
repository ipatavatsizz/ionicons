package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Copy: ImageVector
  get() {
    if (_Copy != null) {
      return _Copy!!
    }
    _Copy = ImageVector.Builder(
      name = "Filled.Copy",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(408f, 480f)
        horizontalLineTo(184f)
        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -72f, -72f)
        verticalLineTo(184f)
        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, -72f)
        horizontalLineTo(408f)
        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 72f, 72f)
        verticalLineTo(408f)
        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 408f, 480f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(160f, 80f)
        horizontalLineTo(395.88f)
        arcTo(72.12f, 72.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 328f, 32f)
        horizontalLineTo(104f)
        arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -72f, 72f)
        verticalLineTo(328f)
        arcToRelative(
          72.12f,
          72.12f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          48f,
          67.88f
        )
        verticalLineTo(160f)
        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 80f)
        close()
      }
    }.build()

    return _Copy!!
  }

@Suppress("ObjectPropertyName")
private var _Copy: ImageVector? = null
