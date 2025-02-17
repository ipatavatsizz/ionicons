package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ShieldCheckmark: ImageVector
  get() {
    if (_ShieldCheckmarkOutline != null) {
      return _ShieldCheckmarkOutline!!
    }
    _ShieldCheckmarkOutline = ImageVector.Builder(
      name = "Outline.ShieldCheckmarkOutline",
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
        moveTo(336f, 176f)
        lineToRelative(-110.8f, 128f)
        lineToRelative(-49.2f, -48.2f)
      }
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
    }.build()

    return _ShieldCheckmarkOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ShieldCheckmarkOutline: ImageVector? = null
