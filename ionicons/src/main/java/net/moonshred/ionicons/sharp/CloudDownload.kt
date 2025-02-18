package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CloudDownload: ImageVector
  get() {
    if (_CloudDownloadSharp != null) {
      return _CloudDownloadSharp!!
    }
    _CloudDownloadSharp = ImageVector.Builder(
      name = "Sharp.CloudDownloadSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(472.7f, 189.5f)
        curveToRelative(-15.76f, -10f, -36.21f, -16.79f, -58.59f, -19.54f)
        curveToRelative(-6.65f, -39.1f, -24.22f, -72.52f, -51.27f, -97.26f)
        curveTo(334.15f, 46.45f, 296.21f, 32f, 256f, 32f)
        curveToRelative(-35.35f, 0f, -68f, 11.08f, -94.37f, 32f)
        arcToRelative(
          149.7f,
          149.7f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -45.29f,
          60.42f
        )
        curveToRelative(-30.67f, 4.32f, -57f, 14.61f, -76.71f, 30f)
        curveTo(13.7f, 174.83f, 0f, 203.56f, 0f, 237.6f)
        curveTo(0f, 305f, 55.92f, 352f, 136f, 352f)
        horizontalLineTo(240f)
        verticalLineTo(208f)
        horizontalLineToRelative(32f)
        verticalLineTo(352f)
        horizontalLineTo(396f)
        curveToRelative(72.64f, 0f, 116f, -34.24f, 116f, -91.6f)
        curveTo(512f, 230.35f, 498.41f, 205.83f, 472.7f, 189.5f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(240f, 419.42f)
        lineToRelative(-48.02f, -48.42f)
        lineToRelative(-22.61f, 23f)
        lineToRelative(86.63f, 86f)
        lineToRelative(86.63f, -86f)
        lineToRelative(-22.61f, -23f)
        lineToRelative(-48.02f, 48.42f)
        lineToRelative(0f, -67.42f)
        lineToRelative(-32f, 0f)
        lineToRelative(0f, 67.42f)
        close()
      }
    }.build()

    return _CloudDownloadSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CloudDownloadSharp: ImageVector? = null
