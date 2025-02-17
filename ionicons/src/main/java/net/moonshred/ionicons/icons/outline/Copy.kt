package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Copy: ImageVector
  get() {
    if (_CopyOutline != null) {
      return _CopyOutline!!
    }
    _CopyOutline = ImageVector.Builder(
      name = "Outline.CopyOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(185f, 128f)
        lineTo(407f, 128f)
        arcTo(57f, 57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 185f)
        lineTo(464f, 407f)
        arcTo(57f, 57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 407f, 464f)
        lineTo(185f, 464f)
        arcTo(57f, 57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 407f)
        lineTo(128f, 185f)
        arcTo(57f, 57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 185f, 128f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(383.5f, 128f)
        lineToRelative(0.5f, -24f)
        arcToRelative(56.16f, 56.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -56f, -56f)
        horizontalLineTo(112f)
        arcToRelative(64.19f, 64.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 64f)
        verticalLineTo(328f)
        arcToRelative(56.16f, 56.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 56f)
        horizontalLineToRelative(24f)
      }
    }.build()

    return _CopyOutline!!
  }

@Suppress("ObjectPropertyName")
private var _CopyOutline: ImageVector? = null
