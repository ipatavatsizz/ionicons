package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.TrailSign: ImageVector
  get() {
    if (_TrailSignSharp != null) {
      return _TrailSignSharp!!
    }
    _TrailSignSharp = ImageVector.Builder(
      name = "Sharp.TrailSignSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(502.63f, 336f)
        lineToRelative(-80f, -80f)
        horizontalLineTo(278f)
        verticalLineTo(224f)
        horizontalLineTo(448f)
        verticalLineTo(64f)
        horizontalLineTo(278f)
        verticalLineTo(32f)
        horizontalLineTo(234f)
        verticalLineTo(64f)
        horizontalLineTo(89.37f)
        lineToRelative(-80f, 80f)
        lineToRelative(80f, 80f)
        horizontalLineTo(234f)
        verticalLineToRelative(32f)
        horizontalLineTo(64f)
        verticalLineTo(416f)
        horizontalLineTo(234f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(44f)
        verticalLineTo(416f)
        horizontalLineTo(422.63f)
        close()
      }
    }.build()

    return _TrailSignSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TrailSignSharp: ImageVector? = null
