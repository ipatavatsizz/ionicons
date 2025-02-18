package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Trash: ImageVector
  get() {
    if (_TrashSharp != null) {
      return _TrashSharp!!
    }
    _TrashSharp = ImageVector.Builder(
      name = "Sharp.TrashSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(447.55f, 96f)
        lineTo(336f, 96f)
        lineTo(336f, 48f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
        lineTo(192f, 32f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
        lineTo(176f, 96f)
        lineTo(64.45f, 96f)
        lineTo(64f, 136f)
        lineTo(97f, 136f)
        lineToRelative(20.09f, 314f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 149f, 480f)
        lineTo(363f, 480f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.93f, -29.95f)
        lineTo(415f, 136f)
        horizontalLineToRelative(33f)
        close()
        moveTo(176f, 416f)
        lineToRelative(-9f, -256f)
        horizontalLineToRelative(33f)
        lineToRelative(9f, 256f)
        close()
        moveTo(272f, 416f)
        lineTo(240f, 416f)
        lineTo(240f, 160f)
        horizontalLineToRelative(32f)
        close()
        moveTo(296f, 96f)
        lineTo(216f, 96f)
        lineTo(216f, 68f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
        horizontalLineToRelative(72f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
        close()
        moveTo(336f, 416f)
        lineTo(303f, 416f)
        lineToRelative(9f, -256f)
        horizontalLineToRelative(33f)
        close()
      }
    }.build()

    return _TrashSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TrashSharp: ImageVector? = null
