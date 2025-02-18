package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Medical: ImageVector
  get() {
    if (_MedicalSharp != null) {
      return _MedicalSharp!!
    }
    _MedicalSharp = ImageVector.Builder(
      name = "Sharp.MedicalSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(351.9f, 256f)
        lineToRelative(108.1f, -62.4f)
        lineToRelative(-48f, -83.2f)
        lineToRelative(-108f, 62.4f)
        lineToRelative(0f, -124.8f)
        lineToRelative(-96f, 0f)
        lineToRelative(0f, 124.8f)
        lineToRelative(-108f, -62.4f)
        lineToRelative(-48f, 83.2f)
        lineToRelative(108.1f, 62.4f)
        lineToRelative(-108.1f, 62.4f)
        lineToRelative(48f, 83.2f)
        lineToRelative(108f, -62.4f)
        lineToRelative(0f, 124.8f)
        lineToRelative(96f, 0f)
        lineToRelative(0f, -124.8f)
        lineToRelative(108f, 62.4f)
        lineToRelative(48f, -83.2f)
        lineToRelative(-108.1f, -62.4f)
        close()
      }
    }.build()

    return _MedicalSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MedicalSharp: ImageVector? = null
