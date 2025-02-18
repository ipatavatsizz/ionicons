package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Pricetag: ImageVector
  get() {
    if (_PricetagOutline != null) {
      return _PricetagOutline!!
    }
    _PricetagOutline = ImageVector.Builder(
      name = "Outline.PricetagOutline",
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
        moveTo(435.25f, 48f)
        horizontalLineTo(312.35f)
        arcToRelative(
          14.46f,
          14.46f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -10.2f,
          4.2f
        )
        lineTo(56.45f, 297.9f)
        arcToRelative(28.85f, 28.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 40.7f)
        lineToRelative(117f, 117f)
        arcToRelative(28.85f, 28.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40.7f, 0f)
        lineTo(459.75f, 210f)
        arcToRelative(
          14.46f,
          14.46f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          4.2f,
          -10.2f
        )
        verticalLineTo(76.8f)
        arcTo(28.66f, 28.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 435.25f, 48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 160f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 384f, 160f)
        close()
      }
    }.build()

    return _PricetagOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PricetagOutline: ImageVector? = null
