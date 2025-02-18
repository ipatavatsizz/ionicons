package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Barcode: ImageVector
  get() {
    if (_Barcode != null) {
      return _Barcode!!
    }
    _Barcode = ImageVector.Builder(
      name = "Filled.Barcode",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(419.13f, 96f)
        lineTo(419f, 96f)
        lineToRelative(-35.05f, 0.33f)
        lineTo(128f, 96f)
        horizontalLineToRelative(-0.16f)
        lineToRelative(-36.74f, 0.33f)
        curveTo(66.93f, 96.38f, 48f, 116.07f, 48f, 141.2f)
        lineTo(48f, 371.47f)
        curveToRelative(0f, 25.15f, 19f, 44.86f, 43.2f, 44.86f)
        horizontalLineToRelative(0.15f)
        lineToRelative(36.71f, -0.33f)
        lineToRelative(255.92f, 0.33f)
        horizontalLineToRelative(0.17f)
        lineToRelative(35.07f, -0.33f)
        arcTo(44.91f, 44.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 464f, 371.13f)
        lineTo(464f, 140.87f)
        arcTo(44.92f, 44.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 419.13f, 96f)
        close()
        moveTo(144f, 320f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        lineTo(112f, 192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
        close()
        moveTo(208f, 352f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        lineTo(176f, 160f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
        close()
        moveTo(272f, 336f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        lineTo(240f, 176f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
        close()
        moveTo(336f, 352f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        lineTo(304f, 160f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
        close()
        moveTo(400f, 320f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        lineTo(368f, 192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
        close()
      }
    }.build()

    return _Barcode!!
  }

@Suppress("ObjectPropertyName")
private var _Barcode: ImageVector? = null
