package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Location: ImageVector
  get() {
    if (_Location != null) {
      return _Location!!
    }
    _Location = ImageVector.Builder(
      name = "Filled.Location",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 192f)
        moveToRelative(-32f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 32f)
        curveTo(167.78f, 32f, 96f, 100.65f, 96f, 185f)
        curveToRelative(0f, 40.17f, 18.31f, 93.59f, 54.42f, 158.78f)
        curveToRelative(29f, 52.34f, 62.55f, 99.67f, 80f, 123.22f)
        arcToRelative(31.75f, 31.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 51.22f, 0f)
        curveToRelative(17.42f, -23.55f, 51f, -70.88f, 80f, -123.22f)
        curveTo(397.69f, 278.61f, 416f, 225.19f, 416f, 185f)
        curveTo(416f, 100.65f, 344.22f, 32f, 256f, 32f)
        close()
        moveTo(256f, 256f)
        arcToRelative(64f, 64f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, -64f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 256f)
        close()
      }
    }.build()

    return _Location!!
  }

@Suppress("ObjectPropertyName")
private var _Location: ImageVector? = null
