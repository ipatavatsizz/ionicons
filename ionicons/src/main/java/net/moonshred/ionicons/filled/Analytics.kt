package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Analytics: ImageVector
  get() {
    if (_Analytics != null) {
      return _Analytics!!
    }
    _Analytics = ImageVector.Builder(
      name = "Filled.Analytics",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(456f, 128f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -37.23f, 54.6f)
        lineTo(334.6f, 266.77f)
        arcToRelative(39.86f, 39.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -29.2f, 0f)
        lineTo(245.23f, 206.6f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -74.46f, 0f)
        lineTo(70.6f, 306.77f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 93.23f, 329.4f)
        lineTo(193.4f, 229.23f)
        arcToRelative(39.86f, 39.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29.2f, 0f)
        lineToRelative(60.17f, 60.17f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 74.46f, 0f)
        lineToRelative(84.17f, -84.17f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 456f, 128f)
        close()
      }
    }.build()

    return _Analytics!!
  }

@Suppress("ObjectPropertyName")
private var _Analytics: ImageVector? = null
