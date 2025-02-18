package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Pint: ImageVector
  get() {
    if (_PintOutline != null) {
      return _PintOutline!!
    }
    _PintOutline = ImageVector.Builder(
      name = "Outline.PintOutline",
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
        moveTo(132.43f, 162f)
        curveToRelative(-6.24f, -34f, -4.49f, -45.55f, -3.07f, -68.39f)
        lineTo(132.27f, 47f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.94f, -15f)
        horizontalLineTo(363.78f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.94f, 15f)
        lineToRelative(2.91f, 46.61f)
        curveToRelative(1.43f, 22.86f, 3.19f, 34.39f, -3.06f, 68.45f)
        curveToRelative(-5.93f, 32.29f, -43.71f, 133.27f, -43.71f, 238.32f)
        verticalLineTo(472f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
        horizontalLineTo(184.12f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
        verticalLineTo(400.37f)
        curveTo(176.13f, 307.9f, 138.66f, 196.07f, 132.43f, 162f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(135.21f, 96f)
        lineTo(376.79f, 96f)
      }
    }.build()

    return _PintOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PintOutline: ImageVector? = null
