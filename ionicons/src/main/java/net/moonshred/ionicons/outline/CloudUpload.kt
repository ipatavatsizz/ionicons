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

val Ionicons.Outline.CloudUpload: ImageVector
  get() {
    if (_CloudUploadOutline != null) {
      return _CloudUploadOutline!!
    }
    _CloudUploadOutline = ImageVector.Builder(
      name = "Outline.CloudUploadOutline",
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
        moveTo(320f, 367.79f)
        horizontalLineToRelative(76f)
        curveToRelative(55f, 0f, 100f, -29.21f, 100f, -83.6f)
        reflectiveCurveToRelative(-53f, -81.47f, -96f, -83.6f)
        curveToRelative(-8.89f, -85.06f, -71f, -136.8f, -144f, -136.8f)
        curveToRelative(-69f, 0f, -113.44f, 45.79f, -128f, 91.2f)
        curveToRelative(-60f, 5.7f, -112f, 43.88f, -112f, 106.4f)
        reflectiveCurveToRelative(54f, 106.4f, 120f, 106.4f)
        horizontalLineToRelative(56f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 255.79f)
        lineToRelative(-64f, -64f)
        lineToRelative(-64f, 64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 448.21f)
        lineTo(256f, 207.79f)
      }
    }.build()

    return _CloudUploadOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CloudUploadOutline: ImageVector? = null
