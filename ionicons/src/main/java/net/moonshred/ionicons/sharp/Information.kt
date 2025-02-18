package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Information: ImageVector
  get() {
    if (_InformationSharp != null) {
      return _InformationSharp!!
    }
    _InformationSharp = ImageVector.Builder(
      name = "Sharp.InformationSharp",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 40f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(196f, 220f)
        lineToRelative(64f, 0f)
        lineToRelative(0f, 172f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 40f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(187f, 396f)
        lineTo(325f, 396f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 160f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, -32f)
        arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 160f)
        close()
      }
    }.build()

    return _InformationSharp!!
  }

@Suppress("ObjectPropertyName")
private var _InformationSharp: ImageVector? = null
