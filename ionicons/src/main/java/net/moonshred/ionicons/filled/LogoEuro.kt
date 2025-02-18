package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoEuro: ImageVector
  get() {
    if (_LogoEuro != null) {
      return _LogoEuro!!
    }
    _LogoEuro = ImageVector.Builder(
      name = "Filled.LogoEuro",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(231.8f, 272f)
        verticalLineTo(224f)
        horizontalLineTo(376f)
        lineToRelative(8f, -48f)
        horizontalLineTo(231.8f)
        verticalLineToRelative(-8.12f)
        curveToRelative(0f, -38.69f, 16.47f, -62.56f, 87.18f, -62.56f)
        curveToRelative(28.89f, 0f, 61.45f, 2.69f, 102.5f, 9.42f)
        lineToRelative(10.52f, -70f)
        arcTo(508.54f, 508.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 315.46f, 32f)
        curveTo(189.26f, 32f, 135f, 76.4f, 135f, 158.46f)
        verticalLineTo(176f)
        lineToRelative(-55f, 0f)
        verticalLineToRelative(48f)
        horizontalLineToRelative(55f)
        verticalLineToRelative(48f)
        horizontalLineTo(80f)
        verticalLineToRelative(48f)
        horizontalLineToRelative(55f)
        verticalLineToRelative(33.54f)
        curveTo(135f, 435.6f, 189.23f, 480f, 315.43f, 480f)
        arcToRelative(
          507.76f,
          507.76f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          116.44f,
          -12.78f
        )
        lineToRelative(-10.58f, -70f)
        curveToRelative(-41.05f, 6.73f, -73.46f, 9.42f, -102.35f, 9.42f)
        curveToRelative(-70.7f, 0f, -87.14f, -20.18f, -87.14f, -67.94f)
        verticalLineTo(320f)
        horizontalLineTo(360.27f)
        lineToRelative(7.87f, -48f)
        close()
      }
    }.build()

    return _LogoEuro!!
  }

@Suppress("ObjectPropertyName")
private var _LogoEuro: ImageVector? = null
