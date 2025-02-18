package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.HandRight: ImageVector
  get() {
    if (_HandRightSharp != null) {
      return _HandRightSharp!!
    }
    _HandRightSharp = ImageVector.Builder(
      name = "Sharp.HandRightSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(82.42f, 209.08f)
        horizontalLineToRelative(0f)
        curveToRelative(15.06f, -6.62f, 32.38f, 1.31f, 38.5f, 17.62f)
        lineTo(156f, 312f)
        horizontalLineToRelative(11.27f)
        verticalLineTo(80f)
        curveToRelative(0f, -17.6f, 13.3f, -32f, 29.55f, -32f)
        horizontalLineToRelative(0f)
        curveToRelative(16.26f, 0f, 29.55f, 14.4f, 29.55f, 32f)
        verticalLineTo(231.75f)
        lineToRelative(14.78f, 0.25f)
        verticalLineTo(32f)
        curveToRelative(0f, -17.6f, 13.3f, -32f, 29.55f, -32f)
        horizontalLineToRelative(0f)
        curveTo(287f, 0f, 300.25f, 14.4f, 300.25f, 32f)
        verticalLineTo(231.75f)
        lineTo(315f, 232f)
        verticalLineTo(64f)
        curveToRelative(0f, -17.6f, 13.3f, -32f, 29.55f, -32f)
        horizontalLineToRelative(0f)
        curveToRelative(16.26f, 0f, 29.55f, 14.4f, 29.55f, 32f)
        verticalLineTo(247.75f)
        lineToRelative(14.78f, 0.25f)
        verticalLineTo(128f)
        curveToRelative(0f, -17.6f, 13.3f, -32f, 29.55f, -32f)
        horizontalLineToRelative(0f)
        curveTo(434.7f, 96f, 448f, 110.4f, 448f, 128f)
        verticalLineTo(344f)
        curveToRelative(0f, 75.8f, -37.13f, 168f, -169f, 168f)
        curveToRelative(-40.8f, 0f, -79.42f, -7f, -100.66f, -21f)
        arcToRelative(
          121.41f,
          121.41f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -33.72f,
          -33.31f
        )
        arcToRelative(138f, 138f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -31.78f)
        lineTo(66.16f, 250.77f)
        curveTo(60.05f, 234.46f, 67.36f, 215.71f, 82.42f, 209.08f)
        close()
      }
    }.build()

    return _HandRightSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HandRightSharp: ImageVector? = null
