package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Medkit: ImageVector
  get() {
    if (_MedkitSharp != null) {
      return _MedkitSharp!!
    }
    _MedkitSharp = ImageVector.Builder(
      name = "Sharp.MedkitSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(484f, 96f)
        horizontalLineTo(384f)
        verticalLineTo(40f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, -8f)
        horizontalLineTo(136f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
        verticalLineTo(96f)
        horizontalLineTo(28f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, 12f)
        verticalLineTo(468f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 12f)
        horizontalLineTo(484f)
        arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, -12f)
        verticalLineTo(108f)
        arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 484f, 96f)
        close()
        moveTo(168f, 72f)
        horizontalLineTo(344f)
        verticalLineTo(96f)
        horizontalLineTo(168f)
        close()
        moveTo(352f, 310f)
        horizontalLineTo(278f)
        verticalLineToRelative(74f)
        horizontalLineTo(234f)
        verticalLineTo(310f)
        horizontalLineTo(160f)
        verticalLineTo(266f)
        horizontalLineToRelative(74f)
        verticalLineTo(192f)
        horizontalLineToRelative(44f)
        verticalLineToRelative(74f)
        horizontalLineToRelative(74f)
        close()
      }
    }.build()

    return _MedkitSharp!!
  }

@Suppress("ObjectPropertyName")
private var _MedkitSharp: ImageVector? = null
