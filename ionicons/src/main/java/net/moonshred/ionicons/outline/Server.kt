package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Server: ImageVector
  get() {
    if (_ServerOutline != null) {
      return _ServerOutline!!
    }
    _ServerOutline = ImageVector.Builder(
      name = "Outline.ServerOutline",
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
        moveTo(80f, 112f)
        arcToRelative(176f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, 352f, 0f)
        arcToRelative(176f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, -352f, 0f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(432f, 112f)
        curveTo(432f, 112f, 432f, 376.05f, 432f, 400f)
        curveTo(432f, 444.18f, 353.2f, 480f, 256f, 480f)
        curveTo(158.8f, 480f, 80f, 444.18f, 80f, 400f)
        curveTo(80f, 378.17f, 80f, 112f, 80f, 112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(432f, 256f)
        curveTo(432f, 300.18f, 353.2f, 336f, 256f, 336f)
        curveTo(158.8f, 336f, 80f, 300.18f, 80f, 256f)
      }
    }.build()

    return _ServerOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ServerOutline: ImageVector? = null
