package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.Flask: ImageVector
  get() {
    if (_FlaskOutline != null) {
      return _FlaskOutline!!
    }
    _FlaskOutline = ImageVector.Builder(
      name = "Outline.FlaskOutline",
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
        moveTo(176f, 48f)
        lineTo(336f, 48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(118f, 304f)
        lineTo(394f, 304f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(208f, 48f)
        verticalLineToRelative(93.48f)
        arcToRelative(
          64.09f,
          64.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -9.88f,
          34.18f
        )
        lineTo(73.21f, 373.49f)
        curveTo(48.4f, 412.78f, 76.63f, 464f, 123.08f, 464f)
        horizontalLineTo(388.92f)
        curveToRelative(46.45f, 0f, 74.68f, -51.22f, 49.87f, -90.51f)
        lineTo(313.87f, 175.66f)
        arcTo(64.09f, 64.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 304f, 141.48f)
        verticalLineTo(48f)
      }
    }.build()

    return _FlaskOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FlaskOutline: ImageVector? = null
