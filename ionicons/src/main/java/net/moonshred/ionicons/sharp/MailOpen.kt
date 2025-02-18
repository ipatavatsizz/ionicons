package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.MailOpen: ImageVector
  get() {
    if (_MailOpenSharp != null) {
      return _MailOpenSharp!!
    }
    _MailOpenSharp = ImageVector.Builder(
      name = "Sharp.MailOpenSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(471.05f, 168.36f)
        lineTo(263.24f, 65.69f)
        arcToRelative(
          16.37f,
          16.37f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -14.48f,
          0f
        )
        lineTo(41f, 168.36f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, 14.31f)
        verticalLineTo(432f)
        arcToRelative(
          16.09f,
          16.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          16.19f,
          16f
        )
        horizontalLineTo(463.81f)
        arcTo(16.09f, 16.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 480f, 432f)
        verticalLineTo(182.67f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 471.05f, 168.36f)
        close()
        moveTo(256f, 97.89f)
        lineToRelative(173f, 85.44f)
        lineTo(253.3f, 270.11f)
        lineToRelative(-173f, -85.44f)
        close()
      }
    }.build()

    return _MailOpenSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MailOpenSharp: ImageVector? = null
