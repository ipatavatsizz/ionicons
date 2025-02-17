package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Move: ImageVector
  get() {
    if (_MoveSharp != null) {
      return _MoveSharp!!
    }
    _MoveSharp = ImageVector.Builder(
      name = "Sharp.MoveSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(176f, 112f)
        lineToRelative(80f, -80f)
        lineToRelative(80f, 80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(255.98f, 32f)
        lineTo(256f, 480f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(176f, 400f)
        lineToRelative(80f, 80f)
        lineToRelative(80f, -80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(400f, 176f)
        lineToRelative(80f, 80f)
        lineToRelative(-80f, 80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(112f, 176f)
        lineToRelative(-80f, 80f)
        lineToRelative(80f, 80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(32f, 256f)
        lineTo(480f, 256f)
      }
    }.build()

    return _MoveSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MoveSharp: ImageVector? = null
