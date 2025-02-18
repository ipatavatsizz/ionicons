package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ThumbsUp: ImageVector
  get() {
    if (_ThumbsUpSharp != null) {
      return _ThumbsUpSharp!!
    }
    _ThumbsUpSharp = ImageVector.Builder(
      name = "Sharp.ThumbsUpSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(456f, 192f)
        lineTo(300f, 180f)
        lineToRelative(23f, -89.4f)
        curveTo(329f, 64f, 322.22f, 48.73f, 300.53f, 42f)
        lineToRelative(-34.69f, -9.85f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.4f, 1.72f)
        lineToRelative(-129f, 202.34f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.81f, 3.81f)
        horizontalLineTo(16f)
        verticalLineTo(448f)
        horizontalLineTo(133.61f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.18f, 2.46f)
        lineToRelative(76.3f, 25.43f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.3f, 4.11f)
        horizontalLineTo(428.32f)
        curveToRelative(19f, 0f, 31.5f, -13.52f, 35.23f, -32.16f)
        lineTo(496f, 305.58f)
        verticalLineTo(232f)
        curveTo(496f, 209.94f, 478f, 194f, 456f, 192f)
        close()
      }
    }.build()

    return _ThumbsUpSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ThumbsUpSharp: ImageVector? = null
