package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoMedium: ImageVector
  get() {
    if (_LogoMedium != null) {
      return _LogoMedium!!
    }
    _LogoMedium = ImageVector.Builder(
      name = "Filled.LogoMedium",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(28f, 28f)
        verticalLineToRelative(456f)
        horizontalLineToRelative(456f)
        verticalLineTo(28f)
        horizontalLineTo(28f)
        close()
        moveTo(406.83f, 136.04f)
        lineToRelative(-24.46f, 23.45f)
        curveToRelative(-2.11f, 1.61f, -3.15f, 4.25f, -2.72f, 6.86f)
        verticalLineToRelative(172.28f)
        curveToRelative(-0.44f, 2.61f, 0.61f, 5.26f, 2.72f, 6.86f)
        lineToRelative(23.88f, 23.45f)
        verticalLineToRelative(5.15f)
        horizontalLineTo(286.13f)
        verticalLineToRelative(-5.15f)
        lineToRelative(24.74f, -24.02f)
        curveToRelative(2.43f, -2.43f, 2.43f, -3.15f, 2.43f, -6.86f)
        verticalLineTo(198.81f)
        lineToRelative(-68.79f, 174.71f)
        horizontalLineToRelative(-9.3f)
        lineToRelative(-80.09f, -174.71f)
        verticalLineToRelative(117.1f)
        curveToRelative(-0.67f, 4.92f, 0.97f, 9.88f, 4.43f, 13.44f)
        lineToRelative(32.18f, 39.03f)
        verticalLineToRelative(5.15f)
        horizontalLineToRelative(-91.24f)
        verticalLineToRelative(-5.15f)
        lineToRelative(32.18f, -39.03f)
        curveToRelative(3.44f, -3.57f, 4.98f, -8.56f, 4.15f, -13.44f)
        verticalLineTo(180.5f)
        curveToRelative(0.38f, -3.76f, -1.05f, -7.48f, -3.86f, -10.01f)
        lineToRelative(-28.6f, -34.46f)
        verticalLineToRelative(-5.15f)
        horizontalLineToRelative(88.81f)
        lineToRelative(68.65f, 150.55f)
        lineToRelative(60.35f, -150.55f)
        horizontalLineToRelative(84.66f)
        verticalLineTo(136.04f)
        close()
      }
    }.build()

    return _LogoMedium!!
  }

@Suppress("ObjectPropertyName")
private var _LogoMedium: ImageVector? = null
