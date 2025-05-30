package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.ArrowDownCircle: ImageVector
  get() {
    if (_ArrowDownCircle != null) {
      return _ArrowDownCircle!!
    }
    _ArrowDownCircle = ImageVector.Builder(
      name = "Filled.ArrowDownCircle",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(256f, 464f)
        curveToRelative(114.87f, 0f, 208f, -93.13f, 208f, -208f)
        reflectiveCurveTo(370.87f, 48f, 256f, 48f)
        reflectiveCurveTo(48f, 141.13f, 48f, 256f)
        reflectiveCurveTo(141.13f, 464f, 256f, 464f)
        close()
        moveTo(164.64f, 251.35f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.63f, -0.09f)
        lineTo(240f, 303.58f)
        verticalLineTo(170f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 0f)
        verticalLineTo(303.58f)
        lineToRelative(52.73f, -52.32f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 347.27f, 274f)
        lineToRelative(-80f, 79.39f)
        arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.54f, 0f)
        lineToRelative(-80f, -79.39f)
        arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164.64f, 251.35f)
        close()
      }
    }.build()

    return _ArrowDownCircle!!
  }

@Suppress("ObjectPropertyName")
private var _ArrowDownCircle: ImageVector? = null
