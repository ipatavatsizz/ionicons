package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Checkbox: ImageVector
  get() {
    if (_CheckboxSharp != null) {
      return _CheckboxSharp!!
    }
    _CheckboxSharp = ImageVector.Builder(
      name = "Sharp.CheckboxSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 48f)
        verticalLineTo(464f)
        horizontalLineTo(464f)
        verticalLineTo(48f)
        close()
        moveTo(218f, 360.38f)
        lineTo(137.4f, 270.81f)
        lineToRelative(23.79f, -21.41f)
        lineToRelative(56f, 62.22f)
        lineTo(350f, 153.46f)
        lineTo(374.54f, 174f)
        close()
      }
    }.build()

    return _CheckboxSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CheckboxSharp: ImageVector? = null
