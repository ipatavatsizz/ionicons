package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Repeat: ImageVector
  get() {
    if (_RepeatSharp != null) {
      return _RepeatSharp!!
    }
    _RepeatSharp = ImageVector.Builder(
      name = "Sharp.RepeatSharp",
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
        moveTo(320f, 120f)
        lineToRelative(48f, 48f)
        lineToRelative(-48f, 48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(352f, 168f)
        lineToRelative(-288f, 0f)
        lineToRelative(0f, 96f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(192f, 392f)
        lineToRelative(-48f, -48f)
        lineToRelative(48f, -48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(160f, 344f)
        lineToRelative(288f, 0f)
        lineToRelative(0f, -96f)
      }
    }.build()

    return _RepeatSharp!!
  }

@Suppress("ObjectPropertyName")
private var _RepeatSharp: ImageVector? = null
