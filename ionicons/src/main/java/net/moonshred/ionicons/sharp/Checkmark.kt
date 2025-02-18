package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Checkmark: ImageVector
  get() {
    if (_CheckmarkSharp != null) {
      return _CheckmarkSharp!!
    }
    _CheckmarkSharp = ImageVector.Builder(
      name = "Sharp.CheckmarkSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(416f, 128f)
        lineToRelative(-224f, 256f)
        lineToRelative(-96f, -96f)
      }
    }.build()

    return _CheckmarkSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CheckmarkSharp: ImageVector? = null
