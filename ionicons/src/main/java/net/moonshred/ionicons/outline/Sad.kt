package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Sad: ImageVector
  get() {
    if (_SadOutline != null) {
      return _SadOutline!!
    }
    _SadOutline = ImageVector.Builder(
      name = "Outline.SadOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
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
        moveTo(256f, 288f)
        curveToRelative(45.42f, 0f, 83.62f, 29.53f, 95.71f, 69.83f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 343.84f, 368f)
        horizontalLineTo(168.15f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.82f, -10.17f)
        curveTo(172.32f, 317.53f, 210.53f, 288f, 256f, 288f)
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

    return _SadOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SadOutline: ImageVector? = null
