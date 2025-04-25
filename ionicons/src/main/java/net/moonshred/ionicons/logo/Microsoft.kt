package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Microsoft: ImageVector
  get() {
    if (_Microsoft != null) {
      return _Microsoft!!
    }
    _Microsoft = ImageVector.Builder(
      name = "Logo.Microsoft",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(31.87f, 30.58f)
        horizontalLineTo(244.7f)
        verticalLineTo(243.39f)
        horizontalLineTo(31.87f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(266.89f, 30.58f)
        horizontalLineTo(479.7f)
        verticalLineTo(243.39f)
        horizontalLineTo(266.89f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(31.87f, 265.61f)
        horizontalLineTo(244.7f)
        verticalLineToRelative(212.8f)
        horizontalLineTo(31.87f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(266.89f, 265.61f)
        horizontalLineTo(479.7f)
        verticalLineToRelative(212.8f)
        horizontalLineTo(266.89f)
        close()
      }
    }.build()

    return _Microsoft!!
  }

@Suppress("ObjectPropertyName")
private var _Microsoft: ImageVector? = null
