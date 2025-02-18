package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.ArrowUndo: ImageVector
  get() {
    if (_ArrowUndoOutline != null) {
      return _ArrowUndoOutline!!
    }
    _ArrowUndoOutline = ImageVector.Builder(
      name = "Outline.ArrowUndoOutline",
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
        moveTo(240f, 424f)
        verticalLineTo(328f)
        curveToRelative(116.4f, 0f, 159.39f, 33.76f, 208f, 96f)
        curveToRelative(0f, -119.23f, -39.57f, -240f, -208f, -240f)
        verticalLineTo(88f)
        lineTo(64f, 256f)
        close()
      }
    }.build()

    return _ArrowUndoOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowUndoOutline: ImageVector? = null
