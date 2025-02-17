package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Woman: ImageVector
  get() {
    if (_WomanSharp != null) {
      return _WomanSharp!!
    }
    _WomanSharp = ImageVector.Builder(
      name = "Sharp.WomanSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(255.75f, 56f)
        moveToRelative(-56f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, 112f, 0f)
        arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = true, -112f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(310.28f, 191.4f)
        horizontalLineToRelative(0.05f)
        lineToRelative(7.66f, -2.3f)
        lineToRelative(36.79f, 122.6f)
        lineToRelative(46f, -13.8f)
        lineToRelative(-16.21f, -54.16f)
        curveToRelative(0f, -0.12f, 0f, -0.24f, -0.07f, -0.36f)
        lineToRelative(-16.84f, -56.12f)
        lineToRelative(-4.71f, -15.74f)
        horizontalLineToRelative(0f)
        lineToRelative(-0.9f, -3f)
        horizontalLineTo(362f)
        lineToRelative(-2.51f, -8.45f)
        arcToRelative(
          44.84f,
          44.84f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -43f,
          -32.08f
        )
        horizontalLineTo(195.24f)
        arcToRelative(
          44.84f,
          44.84f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -43f,
          32.08f
        )
        lineToRelative(-2.51f, 8.45f)
        horizontalLineToRelative(-0.06f)
        lineToRelative(-0.9f, 3f)
        horizontalLineToRelative(0f)
        lineToRelative(-4.71f, 15.74f)
        lineToRelative(-16.84f, 56.12f)
        curveToRelative(0f, 0.12f, 0f, 0.24f, -0.07f, 0.36f)
        lineTo(110.94f, 297.9f)
        lineToRelative(46f, 13.8f)
        lineTo(193.7f, 189.1f)
        lineToRelative(7.54f, 2.26f)
        lineTo(148.25f, 368f)
        horizontalLineToRelative(51.5f)
        verticalLineTo(512f)
        horizontalLineToRelative(52f)
        verticalLineTo(368f)
        horizontalLineToRelative(8f)
        verticalLineTo(512f)
        horizontalLineToRelative(52f)
        verticalLineTo(368f)
        horizontalLineToRelative(51.51f)
        close()
      }
    }.build()

    return _WomanSharp!!
  }

@Suppress("ObjectPropertyName")
private var _WomanSharp: ImageVector? = null
