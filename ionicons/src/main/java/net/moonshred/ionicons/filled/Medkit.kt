package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Medkit: ImageVector
  get() {
    if (_Medkit != null) {
      return _Medkit!!
    }
    _Medkit = ImageVector.Builder(
      name = "Filled.Medkit",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(432f, 96f)
        horizontalLineTo(384f)
        verticalLineTo(80f)
        arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        horizontalLineTo(176f)
        arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, 48f)
        verticalLineTo(96f)
        horizontalLineTo(80f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 64f)
        verticalLineTo(416f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
        horizontalLineTo(432f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
        verticalLineTo(160f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 432f, 96f)
        close()
        moveTo(336f, 304f)
        horizontalLineTo(272f)
        verticalLineToRelative(64f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -32f, 0f)
        verticalLineTo(304f)
        horizontalLineTo(176f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -32f)
        horizontalLineToRelative(64f)
        verticalLineTo(208f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
        verticalLineToRelative(64f)
        horizontalLineToRelative(64f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 32f)
        close()
        moveTo(352f, 96f)
        horizontalLineTo(160f)
        verticalLineTo(80f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        horizontalLineTo(336f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        close()
      }
    }.build()

    return _Medkit!!
  }

@Suppress("ObjectPropertyName")
private var _Medkit: ImageVector? = null
