package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Pencil: ImageVector
  get() {
    if (_PencilSharp != null) {
      return _PencilSharp!!
    }
    _PencilSharp = ImageVector.Builder(
      name = "Sharp.PencilSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(103f, 464f)
        lineToRelative(-55f, 0f)
        lineToRelative(0f, -55f)
        lineToRelative(310.14f, -310.91f)
        lineToRelative(55.77f, 55.78f)
        lineToRelative(-310.91f, 310.13f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(425.72f, 142f)
        lineTo(370f, 86.28f)
        lineToRelative(31.66f, -30.66f)
        curveTo(406.55f, 50.7f, 414.05f, 48f, 421f, 48f)
        arcToRelative(
          25.91f,
          25.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          18.42f,
          7.62f
        )
        lineToRelative(17f, 17f)
        arcTo(25.87f, 25.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 464f, 91f)
        curveToRelative(0f, 7f, -2.71f, 14.45f, -7.62f, 19.36f)
        close()
        moveTo(418.2f, 71.17f)
        horizontalLineToRelative(0f)
        close()
      }
    }.build()

    return _PencilSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PencilSharp: ImageVector? = null
