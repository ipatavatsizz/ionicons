package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.QrCode: ImageVector
  get() {
    if (_QrCodeSharp != null) {
      return _QrCodeSharp!!
    }
    _QrCodeSharp = ImageVector.Builder(
      name = "Sharp.QrCodeSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 336f)
        horizontalLineToRelative(80f)
        verticalLineToRelative(80f)
        horizontalLineToRelative(-80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 272f)
        horizontalLineToRelative(64f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(-64f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 416f)
        horizontalLineToRelative(64f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(-64f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(432f, 272f)
        horizontalLineToRelative(48f)
        verticalLineToRelative(48f)
        horizontalLineToRelative(-48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 432f)
        horizontalLineToRelative(48f)
        verticalLineToRelative(48f)
        horizontalLineToRelative(-48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(336f, 96f)
        horizontalLineToRelative(80f)
        verticalLineToRelative(80f)
        horizontalLineToRelative(-80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 240f)
        horizontalLineTo(272f)
        verticalLineTo(32f)
        horizontalLineTo(480f)
        close()
        moveTo(316f, 196f)
        horizontalLineTo(436f)
        verticalLineTo(76f)
        horizontalLineTo(316f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(96f, 96f)
        horizontalLineToRelative(80f)
        verticalLineToRelative(80f)
        horizontalLineToRelative(-80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(240f, 240f)
        horizontalLineTo(32f)
        verticalLineTo(32f)
        horizontalLineTo(240f)
        close()
        moveTo(76f, 196f)
        horizontalLineTo(196f)
        verticalLineTo(76f)
        horizontalLineTo(76f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(96f, 336f)
        horizontalLineToRelative(80f)
        verticalLineToRelative(80f)
        horizontalLineToRelative(-80f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(240f, 480f)
        horizontalLineTo(32f)
        verticalLineTo(272f)
        horizontalLineTo(240f)
        close()
        moveTo(76f, 436f)
        horizontalLineTo(196f)
        verticalLineTo(316f)
        horizontalLineTo(76f)
        close()
      }
    }.build()

    return _QrCodeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _QrCodeSharp: ImageVector? = null
