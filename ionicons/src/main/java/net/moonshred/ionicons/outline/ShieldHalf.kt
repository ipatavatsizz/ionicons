package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ShieldHalf: ImageVector
  get() {
    if (_ShieldHalfOutline != null) {
      return _ShieldHalfOutline!!
    }
    _ShieldHalfOutline = ImageVector.Builder(
      name = "Outline.ShieldHalfOutline",
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
        moveTo(463.1f, 112.37f)
        curveTo(373.68f, 96.33f, 336.71f, 84.45f, 256f, 48f)
        curveTo(175.29f, 84.45f, 138.32f, 96.33f, 48.9f, 112.37f)
        curveTo(32.7f, 369.13f, 240.58f, 457.79f, 256f, 464f)
        curveTo(271.42f, 457.79f, 479.3f, 369.13f, 463.1f, 112.37f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveTo(175.29f, 84.45f, 138.32f, 96.33f, 48.9f, 112.37f)
        curveTo(32.7f, 369.13f, 240.58f, 457.79f, 256f, 464f)
        close()
      }
    }.build()

    return _ShieldHalfOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ShieldHalfOutline: ImageVector? = null
