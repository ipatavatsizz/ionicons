package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.SwapVertical: ImageVector
  get() {
    if (_SwapVerticalSharp != null) {
      return _SwapVerticalSharp!!
    }
    _SwapVerticalSharp = ImageVector.Builder(
      name = "Sharp.SwapVerticalSharp",
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
        moveTo(464f, 208f)
        lineToRelative(-112f, -112f)
        lineToRelative(-112f, 112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(352f, 113.13f)
        lineTo(352f, 416f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(48f, 304f)
        lineToRelative(112f, 112f)
        lineToRelative(112f, -112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(160f, 398f)
        lineTo(160f, 96f)
      }
    }.build()

    return _SwapVerticalSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SwapVerticalSharp: ImageVector? = null
