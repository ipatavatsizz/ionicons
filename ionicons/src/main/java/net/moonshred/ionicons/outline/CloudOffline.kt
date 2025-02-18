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

val Ionicons.Outline.CloudOffline: ImageVector
  get() {
    if (_CloudOfflineOutline != null) {
      return _CloudOfflineOutline!!
    }
    _CloudOfflineOutline = ImageVector.Builder(
      name = "Outline.CloudOfflineOutline",
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
        moveTo(93.72f, 183.25f)
        curveTo(49.49f, 198.05f, 16f, 233.1f, 16f, 288f)
        curveToRelative(0f, 66f, 54f, 112f, 120f, 112f)
        horizontalLineTo(320.37f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(467.82f, 377.74f)
        curveTo(485.24f, 363.3f, 496f, 341.61f, 496f, 312f)
        curveToRelative(0f, -59.82f, -53f, -85.76f, -96f, -88f)
        curveToRelative(-8.89f, -89.54f, -71f, -144f, -144f, -144f)
        curveToRelative(-26.16f, 0f, -48.79f, 6.93f, -67.6f, 18.14f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(448f, 448f)
        lineTo(64f, 64f)
      }
    }.build()

    return _CloudOfflineOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CloudOfflineOutline: ImageVector? = null
