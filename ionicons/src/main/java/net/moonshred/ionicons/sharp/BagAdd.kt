package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.BagAdd: ImageVector
  get() {
    if (_BagAddSharp != null) {
      return _BagAddSharp!!
    }
    _BagAddSharp = ImageVector.Builder(
      name = "Sharp.BagAddSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
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
        horizontalLineTo(272f)
        verticalLineToRelative(64f)
        horizontalLineTo(240f)
        verticalLineTo(336f)
        horizontalLineTo(176f)
        verticalLineTo(304f)
        horizontalLineToRelative(64f)
        verticalLineTo(240f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(64f)
        close()
      }
    }.build()

    return _BagAddSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BagAddSharp: ImageVector? = null
