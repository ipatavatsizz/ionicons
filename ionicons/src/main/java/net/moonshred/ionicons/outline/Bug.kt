package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Bug: ImageVector
  get() {
    if (_BugOutline != null) {
      return _BugOutline!!
    }
    _BugOutline = ImageVector.Builder(
      name = "Outline.BugOutline",
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
        moveTo(370f, 378f)
        curveToRelative(28.89f, 23.52f, 46f, 46.07f, 46f, 86f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(142f, 378f)
        curveToRelative(-28.89f, 23.52f, -46f, 46.06f, -46f, 86f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(384f, 208f)
        curveToRelative(28.89f, -23.52f, 32f, -56.07f, 32f, -96f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(128f, 206f)
        curveToRelative(-28.89f, -23.52f, -32f, -54.06f, -32f, -94f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(464f, 288.13f)
        lineTo(384f, 288.13f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(128f, 288.13f)
        lineTo(48f, 288.13f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 192f)
        lineTo(256f, 448f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 448f)
        horizontalLineToRelative(0f)
        curveToRelative(-70.4f, 0f, -128f, -57.6f, -128f, -128f)
        verticalLineTo(223.93f)
        curveToRelative(0f, -65.07f, 57.6f, -96f, 128f, -96f)
        horizontalLineToRelative(0f)
        curveToRelative(70.4f, 0f, 128f, 25.6f, 128f, 96f)
        verticalLineTo(320f)
        curveTo(384f, 390.4f, 326.4f, 448f, 256f, 448f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(179.43f, 143.52f)
        arcTo(49.08f, 49.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 127.79f)
        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 255.79f, 48f)
        horizontalLineToRelative(0.42f)
        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336f, 127.79f)
        arcToRelative(
          41.91f,
          41.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -3.12f,
          14.3f
        )
      }
    }.build()

    return _BugOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BugOutline: ImageVector? = null
