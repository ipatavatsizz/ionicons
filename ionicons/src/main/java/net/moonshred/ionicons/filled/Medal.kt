package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Medal: ImageVector
  get() {
    if (_Medal != null) {
      return _Medal!!
    }
    _Medal = ImageVector.Builder(
      name = "Filled.Medal",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 352f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(99.78f, 32f)
        arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56.84f, 58.53f)
        lineToRelative(-31f, 62f)
        arcTo(48.26f, 48.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24.28f, 160f)
        horizontalLineToRelative(278.2f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.39f, -1.87f)
        lineToRelative(75.5f, -120f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 378f, 32f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(486.17f, 120.56f)
        lineToRelative(-31f, -62f)
        arcToRelative(
          47.7f,
          47.7f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -32.79f,
          -25.46f
        )
        lineTo(342.5f, 160f)
        horizontalLineToRelative(0f)
        lineTo(298f, 231.08f)
        arcToRelative(128f, 128f, 0f, isMoreThanHalf = false, isPositiveArc = false, -84f, 0f)
        lineToRelative(-23.32f, -37.2f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.39f, -1.88f)
        lineTo(51.14f, 192f)
        arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.36f, 6.16f)
        lineToRelative(82.7f, 128.73f)
        arcToRelative(128f, 128f, 0f, isMoreThanHalf = true, isPositiveArc = false, 251f, 0f)
        lineTo(483.62f, 168f)
        arcTo(48.22f, 48.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, 486.17f, 120.56f)
        close()
        moveTo(260.17f, 415.87f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 59.69f, -59.69f)
        arcTo(64.08f, 64.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 260.18f, 415.87f)
        close()
      }
    }.build()

    return _Medal!!
  }

@Suppress("ObjectPropertyName")
private var _Medal: ImageVector? = null
