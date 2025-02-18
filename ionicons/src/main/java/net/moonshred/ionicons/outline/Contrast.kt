package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Contrast: ImageVector
  get() {
    if (_ContrastOutline != null) {
      return _ContrastOutline!!
    }
    _ContrastOutline = ImageVector.Builder(
      name = "Outline.ContrastOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 256f)
        moveToRelative(-208f, 0f)
        arcToRelative(208f, 208f, 0f, isMoreThanHalf = true, isPositiveArc = true, 416f, 0f)
        arcToRelative(208f, 208f, 0f, isMoreThanHalf = true, isPositiveArc = true, -416f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 464f)
        curveTo(141.12f, 464f, 48f, 370.88f, 48f, 256f)
        reflectiveCurveTo(141.12f, 48f, 256f, 48f)
        close()
      }
    }.build()

    return _ContrastOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ContrastOutline: ImageVector? = null
