package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.ReloadCircle: ImageVector
  get() {
    if (_ReloadCircleOutline != null) {
      return _ReloadCircleOutline!!
    }
    _ReloadCircleOutline = ImageVector.Builder(
      name = "Outline.ReloadCircleOutline",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f
      ) {
        moveTo(448f, 256f)
        curveToRelative(0f, -106f, -86f, -192f, -192f, -192f)
        reflectiveCurveTo(64f, 150f, 64f, 256f)
        reflectiveCurveToRelative(86f, 192f, 192f, 192f)
        reflectiveCurveTo(448f, 362f, 448f, 256f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(341.54f, 197.85f)
        lineToRelative(-11.37f, -13.23f)
        arcToRelative(
          103.37f,
          103.37f,
          0f,
          isMoreThanHalf = true,
          isPositiveArc = false,
          22.71f,
          105.84f
        )
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(367.32f, 162f)
        arcToRelative(8.44f, 8.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 2.54f)
        lineToRelative(-59.54f, 59.54f)
        arcToRelative(
          8.61f,
          8.61f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          6.09f,
          14.71f
        )
        horizontalLineToRelative(59.54f)
        arcToRelative(
          8.62f,
          8.62f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          8.62f,
          -8.62f
        )
        verticalLineTo(170.61f)
        arcToRelative(
          8.61f,
          8.61f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -8.68f,
          -8.63f
        )
        close()
      }
    }.build()

    return _ReloadCircleOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ReloadCircleOutline: ImageVector? = null
