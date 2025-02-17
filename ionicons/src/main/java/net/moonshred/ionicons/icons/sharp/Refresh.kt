package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Refresh: ImageVector
  get() {
    if (_RefreshSharp != null) {
      return _RefreshSharp!!
    }
    _RefreshSharp = ImageVector.Builder(
      name = "Sharp.RefreshSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(320f, 146f)
        reflectiveCurveToRelative(24.36f, -12f, -64f, -12f)
        arcTo(160f, 160f, 0f, isMoreThanHalf = true, isPositiveArc = false, 416f, 294f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(256f, 58f)
        lineToRelative(80f, 80f)
        lineToRelative(-80f, 80f)
      }
    }.build()

    return _RefreshSharp!!
  }

@Suppress("ObjectPropertyName")
private var _RefreshSharp: ImageVector? = null
