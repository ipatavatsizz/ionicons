package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Mail: ImageVector
  get() {
    if (_MailOutline != null) {
      return _MailOutline!!
    }
    _MailOutline = ImageVector.Builder(
      name = "Outline.MailOutline",
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
        moveTo(88f, 96f)
        lineTo(424f, 96f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 136f)
        lineTo(464f, 376f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 424f, 416f)
        lineTo(88f, 416f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 376f)
        lineTo(48f, 136f)
        arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 96f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 160f)
        lineToRelative(144f, 112f)
        lineToRelative(144f, -112f)
      }
    }.build()

    return _MailOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MailOutline: ImageVector? = null
