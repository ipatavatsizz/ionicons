package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Person: ImageVector
  get() {
    if (_PersonOutline != null) {
      return _PersonOutline!!
    }
    _PersonOutline = ImageVector.Builder(
      name = "Outline.PersonOutline",
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
        moveTo(344f, 144f)
        curveToRelative(-3.92f, 52.87f, -44f, 96f, -88f, 96f)
        reflectiveCurveToRelative(-84.15f, -43.12f, -88f, -96f)
        curveToRelative(-4f, -55f, 35f, -96f, 88f, -96f)
        reflectiveCurveTo(348f, 90f, 344f, 144f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 304f)
        curveToRelative(-87f, 0f, -175.3f, 48f, -191.64f, 138.6f)
        curveTo(62.39f, 453.52f, 68.57f, 464f, 80f, 464f)
        horizontalLineTo(432f)
        curveToRelative(11.44f, 0f, 17.62f, -10.48f, 15.65f, -21.4f)
        curveTo(431.3f, 352f, 343f, 304f, 256f, 304f)
        close()
      }
    }.build()

    return _PersonOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PersonOutline: ImageVector? = null
