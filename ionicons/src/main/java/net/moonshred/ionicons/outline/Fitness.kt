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

val Ionicons.Outline.Fitness: ImageVector
  get() {
    if (_FitnessOutline != null) {
      return _FitnessOutline!!
    }
    _FitnessOutline = ImageVector.Builder(
      name = "Outline.FitnessOutline",
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
        moveTo(352.92f, 80f)
        curveTo(288f, 80f, 256f, 144f, 256f, 144f)
        reflectiveCurveToRelative(-32f, -64f, -96.92f, -64f)
        curveTo(106.32f, 80f, 64.54f, 124.14f, 64f, 176.81f)
        curveToRelative(-1.1f, 109.33f, 86.73f, 187.08f, 183f, 252.42f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 0f)
        curveToRelative(96.26f, -65.34f, 184.09f, -143.09f, 183f, -252.42f)
        curveTo(447.46f, 124.14f, 405.68f, 80f, 352.92f, 80f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 256f)
        lineToRelative(112f, 0f)
        lineToRelative(48f, -96f)
        lineToRelative(48f, 160f)
        lineToRelative(48f, -96f)
        lineToRelative(32f, 64f)
        lineToRelative(128f, 0f)
      }
    }.build()

    return _FitnessOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FitnessOutline: ImageVector? = null
