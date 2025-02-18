package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Resize: ImageVector
  get() {
    if (_ResizeSharp != null) {
      return _ResizeSharp!!
    }
    _ResizeSharp = ImageVector.Builder(
      name = "Sharp.ResizeSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(304f, 96f)
        lineToRelative(112f, 0f)
        lineToRelative(0f, 112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(405.77f, 106.2f)
        lineTo(111.98f, 400.02f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(208f, 416f)
        lineToRelative(-112f, 0f)
        lineToRelative(0f, -112f)
      }
    }.build()

    return _ResizeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ResizeSharp: ImageVector? = null
