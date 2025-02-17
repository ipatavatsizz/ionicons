package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Bed: ImageVector
  get() {
    if (_BedSharp != null) {
      return _BedSharp!!
    }
    _BedSharp = ImageVector.Builder(
      name = "Sharp.BedSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(432f, 224f)
        lineTo(432f, 96f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        lineTo(96f, 80f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 96f)
        lineTo(80f, 224f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, 48f)
        lineTo(32f, 432f)
        lineTo(68f, 432f)
        lineTo(68f, 400f)
        lineTo(444f, 400f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(36f)
        lineTo(480f, 272f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 432f, 224f)
        close()
        moveTo(240f, 224f)
        lineTo(120f, 224f)
        lineTo(120f, 192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        horizontalLineToRelative(88f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        close()
        moveTo(272f, 192f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, -16f)
        horizontalLineToRelative(88f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
        verticalLineToRelative(32f)
        lineTo(272f, 224f)
        close()
      }
    }.build()

    return _BedSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BedSharp: ImageVector? = null
