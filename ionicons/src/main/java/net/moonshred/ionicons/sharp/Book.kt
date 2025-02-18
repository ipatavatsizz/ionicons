package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Book: ImageVector
  get() {
    if (_BookSharp != null) {
      return _BookSharp!!
    }
    _BookSharp = ImageVector.Builder(
      name = "Sharp.BookSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 48f)
        curveToRelative(-67.61f, 0.29f, -117.87f, 9.6f, -154.24f, 25.69f)
        curveTo(282.62f, 85.69f, 272f, 94.77f, 272f, 125.53f)
        verticalLineTo(448f)
        curveToRelative(41.57f, -37.5f, 78.46f, -48f, 224f, -48f)
        verticalLineTo(48f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(48f, 48f)
        curveToRelative(67.61f, 0.29f, 117.87f, 9.6f, 154.24f, 25.69f)
        curveToRelative(27.14f, 12f, 37.76f, 21.08f, 37.76f, 51.84f)
        verticalLineTo(448f)
        curveToRelative(-41.57f, -37.5f, -78.46f, -48f, -224f, -48f)
        verticalLineTo(48f)
        close()
      }
    }.build()

    return _BookSharp!!
  }

@Suppress("ObjectPropertyName")
private var _BookSharp: ImageVector? = null
