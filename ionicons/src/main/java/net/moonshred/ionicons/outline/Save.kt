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

val Ionicons.Outline.Save: ImageVector
  get() {
    if (_SaveOutline != null) {
      return _SaveOutline!!
    }
    _SaveOutline = ImageVector.Builder(
      name = "Outline.SaveOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(380.93f, 57.37f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 358.3f, 48f)
        lineTo(94.22f, 48f)
        arcTo(46.21f, 46.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 94.22f)
        lineTo(48f, 417.78f)
        arcTo(46.21f, 46.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 94.22f, 464f)
        lineTo(417.78f, 464f)
        arcTo(46.36f, 46.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 464f, 417.78f)
        lineTo(464f, 153.7f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.37f, -22.63f)
        close()
        moveTo(256f, 416f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, -64f)
        arcTo(63.92f, 63.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 416f)
        close()
        moveTo(304f, 192f)
        lineTo(112f, 192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
        lineTo(96f, 112f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        lineTo(304f, 96f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        verticalLineToRelative(64f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 304f, 192f)
        close()
      }
    }.build()

    return _SaveOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SaveOutline: ImageVector? = null
