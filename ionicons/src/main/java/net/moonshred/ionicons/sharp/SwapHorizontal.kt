package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.SwapHorizontal: ImageVector
  get() {
    if (_SwapHorizontalSharp != null) {
      return _SwapHorizontalSharp!!
    }
    _SwapHorizontalSharp = ImageVector.Builder(
      name = "Sharp.SwapHorizontalSharp",
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
        moveTo(304f, 48f)
        lineToRelative(112f, 112f)
        lineToRelative(-112f, 112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(398.87f, 160f)
        lineTo(96f, 160f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(208f, 464f)
        lineToRelative(-112f, -112f)
        lineToRelative(112f, -112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(114f, 352f)
        lineTo(416f, 352f)
      }
    }.build()

    return _SwapHorizontalSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SwapHorizontalSharp: ImageVector? = null
