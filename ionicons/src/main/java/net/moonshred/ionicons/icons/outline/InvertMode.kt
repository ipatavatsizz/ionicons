package net.moonshred.ionicons.icons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Outline.InvertMode: ImageVector
  get() {
    if (_InvertModeOutline != null) {
      return _InvertModeOutline!!
    }
    _InvertModeOutline = ImageVector.Builder(
      name = "Outline.InvertModeOutline",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(256f, 256f)
        moveToRelative(-208f, 0f)
        arcToRelative(208f, 208f, 0f, isMoreThanHalf = true, isPositiveArc = true, 416f, 0f)
        arcToRelative(208f, 208f, 0f, isMoreThanHalf = true, isPositiveArc = true, -416f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 176f)
        verticalLineTo(336f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -160f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 48f)
        verticalLineTo(176f)
        arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 160f)
        verticalLineTo(464f)
        curveToRelative(114.88f, 0f, 208f, -93.12f, 208f, -208f)
        reflectiveCurveTo(370.88f, 48f, 256f, 48f)
        close()
      }
    }.build()

    return _InvertModeOutline!!
  }

@Suppress("ObjectPropertyName")
private var _InvertModeOutline: ImageVector? = null
