package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Pizza: ImageVector
  get() {
    if (_PizzaOutline != null) {
      return _PizzaOutline!!
    }
    _PizzaOutline = ImageVector.Builder(
      name = "Outline.PizzaOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(404.76f, 123.08f)
        curveTo(358.37f, 104.18f, 309.69f, 96f, 256f, 96f)
        reflectiveCurveTo(149.9f, 105f, 107.1f, 122.68f)
        curveToRelative(-8.08f, 3.3f, -15.26f, 9f, -10.07f, 19.5f)
        curveTo(101.24f, 150.71f, 203f, 375f, 241.66f, 455f)
        arcToRelative(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28.72f, 0f)
        lineTo(414.43f, 142.78f)
        curveTo(417.62f, 135.88f, 415.33f, 127.38f, 404.76f, 123.08f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(436.38f, 82.68f)
        curveTo(384.31f, 62.08f, 320.17f, 48f, 256f, 48f)
        reflectiveCurveTo(128.65f, 60.78f, 75.48f, 82.08f)
        curveTo(70.79f, 84f, 62f, 88.43f, 64.41f, 95.88f)
        lineTo(74.09f, 120f)
        curveToRelative(4f, 8.2f, 8.67f, 8.2f, 15.06f, 8.2f)
        curveToRelative(1.79f, 0f, 4.29f, -1f, 7.28f, -2.18f)
        arcTo(442.46f, 442.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 96f)
        curveToRelative(56.76f, 0f, 114.91f, 12f, 159.6f, 30f)
        curveToRelative(3.59f, 1.4f, 5.59f, 2.18f, 7.28f, 2.18f)
        curveToRelative(6.58f, 0f, 10.38f, 2.19f, 15f, -8.1f)
        lineTo(447.65f, 96f)
        curveTo(449.66f, 90f, 442.66f, 85.18f, 436.38f, 82.68f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(192f, 192f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(320f, 208f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 320f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
    }.build()

    return _PizzaOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PizzaOutline: ImageVector? = null
