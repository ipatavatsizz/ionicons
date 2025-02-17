package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Map: ImageVector
  get() {
    if (_MapOutline != null) {
      return _MapOutline!!
    }
    _MapOutline = ImageVector.Builder(
      name = "Outline.MapOutline",
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
        moveTo(313.27f, 124.64f)
        lineTo(198.73f, 51.36f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -29.28f, 0.35f)
        lineTo(56.51f, 127.49f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 141.63f)
        verticalLineToRelative(295.8f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.49f, 14.14f)
        lineToRelative(97.82f, -63.79f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 29.5f, -0.24f)
        lineToRelative(111.86f, 73f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29.27f, -0.11f)
        lineToRelative(115.43f, -75.94f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.63f, -14.2f)
        verticalLineTo(74.57f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -23.49f, -14.14f)
        lineToRelative(-98f, 63.86f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 313.27f, 124.64f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(328f, 128f)
        lineTo(328f, 464f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(184f, 48f)
        lineTo(184f, 384f)
      }
    }.build()

    return _MapOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MapOutline: ImageVector? = null
