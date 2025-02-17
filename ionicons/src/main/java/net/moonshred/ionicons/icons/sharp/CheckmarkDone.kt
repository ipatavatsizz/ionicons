package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CheckmarkDone: ImageVector
  get() {
    if (_CheckmarkDoneSharp != null) {
      return _CheckmarkDoneSharp!!
    }
    _CheckmarkDoneSharp = ImageVector.Builder(
      name = "Sharp.CheckmarkDoneSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(465f, 127f)
        lineToRelative(-224f, 257f)
        lineToRelative(-92f, -92f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(140f, 385f)
        lineTo(47f, 292f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 44f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(363f, 127f)
        lineTo(236f, 273f)
      }
    }.build()

    return _CheckmarkDoneSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CheckmarkDoneSharp: ImageVector? = null
