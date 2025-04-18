package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Ban: ImageVector
  get() {
    if (_Ban != null) {
      return _Ban!!
    }
    _Ban = ImageVector.Builder(
      name = "Filled.Ban",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f
      ) {
        moveTo(256f, 256f)
        moveToRelative(-200f, 0f)
        arcToRelative(200f, 200f, 0f, isMoreThanHalf = true, isPositiveArc = true, 400f, 0f)
        arcToRelative(200f, 200f, 0f, isMoreThanHalf = true, isPositiveArc = true, -400f, 0f)
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f
      ) {
        moveTo(114.58f, 114.58f)
        lineTo(397.42f, 397.42f)
      }
    }.build()

    return _Ban!!
  }

@Suppress("ObjectPropertyName")
private var _Ban: ImageVector? = null
