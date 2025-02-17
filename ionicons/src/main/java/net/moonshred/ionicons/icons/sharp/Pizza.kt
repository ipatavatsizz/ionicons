package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Pizza: ImageVector
  get() {
    if (_PizzaSharp != null) {
      return _PizzaSharp!!
    }
    _PizzaSharp = ImageVector.Builder(
      name = "Sharp.PizzaSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(442.3f, 67.82f)
        horizontalLineToRelative(0f)
        curveTo(383.92f, 44.72f, 317.78f, 32f, 256f, 32f)
        curveToRelative(-63.57f, 0f, -129.8f, 12.51f, -186.56f, 35.25f)
        curveTo(49.18f, 75.48f, 42f, 80f, 42f, 80f)
        lineToRelative(22f, 44f)
        lineToRelative(37.53f, -16.14f)
        curveTo(147.58f, 89.53f, 199.19f, 80f, 256.51f, 80f)
        curveTo(314f, 80f, 364.6f, 89.23f, 411.26f, 108.25f)
        horizontalLineToRelative(0f)
        lineTo(448f, 124f)
        lineToRelative(22f, -44f)
        reflectiveCurveTo(463f, 76f, 442.3f, 67.82f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(409.66f, 140.85f)
        curveTo(364.15f, 122.52f, 308.16f, 112f, 256f, 112f)
        arcTo(425f, 425f, 0f, isMoreThanHalf = false, isPositiveArc = false, 102.3f, 140.9f)
        curveToRelative(-0.25f, 0.1f, -9.24f, 4.23f, -19f, 8.71f)
        curveToRelative(7.46f, 16.22f, 18f, 39.16f, 22.2f, 48.33f)
        lineTo(256f, 480f)
        lineTo(429.74f, 149.16f)
        lineToRelative(-19.92f, -8.24f)
        close()
        moveTo(224.41f, 194.07f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -34f, -34f)
        arcTo(32.12f, 32.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224.41f, 194.07f)
        close()
        moveTo(288.41f, 322.07f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -34f, -34f)
        arcTo(32.12f, 32.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 288.41f, 322.07f)
        close()
        moveTo(352.41f, 210.07f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -34f, -34f)
        arcTo(32.12f, 32.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 352.41f, 210.07f)
        close()
      }
    }.build()

    return _PizzaSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PizzaSharp: ImageVector? = null
