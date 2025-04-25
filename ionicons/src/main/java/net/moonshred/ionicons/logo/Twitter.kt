package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Twitter: ImageVector
  get() {
    if (_Twitter != null) {
      return _Twitter!!
    }
    _Twitter = ImageVector.Builder(
      name = "Logo.Twitter",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(496f, 109.5f)
        arcToRelative(
          201.8f,
          201.8f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -56.55f,
          15.3f
        )
        arcToRelative(
          97.51f,
          97.51f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          43.33f,
          -53.6f
        )
        arcToRelative(
          197.74f,
          197.74f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -62.56f,
          23.5f
        )
        arcTo(99.14f, 99.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 348.31f, 64f)
        curveToRelative(-54.42f, 0f, -98.46f, 43.4f, -98.46f, 96.9f)
        arcToRelative(
          93.21f,
          93.21f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          2.54f,
          22.1f
        )
        arcToRelative(
          280.7f,
          280.7f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -203f,
          -101.3f
        )
        arcTo(95.69f, 95.69f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36f, 130.4f)
        curveTo(36f, 164f, 53.53f, 193.7f, 80f, 211.1f)
        arcTo(97.5f, 97.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.22f, 199f)
        verticalLineToRelative(1.2f)
        curveToRelative(0f, 47f, 34f, 86.1f, 79f, 95f)
        arcToRelative(
          100.76f,
          100.76f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -25.94f,
          3.4f
        )
        arcToRelative(
          94.38f,
          94.38f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -18.51f,
          -1.8f
        )
        curveToRelative(12.51f, 38.5f, 48.92f, 66.5f, 92.05f, 67.3f)
        arcTo(199.59f, 199.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 39.5f, 405.6f)
        arcTo(203f, 203f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 404.2f)
        arcTo(278.68f, 278.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 166.74f, 448f)
        curveToRelative(181.36f, 0f, 280.44f, -147.7f, 280.44f, -275.8f)
        curveToRelative(0f, -4.2f, -0.11f, -8.4f, -0.31f, -12.5f)
        arcTo(198.48f, 198.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 496f, 109.5f)
        close()
      }
    }.build()

    return _Twitter!!
  }

@Suppress("ObjectPropertyName")
private var _Twitter: ImageVector? = null
