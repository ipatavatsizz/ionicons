package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Menu: ImageVector
  get() {
    if (_Menu != null) {
      return _Menu!!
    }
    _Menu = ImageVector.Builder(
      name = "Filled.Menu",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(88f, 152f)
        lineTo(424f, 152f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(88f, 256f)
        lineTo(424f, 256f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(88f, 360f)
        lineTo(424f, 360f)
      }
    }.build()

    return _Menu!!
  }

@Suppress("ObjectPropertyName")
private var _Menu: ImageVector? = null
