package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.EllipsisHorizontalCircle: ImageVector
  get() {
    if (_EllipsisHorizontalCircleOutline != null) {
      return _EllipsisHorizontalCircleOutline!!
    }
    _EllipsisHorizontalCircleOutline = ImageVector.Builder(
      name = "Outline.EllipsisHorizontalCircleOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 256f)
        moveToRelative(-26f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 52f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, -52f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(346f, 256f)
        moveToRelative(-26f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 52f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, -52f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(166f, 256f)
        moveToRelative(-26f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, 52f, 0f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = true, isPositiveArc = true, -52f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(448f, 256f)
        curveToRelative(0f, -106f, -86f, -192f, -192f, -192f)
        reflectiveCurveTo(64f, 150f, 64f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        reflectiveCurveTo(448f, 362f, 448f, 256f)
        close()
      }
    }.build()

    return _EllipsisHorizontalCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _EllipsisHorizontalCircleOutline: ImageVector? = null
