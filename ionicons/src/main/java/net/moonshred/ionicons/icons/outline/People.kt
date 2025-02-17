package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.People: ImageVector
  get() {
    if (_PeopleOutline != null) {
      return _PeopleOutline!!
    }
    _PeopleOutline = ImageVector.Builder(
      name = "Outline.PeopleOutline",
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
        moveTo(402f, 168f)
        curveToRelative(-2.93f, 40.67f, -33.1f, 72f, -66f, 72f)
        reflectiveCurveToRelative(-63.12f, -31.32f, -66f, -72f)
        curveToRelative(-3f, -42.31f, 26.37f, -72f, 66f, -72f)
        reflectiveCurveTo(405f, 126.46f, 402f, 168f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(336f, 304f)
        curveToRelative(-65.17f, 0f, -127.84f, 32.37f, -143.54f, 95.41f)
        curveToRelative(-2.08f, 8.34f, 3.15f, 16.59f, 11.72f, 16.59f)
        horizontalLineTo(467.83f)
        curveToRelative(8.57f, 0f, 13.77f, -8.25f, 11.72f, -16.59f)
        curveTo(463.85f, 335.36f, 401.18f, 304f, 336f, 304f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(200f, 185.94f)
        curveTo(197.66f, 218.42f, 173.28f, 244f, 147f, 244f)
        reflectiveCurveTo(96.3f, 218.43f, 94f, 185.94f)
        curveTo(91.61f, 152.15f, 115.34f, 128f, 147f, 128f)
        reflectiveCurveTo(202.39f, 152.77f, 200f, 185.94f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(206f, 306f)
        curveToRelative(-18.05f, -8.27f, -37.93f, -11.45f, -59f, -11.45f)
        curveToRelative(-52f, 0f, -102.1f, 25.85f, -114.65f, 76.2f)
        curveTo(30.7f, 377.41f, 34.88f, 384f, 41.72f, 384f)
        horizontalLineTo(154f)
      }
    }.build()

    return _PeopleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PeopleOutline: ImageVector? = null
