package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.ArrowRedo: ImageVector
  get() {
    if (_ArrowRedoOutline != null) {
      return _ArrowRedoOutline!!
    }
    _ArrowRedoOutline = ImageVector.Builder(
      name = "Outline.ArrowRedoOutline",
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
        moveTo(448f, 256f)
        lineTo(272f, 88f)
        verticalLineToRelative(96f)
        curveTo(103.57f, 184f, 64f, 304.77f, 64f, 424f)
        curveToRelative(48.61f, -62.24f, 91.6f, -96f, 208f, -96f)
        verticalLineToRelative(96f)
        close()
      }
    }.build()

    return _ArrowRedoOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowRedoOutline: ImageVector? = null
