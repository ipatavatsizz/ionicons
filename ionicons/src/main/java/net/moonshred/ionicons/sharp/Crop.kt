package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Crop: ImageVector
  get() {
    if (_CropSharp != null) {
      return _CropSharp!!
    }
    _CropSharp = ImageVector.Builder(
      name = "Sharp.CropSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(166f, 346f)
        lineToRelative(0f, -314f)
        lineToRelative(-44f, 0f)
        lineToRelative(0f, 90f)
        lineToRelative(-90f, 0f)
        lineToRelative(0f, 44f)
        lineToRelative(90f, 0f)
        lineToRelative(0f, 224f)
        lineToRelative(224f, 0f)
        lineToRelative(0f, 90f)
        lineToRelative(44f, 0f)
        lineToRelative(0f, -90f)
        lineToRelative(90f, 0f)
        lineToRelative(0f, -44f)
        lineToRelative(-314f, 0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(346f, 320f)
        lineToRelative(44f, 0f)
        lineToRelative(0f, -198f)
        lineToRelative(-198f, 0f)
        lineToRelative(0f, 44f)
        lineToRelative(154f, 0f)
        lineToRelative(0f, 154f)
        close()
      }
    }.build()

    return _CropSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CropSharp: ImageVector? = null
