package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Sad: ImageVector
  get() {
    if (_SadSharp != null) {
      return _SadSharp!!
    }
    _SadSharp = ImageVector.Builder(
      name = "Sharp.SadSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(414.39f, 97.61f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = true, isPositiveArc = false, 97.61f, 414.39f)
        arcTo(224f, 224f, 0f, isMoreThanHalf = true, isPositiveArc = false, 414.39f, 97.61f)
        close()
        moveTo(328f, 208f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 24f)
        arcTo(23.94f, 23.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 328f, 208f)
        close()
        moveTo(184f, 208f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 24f)
        arcTo(23.94f, 23.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 184f, 208f)
        close()
        moveTo(256f, 288f)
        curveToRelative(45.42f, 0f, 83.75f, 29.49f, 95.72f, 69.83f)
        curveToRelative(1f, 3.52f, 2.33f, 10.17f, 2.33f, 10.17f)
        lineTo(158f, 368f)
        reflectiveCurveToRelative(1.31f, -6.69f, 2.33f, -10.17f)
        curveTo(172.11f, 317.47f, 210.53f, 288f, 256f, 288f)
        close()
      }
    }.build()

    return _SadSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SadSharp: ImageVector? = null
