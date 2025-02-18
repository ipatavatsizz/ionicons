package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.PlaySkipBack: ImageVector
  get() {
    if (_PlaySkipBackOutline != null) {
      return _PlaySkipBackOutline!!
    }
    _PlaySkipBackOutline = ImageVector.Builder(
      name = "Outline.PlaySkipBackOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(400f, 111f)
        verticalLineTo(401f)
        curveToRelative(0f, 17.44f, -17f, 28.52f, -31f, 20.16f)
        lineTo(121.09f, 272.79f)
        curveToRelative(-12.12f, -7.25f, -12.12f, -26.33f, 0f, -33.58f)
        lineTo(369f, 90.84f)
        curveTo(383f, 82.48f, 400f, 93.56f, 400f, 111f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(112f, 80f)
        lineTo(112f, 432f)
      }
    }.build()

    return _PlaySkipBackOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PlaySkipBackOutline: ImageVector? = null
