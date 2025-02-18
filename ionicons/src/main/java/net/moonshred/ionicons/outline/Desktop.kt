package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Desktop: ImageVector
  get() {
    if (_DesktopOutline != null) {
      return _DesktopOutline!!
    }
    _DesktopOutline = ImageVector.Builder(
      name = "Outline.DesktopOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 64f)
        lineTo(448f, 64f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 480f, 96f)
        lineTo(480f, 352f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 448f, 384f)
        lineTo(64f, 384f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 352f)
        lineTo(32f, 96f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
        close()
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(304f, 448f)
        lineToRelative(-8f, -64f)
        lineToRelative(-80f, 0f)
        lineToRelative(-8f, 64f)
        lineToRelative(96f, 0f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(368f, 448f)
        lineTo(144f, 448f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(32f, 304f)
        verticalLineToRelative(48f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 32f)
        lineTo(448f, 384f)
        arcToRelative(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, -32f)
        lineTo(480f, 304f)
        close()
        moveTo(256f, 368f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 368f)
        close()
      }
    }.build()

    return _DesktopOutline!!
  }

@Suppress("ObjectPropertyName")
private var _DesktopOutline: ImageVector? = null
