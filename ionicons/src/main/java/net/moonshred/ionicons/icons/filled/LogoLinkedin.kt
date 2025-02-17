package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoLinkedin: ImageVector
  get() {
    if (_LogoLinkedin != null) {
      return _LogoLinkedin!!
    }
    _LogoLinkedin = ImageVector.Builder(
      name = "Filled.LogoLinkedin",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(444.17f, 32f)
        horizontalLineTo(70.28f)
        curveTo(49.85f, 32f, 32f, 46.7f, 32f, 66.89f)
        verticalLineTo(441.61f)
        curveTo(32f, 461.91f, 49.85f, 480f, 70.28f, 480f)
        horizontalLineTo(444.06f)
        curveTo(464.6f, 480f, 480f, 461.79f, 480f, 441.61f)
        verticalLineTo(66.89f)
        curveTo(480.12f, 46.7f, 464.6f, 32f, 444.17f, 32f)
        close()
        moveTo(170.87f, 405.43f)
        horizontalLineTo(106.69f)
        verticalLineTo(205.88f)
        horizontalLineToRelative(64.18f)
        close()
        moveTo(141f, 175.54f)
        horizontalLineToRelative(-0.46f)
        curveToRelative(-20.54f, 0f, -33.84f, -15.29f, -33.84f, -34.43f)
        curveToRelative(0f, -19.49f, 13.65f, -34.42f, 34.65f, -34.42f)
        reflectiveCurveToRelative(33.85f, 14.82f, 34.31f, 34.42f)
        curveTo(175.65f, 160.25f, 162.35f, 175.54f, 141f, 175.54f)
        close()
        moveTo(405.43f, 405.43f)
        horizontalLineTo(341.25f)
        verticalLineTo(296.32f)
        curveToRelative(0f, -26.14f, -9.34f, -44f, -32.56f, -44f)
        curveToRelative(-17.74f, 0f, -28.24f, 12f, -32.91f, 23.69f)
        curveToRelative(-1.75f, 4.2f, -2.22f, 9.92f, -2.22f, 15.76f)
        verticalLineTo(405.43f)
        horizontalLineTo(209.38f)
        verticalLineTo(205.88f)
        horizontalLineToRelative(64.18f)
        verticalLineToRelative(27.77f)
        curveToRelative(9.34f, -13.3f, 23.93f, -32.44f, 57.88f, -32.44f)
        curveToRelative(42.13f, 0f, 74f, 27.77f, 74f, 87.64f)
        close()
      }
    }.build()

    return _LogoLinkedin!!
  }

@Suppress("ObjectPropertyName")
private var _LogoLinkedin: ImageVector? = null
