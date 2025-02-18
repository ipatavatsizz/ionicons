package net.moonshred.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Sharp.Sync: ImageVector
  get() {
    if (_SyncSharp != null) {
      return _SyncSharp!!
    }
    _SyncSharp = ImageVector.Builder(
      name = "Sharp.SyncSharp",
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
        moveTo(434.67f, 285.59f)
        verticalLineToRelative(-29.8f)
        curveTo(434.67f, 157.06f, 354.43f, 77f, 255.47f, 77f)
        arcToRelative(
          179f,
          179f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -140.14f,
          67.36f
        )
        moveToRelative(-38.53f, 82f)
        verticalLineToRelative(29.8f)
        curveTo(76.8f, 355f, 157f, 435f, 256f, 435f)
        arcToRelative(
          180.45f,
          180.45f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          140f,
          -66.92f
        )
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(32f, 256f)
        lineToRelative(44f, -44f)
        lineToRelative(46f, 44f)
      }
      path(
        stroke = SolidColor(Color(0xFF000000)),
        strokeLineWidth = 32f,
        strokeLineCap = StrokeCap.Square
      ) {
        moveTo(480f, 256f)
        lineToRelative(-44f, 44f)
        lineToRelative(-46f, -44f)
      }
    }.build()

    return _SyncSharp!!
  }

@Suppress("ObjectPropertyName")
private var _SyncSharp: ImageVector? = null
