package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Calculator: ImageVector
  get() {
    if (_CalculatorSharp != null) {
      return _CalculatorSharp!!
    }
    _CalculatorSharp = ImageVector.Builder(
      name = "Sharp.CalculatorSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 48f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        lineTo(112f, 32f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 48f)
        lineTo(96f, 464f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        lineTo(400f, 480f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        close()
        moveTo(192f, 432f)
        lineTo(144f, 432f)
        lineTo(144f, 384f)
        horizontalLineToRelative(48f)
        close()
        moveTo(192f, 352f)
        lineTo(144f, 352f)
        lineTo(144f, 304f)
        horizontalLineToRelative(48f)
        close()
        moveTo(192f, 272f)
        lineTo(144f, 272f)
        lineTo(144f, 224f)
        horizontalLineToRelative(48f)
        close()
        moveTo(280f, 432f)
        lineTo(232f, 432f)
        lineTo(232f, 384f)
        horizontalLineToRelative(48f)
        close()
        moveTo(280f, 352f)
        lineTo(232f, 352f)
        lineTo(232f, 304f)
        horizontalLineToRelative(48f)
        close()
        moveTo(280f, 272f)
        lineTo(232f, 272f)
        lineTo(232f, 224f)
        horizontalLineToRelative(48f)
        close()
        moveTo(368f, 432f)
        lineTo(320f, 432f)
        lineTo(320f, 304f)
        horizontalLineToRelative(48f)
        close()
        moveTo(368f, 272f)
        lineTo(320f, 272f)
        lineTo(320f, 224f)
        horizontalLineToRelative(48f)
        close()
        moveTo(368f, 176f)
        lineTo(144f, 176f)
        lineTo(144f, 80f)
        lineTo(368f, 80f)
        close()
      }
    }.build()

    return _CalculatorSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CalculatorSharp: ImageVector? = null
