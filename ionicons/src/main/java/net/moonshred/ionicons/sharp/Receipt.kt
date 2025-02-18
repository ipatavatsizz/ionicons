package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Receipt: ImageVector
  get() {
    if (_ReceiptSharp != null) {
      return _ReceiptSharp!!
    }
    _ReceiptSharp = ImageVector.Builder(
      name = "Sharp.ReceiptSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 48f)
        lineTo(416f, 32f)
        lineTo(384f, 48f)
        lineTo(352f, 32f)
        lineTo(320f, 48f)
        lineTo(288f, 32f)
        lineTo(256f, 48f)
        lineTo(224f, 32f)
        lineTo(192f, 48f)
        lineTo(144f, 32f)
        lineTo(144f, 288f)
        reflectiveCurveToRelative(0f, 0.05f, 0f, 0.05f)
        lineTo(368f, 288.05f)
        lineTo(368f, 424f)
        curveToRelative(0f, 30.93f, 33.07f, 56f, 64f, 56f)
        horizontalLineToRelative(12f)
        curveToRelative(30.93f, 0f, 52f, -25.07f, 52f, -56f)
        lineTo(496f, 32f)
        close()
        moveTo(272.5f, 240f)
        lineToRelative(-0.5f, -32f)
        lineTo(431.5f, 208f)
        lineToRelative(0.5f, 32f)
        close()
        moveTo(208.5f, 160f)
        lineTo(208f, 128f)
        lineTo(431.5f, 128f)
        lineToRelative(0.5f, 32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 424f)
        verticalLineTo(320f)
        horizontalLineTo(16f)
        verticalLineToRelative(32f)
        curveToRelative(0f, 50.55f, 5.78f, 71.62f, 14.46f, 87.63f)
        curveTo(45.19f, 466.8f, 71.86f, 480f, 112f, 480f)
        horizontalLineTo(368f)
        reflectiveCurveTo(336f, 460f, 336f, 424f)
        close()
      }
    }.build()

    return _ReceiptSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ReceiptSharp: ImageVector? = null
