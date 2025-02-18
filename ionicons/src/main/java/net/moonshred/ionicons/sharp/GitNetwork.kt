package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.GitNetwork: ImageVector
  get() {
    if (_GitNetworkSharp != null) {
      return _GitNetworkSharp!!
    }
    _GitNetworkSharp = ImageVector.Builder(
      name = "Sharp.GitNetworkSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 32f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -57.67f, 91.73f)
        lineTo(255.5f, 204.55f)
        lineToRelative(-70.19f, -80.1f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 160f)
        curveToRelative(1.1f, 0f, 2.2f, 0f, 3.29f, -0.08f)
        lineTo(224f, 265.7f)
        verticalLineToRelative(94.91f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
        verticalLineTo(264.56f)
        lineToRelative(91.78f, -104.71f)
        curveToRelative(1.39f, 0.09f, 2.8f, 0.15f, 4.22f, 0.15f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -128f)
        close()
        moveTo(96f, 96f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 96f)
        close()
        moveTo(256f, 448f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 448f)
        close()
        moveTo(384f, 128f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 384f, 128f)
        close()
      }
    }.build()

    return _GitNetworkSharp!!
  }

@Suppress("ObjectPropertyName")
private var _GitNetworkSharp: ImageVector? = null
