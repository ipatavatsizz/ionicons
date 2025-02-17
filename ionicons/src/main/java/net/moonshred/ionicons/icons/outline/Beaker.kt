package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Beaker: ImageVector
  get() {
    if (_BeakerOutline != null) {
      return _BeakerOutline!!
    }
    _BeakerOutline = ImageVector.Builder(
      name = "Outline.BeakerOutline",
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
        moveTo(445.2f, 48.05f)
        lineTo(398f, 48f)
        horizontalLineTo(128f)
        curveTo(73.7f, 48f, 64f, 83.7f, 64f, 96f)
        curveToRelative(30.3f, 4.2f, 48f, 8f, 48f, 40f)
        verticalLineTo(400f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 464f)
        horizontalLineTo(368f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
        verticalLineTo(96f)
        curveToRelative(0f, -19f, 11.5f, -38.35f, 12.6f, -40f)
        curveToRelative(1.2f, -1.9f, 3.4f, -4.4f, 3.4f, -5.5f)
        reflectiveCurveTo(447.7f, 48.05f, 445.2f, 48.05f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 176f)
        lineTo(432f, 176f)
      }
    }.build()

    return _BeakerOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BeakerOutline: ImageVector? = null
