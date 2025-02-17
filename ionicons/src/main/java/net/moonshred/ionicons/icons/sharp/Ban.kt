package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Ban: ImageVector
  get() {
    if (_BanSharp != null) {
      return _BanSharp!!
    }
    _BanSharp = ImageVector.Builder(
      name = "Sharp.BanSharp",
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
        moveTo(432f, 256f)
        arcToRelative(
          175.09f,
          175.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -35.8f,
          106.26f
        )
        lineTo(149.74f, 115.8f)
        arcTo(175.09f, 175.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 80f)
        curveTo(353.05f, 80f, 432f, 159f, 432f, 256f)
        close()
        moveTo(80f, 256f)
        arcToRelative(
          175.09f,
          175.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          35.8f,
          -106.26f
        )
        lineTo(362.26f, 396.2f)
        arcTo(175.09f, 175.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 432f)
        curveTo(159f, 432f, 80f, 353.05f, 80f, 256f)
        close()
      }
    }.build()

    return _BanSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BanSharp: ImageVector? = null
