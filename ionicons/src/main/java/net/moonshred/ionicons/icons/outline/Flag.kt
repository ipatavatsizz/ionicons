package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Flag: ImageVector
  get() {
    if (_FlagOutline != null) {
      return _FlagOutline!!
    }
    _FlagOutline = ImageVector.Builder(
      name = "Outline.FlagOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(80f, 464f)
        verticalLineTo(68.14f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -6.9f)
        curveTo(91.81f, 56.66f, 112.92f, 48f, 160f, 48f)
        curveToRelative(64f, 0f, 145f, 48f, 192f, 48f)
        arcToRelative(
          199.53f,
          199.53f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          77.23f,
          -15.77f
        )
        arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 432f, 82.08f)
        verticalLineTo(301.44f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.39f, 3.65f)
        curveTo(421.37f, 308.7f, 392.33f, 320f, 352f, 320f)
        curveToRelative(-48f, 0f, -128f, -32f, -192f, -32f)
        reflectiveCurveToRelative(-80f, 16f, -80f, 16f)
      }
    }.build()

    return _FlagOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FlagOutline: ImageVector? = null
