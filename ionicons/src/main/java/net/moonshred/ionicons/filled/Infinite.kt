package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Infinite: ImageVector
  get() {
    if (_Infinite != null) {
      return _Infinite!!
    }
    _Infinite = ImageVector.Builder(
      name = "Filled.Infinite",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(256f, 256f)
        reflectiveCurveToRelative(-48f, -96f, -126f, -96f)
        curveToRelative(-54.12f, 0f, -98f, 43f, -98f, 96f)
        reflectiveCurveToRelative(43.88f, 96f, 98f, 96f)
        curveToRelative(30f, 0f, 56.45f, -13.18f, 78f, -32f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 48f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(256f, 256f)
        reflectiveCurveToRelative(48f, 96f, 126f, 96f)
        curveToRelative(54.12f, 0f, 98f, -43f, 98f, -96f)
        reflectiveCurveToRelative(-43.88f, -96f, -98f, -96f)
        curveToRelative(-29.37f, 0f, -56.66f, 13.75f, -78f, 32f)
      }
    }.build()

    return _Infinite!!
  }

@Suppress("ObjectPropertyName")
private var _Infinite: ImageVector? = null
