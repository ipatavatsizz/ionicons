package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Wine: ImageVector
  get() {
    if (_WineSharp != null) {
      return _WineSharp!!
    }
    _WineSharp = ImageVector.Builder(
      name = "Sharp.WineSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(453f, 112f)
        lineTo(453f, 66.33f)
        lineTo(60.75f, 66.33f)
        lineTo(60.75f, 112f)
        lineTo(235.88f, 288f)
        lineTo(235.88f, 406f)
        lineTo(124.75f, 406f)
        verticalLineToRelative(42f)
        lineTo(389f, 448f)
        lineTo(389f, 406f)
        lineTo(277.88f, 406f)
        lineTo(277.88f, 288f)
        close()
        moveTo(116.35f, 108.33f)
        horizontalLineToRelative(281f)
        lineToRelative(-37.81f, 38f)
        lineTo(154.16f, 146.33f)
        close()
      }
    }.build()

    return _WineSharp!!
  }

@Suppress("ObjectPropertyName")
private var _WineSharp: ImageVector? = null
