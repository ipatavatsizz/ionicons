package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.SearchCircle: ImageVector
  get() {
    if (_SearchCircleOutline != null) {
      return _SearchCircleOutline!!
    }
    _SearchCircleOutline = ImageVector.Builder(
      name = "Outline.SearchCircleOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 80f)
        arcTo(176f, 176f, 0f, isMoreThanHalf = true, isPositiveArc = false, 432f, 256f)
        arcTo(176f, 176f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 80f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(232f, 160f)
        arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = false, 72f, 72f)
        arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 232f, 160f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(283.64f, 283.64f)
        lineTo(336f, 336f)
      }
    }.build()

    return _SearchCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _SearchCircleOutline: ImageVector? = null
