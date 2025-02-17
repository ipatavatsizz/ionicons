package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Bus: ImageVector
  get() {
    if (_BusSharp != null) {
      return _BusSharp!!
    }
    _BusSharp = ImageVector.Builder(
      name = "Sharp.BusSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(424f, 32f)
        lineTo(88f, 32f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 56f)
        lineTo(64f, 416f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 27.71f)
        lineTo(80f, 480f)
        horizontalLineToRelative(72f)
        lineTo(152f, 448f)
        lineTo(360f, 448f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(72f)
        lineTo(432f, 443.71f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 448f, 416f)
        lineTo(448f, 56f)
        arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 424f, 32f)
        close()
        moveTo(175.82f, 371.47f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -35.3f, -35.29f)
        arcTo(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 175.82f, 371.47f)
        close()
        moveTo(240f, 288f)
        lineTo(96f, 288f)
        lineTo(96f, 128f)
        lineTo(240f, 128f)
        close()
        moveTo(256f, 96f)
        lineTo(96.46f, 96f)
        lineTo(96f, 64f)
        lineTo(416f, 64f)
        lineToRelative(-0.46f, 32f)
        lineTo(256f, 96f)
        close()
        moveTo(272f, 128f)
        lineTo(416f, 128f)
        lineTo(416f, 288f)
        lineTo(272f, 288f)
        close()
        moveTo(336.18f, 364.53f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 35.3f, 35.29f)
        arcTo(32.09f, 32.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 336.18f, 364.53f)
        close()
      }
    }.build()

    return _BusSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BusSharp: ImageVector? = null
