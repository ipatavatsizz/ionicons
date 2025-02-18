package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Card: ImageVector
  get() {
    if (_CardOutline != null) {
      return _CardOutline!!
    }
    _CardOutline = ImageVector.Builder(
      name = "Outline.CardOutline",
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
        moveTo(104f, 96f)
        lineTo(408f, 96f)
        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 152f)
        lineTo(464f, 360f)
        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 408f, 416f)
        lineTo(104f, 416f)
        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 360f)
        lineTo(48f, 152f)
        arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 96f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 60f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(48f, 192f)
        lineTo(464f, 192f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 60f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(128f, 300f)
        horizontalLineToRelative(48f)
        verticalLineToRelative(20f)
        horizontalLineToRelative(-48f)
        close()
      }
    }.build()

    return _CardOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CardOutline: ImageVector? = null
