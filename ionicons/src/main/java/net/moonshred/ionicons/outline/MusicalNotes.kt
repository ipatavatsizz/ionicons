package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.MusicalNotes: ImageVector
  get() {
    if (_MusicalNotesOutline != null) {
      return _MusicalNotesOutline!!
    }
    _MusicalNotesOutline = ImageVector.Builder(
      name = "Outline.MusicalNotesOutline",
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
        moveTo(192f, 218f)
        verticalLineToRelative(-6f)
        curveToRelative(0f, -14.84f, 10f, -27f, 24.24f, -30.59f)
        lineToRelative(174.59f, -46.68f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 154f)
        verticalLineTo(176f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(416f, 295.94f)
        verticalLineToRelative(80f)
        curveToRelative(0f, 13.91f, -8.93f, 25.59f, -22f, 30f)
        lineToRelative(-22f, 8f)
        curveToRelative(-25.9f, 8.72f, -52f, -10.42f, -52f, -38f)
        horizontalLineToRelative(0f)
        arcToRelative(33.37f, 33.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, -32f)
        lineToRelative(51f, -18.15f)
        curveToRelative(13.07f, -4.4f, 22f, -15.94f, 22f, -29.85f)
        verticalLineTo(58f)
        arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.6f, -9.61f)
        lineTo(204f, 102f)
        arcToRelative(16.48f, 16.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 16f)
        verticalLineToRelative(226f)
        curveToRelative(0f, 13.91f, -8.93f, 25.6f, -22f, 30f)
        lineToRelative(-52f, 18f)
        curveToRelative(-13.88f, 4.68f, -22f, 17.22f, -22f, 32f)
        horizontalLineToRelative(0f)
        curveToRelative(0f, 27.58f, 26.52f, 46.55f, 52f, 38f)
        lineToRelative(22f, -8f)
        curveToRelative(13.07f, -4.4f, 22f, -16.08f, 22f, -30f)
        verticalLineToRelative(-80f)
      }
    }.build()

    return _MusicalNotesOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MusicalNotesOutline: ImageVector? = null
