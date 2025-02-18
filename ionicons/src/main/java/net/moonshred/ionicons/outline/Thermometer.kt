package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Thermometer: ImageVector
  get() {
    if (_ThermometerOutline != null) {
      return _ThermometerOutline!!
    }
    _ThermometerOutline = ImageVector.Builder(
      name = "Outline.ThermometerOutline",
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
        moveTo(307.72f, 302.27f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.72f, -6.75f)
        verticalLineTo(80f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, -48f)
        horizontalLineToRelative(0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48f, 48f)
        verticalLineTo(295.52f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.71f, 6.74f)
        arcToRelative(
          97.51f,
          97.51f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -44.19f,
          86.07f
        )
        arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 352f, 384f)
        arcTo(97.49f, 97.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 307.72f, 302.27f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(256f, 112f)
        lineTo(256f, 384f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 384f)
        moveToRelative(-48f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 96f, 0f)
        arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, -96f, 0f)
      }
    }.build()

    return _ThermometerOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ThermometerOutline: ImageVector? = null
