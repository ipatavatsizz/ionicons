package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Attach: ImageVector
  get() {
    if (_AttachOutline != null) {
      return _AttachOutline!!
    }
    _AttachOutline = ImageVector.Builder(
      name = "Outline.AttachOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(216.08f, 192f)
        verticalLineTo(335.85f)
        arcToRelative(40.08f, 40.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80.15f, 0f)
        lineToRelative(0.13f, -188.55f)
        arcToRelative(
          67.94f,
          67.94f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = false,
          -135.87f,
          0f
        )
        verticalLineTo(337.12f)
        arcToRelative(95.51f, 95.51f, 0f, isMoreThanHalf = true, isPositiveArc = false, 191f, 0f)
        verticalLineTo(159.74f)
      }
    }.build()

    return _AttachOutline!!
  }

@Suppress("ObjectPropertyName")
private var _AttachOutline: ImageVector? = null
