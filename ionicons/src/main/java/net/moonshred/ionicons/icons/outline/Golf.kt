package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Golf: ImageVector
  get() {
    if (_GolfOutline != null) {
      return _GolfOutline!!
    }
    _GolfOutline = ImageVector.Builder(
      name = "Outline.GolfOutline",
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
        moveTo(256f, 400f)
        lineToRelative(0f, -368f)
        lineToRelative(176f, 80f)
        lineToRelative(-176f, 80f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 336f)
        curveToRelative(-87f, 0f, -175.3f, 43.2f, -191.64f, 124.74f)
        curveTo(62.39f, 470.57f, 68.57f, 480f, 80f, 480f)
        horizontalLineTo(432f)
        curveToRelative(11.44f, 0f, 17.62f, -9.43f, 15.65f, -19.26f)
        curveTo(431.3f, 379.2f, 343f, 336f, 256f, 336f)
        close()
      }
    }.build()

    return _GolfOutline!!
  }

@Suppress("ObjectPropertyName")
private var _GolfOutline: ImageVector? = null
