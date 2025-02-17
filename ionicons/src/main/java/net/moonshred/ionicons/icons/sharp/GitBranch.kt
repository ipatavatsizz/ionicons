package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.GitBranch: ImageVector
  get() {
    if (_GitBranchSharp != null) {
      return _GitBranchSharp!!
    }
    _GitBranchSharp = ImageVector.Builder(
      name = "Sharp.GitBranchSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(352f, 96f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -58.86f, 89.11f)
        lineTo(192f, 273.11f)
        lineTo(192f, 151.39f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, -64f, 0f)
        lineTo(128f, 360.61f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
        lineTo(192f, 358f)
        lineTo(346.25f, 223.73f)
        curveToRelative(1.9f, 0.17f, 3.81f, 0.27f, 5.75f, 0.27f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -128f)
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

    return _GitBranchSharp!!
  }

@Suppress("ObjectPropertyName")
private var _GitBranchSharp: ImageVector? = null
