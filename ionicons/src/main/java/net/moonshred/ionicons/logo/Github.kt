package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Github: ImageVector
  get() {
    if (_Github != null) {
      return _Github!!
    }
    _Github = ImageVector.Builder(
      name = "Logo.Github",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 32f)
        curveTo(132.3f, 32f, 32f, 134.9f, 32f, 261.7f)
        curveToRelative(0f, 101.5f, 64.2f, 187.5f, 153.2f, 217.9f)
        arcToRelative(17.56f, 17.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.8f, 0.4f)
        curveToRelative(8.3f, 0f, 11.5f, -6.1f, 11.5f, -11.4f)
        curveToRelative(0f, -5.5f, -0.2f, -19.9f, -0.3f, -39.1f)
        arcToRelative(
          102.4f,
          102.4f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -22.6f,
          2.7f
        )
        curveToRelative(-43.1f, 0f, -52.9f, -33.5f, -52.9f, -33.5f)
        curveToRelative(-10.2f, -26.5f, -24.9f, -33.6f, -24.9f, -33.6f)
        curveToRelative(-19.5f, -13.7f, -0.1f, -14.1f, 1.4f, -14.1f)
        horizontalLineToRelative(0.1f)
        curveToRelative(22.5f, 2f, 34.3f, 23.8f, 34.3f, 23.8f)
        curveToRelative(11.2f, 19.6f, 26.2f, 25.1f, 39.6f, 25.1f)
        arcToRelative(63f, 63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.6f, -6f)
        curveToRelative(2f, -14.8f, 7.8f, -24.9f, 14.2f, -30.7f)
        curveToRelative(-49.7f, -5.8f, -102f, -25.5f, -102f, -113.5f)
        curveToRelative(0f, -25.1f, 8.7f, -45.6f, 23f, -61.6f)
        curveToRelative(-2.3f, -5.8f, -10f, -29.2f, 2.2f, -60.8f)
        arcToRelative(18.64f, 18.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, -0.5f)
        curveToRelative(8.1f, 0f, 26.4f, 3.1f, 56.6f, 24.1f)
        arcToRelative(
          208.21f,
          208.21f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          112.2f,
          0f
        )
        curveToRelative(30.2f, -21f, 48.5f, -24.1f, 56.6f, -24.1f)
        arcToRelative(18.64f, 18.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 0.5f)
        curveToRelative(12.2f, 31.6f, 4.5f, 55f, 2.2f, 60.8f)
        curveToRelative(14.3f, 16.1f, 23f, 36.6f, 23f, 61.6f)
        curveToRelative(0f, 88.2f, -52.4f, 107.6f, -102.3f, 113.3f)
        curveToRelative(8f, 7.1f, 15.2f, 21.1f, 15.2f, 42.5f)
        curveToRelative(0f, 30.7f, -0.3f, 55.5f, -0.3f, 63f)
        curveToRelative(0f, 5.4f, 3.1f, 11.5f, 11.4f, 11.5f)
        arcToRelative(19.35f, 19.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -0.4f)
        curveTo(415.9f, 449.2f, 480f, 363.1f, 480f, 261.7f)
        curveTo(480f, 134.9f, 379.7f, 32f, 256f, 32f)
        close()
      }
    }.build()

    return _Github!!
  }

@Suppress("ObjectPropertyName")
private var _Github: ImageVector? = null
