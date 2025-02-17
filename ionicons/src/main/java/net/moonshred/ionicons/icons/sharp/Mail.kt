package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Mail: ImageVector
  get() {
    if (_MailSharp != null) {
      return _MailSharp!!
    }
    _MailSharp = ImageVector.Builder(
      name = "Sharp.MailSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 80f)
        horizontalLineTo(48f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 96f)
        verticalLineTo(416f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineTo(464f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        verticalLineTo(96f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 464f, 80f)
        close()
        moveTo(265.82f, 284.63f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -19.64f, 0f)
        lineTo(89.55f, 162.81f)
        lineToRelative(19.64f, -25.26f)
        lineTo(256f, 251.73f)
        lineTo(402.81f, 137.55f)
        lineToRelative(19.64f, 25.26f)
        close()
      }
    }.build()

    return _MailSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MailSharp: ImageVector? = null
