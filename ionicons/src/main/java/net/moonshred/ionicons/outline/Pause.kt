package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Pause: ImageVector
  get() {
    if (_PauseOutline != null) {
      return _PauseOutline!!
    }
    _PauseOutline = ImageVector.Builder(
      name = "Outline.PauseOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(176f, 96f)
        horizontalLineToRelative(16f)
        verticalLineToRelative(320f)
        horizontalLineToRelative(-16f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(320f, 96f)
        horizontalLineToRelative(16f)
        verticalLineToRelative(320f)
        horizontalLineToRelative(-16f)
        close()
      }
    }.build()

    return _PauseOutline!!
  }

@Suppress("ObjectPropertyName")
private var _PauseOutline: ImageVector? = null
