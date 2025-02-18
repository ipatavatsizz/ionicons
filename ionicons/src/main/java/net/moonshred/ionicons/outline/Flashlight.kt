package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Flashlight: ImageVector
  get() {
    if (_FlashlightOutline != null) {
      return _FlashlightOutline!!
    }
    _FlashlightOutline = ImageVector.Builder(
      name = "Outline.FlashlightOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(456.64f, 162.86f)
        lineTo(349.12f, 55.36f)
        curveToRelative(-13.15f, -13.14f, -28.68f, -7.17f, -41.82f, 6f)
        lineToRelative(-11.95f, 12f)
        curveToRelative(-26.13f, 26.13f, -27.62f, 58.38f, -29.42f, 83.31f)
        curveToRelative(-0.89f, 12.24f, -9.78f, 27.55f, -18.51f, 36.28f)
        lineTo(58.58f, 381.67f)
        curveTo(42.23f, 398f, 45.89f, 421.09f, 62.31f, 437.51f)
        lineToRelative(12.17f, 12.17f)
        curveToRelative(16.36f, 16.35f, 39.43f, 20.16f, 55.86f, 3.74f)
        lineToRelative(188.83f, -188.8f)
        curveToRelative(8.74f, -8.74f, 24f, -17.55f, 36.29f, -18.52f)
        curveToRelative(24.87f, -1.86f, 58.62f, -4.85f, 83.26f, -29.49f)
        lineToRelative(11.94f, -11.94f)
        curveTo(463.81f, 191.53f, 469.78f, 176f, 456.64f, 162.86f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(224.68f, 287.28f)
        moveToRelative(-20f, 0f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(289f, 81f)
        lineTo(431f, 223f)
      }
    }.build()

    return _FlashlightOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FlashlightOutline: ImageVector? = null
