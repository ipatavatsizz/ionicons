package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Flame: ImageVector
  get() {
    if (_FlameSharp != null) {
      return _FlameSharp!!
    }
    _FlameSharp = ImageVector.Builder(
      name = "Sharp.FlameSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(394.24f, 197.56f)
        arcToRelative(
          300.67f,
          300.67f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -53.38f,
          -90f
        )
        curveTo(301.2f, 61.65f, 240f, 32f, 192f, 32f)
        curveToRelative(19f, 70f, -14.36f, 117.12f, -44.79f, 163.77f)
        curveTo(122f, 234.36f, 96f, 274.27f, 96f, 320f)
        curveToRelative(0f, 88.22f, 71.78f, 160f, 160f, 160f)
        reflectiveCurveToRelative(160f, -71.78f, 160f, -160f)
        curveTo(416f, 276.7f, 408.68f, 235.51f, 394.24f, 197.56f)
        close()
        moveTo(288.33f, 418.69f)
        curveTo(278f, 429.69f, 265.05f, 432f, 256f, 432f)
        reflectiveCurveToRelative(-22f, -2.31f, -32.33f, -13.31f)
        reflectiveCurveTo(208f, 390.24f, 208f, 368f)
        curveToRelative(0f, -25.14f, 8.82f, -44.28f, 17.34f, -62.78f)
        curveToRelative(6.48f, -14.07f, 14.66f, -27.22f, 15.11f, -44.49f)
        curveToRelative(11.3f, 5.88f, 23.67f, 16.91f, 34.54f, 31.28f)
        curveToRelative(18.17f, 24f, 29f, 52.42f, 29f, 76f)
        curveTo(304f, 390.24f, 298.58f, 407.77f, 288.33f, 418.69f)
        close()
      }
    }.build()

    return _FlameSharp!!
  }

@Suppress("ObjectPropertyName")
private var _FlameSharp: ImageVector? = null
