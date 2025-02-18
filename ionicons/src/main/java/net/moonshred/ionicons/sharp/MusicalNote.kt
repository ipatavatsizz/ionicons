package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.MusicalNote: ImageVector
  get() {
    if (_MusicalNoteSharp != null) {
      return _MusicalNoteSharp!!
    }
    _MusicalNoteSharp = ImageVector.Builder(
      name = "Sharp.MusicalNoteSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(381.55f, 32.05f)
        curveToRelative(-18.13f, 4.28f, -126.57f, 31.07f, -156f, 38.19f)
        arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 72.18f)
        verticalLineTo(353.3f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.32f, 1.88f)
        lineTo(182f, 369.88f)
        curveToRelative(-29.82f, 10.66f, -54f, 18.94f, -54f, 59.06f)
        curveToRelative(0f, 32.47f, 23.53f, 47.18f, 37.95f, 50f)
        arcToRelative(81.77f, 81.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 1.08f)
        curveToRelative(8.89f, 0f, 31f, -3.59f, 47.52f, -14.24f)
        curveTo(256f, 448f, 256f, 448f, 256f, 415.93f)
        verticalLineTo(169.16f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.49f, -1.94f)
        lineToRelative(125f, -33f)
        arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.49f, -1.94f)
        verticalLineTo(34f)
        arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 381.55f, 32.05f)
        close()
      }
    }.build()

    return _MusicalNoteSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MusicalNoteSharp: ImageVector? = null
