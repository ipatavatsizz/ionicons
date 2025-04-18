package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Shield: ImageVector
  get() {
    if (_ShieldOutline != null) {
      return _ShieldOutline!!
    }
    _ShieldOutline = ImageVector.Builder(
      name = "Outline.ShieldOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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
    }.build()

    return _ShieldOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ShieldOutline: ImageVector? = null
