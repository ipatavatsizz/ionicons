package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.GitBranch: ImageVector
  get() {
    if (_GitBranch != null) {
      return _GitBranch!!
    }
    _GitBranch = ImageVector.Builder(
      name = "Filled.GitBranch",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 160f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, -96.27f, 55.24f)
        curveToRelative(-2.29f, 29.08f, -20.08f, 37f, -75f, 48.42f)
        curveToRelative(-17.76f, 3.68f, -35.93f, 7.45f, -52.71f, 13.93f)
        lineTo(192.02f, 151.39f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, -64f, 0f)
        lineTo(128.02f, 360.61f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64.42f, 0.24f)
        curveToRelative(2.39f, -18f, 16f, -24.33f, 65.26f, -34.52f)
        curveToRelative(27.43f, -5.67f, 55.78f, -11.54f, 79.78f, -26.95f)
        curveToRelative(29f, -18.58f, 44.53f, -46.78f, 46.36f, -83.89f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 416f, 160f)
        close()
        moveTo(160f, 64f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 64f)
        close()
        moveTo(160f, 448f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 160f, 448f)
        close()
        moveTo(352f, 192f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 352f, 192f)
        close()
      }
    }.build()

    return _GitBranch!!
  }

@Suppress("ObjectPropertyName")
private var _GitBranch: ImageVector? = null
