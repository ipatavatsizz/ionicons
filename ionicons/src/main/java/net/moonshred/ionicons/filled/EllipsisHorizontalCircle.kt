package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.EllipsisHorizontalCircle: ImageVector
  get() {
    if (_EllipsisHorizontalCircle != null) {
      return _EllipsisHorizontalCircle!!
    }
    _EllipsisHorizontalCircle = ImageVector.Builder(
      name = "Filled.EllipsisHorizontalCircle",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(141.13f, 48f, 48f, 141.13f, 48f, 256f)
        reflectiveCurveToRelative(93.13f, 208f, 208f, 208f)
        reflectiveCurveToRelative(208f, -93.13f, 208f, -208f)
        reflectiveCurveTo(370.87f, 48f, 256f, 48f)
        close()
        moveTo(166f, 282f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 26f, -26f)
        arcTo(26f, 26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 166f, 282f)
        close()
        moveTo(256f, 282f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 26f, -26f)
        arcTo(26f, 26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 282f)
        close()
        moveTo(346f, 282f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 26f, -26f)
        arcTo(26f, 26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 346f, 282f)
        close()
      }
    }.build()

    return _EllipsisHorizontalCircle!!
  }

@Suppress("ObjectPropertyName")
private var _EllipsisHorizontalCircle: ImageVector? = null
