package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Easel: ImageVector
  get() {
    if (_Easel != null) {
      return _Easel!!
    }
    _Easel = ImageVector.Builder(
      name = "Filled.Easel",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(92f, 112f)
        lineTo(420f, 112f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 432f, 124f)
        lineTo(432f, 308f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 420f, 320f)
        lineTo(92f, 320f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 308f)
        lineTo(80f, 124f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 112f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(432f, 64f)
        lineTo(272f, 64f)
        lineTo(272f, 48f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 0f)
        lineTo(240f, 64f)
        lineTo(80f, 64f)
        arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, 48f)
        lineTo(32f, 320f)
        arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
        horizontalLineToRelative(42.79f)
        lineTo(96.62f, 459.6f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 30.76f, 8.8f)
        lineTo(156.07f, 368f)
        lineTo(240f, 368f)
        verticalLineToRelative(48f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 0f)
        lineTo(272f, 368f)
        horizontalLineToRelative(83.93f)
        lineToRelative(28.69f, 100.4f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 30.76f, -8.8f)
        lineTo(389.21f, 368f)
        lineTo(432f, 368f)
        arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -48f)
        lineTo(480f, 112f)
        arcTo(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 432f, 64f)
        close()
        moveTo(448f, 320f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
        lineTo(80f, 336f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
        lineTo(64f, 112f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 96f)
        lineTo(432f, 96f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        close()
      }
    }.build()

    return _Easel!!
  }

@Suppress("ObjectPropertyName")
private var _Easel: ImageVector? = null
