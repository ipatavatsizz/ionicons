package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Triangle: ImageVector
  get() {
    if (_Triangle != null) {
      return _Triangle!!
    }
    _Triangle = ImageVector.Builder(
      name = "Filled.Triangle",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 464f)
        horizontalLineTo(48f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -14.07f, -23.62f)
        lineToRelative(208f, -384f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28.14f, 0f)
        lineToRelative(208f, 384f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 464f)
        close()
      }
    }.build()

    return _Triangle!!
  }

@Suppress("ObjectPropertyName")
private var _Triangle: ImageVector? = null
