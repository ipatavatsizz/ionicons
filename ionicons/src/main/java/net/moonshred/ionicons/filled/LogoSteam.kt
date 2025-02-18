package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoSteam: ImageVector
  get() {
    if (_LogoSteam != null) {
      return _LogoSteam!!
    }
    _LogoSteam = ImageVector.Builder(
      name = "Filled.LogoSteam",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(478.8f, 208.2f)
        arcToRelative(36f, 36f, 0f, isMoreThanHalf = true, isPositiveArc = true, -36f, -36f)
        arcTo(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 478.8f, 208.2f)
        close()
        moveTo(442.6f, 139f)
        arcToRelative(
          69.42f,
          69.42f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -69.4f,
          68.7f
        )
        lineToRelative(-43.2f, 62f)
        arcToRelative(
          48.86f,
          48.86f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -5.4f,
          -0.3f
        )
        arcToRelative(
          51.27f,
          51.27f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -26.4f,
          7.3f
        )
        lineTo(102.4f, 198f)
        arcToRelative(51.8f, 51.8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -50.6f, 62.9f)
        arcToRelative(
          51.27f,
          51.27f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          26.4f,
          -7.3f
        )
        lineTo(274f, 332.2f)
        arcToRelative(
          51.76f,
          51.76f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          102.1f,
          -5.9f
        )
        lineToRelative(66.5f, -48.6f)
        arcToRelative(69.35f, 69.35f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -138.7f)
        close()
        moveTo(442.6f, 161.9f)
        arcToRelative(
          46.45f,
          46.45f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = true,
          -46.5f,
          46.5f
        )
        arcTo(46.54f, 46.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 442.6f, 161.9f)
        close()
        moveTo(51.8f, 170.9f)
        arcToRelative(
          38.18f,
          38.18f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          33.7f,
          20.2f
        )
        lineToRelative(-18.9f, -7.6f)
        verticalLineToRelative(0.1f)
        arcToRelative(
          30.21f,
          30.21f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -22.6f,
          56f
        )
        verticalLineToRelative(0.1f)
        lineToRelative(16.1f, 6.4f)
        arcToRelative(36.8f, 36.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.2f, 0.9f)
        arcToRelative(
          38.05f,
          38.05f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -0.1f,
          -76.1f
        )
        close()
        moveTo(324.6f, 283.1f)
        arcTo(38.1f, 38.1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 290.9f, 339f)
        curveToRelative(6.3f, 2.5f, 12.5f, 5f, 18.8f, 7.6f)
        arcToRelative(
          30.27f,
          30.27f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = false,
          22.5f,
          -56.2f
        )
        lineTo(316.3f, 284f)
        arcTo(46.83f, 46.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 324.6f, 283.1f)
        close()
      }
    }.build()

    return _LogoSteam!!
  }

@Suppress("ObjectPropertyName")
private var _LogoSteam: ImageVector? = null
