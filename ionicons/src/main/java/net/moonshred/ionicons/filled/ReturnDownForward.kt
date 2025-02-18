package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.ReturnDownForward: ImageVector
  get() {
    if (_ReturnDownForward != null) {
      return _ReturnDownForward!!
    }
    _ReturnDownForward = ImageVector.Builder(
      name = "Filled.ReturnDownForward",
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
        moveTo(400f, 352f)
        lineToRelative(64f, -64f)
        lineToRelative(-64f, -64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(448f, 288f)
        horizontalLineTo(154f)
        curveTo(95.24f, 288f, 48f, 238.67f, 48f, 180f)
        verticalLineTo(160f)
      }
    }.build()

    return _ReturnDownForward!!
  }

@Suppress("ObjectPropertyName")
private var _ReturnDownForward: ImageVector? = null
