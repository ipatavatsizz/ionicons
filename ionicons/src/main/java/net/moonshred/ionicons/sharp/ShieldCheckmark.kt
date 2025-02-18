package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ShieldCheckmark: ImageVector
  get() {
    if (_ShieldCheckmarkSharp != null) {
      return _ShieldCheckmarkSharp!!
    }
    _ShieldCheckmarkSharp = ImageVector.Builder(
      name = "Sharp.ShieldCheckmarkSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(479.07f, 111.36f)
        lineToRelative(-0.79f, -12.53f)
        lineToRelative(-12.36f, -2.21f)
        curveToRelative(-86.5f, -15.52f, -122.61f, -26.74f, -203.33f, -63.2f)
        lineToRelative(-6.59f, -3f)
        lineToRelative(-6.59f, 3f)
        curveTo(168.69f, 69.88f, 132.58f, 81.1f, 46.08f, 96.62f)
        lineTo(33.72f, 98.83f)
        lineToRelative(-0.79f, 12.53f)
        curveToRelative(-3.85f, 61.11f, 4.36f, 118.05f, 24.43f, 169.24f)
        arcTo(349.47f, 349.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 129f, 393.11f)
        curveToRelative(53.47f, 56.73f, 110.24f, 81.37f, 121.07f, 85.73f)
        lineToRelative(6f, 2.41f)
        lineToRelative(6f, -2.41f)
        curveToRelative(10.83f, -4.36f, 67.6f, -29f, 121.07f, -85.73f)
        arcTo(349.47f, 349.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 454.64f, 280.6f)
        curveTo(474.71f, 229.41f, 482.92f, 172.47f, 479.07f, 111.36f)
        close()
        moveTo(226.16f, 327.36f)
        lineTo(153.37f, 256f)
        lineToRelative(22.4f, -22.86f)
        lineToRelative(48.47f, 47.49f)
        lineTo(334.37f, 153.43f)
        lineToRelative(24.2f, 20.94f)
        close()
      }
    }.build()

    return _ShieldCheckmarkSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ShieldCheckmarkSharp: ImageVector? = null
