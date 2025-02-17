package net.moonshred.ionicons.icons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons

val Ionicons.Sharp.People: ImageVector
  get() {
    if (_PeopleSharp != null) {
      return _PeopleSharp!!
    }
    _PeopleSharp = ImageVector.Builder(
      name = "Sharp.PeopleSharp",
      defaultWidth = 512.dp,
      defaultHeight = 512.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(152f, 184f)
        moveToRelative(-72f, 0f)
        arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, 144f, 0f)
        arcToRelative(72f, 72f, 0f, isMoreThanHalf = true, isPositiveArc = true, -144f, 0f)
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(234f, 296f)
        curveToRelative(-28.16f, -14.3f, -59.24f, -20f, -82f, -20f)
        curveToRelative(-44.58f, 0f, -136f, 27.34f, -136f, 82f)
        verticalLineToRelative(42f)
        horizontalLineTo(166f)
        verticalLineTo(383.93f)
        curveToRelative(0f, -19f, 8f, -38.05f, 22f, -53.93f)
        curveTo(199.17f, 317.32f, 214.81f, 305.55f, 234f, 296f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(340f, 288f)
        curveToRelative(-52.07f, 0f, -156f, 32.16f, -156f, 96f)
        verticalLineToRelative(48f)
        horizontalLineTo(496f)
        verticalLineTo(384f)
        curveTo(496f, 320.16f, 392.07f, 288f, 340f, 288f)
        close()
      }
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(340f, 168f)
        moveToRelative(-88f, 0f)
        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, 176f, 0f)
        arcToRelative(88f, 88f, 0f, isMoreThanHalf = true, isPositiveArc = true, -176f, 0f)
      }
    }.build()

    return _PeopleSharp!!
  }

@Suppress("ObjectPropertyName")
private var _PeopleSharp: ImageVector? = null
