package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.BagHandle: ImageVector
  get() {
    if (_BagHandleSharp != null) {
      return _BagHandleSharp!!
    }
    _BagHandleSharp = ImageVector.Builder(
      name = "Sharp.BagHandleSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(460f, 160f)
        lineTo(372f, 160f)
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
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 460f, 160f)
        close()
        moveTo(180f, 149f)
        curveToRelative(0f, -41.84f, 33.41f, -76.56f, 75.25f, -77f)
        arcTo(76.08f, 76.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 332f, 148f)
        verticalLineToRelative(12f)
        lineTo(180f, 160f)
        close()
        moveTo(368f, 240f)
        arcToRelative(112f, 112f, 0f, isMoreThanHalf = false, isPositiveArc = true, -224f, 0f)
        lineTo(144f, 208f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(32f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 0f)
        lineTo(336f, 208f)
        horizontalLineToRelative(32f)
        close()
      }
    }.build()

    return _BagHandleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BagHandleSharp: ImageVector? = null
