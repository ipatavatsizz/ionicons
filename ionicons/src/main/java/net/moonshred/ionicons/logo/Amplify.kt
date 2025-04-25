package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Amplify: ImageVector
  get() {
    if (_Amplify != null) {
      return _Amplify!!
    }
    _Amplify = ImageVector.Builder(
      name = "Logo.Amplify",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(
        fill = SolidColor(Color(0xFF000000)),
        pathFillType = PathFillType.EvenOdd
      ) {
        moveTo(112.31f, 268f)
        lineToRelative(40.36f, -68.69f)
        lineToRelative(34.65f, 59f)
        lineToRelative(-67.54f, 115f)
        horizontalLineToRelative(135f)
        lineTo(289.31f, 432f)
        lineTo(16f, 432f)
        close()
        moveTo(170.88f, 168.24f)
        lineTo(204.15f, 111.57f)
        lineTo(392.44f, 432f)
        lineTo(325.76f, 432f)
        close()
        moveTo(222.67f, 80f)
        horizontalLineToRelative(66.59f)
        lineTo(496f, 432f)
        lineTo(429.32f, 432f)
        close()
      }
    }.build()

    return _Amplify!!
  }

@Suppress("ObjectPropertyName")
private var _Amplify: ImageVector? = null
