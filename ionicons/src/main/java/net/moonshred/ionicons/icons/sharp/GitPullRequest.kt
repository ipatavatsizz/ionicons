package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.GitPullRequest: ImageVector
  get() {
    if (_GitPullRequestSharp != null) {
      return _GitPullRequestSharp!!
    }
    _GitPullRequestSharp = ImageVector.Builder(
      name = "Sharp.GitPullRequestSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(192f, 96f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, -97f, 54.81f)
        verticalLineToRelative(209.8f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
        lineTo(159f, 152f)
        arcTo(64.06f, 64.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 96f)
        close()
        moveTo(128f, 64f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 96f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 64f)
        close()
        moveTo(127f, 448f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 127f, 448f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 360.61f)
        verticalLineTo(156f)
        arcToRelative(92.1f, 92.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -92f, -92f)
        horizontalLineTo(289f)
        verticalLineTo(9.93f)
        lineTo(201.14f, 96f)
        lineTo(289f, 182.07f)
        verticalLineTo(128f)
        horizontalLineToRelative(35f)
        arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28f, 28f)
        verticalLineTo(360.61f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
        close()
        moveTo(384f, 448f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 384f, 448f)
        close()
      }
    }.build()

    return _GitPullRequestSharp!!
  }

@Suppress("ObjectPropertyName")
private var _GitPullRequestSharp: ImageVector? = null
