package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Cube: ImageVector
  get() {
    if (_CubeSharp != null) {
      return _CubeSharp!!
    }
    _CubeSharp = ImageVector.Builder(
      name = "Sharp.CubeSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 170f)
        lineToRelative(0f, 196.92f)
        lineToRelative(192f, 113.08f)
        lineToRelative(0f, -196f)
        lineToRelative(-192f, -114f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 480f)
        lineTo(464f, 366.92f)
        verticalLineTo(170f)
        lineTo(272f, 284f)
        close()
        moveTo(448f, 357.64f)
        horizontalLineToRelative(0f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 144f)
        lineToRelative(-192f, -112f)
        lineToRelative(-192f, 112f)
        lineToRelative(192f, 112f)
        lineToRelative(192f, -112f)
        close()
      }
    }.build()

    return _CubeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CubeSharp: ImageVector? = null
