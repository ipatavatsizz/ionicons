package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.HeartDislike: ImageVector
  get() {
    if (_HeartDislikeSharp != null) {
      return _HeartDislikeSharp!!
    }
    _HeartDislikeSharp = ImageVector.Builder(
      name = "Sharp.HeartDislikeSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 64.45f)
        lineToRelative(389.47f, 389.94f)
        lineToRelative(22.84f, -22.47f)
        lineToRelative(-389.46f, -389.92f)
        lineToRelative(-22.85f, 22.45f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(62.67f, 192.91f)
        curveToRelative(-0.56f, 55.63f, 19.77f, 106.94f, 62.16f, 156.88f)
        curveTo(165.08f, 397.21f, 219.39f, 429.46f, 262.3f, 458f)
        lineToRelative(9f, 6f)
        lineToRelative(9f, -6f)
        curveToRelative(18.49f, -12.3f, 39.1f, -25.3f, 59.79f, -39.89f)
        lineTo(71.74f, 149.28f)
        arcTo(114.62f, 114.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 62.67f, 192.91f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(417.83f, 349.79f)
        curveToRelative(42.39f, -49.94f, 62.72f, -101.25f, 62.16f, -156.88f)
        curveToRelative(-0.63f, -62f, -50.61f, -112.54f, -111.43f, -112.54f)
        curveToRelative(-48.26f, 0f, -80.35f, 28f, -97.23f, 48.17f)
        curveToRelative(-16.88f, -20.2f, -49f, -48.17f, -97.23f, -48.17f)
        arcTo(108.24f, 108.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 142.84f, 85f)
        lineToRelative(270f, 270.48f)
        curveTo(414.55f, 353.59f, 416.21f, 351.7f, 417.83f, 349.79f)
        close()
      }
    }.build()

    return _HeartDislikeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HeartDislikeSharp: ImageVector? = null
