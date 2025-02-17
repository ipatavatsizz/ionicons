package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.CloudDownload: ImageVector
  get() {
    if (_CloudDownloadOutline != null) {
      return _CloudDownloadOutline!!
    }
    _CloudDownloadOutline = ImageVector.Builder(
      name = "Outline.CloudDownloadOutline",
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
        moveTo(320f, 336f)
        horizontalLineToRelative(76f)
        curveToRelative(55f, 0f, 100f, -21.21f, 100f, -75.6f)
        reflectiveCurveToRelative(-53f, -73.47f, -96f, -75.6f)
        curveTo(391.11f, 99.74f, 329f, 48f, 256f, 48f)
        curveToRelative(-69f, 0f, -113.44f, 45.79f, -128f, 91.2f)
        curveToRelative(-60f, 5.7f, -112f, 35.88f, -112f, 98.4f)
        reflectiveCurveTo(70f, 336f, 136f, 336f)
        horizontalLineToRelative(56f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(192f, 400.1f)
        lineToRelative(64f, 63.9f)
        lineToRelative(64f, -63.9f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 224f)
        lineTo(256f, 448.03f)
      }
    }.build()

    return _CloudDownloadOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CloudDownloadOutline: ImageVector? = null
