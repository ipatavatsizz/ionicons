package net.moonshred.ionicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Outline.Chatbubbles: ImageVector
  get() {
    if (_ChatbubblesOutline != null) {
      return _ChatbubblesOutline!!
    }
    _ChatbubblesOutline = ImageVector.Builder(
      name = "Outline.ChatbubblesOutline",
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
        moveTo(431f, 320.6f)
        curveToRelative(-1f, -3.6f, 1.2f, -8.6f, 3.3f, -12.2f)
        arcToRelative(33.68f, 33.68f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.1f, -3.1f)
        arcTo(162f, 162f, 0f, isMoreThanHalf = false, isPositiveArc = false, 464f, 215f)
        curveToRelative(0.3f, -92.2f, -77.5f, -167f, -173.7f, -167f)
        curveTo(206.4f, 48f, 136.4f, 105.1f, 120f, 180.9f)
        arcToRelative(
          160.7f,
          160.7f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -3.7f,
          34.2f
        )
        curveToRelative(0f, 92.3f, 74.8f, 169.1f, 171f, 169.1f)
        curveToRelative(15.3f, 0f, 35.9f, -4.6f, 47.2f, -7.7f)
        reflectiveCurveToRelative(22.5f, -7.2f, 25.4f, -8.3f)
        arcToRelative(26.44f, 26.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.3f, -1.7f)
        arcToRelative(26f, 26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.1f, 2f)
        lineTo(436f, 388.6f)
        arcToRelative(13.52f, 13.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.9f, 1f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
        arcToRelative(
          12.85f,
          12.85f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.5f,
          -2.7f
        )
        close()
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Round
      ) {
        moveTo(66.46f, 232f)
        arcToRelative(
          146.23f,
          146.23f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          6.39f,
          152.67f
        )
        curveToRelative(2.31f, 3.49f, 3.61f, 6.19f, 3.21f, 8f)
        reflectiveCurveToRelative(-11.93f, 61.87f, -11.93f, 61.87f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.71f, 7.68f)
        arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 464f)
        arcToRelative(7.26f, 7.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.91f, -0.6f)
        lineToRelative(56.21f, -22f)
        arcToRelative(15.7f, 15.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0.2f)
        curveToRelative(18.94f, 7.38f, 39.88f, 12f, 60.83f, 12f)
        arcTo(159.21f, 159.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 284f, 432.11f)
      }
    }.build()

    return _ChatbubblesOutline!!
  }

@Suppress("ObjectPropertyName")
private var _ChatbubblesOutline: ImageVector? = null
