package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.ThumbsDown: ImageVector
  get() {
    if (_ThumbsDownSharp != null) {
      return _ThumbsDownSharp!!
    }
    _ThumbsDownSharp = ImageVector.Builder(
      name = "Sharp.ThumbsDownSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(56f, 320f)
        lineToRelative(156.05f, 12f)
        lineToRelative(-23f, 89.4f)
        curveToRelative(-6.08f, 26.6f, 0.7f, 41.87f, 22.39f, 48.62f)
        lineToRelative(34.69f, 9.85f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.4f, -1.72f)
        lineToRelative(129f, -202.34f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.81f, -3.81f)
        horizontalLineTo(496f)
        verticalLineTo(64f)
        horizontalLineTo(378.39f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.18f, -2.46f)
        lineToRelative(-76.3f, -25.43f)
        arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 261.61f, 32f)
        horizontalLineTo(83.68f)
        curveToRelative(-19f, 0f, -31.5f, 13.52f, -35.23f, 32.16f)
        lineTo(16f, 206.42f)
        verticalLineTo(280f)
        curveTo(16f, 302.06f, 34f, 318f, 56f, 320f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(372.66f, 279.16f)
        lineToRelative(-1f, 2f)
        arcToRelative(
          16.29f,
          16.29f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          6.77f,
          -7.26f
        )
        arcTo(16.48f, 16.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 372.66f, 279.16f)
        close()
      }
    }.build()

    return _ThumbsDownSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ThumbsDownSharp: ImageVector? = null
