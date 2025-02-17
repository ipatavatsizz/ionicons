package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Bug: ImageVector
  get() {
    if (_BugSharp != null) {
      return _BugSharp!!
    }
    _BugSharp = ImageVector.Builder(
      name = "Sharp.BugSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(480f, 304.13f)
        verticalLineToRelative(-32f)
        horizontalLineTo(400f)
        verticalLineTo(215.2f)
        curveToRelative(29.42f, -27.95f, 32f, -64.76f, 32f, -103.2f)
        verticalLineTo(96f)
        horizontalLineTo(400f)
        verticalLineToRelative(16f)
        curveToRelative(0f, 28f, -1.86f, 48.15f, -9.9f, 63.84f)
        curveTo(368f, 128f, 324.32f, 112f, 256f, 112f)
        curveToRelative(-39.8f, 0f, -75.19f, 7.06f, -100.43f, 24.32f)
        curveToRelative(-14.9f, 10.19f, -25.2f, 24.91f, -32.7f, 39.72f)
        curveTo(114f, 160.57f, 112f, 140.82f, 112f, 112f)
        verticalLineTo(96f)
        horizontalLineTo(80f)
        verticalLineToRelative(16f)
        curveToRelative(0f, 37.44f, 2.59f, 73.36f, 32f, 101.2f)
        verticalLineToRelative(58.93f)
        horizontalLineTo(32f)
        verticalLineToRelative(32f)
        lineToRelative(80f, -0.13f)
        curveToRelative(0f, 19f, 3.7f, 53.09f, 10.39f, 69.69f)
        curveTo(96.6f, 396.76f, 80f, 422.31f, 80f, 464f)
        verticalLineToRelative(16f)
        horizontalLineToRelative(32f)
        verticalLineTo(464f)
        curveToRelative(0f, -27.66f, 9.1f, -44.71f, 26.17f, -61.32f)
        curveTo(160f, 448f, 177f, 464f, 240f, 464f)
        verticalLineTo(176f)
        horizontalLineToRelative(32f)
        verticalLineTo(464f)
        curveToRelative(65f, 0f, 80f, -16f, 101.83f, -61.32f)
        curveTo(390.9f, 419.29f, 400f, 436.35f, 400f, 464f)
        verticalLineToRelative(16f)
        horizontalLineToRelative(32f)
        verticalLineTo(464f)
        curveToRelative(0f, -41.68f, -16.6f, -67.23f, -42.39f, -90.31f)
        curveTo(396.3f, 357.09f, 400f, 323f, 400f, 304f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 32f)
        curveToRelative(-48.06f, 0f, -96f, 0f, -96f, 84f)
        curveToRelative(26.12f, -14f, 59.35f, -20f, 96f, -20f)
        curveToRelative(24.09f, 0f, 46.09f, 2.65f, 65.39f, 8f)
        curveToRelative(10.75f, 3f, 24.66f, 8.71f, 30.61f, 12f)
        curveTo(352f, 32f, 304.06f, 32f, 256f, 32f)
        close()
      }
    }.build()

    return _BugSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BugSharp: ImageVector? = null
