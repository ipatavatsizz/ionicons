package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Cut: ImageVector
  get() {
    if (_CutSharp != null) {
      return _CutSharp!!
    }
    _CutSharp = ImageVector.Builder(
      name = "Sharp.CutSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 128f)
        lineTo(432f, 128f)
        lineTo(233.06f, 198.46f)
        lineToRelative(-59.13f, -31.59f)
        arcToRelative(
          72.16f,
          72.16f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = false,
          -25.69f,
          41.47f
        )
        lineToRelative(52.2f, 31.72f)
        lineTo(192f, 277f)
        lineToRelative(-43.64f, 26.76f)
        arcToRelative(71.74f, 71.74f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24.79f, 38f)
        lineTo(480f, 160f)
        close()
        moveTo(103.48f, 192f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, -40f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.48f, 192f)
        close()
        moveTo(103.48f, 400f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, -40f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 103.48f, 400f)
        close()
        moveTo(255.48f, 256f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 255.48f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(343.79f, 259.87f)
        lineToRelative(-83.74f, 48.18f)
        lineToRelative(171.95f, 59.95f)
        lineToRelative(47.99f, 0f)
        lineToRelative(0.01f, -32f)
        lineToRelative(-136.21f, -76.13f)
        close()
      }
    }.build()

    return _CutSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CutSharp: ImageVector? = null
