package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.ShareSocial: ImageVector
  get() {
    if (_ShareSocial != null) {
      return _ShareSocial!!
    }
    _ShareSocial = ImageVector.Builder(
      name = "Filled.ShareSocial",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 336f)
        arcToRelative(
          63.78f,
          63.78f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -46.12f,
          19.7f
        )
        lineToRelative(-148f, -83.27f)
        arcToRelative(
          63.85f,
          63.85f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0f,
          -32.86f
        )
        lineToRelative(148f, -83.27f)
        arcToRelative(
          63.8f,
          63.8f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = false,
          -15.73f,
          -27.87f
        )
        lineToRelative(-148f, 83.27f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 88.6f)
        lineToRelative(148f, 83.27f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 384f, 336f)
        close()
      }
    }.build()

    return _ShareSocial!!
  }

@Suppress("ObjectPropertyName")
private var _ShareSocial: ImageVector? = null
