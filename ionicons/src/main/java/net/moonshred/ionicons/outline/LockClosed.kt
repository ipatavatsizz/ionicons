package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.LockClosed: ImageVector
  get() {
    if (_LockClosedOutline != null) {
      return _LockClosedOutline!!
    }
    _LockClosedOutline = ImageVector.Builder(
      name = "Outline.LockClosedOutline",
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
        moveTo(336f, 208f)
        verticalLineTo(113f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, -160f, 0f)
        verticalLineToRelative(95f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 208f)
        lineTo(368f, 208f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 416f, 256f)
        lineTo(416f, 432f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 480f)
        lineTo(144f, 480f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 432f)
        lineTo(96f, 256f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 208f)
        close()
      }
    }.build()

    return _LockClosedOutline!!
  }

@Suppress("ObjectPropertyName")
private var _LockClosedOutline: ImageVector? = null
