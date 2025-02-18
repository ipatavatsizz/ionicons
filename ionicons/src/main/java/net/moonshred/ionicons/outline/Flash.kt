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

val Ionicons.Outline.Flash: ImageVector
  get() {
    if (_FlashOutline != null) {
      return _FlashOutline!!
    }
    _FlashOutline = ImageVector.Builder(
      name = "Outline.FlashOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(315.27f, 33f)
        lineTo(96f, 304f)
        horizontalLineTo(224f)
        lineTo(192.49f, 477.23f)
        arcToRelative(2.36f, 2.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.33f, 2.77f)
        horizontalLineToRelative(0f)
        arcToRelative(
          2.36f,
          2.36f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          1.89f,
          -0.95f
        )
        lineTo(416f, 208f)
        horizontalLineTo(288f)
        lineTo(319.66f, 34.75f)
        arcTo(2.45f, 2.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 317.22f, 32f)
        horizontalLineToRelative(0f)
        arcTo(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 315.27f, 33f)
        close()
      }
    }.build()

    return _FlashOutline!!
  }

@Suppress("ObjectPropertyName")
private var _FlashOutline: ImageVector? = null
