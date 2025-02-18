package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Infinite: ImageVector
  get() {
    if (_InfiniteOutline != null) {
      return _InfiniteOutline!!
    }
    _InfiniteOutline = ImageVector.Builder(
      name = "Outline.InfiniteOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(256f, 256f)
        reflectiveCurveToRelative(-48f, -96f, -126f, -96f)
        curveToRelative(-54.12f, 0f, -98f, 43f, -98f, 96f)
        reflectiveCurveToRelative(43.88f, 96f, 98f, 96f)
        curveToRelative(37.51f, 0f, 71f, -22.41f, 94f, -48f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(256f, 256f)
        reflectiveCurveToRelative(48f, 96f, 126f, 96f)
        curveToRelative(54.12f, 0f, 98f, -43f, 98f, -96f)
        reflectiveCurveToRelative(-43.88f, -96f, -98f, -96f)
        curveToRelative(-37.51f, 0f, -71f, 22.41f, -94f, 48f)
      }
    }.build()

    return _InfiniteOutline!!
  }

@Suppress("ObjectPropertyName")
private var _InfiniteOutline: ImageVector? = null
