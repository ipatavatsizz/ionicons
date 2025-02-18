package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Text: ImageVector
  get() {
    if (_TextSharp != null) {
      return _TextSharp!!
    }
    _TextSharp = ImageVector.Builder(
      name = "Sharp.TextSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(404.42f, 170f)
        curveToRelative(-41.23f, 0f, -78.07f, 24.06f, -93.85f, 61.3f)
        lineTo(304f, 246.52f)
        lineToRelative(40.33f, 17.18f)
        lineToRelative(6.56f, -15.22f)
        curveToRelative(8.9f, -21f, 29.91f, -34.55f, 53.53f, -34.55f)
        curveToRelative(34.55f, 0f, 57.76f, 23.27f, 57.76f, 57.91f)
        verticalLineToRelative(2.3f)
        curveToRelative(-22.12f, 0.59f, -48.65f, 2.05f, -72.27f, 4.84f)
        curveToRelative(-54.52f, 6.43f, -87.06f, 36.23f, -87.06f, 79.72f)
        curveToRelative(0f, 23.16f, 8.72f, 44f, 24.56f, 58.59f)
        curveTo(342.28f, 431f, 362.55f, 438f, 384.51f, 438f)
        curveToRelative(30.86f, 0f, 57.5f, -7.33f, 77.67f, -22.64f)
        verticalLineTo(438f)
        horizontalLineTo(506f)
        verticalLineTo(271.84f)
        curveTo(506f, 212.83f, 463.28f, 170f, 404.42f, 170f)
        close()
        moveTo(384.51f, 395.07f)
        curveToRelative(-17.46f, 0f, -37.85f, -9.84f, -37.85f, -36.37f)
        curveToRelative(0f, -10.65f, 3.82f, -18.11f, 12.38f, -24.19f)
        curveToRelative(8.34f, -5.92f, 21.12f, -10.15f, 36f, -11.9f)
        curveToRelative(21.78f, -2.57f, 46.31f, -3.95f, 67f, -4.52f)
        curveTo(459.88f, 369.58f, 434.47f, 395.07f, 384.51f, 395.07f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(93.25f, 325.87f)
        horizontalLineToRelative(125.5f)
        lineTo(260.94f, 438f)
        horizontalLineTo(308f)
        lineTo(155f, 48f)
        lineTo(4f, 438f)
        horizontalLineTo(51.06f)
        close()
        moveTo(156f, 160.71f)
        lineTo(202.25f, 282f)
        horizontalLineToRelative(-92.5f)
        close()
      }
    }.build()

    return _TextSharp!!
  }

@Suppress("ObjectPropertyName")
private var _TextSharp: ImageVector? = null
