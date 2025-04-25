package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Yen: ImageVector
  get() {
    if (_Yen != null) {
      return _Yen!!
    }
    _Yen = ImageVector.Builder(
      name = "Logo.Yen",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 32f)
        horizontalLineTo(368f)
        lineTo(256f, 253.13f)
        lineTo(144f, 32f)
        horizontalLineTo(64f)
        lineTo(176.37f, 240f)
        horizontalLineTo(128f)
        verticalLineToRelative(48f)
        horizontalLineToRelative(73.56f)
        lineTo(216f, 319f)
        verticalLineToRelative(17f)
        horizontalLineTo(128f)
        verticalLineToRelative(48f)
        horizontalLineToRelative(88f)
        verticalLineToRelative(96f)
        horizontalLineToRelative(80f)
        verticalLineTo(384f)
        horizontalLineToRelative(88f)
        verticalLineTo(336f)
        horizontalLineTo(296f)
        verticalLineTo(319f)
        lineToRelative(14.89f, -31f)
        horizontalLineTo(384f)
        verticalLineTo(240f)
        horizontalLineTo(335.71f)
        close()
      }
    }.build()

    return _Yen!!
  }

@Suppress("ObjectPropertyName")
private var _Yen: ImageVector? = null
