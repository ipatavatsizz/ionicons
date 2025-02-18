package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Ticket: ImageVector
  get() {
    if (_TicketSharp != null) {
      return _TicketSharp!!
    }
    _TicketSharp = ImageVector.Builder(
      name = "Sharp.TicketSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(426.24f, 127.72f)
        lineTo(415.3f, 138.66f)
        arcToRelative(29.67f, 29.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, -42f, -42f)
        lineToRelative(10.94f, -10.94f)
        lineTo(314.52f, 16f)
        lineToRelative(-88f, 88f)
        lineToRelative(-4f, 12.09f)
        lineToRelative(-12.09f, 4f)
        lineTo(16f, 314.52f)
        lineToRelative(69.76f, 69.76f)
        lineTo(96.7f, 373.34f)
        arcToRelative(29.67f, 29.67f, 0f, isMoreThanHalf = false, isPositiveArc = true, 42f, 42f)
        lineToRelative(-10.94f, 10.94f)
        lineTo(197.48f, 496f)
        lineToRelative(194.4f, -194.4f)
        lineToRelative(4f, -12.09f)
        lineToRelative(12.09f, -4f)
        lineToRelative(88f, -88f)
        close()
        moveTo(217.68f, 133.15f)
        lineTo(239.55f, 111.28f)
        lineTo(272.55f, 144.28f)
        lineTo(250.67f, 166.15f)
        close()
        moveTo(260.68f, 176.15f)
        lineTo(282.56f, 154.27f)
        lineTo(315.08f, 186.79f)
        lineTo(293.2f, 208.67f)
        close()
        moveTo(303.24f, 218.71f)
        lineTo(325.12f, 196.83f)
        lineTo(357.64f, 229.35f)
        lineTo(335.8f, 251.28f)
        close()
        moveTo(378.81f, 294.27f)
        lineTo(345.81f, 261.27f)
        lineTo(367.68f, 239.39f)
        lineTo(400.68f, 272.39f)
        close()
      }
    }.build()

    return _TicketSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TicketSharp: ImageVector? = null
