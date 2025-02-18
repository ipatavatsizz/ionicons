package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Download: ImageVector
  get() {
    if (_DownloadSharp != null) {
      return _DownloadSharp!!
    }
    _DownloadSharp = ImageVector.Builder(
      name = "Sharp.DownloadSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 160f)
        verticalLineTo(307.37f)
        lineToRelative(64f, -64f)
        lineTo(358.63f, 266f)
        lineTo(256f, 368.63f)
        lineTo(153.37f, 266f)
        lineTo(176f, 243.37f)
        lineToRelative(64f, 64f)
        verticalLineTo(160f)
        horizontalLineTo(92f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 12f)
        verticalLineTo(468f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineTo(420f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        verticalLineTo(172f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(240f, 32f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(128f)
        horizontalLineToRelative(-32f)
        close()
      }
    }.build()

    return _DownloadSharp!!
  }

@Suppress("ObjectPropertyName")
private var _DownloadSharp: ImageVector? = null
