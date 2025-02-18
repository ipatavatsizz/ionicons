package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ChatboxEllipses: ImageVector
  get() {
    if (_ChatboxEllipsesSharp != null) {
      return _ChatboxEllipsesSharp!!
    }
    _ChatboxEllipsesSharp = ImageVector.Builder(
      name = "Sharp.ChatboxEllipsesSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(456f, 48f)
        lineTo(56f, 48f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 72f)
        lineTo(32f, 360f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
        horizontalLineToRelative(72f)
        verticalLineToRelative(80f)
        lineToRelative(117.74f, -80f)
        lineTo(456f, 384f)
        arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
        lineTo(480f, 72f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 456f, 48f)
        close()
        moveTo(160f, 248f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 248f)
        close()
        moveTo(256f, 248f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 248f)
        close()
        moveTo(352f, 248f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 352f, 248f)
        close()
        moveTo(456f, 80f)
        horizontalLineToRelative(0f)
        close()
      }
    }.build()

    return _ChatboxEllipsesSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ChatboxEllipsesSharp: ImageVector? = null
