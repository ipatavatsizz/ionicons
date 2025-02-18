package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoBitcoin: ImageVector
  get() {
    if (_LogoBitcoin != null) {
      return _LogoBitcoin!!
    }
    _LogoBitcoin = ImageVector.Builder(
      name = "Filled.LogoBitcoin",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(410.47f, 279.2f)
        curveToRelative(-5f, -11.5f, -12.7f, -21.6f, -28.1f, -30.1f)
        arcToRelative(
          98.15f,
          98.15f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -25.4f,
          -10f
        )
        arcToRelative(
          62.22f,
          62.22f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          16.3f,
          -11f
        )
        arcToRelative(
          56.37f,
          56.37f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          15.6f,
          -23.3f
        )
        arcToRelative(
          77.11f,
          77.11f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          3.5f,
          -28.2f
        )
        curveToRelative(-1.1f, -16.8f, -4.4f, -33.1f, -13.2f, -44.8f)
        reflectiveCurveToRelative(-21.2f, -20.7f, -37.6f, -27f)
        curveToRelative(-12.6f, -4.8f, -25.5f, -7.8f, -45.5f, -8.9f)
        lineTo(296.07f, 32f)
        horizontalLineToRelative(-40f)
        lineTo(256.07f, 96f)
        horizontalLineToRelative(-32f)
        lineTo(224.07f, 32f)
        horizontalLineToRelative(-41f)
        lineTo(183.07f, 96f)
        lineTo(96f, 96f)
        verticalLineToRelative(48f)
        horizontalLineToRelative(27.87f)
        curveToRelative(8.7f, 0f, 14.6f, 0.8f, 17.6f, 2.3f)
        arcToRelative(13.22f, 13.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 6f)
        curveToRelative(1.3f, 2.5f, 1.9f, 8.4f, 1.9f, 17.5f)
        lineTo(149.87f, 343f)
        curveToRelative(0f, 9f, -0.6f, 14.8f, -1.9f, 17.4f)
        reflectiveCurveToRelative(-2f, 4.9f, -5.1f, 6.3f)
        reflectiveCurveToRelative(-3.2f, 1.3f, -11.8f, 1.3f)
        horizontalLineToRelative(-26.4f)
        lineTo(96f, 416f)
        horizontalLineToRelative(87f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(41f)
        lineTo(224f, 416f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(40f)
        lineTo(296f, 415.6f)
        curveToRelative(26f, -1.3f, 44.5f, -4.7f, 59.4f, -10.3f)
        curveToRelative(19.3f, -7.2f, 34.1f, -17.7f, 44.7f, -31.5f)
        reflectiveCurveToRelative(14f, -34.9f, 14.93f, -51.2f)
        curveTo(415.7f, 308.1f, 415f, 289.4f, 410.47f, 279.2f)
        close()
        moveTo(224f, 150f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(74f)
        lineTo(224f, 224f)
        close()
        moveTo(224f, 362f)
        lineTo(224f, 272f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(90f)
        close()
        moveTo(296f, 153.9f)
        curveToRelative(6f, 2.5f, 9.9f, 7.5f, 13.8f, 12.7f)
        curveToRelative(4.3f, 5.7f, 6.5f, 13.3f, 6.5f, 21.4f)
        curveToRelative(0f, 7.8f, -2.9f, 14.5f, -7.5f, 20.5f)
        curveToRelative(-3.8f, 4.9f, -6.8f, 8.3f, -12.8f, 11.1f)
        close()
        moveTo(324.8f, 340.6f)
        curveToRelative(-7.8f, 6.9f, -12.3f, 10.1f, -22.1f, 13.8f)
        arcToRelative(56.06f, 56.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.7f, 1.9f)
        lineTo(296f, 273.5f)
        arcToRelative(40.74f, 40.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.3f, 3.4f)
        curveToRelative(7.8f, 3.3f, 15.2f, 6.9f, 19.8f, 13.2f)
        arcToRelative(43.82f, 43.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 24.7f)
        curveTo(335.07f, 325.7f, 332.27f, 334f, 324.77f, 340.6f)
        close()
      }
    }.build()

    return _LogoBitcoin!!
  }

@Suppress("ObjectPropertyName")
private var _LogoBitcoin: ImageVector? = null
