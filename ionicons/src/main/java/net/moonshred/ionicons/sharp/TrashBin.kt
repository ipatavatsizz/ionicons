package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.TrashBin: ImageVector
  get() {
    if (_TrashBinSharp != null) {
      return _TrashBinSharp!!
    }
    _TrashBinSharp = ImageVector.Builder(
      name = "Sharp.TrashBinSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(64f, 160f)
        lineTo(93.74f, 442.51f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 117.61f, 464f)
        horizontalLineTo(394.39f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.87f, -21.49f)
        lineTo(448f, 160f)
        close()
        moveTo(312f, 377.46f)
        lineToRelative(-56f, -56f)
        lineToRelative(-56f, 56f)
        lineTo(174.54f, 352f)
        lineToRelative(56f, -56f)
        lineToRelative(-56f, -56f)
        lineTo(200f, 214.54f)
        lineToRelative(56f, 56f)
        lineToRelative(56f, -56f)
        lineTo(337.46f, 240f)
        lineToRelative(-56f, 56f)
        lineToRelative(56f, 56f)
        close()
      }
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
    }.build()

    return _TrashBinSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TrashBinSharp: ImageVector? = null
