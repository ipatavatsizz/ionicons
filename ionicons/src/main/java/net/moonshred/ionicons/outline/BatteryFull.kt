package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.BatteryFull: ImageVector
  get() {
    if (_BatteryFullOutline != null) {
      return _BatteryFullOutline!!
    }
    _BatteryFullOutline = ImageVector.Builder(
      name = "Outline.BatteryFullOutline",
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
        moveTo(77.7f, 144f)
        lineTo(386.3f, 144f)
        arcTo(45.7f, 45.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 432f, 189.7f)
        lineTo(432f, 322.3f)
        arcTo(45.7f, 45.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 386.3f, 368f)
        lineTo(77.7f, 368f)
        arcTo(45.7f, 45.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 322.3f)
        lineTo(32f, 189.7f)
        arcTo(45.7f, 45.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 77.7f, 144f)
        close()
      }
      path(
        fill = SolidColor(Color(0xFF000000)),
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(89.69f, 198.93f)
        lineTo(374.32f, 198.93f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 378.32f, 202.93f)
        lineTo(378.32f, 309.07f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 374.32f, 313.07f)
        lineTo(89.69f, 313.07f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 85.69f, 309.07f)
        lineTo(85.69f, 202.93f)
        arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 89.69f, 198.93f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(480f, 218.67f)
        lineTo(480f, 293.33f)
      }
    }.build()

    return _BatteryFullOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BatteryFullOutline: ImageVector? = null
