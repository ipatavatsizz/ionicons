package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Information: ImageVector
  get() {
    if (_InformationOutline != null) {
      return _InformationOutline!!
    }
    _InformationOutline = ImageVector.Builder(
      name = "Outline.InformationOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 40f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(196f, 220f)
        lineToRelative(64f, 0f)
        lineToRelative(0f, 172f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 40f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(187f, 396f)
        lineTo(325f, 396f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 160f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 160f)
        close()
      }
    }.build()

    return _InformationOutline!!
  }

@Suppress("ObjectPropertyName")
private var _InformationOutline: ImageVector? = null
