package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Reader: ImageVector
  get() {
    if (_ReaderSharp != null) {
      return _ReaderSharp!!
    }
    _ReaderSharp = ImageVector.Builder(
      name = "Sharp.ReaderSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(80f, 44f)
        lineTo(80f, 468f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        lineTo(420f, 480f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        lineTo(432f, 44f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
        lineTo(92f, 32f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 44f)
        close()
        moveTo(272f, 304f)
        lineTo(160f, 304f)
        lineTo(160f, 272f)
        lineTo(272f, 272f)
        close()
        moveTo(352f, 224f)
        lineTo(160f, 224f)
        lineTo(160f, 192f)
        lineTo(352f, 192f)
        close()
        moveTo(352f, 144f)
        lineTo(160f, 144f)
        lineTo(160f, 112f)
        lineTo(352f, 112f)
        close()
      }
    }.build()

    return _ReaderSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ReaderSharp: ImageVector? = null
