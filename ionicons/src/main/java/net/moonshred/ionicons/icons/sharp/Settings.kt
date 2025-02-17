package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Settings: ImageVector
  get() {
    if (_SettingsSharp != null) {
      return _SettingsSharp!!
    }
    _SettingsSharp = ImageVector.Builder(
      name = "Sharp.SettingsSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 176f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = true, isPositiveArc = false, 80f, 80f)
        arcTo(80.24f, 80.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 176f)
        close()
        moveTo(428.72f, 256f)
        arcToRelative(
          165.53f,
          165.53f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -1.64f,
          22.34f
        )
        lineToRelative(48.69f, 38.12f)
        arcToRelative(
          11.59f,
          11.59f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          2.63f,
          14.78f
        )
        lineToRelative(-46.06f, 79.52f)
        arcToRelative(
          11.64f,
          11.64f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -14.14f,
          4.93f
        )
        lineToRelative(-57.25f, -23f)
        arcToRelative(
          176.56f,
          176.56f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -38.82f,
          22.67f
        )
        lineToRelative(-8.56f, 60.78f)
        arcTo(11.93f, 11.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 302.06f, 486f)
        lineTo(209.94f, 486f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.51f, -9.53f)
        lineToRelative(-8.56f, -60.78f)
        arcTo(169.3f, 169.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 151.05f, 393f)
        lineTo(93.8f, 416f)
        arcToRelative(
          11.64f,
          11.64f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -14.14f,
          -4.92f
        )
        lineTo(33.6f, 331.57f)
        arcToRelative(
          11.59f,
          11.59f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          2.63f,
          -14.78f
        )
        lineToRelative(48.69f, -38.12f)
        arcTo(174.58f, 174.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 83.28f, 256f)
        arcToRelative(
          165.53f,
          165.53f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          1.64f,
          -22.34f
        )
        lineTo(36.23f, 195.54f)
        arcToRelative(
          11.59f,
          11.59f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -2.63f,
          -14.78f
        )
        lineToRelative(46.06f, -79.52f)
        arcTo(11.64f, 11.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 93.8f, 96.31f)
        lineToRelative(57.25f, 23f)
        arcToRelative(
          176.56f,
          176.56f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          38.82f,
          -22.67f
        )
        lineToRelative(8.56f, -60.78f)
        arcTo(11.93f, 11.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 209.94f, 26f)
        horizontalLineToRelative(92.12f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.51f, 9.53f)
        lineToRelative(8.56f, 60.78f)
        arcTo(169.3f, 169.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 361f, 119f)
        lineTo(418.2f, 96f)
        arcToRelative(
          11.64f,
          11.64f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          14.14f,
          4.92f
        )
        lineToRelative(46.06f, 79.52f)
        arcToRelative(
          11.59f,
          11.59f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -2.63f,
          14.78f
        )
        lineToRelative(-48.69f, 38.12f)
        arcTo(174.58f, 174.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 428.72f, 256f)
        close()
      }
    }.build()

    return _SettingsSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SettingsSharp: ImageVector? = null
