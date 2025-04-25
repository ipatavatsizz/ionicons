package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Npm: ImageVector
  get() {
    if (_Npm != null) {
      return _Npm!!
    }
    _Npm = ImageVector.Builder(
      name = "Logo.Npm",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(227.6f, 213.1f)
        horizontalLineToRelative(28.4f)
        verticalLineToRelative(57.1f)
        horizontalLineToRelative(-28.4f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(0f, 156f)
        lineTo(0f, 327.4f)
        lineTo(142.2f, 327.4f)
        lineTo(142.2f, 356f)
        lineTo(256f, 356f)
        lineTo(256f, 327.4f)
        lineTo(512f, 327.4f)
        lineTo(512f, 156f)
        close()
        moveTo(142.2f, 298.9f)
        lineTo(113.8f, 298.9f)
        lineTo(113.8f, 213.2f)
        lineTo(85.3f, 213.2f)
        verticalLineToRelative(85.7f)
        lineTo(28.4f, 298.9f)
        lineTo(28.4f, 184.6f)
        lineTo(142.2f, 184.6f)
        close()
        moveTo(284.4f, 298.9f)
        lineTo(227.5f, 298.9f)
        verticalLineToRelative(28.6f)
        lineTo(170.6f, 327.5f)
        lineTo(170.6f, 184.6f)
        lineTo(284.4f, 184.6f)
        close()
        moveTo(483.6f, 298.9f)
        lineTo(455.2f, 298.9f)
        lineTo(455.2f, 213.2f)
        lineTo(426.8f, 213.2f)
        verticalLineToRelative(85.7f)
        lineTo(398.4f, 298.9f)
        lineTo(398.4f, 213.2f)
        lineTo(370f, 213.2f)
        verticalLineToRelative(85.7f)
        lineTo(313.1f, 298.9f)
        lineTo(313.1f, 184.6f)
        lineTo(483.8f, 184.6f)
        lineTo(483.8f, 298.9f)
        close()
      }
    }.build()

    return _Npm!!
  }

@Suppress("ObjectPropertyName")
private var _Npm: ImageVector? = null
