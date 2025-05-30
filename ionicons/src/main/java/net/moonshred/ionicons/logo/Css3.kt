package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Css3: ImageVector
  get() {
    if (_Css3 != null) {
      return _Css3!!
    }
    _Css3 = ImageVector.Builder(
      name = "Logo.Css3",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(64f, 32f)
        lineTo(99f, 435.22f)
        lineTo(255.77f, 480f)
        lineTo(413f, 435.15f)
        lineTo(448f, 32f)
        close()
        moveTo(354.68f, 366.9f)
        lineTo(256.07f, 395f)
        lineToRelative(-98.46f, -28.24f)
        lineTo(150.86f, 289f)
        horizontalLineToRelative(48.26f)
        lineToRelative(3.43f, 39.56f)
        lineToRelative(53.59f, 15.16f)
        lineToRelative(0.13f, 0.28f)
        horizontalLineToRelative(0f)
        lineToRelative(53.47f, -14.85f)
        lineTo(315.38f, 265f)
        horizontalLineTo(203f)
        lineToRelative(-4f, -50f)
        horizontalLineTo(319.65f)
        lineTo(324f, 164f)
        horizontalLineTo(140f)
        lineToRelative(-4f, -49f)
        horizontalLineTo(376.58f)
        close()
      }
    }.build()

    return _Css3!!
  }

@Suppress("ObjectPropertyName")
private var _Css3: ImageVector? = null
