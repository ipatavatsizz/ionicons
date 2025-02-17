package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Cafe: ImageVector
  get() {
    if (_CafeSharp != null) {
      return _CafeSharp!!
    }
    _CafeSharp = ImageVector.Builder(
      name = "Sharp.CafeSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 64f)
        lineTo(80f, 64f)
        lineTo(80f, 318.34f)
        arcToRelative(
          19.83f,
          19.83f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          5.86f,
          14.14f
        )
        lineToRelative(29.65f, 29.66f)
        arcTo(19.87f, 19.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 129.66f, 368f)
        lineTo(334.34f, 368f)
        arcToRelative(
          19.87f,
          19.87f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          14.15f,
          -5.86f
        )
        lineToRelative(29.65f, -29.66f)
        arcTo(19.83f, 19.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 384f, 318.34f)
        lineTo(384f, 192f)
        horizontalLineToRelative(32f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, -4.69f)
        lineToRelative(32f, -32f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 464f, 144f)
        lineTo(464f, 80f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 448f, 64f)
        close()
        moveTo(432f, 137.37f)
        lineTo(409.37f, 160f)
        lineTo(384f, 160f)
        lineTo(384f, 96f)
        horizontalLineToRelative(48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 400f)
        horizontalLineToRelative(368f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-368f)
        close()
      }
    }.build()

    return _CafeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CafeSharp: ImageVector? = null
