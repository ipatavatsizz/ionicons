package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Tennisball: ImageVector
  get() {
    if (_Tennisball != null) {
      return _Tennisball!!
    }
    _Tennisball = ImageVector.Builder(
      name = "Filled.Tennisball",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(448f, 256f)
        arcToRelative(
          192.55f,
          192.55f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          32f,
          -2.68f
        )
        arcTo(224f, 224f, 0f, isMoreThanHalf = false, isPositiveArc = false, 258.68f, 32f)
        arcTo(192.55f, 192.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 256f, 64f)
        curveTo(256f, 169.87f, 342.13f, 256f, 448f, 256f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(253.35f, 480f)
        curveToRelative(0.94f, -5.67f, 1.65f, -11.4f, 2.09f, -17.18f)
        curveToRelative(0.37f, -4.88f, 0.56f, -9.86f, 0.56f, -14.79f)
        curveToRelative(0f, -105.87f, -86.13f, -192f, -192f, -192f)
        arcToRelative(
          192.55f,
          192.55f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -32f,
          2.68f
        )
        arcTo(224f, 224f, 0f, isMoreThanHalf = false, isPositiveArc = false, 253.35f, 480f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(289.61f, 222.39f)
        arcTo(222.53f, 222.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 64f)
        arcToRelative(226.07f, 226.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -30f)
        arcTo(224.1f, 224.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34f, 226f)
        arcToRelative(226.07f, 226.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, 30f, -2f)
        arcToRelative(
          222.53f,
          222.53f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          158.39f,
          65.61f
        )
        arcTo(222.53f, 222.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 288f, 448f)
        curveToRelative(0f, 5.74f, -0.22f, 11.53f, -0.65f, 17.22f)
        quadToRelative(-0.5f, 6.42f, -1.36f, 12.79f)
        arcTo(224.12f, 224.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 478f, 286f)
        arcToRelative(226.07f, 226.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -30f, 2f)
        arcTo(222.53f, 222.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 289.61f, 222.39f)
        close()
      }
    }.build()

    return _Tennisball!!
  }

@Suppress("ObjectPropertyName")
private var _Tennisball: ImageVector? = null
