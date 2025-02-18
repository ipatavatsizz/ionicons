package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoMarkdown: ImageVector
  get() {
    if (_LogoMarkdown != null) {
      return _LogoMarkdown!!
    }
    _LogoMarkdown = ImageVector.Builder(
      name = "Filled.LogoMarkdown",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(475f, 64f)
        lineTo(37f, 64f)
        curveTo(16.58f, 64f, 0f, 81.38f, 0f, 102.77f)
        lineTo(0f, 409.19f)
        curveTo(0f, 430.59f, 16.58f, 448f, 37f, 448f)
        lineTo(475f, 448f)
        curveToRelative(20.38f, 0f, 37f, -17.41f, 37f, -38.81f)
        lineTo(512f, 102.77f)
        curveTo(512f, 81.38f, 495.42f, 64f, 475f, 64f)
        close()
        moveTo(288f, 368f)
        lineTo(224f, 368f)
        lineTo(224f, 256f)
        lineToRelative(-48f, 64f)
        lineToRelative(-48f, -64f)
        lineTo(128f, 368f)
        lineTo(64f, 368f)
        lineTo(64f, 144f)
        horizontalLineToRelative(64f)
        lineToRelative(48f, 80f)
        lineToRelative(48f, -80f)
        horizontalLineToRelative(64f)
        close()
        moveTo(384f, 368f)
        lineTo(304f, 256f)
        horizontalLineToRelative(48.05f)
        lineTo(352f, 144f)
        horizontalLineToRelative(64f)
        lineTo(416f, 256f)
        horizontalLineToRelative(48f)
        close()
      }
    }.build()

    return _LogoMarkdown!!
  }

@Suppress("ObjectPropertyName")
private var _LogoMarkdown: ImageVector? = null
