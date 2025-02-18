package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Basket: ImageVector
  get() {
    if (_BasketOutline != null) {
      return _BasketOutline!!
    }
    _BasketOutline = ImageVector.Builder(
      name = "Outline.BasketOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(68.4f, 192f)
        arcTo(20.38f, 20.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 212.2f)
        arcToRelative(17.87f, 17.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.8f, 5.5f)
        lineTo(100.5f, 400f)
        arcToRelative(
          40.46f,
          40.46f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          39.1f,
          29.5f
        )
        horizontalLineTo(372.4f)
        arcTo(40.88f, 40.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 411.7f, 400f)
        lineToRelative(51.7f, -182.3f)
        lineToRelative(0.6f, -5.5f)
        arcTo(20.38f, 20.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 443.6f, 192f)
        horizontalLineTo(68.4f)
        close()
        moveTo(261.72f, 352.07f)
        arcTo(42.07f, 42.07f, 0f, isMoreThanHalf = true, isPositiveArc = true, 304f, 310f)
        arcTo(42.27f, 42.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 261.72f, 352.07f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 192f)
        lineToRelative(96f, -128f)
        lineToRelative(96f, 128f)
      }
    }.build()

    return _BasketOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BasketOutline: ImageVector? = null
