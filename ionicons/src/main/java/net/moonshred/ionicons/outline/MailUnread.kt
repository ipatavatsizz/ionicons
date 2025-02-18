package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.MailUnread: ImageVector
  get() {
    if (_MailUnreadOutline != null) {
      return _MailUnreadOutline!!
    }
    _MailUnreadOutline = ImageVector.Builder(
      name = "Outline.MailUnreadOutline",
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
        moveTo(320f, 96f)
        horizontalLineTo(88f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, 40f)
        verticalLineTo(376f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
        horizontalLineTo(422.73f)
        arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
        verticalLineTo(239f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(112f, 160f)
        lineToRelative(144f, 112f)
        lineToRelative(87f, -65.67f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(431.95f, 128.05f)
        moveToRelative(-47.95f, 0f)
        arcToRelative(47.95f, 47.95f, 0f, isMoreThanHalf = true, isPositiveArc = true, 95.9f, 0f)
        arcToRelative(47.95f, 47.95f, 0f, isMoreThanHalf = true, isPositiveArc = true, -95.9f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(432f, 192f)
        arcToRelative(
          63.95f,
          63.95f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = true,
          63.95f,
          -63.95f
        )
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 432f, 192f)
        close()
        moveTo(432f, 96.1f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 31.95f, 32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 432f, 96.1f)
        close()
      }
    }.build()

    return _MailUnreadOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MailUnreadOutline: ImageVector? = null
