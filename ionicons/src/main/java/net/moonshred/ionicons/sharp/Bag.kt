package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Bag: ImageVector
  get() {
    if (_BagSharp != null) {
      return _BagSharp!!
    }
    _BagSharp = ImageVector.Builder(
      name = "Sharp.BagSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(372f, 160f)
        lineTo(372f, 148f)
        arcTo(116.13f, 116.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 258.89f, 32f)
        curveToRelative(-1f, 0f, -1.92f, 0f, -2.89f, 0f)
        reflectiveCurveToRelative(-1.93f, 0f, -2.89f, 0f)
        arcTo(116.13f, 116.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 140f, 148f)
        verticalLineToRelative(12f)
        lineTo(52f, 160f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
        lineTo(48f, 464f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        lineTo(448f, 480f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        lineTo(464f, 164f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
        close()
        moveTo(332f, 160f)
        lineTo(180f, 160f)
        lineTo(180f, 149f)
        curveToRelative(0f, -41.84f, 33.41f, -76.56f, 75.25f, -77f)
        arcTo(76.08f, 76.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 332f, 148f)
        close()
      }
    }.build()

    return _BagSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BagSharp: ImageVector? = null
