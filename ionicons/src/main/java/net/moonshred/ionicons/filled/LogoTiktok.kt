package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.LogoTiktok: ImageVector
  get() {
    if (_LogoTiktok != null) {
      return _LogoTiktok!!
    }
    _LogoTiktok = ImageVector.Builder(
      name = "Filled.LogoTiktok",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(412.19f, 118.66f)
        arcToRelative(
          109.27f,
          109.27f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -9.45f,
          -5.5f
        )
        arcToRelative(
          132.87f,
          132.87f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -24.27f,
          -20.62f
        )
        curveToRelative(-18.1f, -20.71f, -24.86f, -41.72f, -27.35f, -56.43f)
        horizontalLineToRelative(0.1f)
        curveTo(349.14f, 23.9f, 350f, 16f, 350.13f, 16f)
        horizontalLineTo(267.69f)
        verticalLineTo(334.78f)
        curveToRelative(0f, 4.28f, 0f, 8.51f, -0.18f, 12.69f)
        curveToRelative(0f, 0.52f, -0.05f, 1f, -0.08f, 1.56f)
        curveToRelative(0f, 0.23f, 0f, 0.47f, -0.05f, 0.71f)
        curveToRelative(0f, 0.06f, 0f, 0.12f, 0f, 0.18f)
        arcToRelative(70f, 70f, 0f, isMoreThanHalf = false, isPositiveArc = true, -35.22f, 55.56f)
        arcToRelative(68.8f, 68.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -34.11f, 9f)
        curveToRelative(-38.41f, 0f, -69.54f, -31.32f, -69.54f, -70f)
        reflectiveCurveToRelative(31.13f, -70f, 69.54f, -70f)
        arcToRelative(68.9f, 68.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.41f, 3.39f)
        lineToRelative(0.1f, -83.94f)
        arcToRelative(
          153.14f,
          153.14f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -118f,
          34.52f
        )
        arcToRelative(
          161.79f,
          161.79f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -35.3f,
          43.53f
        )
        curveToRelative(-3.48f, 6f, -16.61f, 30.11f, -18.2f, 69.24f)
        curveToRelative(-1f, 22.21f, 5.67f, 45.22f, 8.85f, 54.73f)
        verticalLineToRelative(0.2f)
        curveToRelative(2f, 5.6f, 9.75f, 24.71f, 22.38f, 40.82f)
        arcTo(167.53f, 167.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 115f, 470.66f)
        verticalLineToRelative(-0.2f)
        lineToRelative(0.2f, 0.2f)
        curveTo(155.11f, 497.78f, 199.36f, 496f, 199.36f, 496f)
        curveToRelative(7.66f, -0.31f, 33.32f, 0f, 62.46f, -13.81f)
        curveToRelative(32.32f, -15.31f, 50.72f, -38.12f, 50.72f, -38.12f)
        arcToRelative(
          158.46f,
          158.46f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          27.64f,
          -45.93f
        )
        curveToRelative(7.46f, -19.61f, 9.95f, -43.13f, 9.95f, -52.53f)
        verticalLineTo(176.49f)
        curveToRelative(1f, 0.6f, 14.32f, 9.41f, 14.32f, 9.41f)
        reflectiveCurveToRelative(19.19f, 12.3f, 49.13f, 20.31f)
        curveToRelative(21.48f, 5.7f, 50.42f, 6.9f, 50.42f, 6.9f)
        verticalLineTo(131.27f)
        curveTo(453.86f, 132.37f, 433.27f, 129.17f, 412.19f, 118.66f)
        close()
      }
    }.build()

    return _LogoTiktok!!
  }

@Suppress("ObjectPropertyName")
private var _LogoTiktok: ImageVector? = null
