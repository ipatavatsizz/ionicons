package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Gift: ImageVector
  get() {
    if (_GiftSharp != null) {
      return _GiftSharp!!
    }
    _GiftSharp = ImageVector.Builder(
      name = "Sharp.GiftSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(234f, 144f)
        horizontalLineToRelative(44f)
        lineTo(278f, 256f)
        lineTo(442f, 256f)
        arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, -22f)
        lineTo(464f, 166f)
        arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22f, -22f)
        lineTo(382.18f, 144f)
        arcTo(77.95f, 77.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 55.79f)
        arcTo(78f, 78f, 0f, isMoreThanHalf = false, isPositiveArc = false, 129.81f, 144f)
        lineTo(70f, 144f)
        arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -22f, 22f)
        verticalLineToRelative(68f)
        arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 22f)
        lineTo(234f, 256f)
        close()
        moveTo(278f, 110f)
        arcToRelative(34f, 34f, 0f, isMoreThanHalf = true, isPositiveArc = true, 34f, 34f)
        lineTo(278f, 144f)
        close()
        moveTo(166f, 110f)
        arcToRelative(34f, 34f, 0f, isMoreThanHalf = true, isPositiveArc = true, 68f, 0f)
        verticalLineToRelative(34f)
        lineTo(200f, 144f)
        arcTo(34f, 34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 166f, 110f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(278f, 480f)
        horizontalLineTo(410f)
        arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, -22f)
        verticalLineTo(288f)
        horizontalLineTo(278f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(80f, 458f)
        arcToRelative(22f, 22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 22f)
        horizontalLineTo(234f)
        verticalLineTo(288f)
        horizontalLineTo(80f)
        close()
      }
    }.build()

    return _GiftSharp!!
  }

@Suppress("ObjectPropertyName")
private var _GiftSharp: ImageVector? = null
