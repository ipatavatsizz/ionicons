package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Wifi: ImageVector
  get() {
    if (_WifiOutline != null) {
      return _WifiOutline!!
    }
    _WifiOutline = ImageVector.Builder(
      name = "Outline.WifiOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(318.59f, 363.5f)
        lineTo(256f, 424f)
        lineTo(193.41f, 363.5f)
        curveTo(193.41f, 363.5f, 212f, 336f, 256f, 336f)
        curveTo(300f, 336f, 318.59f, 363.5f, 318.59f, 363.5f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(407.31f, 278f)
        lineTo(372f, 312f)
        curveTo(372f, 312f, 331f, 266f, 256f, 266f)
        curveTo(181f, 266f, 140f, 312f, 140f, 312f)
        lineTo(104.69f, 278f)
        curveTo(104.69f, 278f, 142.5f, 214f, 256f, 214f)
        curveTo(369.5f, 214f, 407.31f, 278f, 407.31f, 278f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(496f, 192f)
        lineTo(459.31f, 227.5f)
        curveTo(459.31f, 227.5f, 386.5f, 141f, 256f, 141f)
        curveTo(125.5f, 141f, 52.69f, 227.5f, 52.69f, 227.5f)
        lineTo(16f, 192f)
        curveTo(16f, 192f, 88f, 88f, 256f, 88f)
        curveTo(424f, 88f, 496f, 192f, 496f, 192f)
        close()
      }
    }.build()

    return _WifiOutline!!
  }

@Suppress("ObjectPropertyName")
private var _WifiOutline: ImageVector? = null
