package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.ChevronBack: ImageVector
  get() {
    if (_ChevronBack != null) {
      return _ChevronBack!!
    }
    _ChevronBack = ImageVector.Builder(
      name = "Filled.ChevronBack",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(328f, 112f)
        lineToRelative(-144f, 144f)
        lineToRelative(144f, 144f)
      }
    }.build()

    return _ChevronBack!!
  }

@Suppress("ObjectPropertyName")
private var _ChevronBack: ImageVector? = null
