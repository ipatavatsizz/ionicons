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

val Ionicons.Outline.ReturnDownBack: ImageVector
  get() {
    if (_ReturnDownBackOutline != null) {
      return _ReturnDownBackOutline!!
    }
    _ReturnDownBackOutline = ImageVector.Builder(
      name = "Outline.ReturnDownBackOutline",
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
        moveTo(112f, 352f)
        lineToRelative(-64f, -64f)
        lineToRelative(64f, -64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 288f)
        horizontalLineTo(358f)
        curveToRelative(58.76f, 0f, 106f, -49.33f, 106f, -108f)
        verticalLineTo(160f)
      }
    }.build()

    return _ReturnDownBackOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ReturnDownBackOutline: ImageVector? = null
