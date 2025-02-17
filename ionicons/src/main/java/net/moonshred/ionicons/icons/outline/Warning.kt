package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Warning: ImageVector
  get() {
    if (_WarningOutline != null) {
      return _WarningOutline!!
    }
    _WarningOutline = ImageVector.Builder(
      name = "Outline.WarningOutline",
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
        moveTo(85.57f, 446.25f)
        horizontalLineTo(426.43f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 28.17f, -47.17f)
        lineTo(284.18f, 82.58f)
        curveToRelative(-12.09f, -22.44f, -44.27f, -22.44f, -56.36f, 0f)
        lineTo(57.4f, 399.08f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 85.57f, 446.25f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(250.26f, 195.39f)
        lineToRelative(5.74f, 122f)
        lineToRelative(5.73f, -121.95f)
        arcToRelative(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.79f, -6f)
        horizontalLineToRelative(0f)
        arcTo(5.74f, 5.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 250.26f, 195.39f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 397.25f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 20f, -20f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 397.25f)
        close()
      }
    }.build()

    return _WarningOutline!!
  }

@Suppress("ObjectPropertyName")
private var _WarningOutline: ImageVector? = null
