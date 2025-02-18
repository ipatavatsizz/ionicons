package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.MusicalNote: ImageVector
  get() {
    if (_MusicalNoteOutline != null) {
      return _MusicalNoteOutline!!
    }
    _MusicalNoteOutline = ImageVector.Builder(
      name = "Outline.MusicalNoteOutline",
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
        moveTo(240f, 343.31f)
        verticalLineTo(424f)
        arcToRelative(
          32.28f,
          32.28f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -21.88f,
          30.65f
        )
        lineToRelative(-21.47f, 7.23f)
        curveToRelative(-25.9f, 8.71f, -52.65f, -10.75f, -52.65f, -38.32f)
        horizontalLineToRelative(0f)
        arcTo(34.29f, 34.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 167.25f, 391f)
        lineToRelative(50.87f, -17.12f)
        arcTo(32.29f, 32.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 343.24f)
        verticalLineTo(92f)
        arcToRelative(
          16.13f,
          16.13f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          12.06f,
          -15.66f
        )
        lineTo(360.49f, 48.2f)
        arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 54f)
        verticalLineToRelative(57.76f)
        arcToRelative(
          16.13f,
          16.13f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -12.12f,
          15.67f
        )
        lineToRelative(-91.64f, 23.13f)
        arcTo(32.25f, 32.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 181.91f)
        verticalLineTo(221.3f)
      }
    }.build()

    return _MusicalNoteOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MusicalNoteOutline: ImageVector? = null
