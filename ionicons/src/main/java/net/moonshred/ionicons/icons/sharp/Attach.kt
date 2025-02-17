package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Attach: ImageVector
  get() {
    if (_AttachSharp != null) {
      return _AttachSharp!!
    }
    _AttachSharp = ImageVector.Builder(
      name = "Sharp.AttachSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(216.08f, 192f)
        verticalLineTo(335.55f)
        arcToRelative(40.08f, 40.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80.15f, 0f)
        lineTo(296.36f, 147f)
        arcToRelative(
          67.94f,
          67.94f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = false,
          -135.87f,
          0f
        )
        verticalLineTo(336.82f)
        arcToRelative(95.51f, 95.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 191f, 0f)
        verticalLineTo(159.44f)
      }
    }.build()

    return _AttachSharp!!
  }

@Suppress("ObjectPropertyName")
private var _AttachSharp: ImageVector? = null
