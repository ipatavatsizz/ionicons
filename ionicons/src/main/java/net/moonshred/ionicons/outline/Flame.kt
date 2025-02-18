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

val Ionicons.Outline.Flame: ImageVector
  get() {
    if (_FlameOutline != null) {
      return _FlameOutline!!
    }
    _FlameOutline = ImageVector.Builder(
      name = "Outline.FlameOutline",
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
        moveTo(112f, 320f)
        curveToRelative(0f, -93f, 124f, -165f, 96f, -272f)
        curveToRelative(66f, 0f, 192f, 96f, 192f, 272f)
        arcToRelative(144f, 144f, 0f, isMoreThanHalf = false, isPositiveArc = true, -288f, 0f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 368f)
        curveToRelative(0f, 57.71f, -32f, 80f, -64f, 80f)
        reflectiveCurveToRelative(-64f, -22.29f, -64f, -80f)
        reflectiveCurveToRelative(40f, -86f, 32f, -128f)
        curveTo(266f, 240f, 320f, 310.29f, 320f, 368f)
        close()
      }
    }.build()

    return _FlameOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FlameOutline: ImageVector? = null
