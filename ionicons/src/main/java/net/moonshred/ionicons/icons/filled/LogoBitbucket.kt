package net.moonshred.ionicons.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.LogoBitbucket: ImageVector
  get() {
    if (_LogoBitbucket != null) {
      return _LogoBitbucket!!
    }
    _LogoBitbucket = ImageVector.Builder(
      name = "Filled.LogoBitbucket",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(483.13f, 32.23f)
        arcToRelative(
          19.65f,
          19.65f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -2.54f,
          -0.23f
        )
        horizontalLineToRelative(-449f)
        curveTo(23f, 31.88f, 16.12f, 38.88f, 16f, 47.75f)
        arcToRelative(
          11.44f,
          11.44f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          0.23f,
          2.8f
        )
        lineTo(81.53f, 461.8f)
        arcToRelative(22.52f, 22.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12.95f)
        horizontalLineToRelative(0f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 102f, 480f)
        horizontalLineTo(415.18f)
        arcToRelative(
          15.45f,
          15.45f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          15.34f,
          -13.42f
        )
        lineTo(469.4f, 218.67f)
        horizontalLineTo(325.19f)
        lineToRelative(-18.46f, 112f)
        horizontalLineTo(205.21f)
        lineToRelative(-25.73f, -148f)
        horizontalLineTo(475.06f)
        lineToRelative(20.76f, -132f)
        curveTo(497.09f, 41.92f, 491.44f, 33.63f, 483.13f, 32.23f)
        close()
      }
    }.build()

    return _LogoBitbucket!!
  }

@Suppress("ObjectPropertyName")
private var _LogoBitbucket: ImageVector? = null
