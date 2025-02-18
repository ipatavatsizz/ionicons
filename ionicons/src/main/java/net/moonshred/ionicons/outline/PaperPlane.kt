package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.PaperPlane: ImageVector
  get() {
    if (_PaperPlaneOutline != null) {
      return _PaperPlaneOutline!!
    }
    _PaperPlaneOutline = ImageVector.Builder(
      name = "Outline.PaperPlaneOutline",
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
        moveTo(53.12f, 199.94f)
        lineToRelative(400f, -151.39f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.33f, 10.33f)
        lineToRelative(-151.39f, 400f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15f, -0.34f)
        lineTo(229.66f, 292.45f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.11f, -10.11f)
        lineTo(53.46f, 215f)
        arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 53.12f, 199.94f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(460f, 52f)
        lineTo(227f, 285f)
      }
    }.build()

    return _PaperPlaneOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PaperPlaneOutline: ImageVector? = null
