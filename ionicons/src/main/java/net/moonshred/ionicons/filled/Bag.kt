package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Bag: ImageVector
  get() {
    if (_Bag != null) {
      return _Bag!!
    }
    _Bag = ImageVector.Builder(
      name = "Filled.Bag",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(454.65f, 169.4f)
        arcTo(31.82f, 31.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 432f, 160f)
        horizontalLineTo(368f)
        verticalLineTo(144f)
        arcToRelative(112f, 112f, 0f, isMoreThanHalf = false, isPositiveArc = false, -224f, 0f)
        verticalLineToRelative(16f)
        horizontalLineTo(80f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -32f, 32f)
        verticalLineTo(408f)
        curveToRelative(0f, 39f, 33f, 72f, 72f, 72f)
        horizontalLineTo(392f)
        arcToRelative(
          72.22f,
          72.22f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          50.48f,
          -20.55f
        )
        arcTo(69.48f, 69.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 464f, 409.25f)
        verticalLineTo(192f)
        arcTo(31.75f, 31.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 454.65f, 169.4f)
        close()
        moveTo(176f, 144f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 0f)
        verticalLineToRelative(16f)
        horizontalLineTo(176f)
        close()
      }
    }.build()

    return _Bag!!
  }

@Suppress("ObjectPropertyName")
private var _Bag: ImageVector? = null
