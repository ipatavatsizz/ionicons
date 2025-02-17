package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.BowlingBall: ImageVector
  get() {
    if (_BowlingBallSharp != null) {
      return _BowlingBallSharp!!
    }
    _BowlingBallSharp = ImageVector.Builder(
      name = "Sharp.BowlingBallSharp",
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
        moveTo(286f, 230f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, -28f)
        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 286f, 230f)
        close()
        moveTo(294f, 154f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, -28f)
        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 294f, 154f)
        close()
        moveTo(362f, 198f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, -28f)
        arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 362f, 198f)
        close()
      }
    }.build()

    return _BowlingBallSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BowlingBallSharp: ImageVector? = null
