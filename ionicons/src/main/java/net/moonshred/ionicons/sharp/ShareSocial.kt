package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.ShareSocial: ImageVector
  get() {
    if (_ShareSocialSharp != null) {
      return _ShareSocialSharp!!
    }
    _ShareSocialSharp = ImageVector.Builder(
      name = "Sharp.ShareSocialSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(378f, 324f)
        arcToRelative(
          69.78f,
          69.78f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -48.83f,
          19.91f
        )
        lineTo(202f, 272.41f)
        arcToRelative(
          69.68f,
          69.68f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0f,
          -32.82f
        )
        lineToRelative(127.13f, -71.5f)
        arcTo(69.76f, 69.76f, 0f, isMoreThanHalf = true, isPositiveArc = false, 308.87f, 129f)
        lineToRelative(-130.13f, 73.2f)
        arcToRelative(70f, 70f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 107.56f)
        lineTo(308.87f, 383f)
        arcTo(70f, 70f, 0f, isMoreThanHalf = true, isPositiveArc = false, 378f, 324f)
        close()
      }
    }.build()

    return _ShareSocialSharp!!
  }

@Suppress("ObjectPropertyName")
private var _ShareSocialSharp: ImageVector? = null
