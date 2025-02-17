package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Ear: ImageVector
  get() {
    if (_EarOutline != null) {
      return _EarOutline!!
    }
    _EarOutline = ImageVector.Builder(
      name = "Outline.EarOutline",
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
        moveTo(335.72f, 330.76f)
        curveTo(381.73f, 299.5f, 416f, 251.34f, 416f, 192f)
        arcToRelative(160f, 160f, 0f, isMoreThanHalf = false, isPositiveArc = false, -320f, 0f)
        verticalLineTo(398.57f)
        curveTo(96f, 442.83f, 131.74f, 480f, 176f, 480f)
        horizontalLineToRelative(0f)
        curveToRelative(44.26f, 0f, 66.83f, -25.94f, 77.29f, -40f)
        curveTo(268.06f, 420.19f, 295f, 358.44f, 335.72f, 330.76f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 304f)
        verticalLineTo(184f)
        curveToRelative(0f, -48.4f, 43.2f, -88f, 96f, -88f)
        horizontalLineToRelative(0f)
        curveToRelative(52.8f, 0f, 96f, 39.6f, 96f, 88f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 239f)
        curveToRelative(25f, -18f, 79.82f, -15f, 79.82f, -15f)
        curveToRelative(26f, 0f, 41.17f, 29.42f, 26f, 50.6f)
        curveToRelative(0f, 0f, -36.86f, 42.4f, -41.86f, 61.4f)
      }
    }.build()

    return _EarOutline!!
  }

@Suppress("ObjectPropertyName")
private var _EarOutline: ImageVector? = null
