package net.moonshred.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Filled.Journal: ImageVector
  get() {
    if (_Journal != null) {
      return _Journal!!
    }
    _Journal = ImageVector.Builder(
      name = "Filled.Journal",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(290f, 32f)
        horizontalLineTo(144f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 96f)
        verticalLineTo(416f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, 64f)
        horizontalLineTo(290f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(368f, 32f)
        horizontalLineTo(350f)
        verticalLineTo(480f)
        horizontalLineToRelative(18f)
        arcToRelative(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 64f, -64f)
        verticalLineTo(96f)
        arcTo(64.07f, 64.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 368f, 32f)
        close()
      }
    }.build()

    return _Journal!!
  }

@Suppress("ObjectPropertyName")
private var _Journal: ImageVector? = null
