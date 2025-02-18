package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Language: ImageVector
  get() {
    if (_LanguageSharp != null) {
      return _LanguageSharp!!
    }
    _LanguageSharp = ImageVector.Builder(
      name = "Sharp.LanguageSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(363f, 176f)
        lineTo(246f, 464f)
        horizontalLineToRelative(47.24f)
        lineToRelative(24.49f, -58f)
        horizontalLineToRelative(90.54f)
        lineToRelative(24.49f, 58f)
        horizontalLineTo(480f)
        close()
        moveTo(336.31f, 362f)
        lineTo(363f, 279.85f)
        lineTo(389.69f, 362f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(272f, 320f)
        curveToRelative(-0.25f, -0.19f, -20.59f, -15.77f, -45.42f, -42.67f)
        curveToRelative(39.58f, -53.64f, 62f, -114.61f, 71.15f, -143.33f)
        horizontalLineTo(352f)
        verticalLineTo(90f)
        horizontalLineTo(214f)
        verticalLineTo(48f)
        horizontalLineTo(170f)
        verticalLineTo(90f)
        horizontalLineTo(32f)
        verticalLineToRelative(44f)
        horizontalLineTo(251.25f)
        curveToRelative(-9.52f, 26.95f, -27.05f, 69.5f, -53.79f, 108.36f)
        curveToRelative(-32.68f, -43.44f, -47.14f, -75.88f, -47.33f, -76.22f)
        lineTo(143f, 152f)
        lineToRelative(-38f, 22f)
        lineToRelative(6.87f, 13.86f)
        curveToRelative(0.89f, 1.56f, 17.19f, 37.9f, 54.71f, 86.57f)
        curveToRelative(0.92f, 1.21f, 1.85f, 2.39f, 2.78f, 3.57f)
        curveToRelative(-49.72f, 56.86f, -89.15f, 79.09f, -89.66f, 79.47f)
        lineTo(64f, 368f)
        lineToRelative(23f, 36f)
        lineToRelative(19.3f, -11.47f)
        curveToRelative(2.2f, -1.67f, 41.33f, -24f, 92f, -80.78f)
        curveToRelative(24.52f, 26.28f, 43.22f, 40.83f, 44.3f, 41.67f)
        lineTo(255f, 362f)
        close()
      }
    }.build()

    return _LanguageSharp!!
  }

@Suppress("ObjectPropertyName")
private var _LanguageSharp: ImageVector? = null
