package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Shuffle: ImageVector
  get() {
    if (_ShuffleSharp != null) {
      return _ShuffleSharp!!
    }
    _ShuffleSharp = ImageVector.Builder(
      name = "Sharp.ShuffleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(400f, 304f)
        lineToRelative(48f, 48f)
        lineToRelative(-48f, 48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(400f, 112f)
        lineToRelative(48f, 48f)
        lineToRelative(-48f, 48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(64f, 352f)
        lineToRelative(128f, 0f)
        lineToRelative(60f, -92f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(64f, 160f)
        lineToRelative(128f, 0f)
        lineToRelative(128f, 192f)
        lineToRelative(96f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(416f, 160f)
        lineToRelative(-96f, 0f)
        lineToRelative(-32f, 48f)
      }
    }.build()

    return _ShuffleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ShuffleSharp: ImageVector? = null
