package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Ticket: ImageVector
  get() {
    if (_TicketOutline != null) {
      return _TicketOutline!!
    }
    _TicketOutline = ImageVector.Builder(
      name = "Outline.TicketOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(366.05f, 146f)
        arcToRelative(
          46.7f,
          46.7f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -2.42f,
          -63.42f
        )
        arcToRelative(
          3.87f,
          3.87f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.22f,
          -5.26f
        )
        lineTo(319.28f, 33.14f)
        arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 0f)
        lineToRelative(-70.34f, 70.34f)
        arcToRelative(
          23.62f,
          23.62f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -5.71f,
          9.24f
        )
        horizontalLineToRelative(0f)
        arcToRelative(
          23.66f,
          23.66f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -14.95f,
          15f
        )
        horizontalLineToRelative(0f)
        arcToRelative(
          23.7f,
          23.7f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -9.25f,
          5.71f
        )
        lineTo(33.14f, 313.78f)
        arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
        lineToRelative(44.13f, 44.13f)
        arcToRelative(3.87f, 3.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.26f, 0.22f)
        arcToRelative(
          46.69f,
          46.69f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          65.84f,
          65.84f
        )
        arcToRelative(3.87f, 3.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.22f, 5.26f)
        lineToRelative(44.13f, 44.13f)
        arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 0f)
        lineToRelative(180.4f, -180.39f)
        arcToRelative(
          23.7f,
          23.7f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          5.71f,
          -9.25f
        )
        horizontalLineToRelative(0f)
        arcToRelative(
          23.66f,
          23.66f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          14.95f,
          -15f
        )
        horizontalLineToRelative(0f)
        arcToRelative(
          23.62f,
          23.62f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          9.24f,
          -5.71f
        )
        lineToRelative(70.34f, -70.34f)
        arcToRelative(3.89f, 3.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.5f)
        lineToRelative(-44.13f, -44.13f)
        arcToRelative(
          3.87f,
          3.87f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -5.26f,
          -0.22f
        )
        arcTo(46.7f, 46.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 366.05f, 146f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(250.5f, 140.44f)
        lineTo(233.99f, 123.93f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(294.52f, 184.46f)
        lineTo(283.51f, 173.46f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(338.54f, 228.49f)
        lineTo(327.54f, 217.48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(388.07f, 278.01f)
        lineTo(371.56f, 261.5f)
      }
    }.build()

    return _TicketOutline!!
  }

@Suppress("ObjectPropertyName")
private var _TicketOutline: ImageVector? = null
