package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Send: ImageVector
  get() {
    if (_SendOutline != null) {
      return _SendOutline!!
    }
    _SendOutline = ImageVector.Builder(
      name = "Outline.SendOutline",
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
        moveTo(470.3f, 271.15f)
        lineTo(43.16f, 447.31f)
        arcToRelative(7.83f, 7.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.16f, -7f)
        verticalLineTo(327f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.51f, -7.86f)
        lineToRelative(247.62f, -47f)
        curveToRelative(17.36f, -3.29f, 17.36f, -28.15f, 0f, -31.44f)
        lineToRelative(-247.63f, -47f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.5f, -7.85f)
        verticalLineTo(72.59f)
        curveToRelative(0f, -5.74f, 5.88f, -10.26f, 11.16f, -8f)
        lineTo(470.3f, 241.76f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 470.3f, 271.15f)
        close()
      }
    }.build()

    return _SendOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SendOutline: ImageVector? = null
