package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Archive: ImageVector
  get() {
    if (_ArchiveSharp != null) {
      return _ArchiveSharp!!
    }
    _ArchiveSharp = ImageVector.Builder(
      name = "Sharp.ArchiveSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(44f, 48f)
        lineTo(468f, 48f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 480f, 60f)
        lineTo(480f, 116f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 468f, 128f)
        lineTo(44f, 128f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 116f)
        lineTo(32f, 60f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 44f, 48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(64f, 160f)
        verticalLineTo(440f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineTo(424f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        verticalLineTo(160f)
        close()
        moveTo(256f, 390.63f)
        lineTo(169.32f, 304f)
        lineTo(192f, 281.32f)
        lineTo(240f, 329.37f)
        verticalLineTo(208f)
        horizontalLineToRelative(32f)
        verticalLineTo(329.37f)
        lineToRelative(48.07f, -48.07f)
        lineToRelative(22.61f, 22.64f)
        close()
      }
    }.build()

    return _ArchiveSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ArchiveSharp: ImageVector? = null
