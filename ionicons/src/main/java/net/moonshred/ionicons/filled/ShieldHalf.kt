package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.ShieldHalf: ImageVector
  get() {
    if (_ShieldHalf != null) {
      return _ShieldHalf!!
    }
    _ShieldHalf = ImageVector.Builder(
      name = "Filled.ShieldHalf",
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
        moveTo(48.9f, 112.37f)
        curveTo(138.32f, 96.33f, 175.29f, 84.45f, 256f, 48f)
        curveToRelative(80.71f, 36.45f, 117.68f, 48.33f, 207.1f, 64.37f)
        curveTo(479.3f, 369.13f, 271.42f, 457.79f, 256f, 464f)
        curveTo(240.58f, 457.79f, 32.7f, 369.13f, 48.9f, 112.37f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        curveToRelative(80.71f, 36.45f, 117.68f, 48.33f, 207.1f, 64.37f)
        curveTo(479.3f, 369.13f, 271.42f, 457.79f, 256f, 464f)
        close()
      }
    }.build()

    return _ShieldHalf!!
  }

@Suppress("ObjectPropertyName")
private var _ShieldHalf: ImageVector? = null
