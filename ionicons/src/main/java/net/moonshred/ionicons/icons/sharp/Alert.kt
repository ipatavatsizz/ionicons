package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Alert: ImageVector
  get() {
    if (_AlertSharp != null) {
      return _AlertSharp!!
    }
    _AlertSharp = ImageVector.Builder(
      name = "Sharp.AlertSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(240f, 80f)
        lineToRelative(8f, 240f)
        lineToRelative(16f, 0f)
        lineToRelative(8f, -240f)
        lineToRelative(-32f, 0f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(240f, 400f)
        horizontalLineToRelative(32f)
        verticalLineToRelative(32f)
        horizontalLineToRelative(-32f)
        close()
      }
    }.build()

    return _AlertSharp!!
  }

@Suppress("ObjectPropertyName")
private var _AlertSharp: ImageVector? = null
