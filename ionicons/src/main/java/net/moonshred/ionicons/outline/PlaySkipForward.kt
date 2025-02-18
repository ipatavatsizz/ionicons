package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.PlaySkipForward: ImageVector
  get() {
    if (_PlaySkipForwardOutline != null) {
      return _PlaySkipForwardOutline!!
    }
    _PlaySkipForwardOutline = ImageVector.Builder(
      name = "Outline.PlaySkipForwardOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(112f, 111f)
        verticalLineTo(401f)
        curveToRelative(0f, 17.44f, 17f, 28.52f, 31f, 20.16f)
        lineToRelative(247.9f, -148.37f)
        curveToRelative(12.12f, -7.25f, 12.12f, -26.33f, 0f, -33.58f)
        lineTo(143f, 90.84f)
        curveTo(129f, 82.48f, 112f, 93.56f, 112f, 111f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(400f, 80f)
        lineTo(400f, 432f)
      }
    }.build()

    return _PlaySkipForwardOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PlaySkipForwardOutline: ImageVector? = null
