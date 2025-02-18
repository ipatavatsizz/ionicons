package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Create: ImageVector
  get() {
    if (_CreateSharp != null) {
      return _CreateSharp!!
    }
    _CreateSharp = ImageVector.Builder(
      name = "Sharp.CreateSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464.37f, 49.2f)
        arcToRelative(
          22.07f,
          22.07f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -31.88f,
          -0.76f
        )
        lineTo(414.18f, 66.69f)
        lineToRelative(31.18f, 31.1f)
        lineToRelative(18f, -17.91f)
        arcTo(22.16f, 22.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 464.37f, 49.2f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(252.76f, 336f)
        lineToRelative(-13.27f, 0f)
        lineToRelative(-31.49f, 0f)
        lineToRelative(-32f, 0f)
        lineToRelative(0f, -32f)
        lineToRelative(0f, -31.49f)
        lineToRelative(0f, -13.27f)
        lineToRelative(9.4f, -9.38f)
        lineToRelative(138.14f, -137.86f)
        lineToRelative(-275.54f, 0f)
        lineToRelative(0f, 352f)
        lineToRelative(352f, 0f)
        lineToRelative(0f, -275.54f)
        lineToRelative(-137.86f, 138.14f)
        lineToRelative(-9.38f, 9.4f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(400f, 143.16f)
        lineToRelative(32.79f, -32.86f)
        lineToRelative(-31.09f, -31.09f)
        lineToRelative(-32.85f, 32.79f)
        lineToRelative(31.15f, 0f)
        lineToRelative(0f, 31.16f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(208f, 304f)
        lineToRelative(31.49f, 0f)
        lineToRelative(160.51f, -160.84f)
        lineToRelative(0f, -31.16f)
        lineToRelative(-31.15f, 0f)
        lineToRelative(-160.85f, 160.51f)
        lineToRelative(0f, 31.49f)
        close()
      }
    }.build()

    return _CreateSharp!!
  }

@Suppress("ObjectPropertyName")
private var _CreateSharp: ImageVector? = null
