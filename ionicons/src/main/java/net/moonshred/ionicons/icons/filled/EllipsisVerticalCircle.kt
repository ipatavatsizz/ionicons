package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.EllipsisVerticalCircle: ImageVector
  get() {
    if (_EllipsisVerticalCircle != null) {
      return _EllipsisVerticalCircle!!
    }
    _EllipsisVerticalCircle = ImageVector.Builder(
      name = "Filled.EllipsisVerticalCircle",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 256f)
        curveToRelative(0f, -114.87f, -93.13f, -208f, -208f, -208f)
        reflectiveCurveTo(48f, 141.13f, 48f, 256f)
        reflectiveCurveToRelative(93.13f, 208f, 208f, 208f)
        reflectiveCurveTo(464f, 370.87f, 464f, 256f)
        close()
        moveTo(230f, 166f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 26f, 26f)
        arcTo(26f, 26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 230f, 166f)
        close()
        moveTo(230f, 256f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 26f, 26f)
        arcTo(26f, 26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 230f, 256f)
        close()
        moveTo(230f, 346f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 26f, 26f)
        arcTo(26f, 26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 230f, 346f)
        close()
      }
    }.build()

    return _EllipsisVerticalCircle!!
  }

@Suppress("ObjectPropertyName")
private var _EllipsisVerticalCircle: ImageVector? = null
