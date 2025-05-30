package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Happy: ImageVector
  get() {
    if (_Happy != null) {
      return _Happy!!
    }
    _Happy = ImageVector.Builder(
      name = "Filled.Happy",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(414.39f, 97.61f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = true, isPositiveArc = false, 97.61f, 414.39f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = true, isPositiveArc = false, 414.39f, 97.61f)
        close()
        moveTo(184f, 208f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 24f)
        arcTo(23.94f, 23.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 208f)
        close()
        moveTo(351.67f, 314.17f)
        curveToRelative(-12f, 40.3f, -50.2f, 69.83f, -95.62f, 69.83f)
        reflectiveCurveToRelative(-83.62f, -29.53f, -95.72f, -69.83f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168.16f, 304f)
        horizontalLineTo(343.85f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 351.67f, 314.17f)
        close()
        moveTo(328f, 256f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, -24f)
        arcTo(23.94f, 23.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 328f, 256f)
        close()
      }
    }.build()

    return _Happy!!
  }

@Suppress("ObjectPropertyName")
private var _Happy: ImageVector? = null
