package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Hourglass: ImageVector
  get() {
    if (_HourglassOutline != null) {
      return _HourglassOutline!!
    }
    _HourglassOutline = ImageVector.Builder(
      name = "Outline.HourglassOutline",
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
        moveTo(145.61f, 464f)
        horizontalLineTo(366.39f)
        curveToRelative(19.8f, 0f, 35.55f, -16.29f, 33.42f, -35.06f)
        curveTo(386.06f, 308f, 304f, 310f, 304f, 256f)
        reflectiveCurveToRelative(83.11f, -51f, 95.8f, -172.94f)
        curveToRelative(2f, -18.78f, -13.61f, -35.06f, -33.41f, -35.06f)
        horizontalLineTo(145.61f)
        curveToRelative(-19.8f, 0f, -35.37f, 16.28f, -33.41f, 35.06f)
        curveTo(124.89f, 205f, 208f, 201f, 208f, 256f)
        reflectiveCurveToRelative(-82.06f, 52f, -95.8f, 172.94f)
        curveTo(110.06f, 447.71f, 125.81f, 464f, 145.61f, 464f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(343.3f, 432f)
        horizontalLineTo(169.13f)
        curveToRelative(-15.6f, 0f, -20f, -18f, -9.06f, -29.16f)
        curveTo(186.55f, 376f, 240f, 356.78f, 240f, 326f)
        verticalLineTo(224f)
        curveToRelative(0f, -19.85f, -38f, -35f, -61.51f, -67.2f)
        curveToRelative(-3.88f, -5.31f, -3.49f, -12.8f, 6.37f, -12.8f)
        horizontalLineTo(327.59f)
        curveToRelative(8.41f, 0f, 10.23f, 7.43f, 6.4f, 12.75f)
        curveTo(310.82f, 189f, 272f, 204.05f, 272f, 224f)
        verticalLineTo(326f)
        curveToRelative(0f, 30.53f, 55.71f, 47f, 80.4f, 76.87f)
        curveTo(362.35f, 414.91f, 358.87f, 432f, 343.3f, 432f)
        close()
      }
    }.build()

    return _HourglassOutline!!
  }

@Suppress("ObjectPropertyName")
private var _HourglassOutline: ImageVector? = null
