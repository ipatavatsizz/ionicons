package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.CodeDownload: ImageVector
  get() {
    if (_CodeDownloadSharp != null) {
      return _CodeDownloadSharp!!
    }
    _CodeDownloadSharp = ImageVector.Builder(
      name = "Sharp.CodeDownloadSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 42f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(160f, 368f)
        lineToRelative(-128f, -112f)
        lineToRelative(128f, -112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 42f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(352f, 368f)
        lineToRelative(128f, -112f)
        lineToRelative(-128f, -112f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 42f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(192f, 288.1f)
        lineToRelative(64f, 63.9f)
        lineToRelative(64f, -63.9f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 42f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(256f, 160f)
        lineTo(256f, 336.03f)
      }
    }.build()

    return _CodeDownloadSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CodeDownloadSharp: ImageVector? = null
