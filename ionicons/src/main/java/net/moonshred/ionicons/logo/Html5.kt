package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Html5: ImageVector
  get() {
    if (_Html5 != null) {
      return _Html5!!
    }
    _Html5 = ImageVector.Builder(
      name = "Logo.Html5",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(64f, 32f)
        lineTo(98.94f, 435.21f)
        lineTo(255.77f, 480f)
        lineTo(413f, 435.15f)
        lineTo(448f, 32f)
        close()
        moveTo(372f, 164f)
        horizontalLineTo(188f)
        lineToRelative(4f, 51f)
        horizontalLineTo(368f)
        lineTo(354.49f, 366.39f)
        lineTo(256f, 394.48f)
        lineToRelative(-98.68f, -28f)
        lineTo(150.54f, 289f)
        horizontalLineTo(198.8f)
        lineToRelative(3.42f, 39.29f)
        lineTo(256f, 343.07f)
        lineToRelative(53.42f, -14.92f)
        lineTo(315f, 264f)
        horizontalLineTo(148f)
        lineTo(135.41f, 114.41f)
        lineToRelative(240.79f, 0f)
        close()
      }
    }.build()

    return _Html5!!
  }

@Suppress("ObjectPropertyName")
private var _Html5: ImageVector? = null
