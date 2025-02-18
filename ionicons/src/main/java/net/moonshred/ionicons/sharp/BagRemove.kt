package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.BagRemove: ImageVector
  get() {
    if (_BagRemoveSharp != null) {
      return _BagRemoveSharp!!
    }
    _BagRemoveSharp = ImageVector.Builder(
      name = "Sharp.BagRemoveSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(460f, 160f)
        horizontalLineTo(372f)
        verticalLineTo(148f)
        arcTo(116.13f, 116.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 258.89f, 32f)
        curveToRelative(-1f, 0f, -1.92f, 0f, -2.89f, 0f)
        reflectiveCurveToRelative(-1.93f, 0f, -2.89f, 0f)
        arcTo(116.13f, 116.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 140f, 148f)
        verticalLineToRelative(12f)
        horizontalLineTo(52f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
        verticalLineTo(464f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
        horizontalLineTo(448f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
        verticalLineTo(164f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 460f, 160f)
        close()
        moveTo(180f, 149f)
        curveToRelative(0f, -41.84f, 33.41f, -76.56f, 75.25f, -77f)
        arcTo(76.08f, 76.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 332f, 148f)
        verticalLineToRelative(12f)
        horizontalLineTo(180f)
        close()
        moveTo(336f, 336f)
        horizontalLineTo(176f)
        verticalLineTo(304f)
        horizontalLineTo(336f)
        close()
      }
    }.build()

    return _BagRemoveSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BagRemoveSharp: ImageVector? = null
