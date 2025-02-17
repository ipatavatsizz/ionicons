package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Layers: ImageVector
  get() {
    if (_LayersOutline != null) {
      return _LayersOutline!!
    }
    _LayersOutline = ImageVector.Builder(
      name = "Outline.LayersOutline",
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
        moveTo(434.8f, 137.65f)
        lineTo(285.44f, 69.55f)
        curveToRelative(-16.19f, -7.4f, -42.69f, -7.4f, -58.88f, 0f)
        lineTo(77.3f, 137.65f)
        curveToRelative(-17.6f, 8f, -17.6f, 21.09f, 0f, 29.09f)
        lineToRelative(148f, 67.5f)
        curveToRelative(16.89f, 7.7f, 44.69f, 7.7f, 61.58f, 0f)
        lineToRelative(148f, -67.5f)
        curveTo(452.4f, 158.74f, 452.4f, 145.64f, 434.8f, 137.65f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 308.52f)
        lineTo(77.3f, 345.63f)
        curveToRelative(-17.6f, 8f, -17.6f, 21.1f, 0f, 29.1f)
        lineToRelative(148f, 67.5f)
        curveToRelative(16.89f, 7.69f, 44.69f, 7.69f, 61.58f, 0f)
        lineToRelative(148f, -67.5f)
        curveToRelative(17.6f, -8f, 17.6f, -21.1f, 0f, -29.1f)
        lineToRelative(-79.94f, -38.47f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 204.48f)
        lineTo(77.2f, 241.64f)
        curveToRelative(-17.6f, 8f, -17.6f, 21.1f, 0f, 29.1f)
        lineToRelative(148f, 67.49f)
        curveToRelative(16.89f, 7.7f, 44.69f, 7.7f, 61.58f, 0f)
        lineToRelative(148f, -67.49f)
        curveToRelative(17.7f, -8f, 17.7f, -21.1f, 0.1f, -29.1f)
        lineTo(352f, 204.48f)
      }
    }.build()

    return _LayersOutline!!
  }

@Suppress("ObjectPropertyName")
private var _LayersOutline: ImageVector? = null
