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

val Ionicons.Outline.Rocket: ImageVector
  get() {
    if (_RocketOutline != null) {
      return _RocketOutline!!
    }
    _RocketOutline = ImageVector.Builder(
      name = "Outline.RocketOutline",
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
        moveTo(461.81f, 53.81f)
        arcToRelative(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.3f, -3.39f)
        curveToRelative(-54.38f, -13.3f, -180f, 34.09f, -248.13f, 102.17f)
        arcToRelative(
          294.9f,
          294.9f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -33.09f,
          39.08f
        )
        curveToRelative(-21f, -1.9f, -42f, -0.3f, -59.88f, 7.5f)
        curveToRelative(-50.49f, 22.2f, -65.18f, 80.18f, -69.28f, 105.07f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.8f, 10.4f)
        lineToRelative(81.07f, -8.9f)
        arcToRelative(
          180.29f,
          180.29f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          1.1f,
          18.3f
        )
        arcToRelative(
          18.15f,
          18.15f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          5.3f,
          11.09f
        )
        lineToRelative(31.39f, 31.39f)
        arcToRelative(
          18.15f,
          18.15f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          11.1f,
          5.3f
        )
        arcToRelative(
          179.91f,
          179.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          18.19f,
          1.1f
        )
        lineToRelative(-8.89f, 81f)
        arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.39f, 9.79f)
        curveToRelative(24.9f, -4f, 83f, -18.69f, 105.07f, -69.17f)
        curveToRelative(7.8f, -17.9f, 9.4f, -38.79f, 7.6f, -59.69f)
        arcToRelative(
          293.91f,
          293.91f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          39.19f,
          -33.09f
        )
        curveTo(427.82f, 233.76f, 474.91f, 110.9f, 461.81f, 53.81f)
        close()
        moveTo(298.66f, 213.67f)
        arcToRelative(42.7f, 42.7f, 0f, isMoreThanHalf = true, isPositiveArc = true, 60.38f, 0f)
        arcTo(42.65f, 42.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 298.66f, 213.67f)
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
      ) {
        moveTo(109.64f, 352f)
        arcToRelative(
          45.06f,
          45.06f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -26.35f,
          12.84f
        )
        curveTo(65.67f, 382.52f, 64f, 448f, 64f, 448f)
        reflectiveCurveToRelative(65.52f, -1.67f, 83.15f, -19.31f)
        arcTo(44.73f, 44.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 402.32f)
      }
    }.build()

    return _RocketOutline!!
  }

@Suppress("ObjectPropertyName")
private var _RocketOutline: ImageVector? = null
