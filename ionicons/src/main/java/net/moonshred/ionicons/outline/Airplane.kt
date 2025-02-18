package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Airplane: ImageVector
  get() {
    if (_AirplaneOutline != null) {
      return _AirplaneOutline!!
    }
    _AirplaneOutline = ImageVector.Builder(
      name = "Outline.AirplaneOutline",
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
        moveTo(407.72f, 224f)
        curveToRelative(-3.4f, 0f, -14.79f, 0.1f, -18f, 0.3f)
        lineToRelative(-64.9f, 1.7f)
        arcToRelative(1.83f, 1.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.69f, -0.9f)
        lineTo(193.55f, 67.56f)
        arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 186.89f, 64f)
        horizontalLineTo(160f)
        lineToRelative(73f, 161f)
        arcToRelative(2.35f, 2.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.26f, 3.35f)
        lineToRelative(-121.69f, 1.8f)
        arcToRelative(8.06f, 8.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.6f, -3.1f)
        lineToRelative(-37f, -45f)
        curveToRelative(-3f, -3.9f, -8.62f, -6f, -13.51f, -6f)
        horizontalLineTo(33.08f)
        curveToRelative(-1.29f, 0f, -1.1f, 1.21f, -0.75f, 2.43f)
        lineTo(52.17f, 249.9f)
        arcToRelative(16.3f, 16.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.9f)
        lineTo(32.31f, 333f)
        curveToRelative(-0.59f, 1.95f, -0.52f, 3f, 1.77f, 3f)
        horizontalLineTo(52f)
        curveToRelative(8.14f, 0f, 9.25f, -1.06f, 13.41f, -6.3f)
        lineToRelative(37.7f, -45.7f)
        arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.6f, -3.1f)
        lineToRelative(120.68f, 2.7f)
        arcToRelative(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.43f, 3.74f)
        lineTo(160f, 448f)
        horizontalLineToRelative(26.64f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.65f, -3.55f)
        lineTo(323.14f, 287f)
        curveToRelative(0.39f, -0.6f, 2f, -0.9f, 2.69f, -0.9f)
        lineToRelative(63.9f, 1.7f)
        curveToRelative(3.3f, 0.2f, 14.59f, 0.3f, 18f, 0.3f)
        curveTo(452f, 288.1f, 480f, 275.93f, 480f, 256f)
        reflectiveCurveTo(452.12f, 224f, 407.72f, 224f)
        close()
      }
    }.build()

    return _AirplaneOutline!!
  }

@Suppress("ObjectPropertyName")
private var _AirplaneOutline: ImageVector? = null
