package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Toggle: ImageVector
  get() {
    if (_ToggleOutline != null) {
      return _ToggleOutline!!
    }
    _ToggleOutline = ImageVector.Builder(
      name = "Outline.ToggleOutline",
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
        moveTo(368f, 256f)
        moveToRelative(-128f, 0f)
        arcToRelative(128f, 128f, 0f, isMoreThanHalf = true, isPositiveArc = true, 256f, 0f)
        arcToRelative(128f, 128f, 0f, isMoreThanHalf = true, isPositiveArc = true, -256f, 0f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(144f, 128f)
        lineTo(368f, 128f)
        arcTo(128f, 128f, 0f, isMoreThanHalf = false, isPositiveArc = true, 496f, 256f)
        lineTo(496f, 256f)
        arcTo(128f, 128f, 0f, isMoreThanHalf = false, isPositiveArc = true, 368f, 384f)
        lineTo(144f, 384f)
        arcTo(128f, 128f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 256f)
        lineTo(16f, 256f)
        arcTo(128f, 128f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 128f)
        close()
      }
    }.build()

    return _ToggleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ToggleOutline: ImageVector? = null
