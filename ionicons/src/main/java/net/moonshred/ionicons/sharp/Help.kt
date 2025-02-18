package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Help: ImageVector
  get() {
    if (_HelpSharp != null) {
      return _HelpSharp!!
    }
    _HelpSharp = ImageVector.Builder(
      name = "Sharp.HelpSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 40f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(160f, 164f)
        curveToRelative(0f, -10f, 1.44f, -33f, 33.54f, -59.46f)
        curveTo(212.6f, 88.83f, 235.49f, 84.28f, 256f, 84f)
        curveToRelative(18.73f, -0.23f, 35.47f, 2.94f, 45.48f, 7.82f)
        curveTo(318.59f, 100.2f, 352f, 120.6f, 352f, 164f)
        curveToRelative(0f, 45.67f, -29.18f, 66.37f, -62.35f, 89.18f)
        reflectiveCurveTo(248f, 290.36f, 248f, 316f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(223.5f, 368f)
        lineTo(272.5f, 368f)
        arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 276f, 371.5f)
        lineTo(276f, 420.5f)
        arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 272.5f, 424f)
        lineTo(223.5f, 424f)
        arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 220f, 420.5f)
        lineTo(220f, 371.5f)
        arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 223.5f, 368f)
        close()
      }
    }.build()

    return _HelpSharp!!
  }

@Suppress("ObjectPropertyName")
private var _HelpSharp: ImageVector? = null
