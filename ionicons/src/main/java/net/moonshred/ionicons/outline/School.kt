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

val Ionicons.Outline.School: ImageVector
  get() {
    if (_SchoolOutline != null) {
      return _SchoolOutline!!
    }
    _SchoolOutline = ImageVector.Builder(
      name = "Outline.SchoolOutline",
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
        moveTo(32f, 192f)
        lineToRelative(224f, -128f)
        lineToRelative(224f, 128f)
        lineToRelative(-224f, 128f)
        lineToRelative(-224f, -128f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 240f)
        lineToRelative(0f, 128f)
        lineToRelative(144f, 80f)
        lineToRelative(144f, -80f)
        lineToRelative(0f, -128f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(480f, 368f)
        lineTo(480f, 192f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 320f)
        lineTo(256f, 448f)
      }
    }.build()

    return _SchoolOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SchoolOutline: ImageVector? = null
