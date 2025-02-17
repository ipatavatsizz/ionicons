package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoFacebook: ImageVector
  get() {
    if (_LogoFacebook != null) {
      return _LogoFacebook!!
    }
    _LogoFacebook = ImageVector.Builder(
      name = "Filled.LogoFacebook",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(480f, 257.35f)
        curveToRelative(0f, -123.7f, -100.3f, -224f, -224f, -224f)
        reflectiveCurveToRelative(-224f, 100.3f, -224f, 224f)
        curveToRelative(0f, 111.8f, 81.9f, 204.47f, 189f, 221.29f)
        verticalLineTo(322.12f)
        horizontalLineTo(164.11f)
        verticalLineTo(257.35f)
        horizontalLineTo(221f)
        verticalLineTo(208f)
        curveToRelative(0f, -56.13f, 33.45f, -87.16f, 84.61f, -87.16f)
        curveToRelative(24.51f, 0f, 50.15f, 4.38f, 50.15f, 4.38f)
        verticalLineToRelative(55.13f)
        horizontalLineTo(327.5f)
        curveToRelative(-27.81f, 0f, -36.51f, 17.26f, -36.51f, 35f)
        verticalLineToRelative(42f)
        horizontalLineToRelative(62.12f)
        lineToRelative(-9.92f, 64.77f)
        horizontalLineTo(291f)
        verticalLineTo(478.66f)
        curveTo(398.1f, 461.85f, 480f, 369.18f, 480f, 257.35f)
        close()
      }
    }.build()

    return _LogoFacebook!!
  }

@Suppress("ObjectPropertyName")
private var _LogoFacebook: ImageVector? = null
