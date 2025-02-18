package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Checkmark: ImageVector
  get() {
    if (_Checkmark != null) {
      return _Checkmark!!
    }
    _Checkmark = ImageVector.Builder(
      name = "Filled.Checkmark",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(416f, 128f)
        lineToRelative(-224f, 256f)
        lineToRelative(-96f, -96f)
      }
    }.build()

    return _Checkmark!!
  }

@Suppress("ObjectPropertyName")
private var _Checkmark: ImageVector? = null
