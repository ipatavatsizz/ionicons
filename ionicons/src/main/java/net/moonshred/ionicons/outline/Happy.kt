package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Happy: ImageVector
  get() {
    if (_HappyOutline != null) {
      return _HappyOutline!!
    }
    _HappyOutline = ImageVector.Builder(
      name = "Outline.HappyOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(184f, 232f)
        moveToRelative(-24f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256.05f, 384f)
        curveToRelative(-45.42f, 0f, -83.62f, -29.53f, -95.71f, -69.83f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168.16f, 304f)
        horizontalLineTo(343.85f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.82f, 10.17f)
        curveTo(339.68f, 354.47f, 301.47f, 384f, 256.05f, 384f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(328f, 232f)
        moveToRelative(-24f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 48f, 0f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -48f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 256f)
        moveToRelative(-208f, 0f)
        arcToRelative(208f, 208f, 0f, isMoreThanHalf = true, isPositiveArc = true, 416f, 0f)
        arcToRelative(208f, 208f, 0f, isMoreThanHalf = true, isPositiveArc = true, -416f, 0f)
      }
    }.build()

    return _HappyOutline!!
  }

@Suppress("ObjectPropertyName")
private var _HappyOutline: ImageVector? = null
