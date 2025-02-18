package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.HandLeft: ImageVector
  get() {
    if (_HandLeftSharp != null) {
      return _HandLeftSharp!!
    }
    _HandLeftSharp = ImageVector.Builder(
      name = "Sharp.HandLeftSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(429.58f, 209.08f)
        horizontalLineToRelative(0f)
        curveToRelative(-15.06f, -6.62f, -32.38f, 1.31f, -38.5f, 17.62f)
        lineTo(356f, 312f)
        horizontalLineTo(344.73f)
        verticalLineTo(80f)
        curveToRelative(0f, -17.6f, -13.3f, -32f, -29.55f, -32f)
        horizontalLineToRelative(0f)
        curveToRelative(-16.26f, 0f, -29.55f, 14.4f, -29.55f, 32f)
        verticalLineTo(231.75f)
        lineToRelative(-14.78f, 0.25f)
        verticalLineTo(32f)
        curveToRelative(0f, -17.6f, -13.3f, -32f, -29.55f, -32f)
        horizontalLineToRelative(0f)
        curveToRelative(-16.25f, 0f, -29.55f, 14.4f, -29.55f, 32f)
        verticalLineTo(231.75f)
        lineTo(197f, 232f)
        verticalLineTo(64f)
        curveToRelative(0f, -17.6f, -13.3f, -32f, -29.55f, -32f)
        horizontalLineToRelative(0f)
        curveToRelative(-16.26f, 0f, -29.55f, 14.4f, -29.55f, 32f)
        verticalLineTo(247.75f)
        lineTo(123.1f, 248f)
        verticalLineTo(128f)
        curveToRelative(0f, -17.6f, -13.3f, -32f, -29.55f, -32f)
        horizontalLineToRelative(0f)
        curveTo(77.3f, 96f, 64f, 110.4f, 64f, 128f)
        verticalLineTo(344f)
        curveToRelative(0f, 75.8f, 37.13f, 168f, 169f, 168f)
        curveToRelative(40.8f, 0f, 79.42f, -7f, 100.66f, -21f)
        arcToRelative(
          121.41f,
          121.41f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          33.72f,
          -33.31f
        )
        arcToRelative(138f, 138f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -31.78f)
        lineToRelative(62.45f, -175.14f)
        curveTo(452f, 234.46f, 444.64f, 215.71f, 429.58f, 209.08f)
        close()
      }
    }.build()

    return _HandLeftSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HandLeftSharp: ImageVector? = null
