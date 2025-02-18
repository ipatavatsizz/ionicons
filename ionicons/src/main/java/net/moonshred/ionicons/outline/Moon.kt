package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Moon: ImageVector
  get() {
    if (_MoonOutline != null) {
      return _MoonOutline!!
    }
    _MoonOutline = ImageVector.Builder(
      name = "Outline.MoonOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(160f, 136f)
        curveToRelative(0f, -30.62f, 4.51f, -61.61f, 16f, -88f)
        curveTo(99.57f, 81.27f, 48f, 159.32f, 48f, 248f)
        curveToRelative(0f, 119.29f, 96.71f, 216f, 216f, 216f)
        curveToRelative(88.68f, 0f, 166.73f, -51.57f, 200f, -128f)
        curveToRelative(-26.39f, 11.49f, -57.38f, 16f, -88f, 16f)
        curveTo(256.71f, 352f, 160f, 255.29f, 160f, 136f)
        close()
      }
    }.build()

    return _MoonOutline!!
  }

@Suppress("ObjectPropertyName")
private var _MoonOutline: ImageVector? = null
