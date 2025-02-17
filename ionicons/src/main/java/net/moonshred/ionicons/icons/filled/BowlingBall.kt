package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.BowlingBall: ImageVector
  get() {
    if (_BowlingBall != null) {
      return _BowlingBall!!
    }
    _BowlingBall = ImageVector.Builder(
      name = "Filled.BowlingBall",
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
        moveTo(288f, 224f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, -24f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 288f, 224f)
        close()
        moveTo(296f, 152f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, -24f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 296f, 152f)
        close()
        moveTo(360f, 192f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, -24f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 360f, 192f)
        close()
      }
    }.build()

    return _BowlingBall!!
  }

@Suppress("ObjectPropertyName")
private var _BowlingBall: ImageVector? = null
