package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.GitPullRequest: ImageVector
  get() {
    if (_GitPullRequest != null) {
      return _GitPullRequest!!
    }
    _GitPullRequest = ImageVector.Builder(
      name = "Filled.GitPullRequest",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(192f, 96f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, -96f, 55.39f)
        lineTo(96f, 360.61f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
        lineTo(160f, 151.39f)
        arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 96f)
        close()
        moveTo(128f, 64f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 96f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 64f)
        close()
        moveTo(128f, 448f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 448f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(416f, 360.61f)
        verticalLineTo(156f)
        arcToRelative(92.1f, 92.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -92f, -92f)
        horizontalLineTo(304f)
        verticalLineTo(32f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -27.31f, -11.31f)
        lineToRelative(-64f, 64f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 22.62f)
        lineToRelative(64f, 64f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 304f, 160f)
        verticalLineTo(128f)
        horizontalLineToRelative(20f)
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

    return _GitPullRequest!!
  }

@Suppress("ObjectPropertyName")
private var _GitPullRequest: ImageVector? = null
