package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Pricetags: ImageVector
  get() {
    if (_PricetagsOutline != null) {
      return _PricetagsOutline!!
    }
    _PricetagsOutline = ImageVector.Builder(
      name = "Outline.PricetagsOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(403.29f, 32f)
        horizontalLineTo(280.36f)
        arcToRelative(
          14.46f,
          14.46f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -10.2f,
          4.2f
        )
        lineTo(24.4f, 281.9f)
        arcToRelative(28.85f, 28.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 40.7f)
        lineToRelative(117f, 117f)
        arcToRelative(28.86f, 28.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40.71f, 0f)
        lineTo(427.8f, 194f)
        arcToRelative(
          14.46f,
          14.46f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          4.2f,
          -10.2f
        )
        verticalLineTo(60.8f)
        arcTo(28.66f, 28.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 403.29f, 32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(352f, 144f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 352f, 144f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(230f, 480f)
        lineTo(492f, 218f)
        arcToRelative(13.81f, 13.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -10f)
        verticalLineTo(80f)
      }
    }.build()

    return _PricetagsOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PricetagsOutline: ImageVector? = null
