package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Recording: ImageVector
  get() {
    if (_RecordingSharp != null) {
      return _RecordingSharp!!
    }
    _RecordingSharp = ImageVector.Builder(
      name = "Sharp.RecordingSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 138f)
        arcToRelative(
          117.93f,
          117.93f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -91.84f,
          192f
        )
        lineTo(219.84f, 330f)
        arcTo(118f, 118f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 374f)
        lineTo(384f, 374f)
        arcToRelative(118f, 118f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -236f)
        close()
        moveTo(54f, 256f)
        arcToRelative(74f, 74f, 0f, isMoreThanHalf = true, isPositiveArc = true, 74f, 74f)
        arcTo(74.09f, 74.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 54f, 256f)
        close()
        moveTo(384f, 330f)
        arcToRelative(74f, 74f, 0f, isMoreThanHalf = true, isPositiveArc = true, 74f, -74f)
        arcTo(74.09f, 74.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 384f, 330f)
        close()
      }
    }.build()

    return _RecordingSharp!!
  }

@Suppress("ObjectPropertyName")
private var _RecordingSharp: ImageVector? = null
