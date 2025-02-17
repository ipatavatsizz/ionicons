package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.CloudDone: ImageVector
  get() {
    if (_CloudDoneOutline != null) {
      return _CloudDoneOutline!!
    }
    _CloudDoneOutline = ImageVector.Builder(
      name = "Outline.CloudDoneOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(400f, 240f)
        curveToRelative(-8.89f, -89.54f, -71f, -144f, -144f, -144f)
        curveToRelative(-69f, 0f, -113.44f, 48.2f, -128f, 96f)
        curveTo(68f, 198f, 16f, 235.59f, 16f, 304f)
        curveToRelative(0f, 66f, 54f, 112f, 120f, 112f)
        horizontalLineTo(396f)
        curveToRelative(55f, 0f, 100f, -27.44f, 100f, -88f)
        curveTo(496f, 268.18f, 443f, 242.24f, 400f, 240f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(317f, 208f)
        lineToRelative(-107.8f, 128f)
        lineToRelative(-46.2f, -51.2f)
      }
    }.build()

    return _CloudDoneOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CloudDoneOutline: ImageVector? = null
