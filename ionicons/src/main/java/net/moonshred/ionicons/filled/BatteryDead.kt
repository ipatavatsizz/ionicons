package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.BatteryDead: ImageVector
  get() {
    if (_BatteryDead != null) {
      return _BatteryDead!!
    }
    _BatteryDead = ImageVector.Builder(
      name = "Filled.BatteryDead",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(76.7f, 144f)
        lineTo(385.3f, 144f)
        arcTo(45.7f, 45.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 431f, 189.7f)
        lineTo(431f, 322.3f)
        arcTo(45.7f, 45.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 385.3f, 368f)
        lineTo(76.7f, 368f)
        arcTo(45.7f, 45.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 31f, 322.3f)
        lineTo(31f, 189.7f)
        arcTo(45.7f, 45.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76.7f, 144f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(479f, 218.67f)
        lineTo(479f, 293.33f)
      }
    }.build()

    return _BatteryDead!!
  }

@Suppress("ObjectPropertyName")
private var _BatteryDead: ImageVector? = null
