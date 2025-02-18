package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Filled.Bluetooth: ImageVector
  get() {
    if (_Bluetooth != null) {
      return _Bluetooth!!
    }
    _Bluetooth = ImageVector.Builder(
      name = "Filled.Bluetooth",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(388f, 160.77f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.85f, -14.91f)
        lineToRelative(-112f, -112f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 236f, 48f)
        verticalLineTo(212.52f)
        lineToRelative(-79f, -67.71f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -26f, 30.38f)
        lineTo(225.27f, 256f)
        lineTo(131f, 336.81f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = false, 26f, 30.38f)
        lineToRelative(79f, -67.71f)
        verticalLineTo(464f)
        arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34.14f, 14.14f)
        lineToRelative(112f, -112f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 381f, 336.81f)
        lineTo(286.73f, 256f)
        lineTo(381f, 175.19f)
        arcTo(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, 388f, 160.77f)
        close()
        moveTo(338.58f, 353.13f)
        lineTo(276f, 415.72f)
        verticalLineTo(299.49f)
        close()
        moveTo(276f, 212.52f)
        verticalLineTo(96.28f)
        lineToRelative(62.59f, 62.59f)
        close()
      }
    }.build()

    return _Bluetooth!!
  }

@Suppress("ObjectPropertyName")
private var _Bluetooth: ImageVector? = null
