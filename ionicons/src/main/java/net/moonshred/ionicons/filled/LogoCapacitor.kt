package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.LogoCapacitor: ImageVector
  get() {
    if (_LogoCapacitor != null) {
      return _LogoCapacitor!!
    }
    _LogoCapacitor = ImageVector.Builder(
      name = "Filled.LogoCapacitor",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 101.09f)
        lineTo(372.37f, 208.72f)
        lineTo(479.23f, 315.78f)
        lineToRelative(-69.3f, 69.3f)
        lineTo(126.71f, 101.85f)
        lineTo(196f, 32.54f)
        lineTo(303.07f, 139.42f)
        lineTo(410.67f, 32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32.55f, 196f)
        lineToRelative(69.3f, -69.31f)
        lineTo(385.07f, 409.93f)
        lineToRelative(-69.3f, 69.3f)
        lineToRelative(-107f, -106.87f)
        lineTo(101.08f, 480f)
        lineTo(32f, 410.67f)
        lineTo(139.42f, 303.06f)
        close()
      }
    }.build()

    return _LogoCapacitor!!
  }

@Suppress("ObjectPropertyName")
private var _LogoCapacitor: ImageVector? = null
