package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Nuclear: ImageVector
  get() {
    if (_NuclearSharp != null) {
      return _NuclearSharp!!
    }
    _NuclearSharp = ImageVector.Builder(
      name = "Sharp.NuclearSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 256f)
        moveToRelative(-48f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -96f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(403.08f, 108.92f)
        arcTo(208f, 208f, 0f, isMoreThanHalf = false, isPositiveArc = false, 108.92f, 403.08f)
        arcTo(208f, 208f, 0f, isMoreThanHalf = false, isPositiveArc = false, 403.08f, 108.92f)
        close()
        moveTo(342f, 256f)
        arcToRelative(
          86.13f,
          86.13f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -53.47f,
          79.59f
        )
        lineToRelative(51.71f, 68f)
        arcToRelative(
          169.73f,
          169.73f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -168.48f,
          0f
        )
        lineToRelative(51.71f, -68f)
        arcToRelative(86f, 86f, 0f, isMoreThanHalf = false, isPositiveArc = true, -50.56f, -101.77f)
        lineToRelative(-85.48f, 0.09f)
        arcToRelative(
          170.21f,
          170.21f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          73.83f,
          -119f
        )
        lineTo(199.2f, 191.5f)
        arcToRelative(85.78f, 85.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 113.6f, 0f)
        lineToRelative(37.94f, -76.59f)
        arcToRelative(
          170.21f,
          170.21f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          73.83f,
          119f
        )
        lineToRelative(-85.48f, -0.09f)
        arcTo(85.87f, 85.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 342f, 256f)
        close()
      }
    }.build()

    return _NuclearSharp!!
  }

@Suppress("ObjectPropertyName")
private var _NuclearSharp: ImageVector? = null
