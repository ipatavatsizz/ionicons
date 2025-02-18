package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.Chatbubbles: ImageVector
  get() {
    if (_ChatbubblesSharp != null) {
      return _ChatbubblesSharp!!
    }
    _ChatbubblesSharp = ImageVector.Builder(
      name = "Sharp.ChatbubblesSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 312.43f)
        curveToRelative(0.77f, -1.11f, 1.51f, -2.26f, 2.27f, -3.34f)
        arcTo(174.55f, 174.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 480f, 211.85f)
        curveTo(480.32f, 112.55f, 396.54f, 32f, 292.94f, 32f)
        curveToRelative(-90.36f, 0f, -165.74f, 61.49f, -183.4f, 143.12f)
        arcToRelative(
          172.81f,
          172.81f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -4f,
          36.83f
        )
        curveToRelative(0f, 99.4f, 80.56f, 182.11f, 184.16f, 182.11f)
        curveToRelative(16.47f, 0f, 38.66f, -4.95f, 50.83f, -8.29f)
        reflectiveCurveToRelative(24.23f, -7.75f, 27.35f, -8.94f)
        reflectiveCurveToRelative(8f, -2.41f, 11.89f, -1.29f)
        lineToRelative(77.42f, 22.38f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -4.86f)
        lineToRelative(-17.72f, -67.49f)
        curveTo(443.24f, 320.57f, 443.08f, 319.63f, 448f, 312.43f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(312.54f, 415.38f)
        arcToRelative(
          165.32f,
          165.32f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -23.26f,
          2.05f
        )
        curveToRelative(-42.43f, 0f, -82.5f, -11.2f, -115f, -32.2f)
        arcToRelative(
          184.09f,
          184.09f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -53.09f,
          -49.32f
        )
        curveTo(95.11f, 301.34f, 80.89f, 257.4f, 80.89f, 211.42f)
        curveToRelative(0f, -3.13f, 0.11f, -6.14f, 0.22f, -9.16f)
        arcToRelative(
          4.34f,
          4.34f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -7.54f,
          -3.12f
        )
        arcTo(158.76f, 158.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 58.71f, 394.38f)
        curveToRelative(2.47f, 3.77f, 3.87f, 6.68f, 3.44f, 8.62f)
        lineTo(48.06f, 475.26f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.22f, 4.53f)
        lineToRelative(68f, -24.24f)
        arcToRelative(
          16.85f,
          16.85f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          12.92f,
          0.22f
        )
        curveToRelative(20.35f, 8f, 42.86f, 12.92f, 65.37f, 12.92f)
        arcToRelative(
          169.45f,
          169.45f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          116.63f,
          -46f
        )
        arcTo(4.29f, 4.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 312.54f, 415.38f)
        close()
      }
    }.build()

    return _ChatbubblesSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ChatbubblesSharp: ImageVector? = null
