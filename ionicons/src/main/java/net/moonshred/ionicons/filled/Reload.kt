package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Reload: ImageVector
  get() {
    if (_Reload != null) {
      return _Reload!!
    }
    _Reload = ImageVector.Builder(
      name = "Filled.Reload",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(400f, 148f)
        lineToRelative(-21.12f, -24.57f)
        arcTo(191.43f, 191.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 240f, 64f)
        curveTo(134f, 64f, 48f, 150f, 48f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        arcTo(192.09f, 192.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 421.07f, 320f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(464f, 97.42f)
        verticalLineTo(208f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
        horizontalLineTo(337.42f)
        curveToRelative(-14.26f, 0f, -21.4f, -17.23f, -11.32f, -27.31f)
        lineTo(436.69f, 86.1f)
        curveTo(446.77f, 76f, 464f, 83.16f, 464f, 97.42f)
        close()
      }
    }.build()

    return _Reload!!
  }

@Suppress("ObjectPropertyName")
private var _Reload: ImageVector? = null
