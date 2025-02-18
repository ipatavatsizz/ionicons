package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoMastodon: ImageVector
  get() {
    if (_LogoMastodon != null) {
      return _LogoMastodon!!
    }
    _LogoMastodon = ImageVector.Builder(
      name = "Filled.LogoMastodon",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 173.59f)
        curveToRelative(0f, -104.13f, -68.26f, -134.65f, -68.26f, -134.65f)
        curveTo(377.3f, 23.15f, 318.2f, 16.5f, 256.8f, 16f)
        horizontalLineToRelative(-1.51f)
        curveToRelative(-61.4f, 0.5f, -120.46f, 7.15f, -154.88f, 22.94f)
        curveToRelative(0f, 0f, -68.27f, 30.52f, -68.27f, 134.65f)
        curveToRelative(0f, 23.85f, -0.46f, 52.35f, 0.29f, 82.59f)
        curveTo(34.91f, 358f, 51.11f, 458.37f, 145.32f, 483.29f)
        curveToRelative(43.43f, 11.49f, 80.73f, 13.89f, 110.76f, 12.24f)
        curveToRelative(54.47f, -3f, 85f, -19.42f, 85f, -19.42f)
        lineToRelative(-1.79f, -39.5f)
        reflectiveCurveToRelative(-38.93f, 12.27f, -82.64f, 10.77f)
        curveToRelative(-43.31f, -1.48f, -89f, -4.67f, -96f, -57.81f)
        arcToRelative(
          108.44f,
          108.44f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -1f,
          -14.9f
        )
        arcToRelative(
          558.91f,
          558.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          96.39f,
          12.85f
        )
        curveToRelative(32.95f, 1.51f, 63.84f, -1.93f, 95.22f, -5.67f)
        curveToRelative(60.18f, -7.18f, 112.58f, -44.24f, 119.16f, -78.09f)
        curveTo(480.84f, 250.42f, 480f, 173.59f, 480f, 173.59f)
        close()
        moveTo(399.46f, 307.75f)
        horizontalLineToRelative(-50f)
        verticalLineTo(185.38f)
        curveToRelative(0f, -25.8f, -10.86f, -38.89f, -32.58f, -38.89f)
        curveToRelative(-24f, 0f, -36.06f, 15.53f, -36.06f, 46.24f)
        verticalLineToRelative(67f)
        horizontalLineTo(231.16f)
        verticalLineToRelative(-67f)
        curveToRelative(0f, -30.71f, -12f, -46.24f, -36.06f, -46.24f)
        curveToRelative(-21.72f, 0f, -32.58f, 13.09f, -32.58f, 38.89f)
        verticalLineTo(307.75f)
        horizontalLineToRelative(-50f)
        verticalLineTo(181.67f)
        quadToRelative(0f, -38.65f, 19.75f, -61.39f)
        curveToRelative(13.6f, -15.15f, 31.4f, -22.92f, 53.51f, -22.92f)
        curveToRelative(25.58f, 0f, 44.95f, 9.82f, 57.75f, 29.48f)
        lineTo(256f, 147.69f)
        lineToRelative(12.45f, -20.85f)
        curveToRelative(12.81f, -19.66f, 32.17f, -29.48f, 57.75f, -29.48f)
        curveToRelative(22.11f, 0f, 39.91f, 7.77f, 53.51f, 22.92f)
        quadTo(399.5f, 143f, 399.46f, 181.67f)
        close()
      }
    }.build()

    return _LogoMastodon!!
  }

@Suppress("ObjectPropertyName")
private var _LogoMastodon: ImageVector? = null
