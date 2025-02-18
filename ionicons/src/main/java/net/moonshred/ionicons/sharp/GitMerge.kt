package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.GitMerge: ImageVector
  get() {
    if (_GitMergeSharp != null) {
      return _GitMergeSharp!!
    }
    _GitMergeSharp = ImageVector.Builder(
      name = "Sharp.GitMergeSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(384f, 224f)
        arcToRelative(
          63.66f,
          63.66f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -37.95f,
          12.5f
        )
        lineTo(160f, 153.36f)
        verticalLineToRelative(-2f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, -64f, 0f)
        lineTo(96f, 360.61f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
        lineTo(160f, 223.46f)
        lineToRelative(160.41f, 71.69f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 384f, 224f)
        close()
        moveTo(128f, 64f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 96f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 64f)
        close()
        moveTo(128f, 448f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 448f)
        close()
        moveTo(384f, 320f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 384f, 320f)
        close()
      }
    }.build()

    return _GitMergeSharp!!
  }

@Suppress("ObjectPropertyName")
private var _GitMergeSharp: ImageVector? = null
