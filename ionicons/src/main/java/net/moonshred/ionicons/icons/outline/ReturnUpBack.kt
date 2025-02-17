package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.ReturnUpBack: ImageVector
  get() {
    if (_ReturnUpBackOutline != null) {
      return _ReturnUpBackOutline!!
    }
    _ReturnUpBackOutline = ImageVector.Builder(
      name = "Outline.ReturnUpBackOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 160f)
        lineToRelative(-64f, 64f)
        lineToRelative(64f, 64f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(64f, 224f)
        horizontalLineTo(358f)
        curveToRelative(58.76f, 0f, 106f, 49.33f, 106f, 108f)
        verticalLineToRelative(20f)
      }
    }.build()

    return _ReturnUpBackOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ReturnUpBackOutline: ImageVector? = null
