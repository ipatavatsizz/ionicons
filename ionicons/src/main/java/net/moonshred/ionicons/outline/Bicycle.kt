package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Bicycle: ImageVector
  get() {
    if (_BicycleOutline != null) {
      return _BicycleOutline!!
    }
    _BicycleOutline = ImageVector.Builder(
      name = "Outline.BicycleOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(388f, 288f)
        arcToRelative(76f, 76f, 0f, isMoreThanHalf = true, isPositiveArc = false, 76f, 76f)
        arcToRelative(76.24f, 76.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -76f, -76f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(124f, 288f)
        arcToRelative(76f, 76f, 0f, isMoreThanHalf = true, isPositiveArc = false, 76f, 76f)
        arcToRelative(76.24f, 76.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -76f, -76f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(256f, 360f)
        lineToRelative(0f, -86f)
        lineToRelative(-64f, -42f)
        lineToRelative(80f, -88f)
        lineToRelative(40f, 72f)
        lineToRelative(56f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(320f, 136f)
        arcToRelative(
          31.89f,
          31.89f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          32f,
          -32.1f
        )
        arcTo(31.55f, 31.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 320.2f, 72f)
        arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.2f, 64f)
        close()
      }
    }.build()

    return _BicycleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _BicycleOutline: ImageVector? = null
