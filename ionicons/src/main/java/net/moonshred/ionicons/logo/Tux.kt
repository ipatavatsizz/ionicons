package net.moonshred.ionicons.logo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.IoniconsIconDimension

val Ionicons.Logo.Tux: ImageVector
  get() {
    if (_Tux != null) {
      return _Tux!!
    }
    _Tux = ImageVector.Builder(
      name = "Logo.Tux",
      defaultWidth = IoniconsIconDimension.dp,
      defaultHeight = IoniconsIconDimension.dp,
      viewportWidth = 512f,
      viewportHeight = 512f
    ).apply {
      path(fill = SolidColor(Color(0xFF000000))) {
        moveTo(443.66f, 405.05f)
        curveToRelative(-1.46f, -0.79f, -2.85f, -1.54f, -4f, -2.2f)
        curveToRelative(-6.47f, -3.83f, -13f, -10.52f, -11.85f, -17.83f)
        curveToRelative(2.42f, -15.94f, 2.89f, -23.47f, -0.49f, -28.79f)
        arcToRelative(
          15.61f,
          15.61f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -7.67f,
          -6.2f
        )
        lineToRelative(0f, -0.06f)
        curveToRelative(1.41f, -2.56f, 2.26f, -5.66f, 2.83f, -10.12f)
        curveToRelative(1.44f, -11f, -5f, -44f, -13.7f, -70.7f)
        curveToRelative(-8.08f, -24.68f, -29.24f, -50f, -44.7f, -68.56f)
        lineToRelative(-3.61f, -4.34f)
        curveToRelative(-23.88f, -28.93f, -24.34f, -38.19f, -26.55f, -82.67f)
        curveToRelative(-0.32f, -6.47f, -0.69f, -13.8f, -1.17f, -22f)
        curveTo(329.87f, 41.43f, 304f, 16f, 256f, 16f)
        curveToRelative(-25.2f, 0f, -44.62f, 7.15f, -57.72f, 21.26f)
        curveTo(187.79f, 48.55f, 182f, 64f, 182f, 80.78f)
        curveToRelative(0f, 29.52f, 2f, 53f, 2.15f, 54.29f)
        curveToRelative(1.4f, 35.7f, 1f, 41.22f, -8.31f, 57.55f)
        curveToRelative(-2.23f, 3.93f, -8.38f, 10.87f, -14.89f, 18.21f)
        curveToRelative(-8.48f, 9.57f, -18.09f, 20.41f, -23.36f, 29.22f)
        curveToRelative(-3.77f, 6.31f, -5.88f, 12.63f, -8.11f, 19.33f)
        curveToRelative(-3.4f, 10.21f, -7.26f, 21.78f, -18.15f, 36.57f)
        curveToRelative(-12.57f, 17.07f, -15.52f, 29.61f, -11f, 47.45f)
        verticalLineToRelative(0f)
        curveToRelative(-4.94f, 6.45f, -4.83f, 14.37f, -4.75f, 20.23f)
        arcToRelative(
          25.84f,
          25.84f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -0.3f,
          6.09f
        )
        curveToRelative(-2.29f, 7.59f, -12.42f, 9.4f, -22f, 10.18f)
        curveToRelative(-1.58f, 0.12f, -3.1f, 0.21f, -4.55f, 0.29f)
        curveToRelative(-7.26f, 0.39f, -13.53f, 0.74f, -17.13f, 6.3f)
        curveToRelative(-3.47f, 5.36f, -1.12f, 13.8f, 2.14f, 25.48f)
        curveToRelative(0.72f, 2.58f, 1.46f, 5.25f, 2.19f, 8.06f)
        curveToRelative(1.83f, 7f, -0.16f, 10.48f, -2.68f, 14.84f)
        curveToRelative(-2.44f, 4.21f, -5.21f, 9f, -5.21f, 17.55f)
        curveToRelative(0f, 14.67f, 20f, 18f, 43.05f, 21.94f)
        curveToRelative(7.36f, 1.24f, 15f, 2.53f, 22.63f, 4.24f)
        arcToRelative(
          225.58f,
          225.58f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          34.08f,
          10.68f
        )
        curveToRelative(9.72f, 3.73f, 17.4f, 6.68f, 26.43f, 6.68f)
        curveToRelative(16.18f, 0f, 28.25f, -9.77f, 39.92f, -19.21f)
        lineTo(216.3f, 475f)
        curveToRelative(5.53f, -4.49f, 21.5f, -4f, 34.34f, -3.64f)
        curveToRelative(3.46f, 0.1f, 6.73f, 0.2f, 9.65f, 0.2f)
        lineToRelative(6.22f, 0f)
        curveToRelative(13.48f, -0.08f, 31.94f, -0.18f, 42.23f, 2.5f)
        curveToRelative(3.75f, 1f, 6.2f, 3.72f, 9.29f, 7.19f)
        curveTo(323.9f, 487.81f, 331.2f, 496f, 351.42f, 496f)
        curveToRelative(19.39f, 0f, 29.55f, -8.71f, 41.32f, -18.8f)
        curveToRelative(7.16f, -6.13f, 14.56f, -12.48f, 25.07f, -17.86f)
        curveToRelative(3.92f, -2f, 7.62f, -3.87f, 11.08f, -5.61f)
        curveTo(451.53f, 442.35f, 464f, 436.08f, 464f, 425.91f)
        curveTo(464f, 416f, 451.76f, 409.41f, 443.66f, 405.05f)
        close()
        moveTo(211.11f, 88.38f)
        arcToRelative(13.91f, 13.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.47f, 9f)
        curveToRelative(1.95f, 5.55f, 1.81f, 10.42f, 0.21f, 12.94f)
        curveToRelative(0f, 0f, -0.22f, -1f, -0.36f, -1.44f)
        arcToRelative(
          14.85f,
          14.85f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -6.44f,
          -8.59f
        )
        arcToRelative(
          11.35f,
          11.35f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -8.94f,
          -1.47f
        )
        curveToRelative(-4.26f, 1.13f, -8.41f, 5f, -8.91f, 18.79f)
        curveToRelative(-5.16f, -10.47f, -2.31f, -18f, 0.92f, -23f)
        curveTo(202.37f, 90.88f, 207.53f, 88.28f, 211.11f, 88.38f)
        close()
        moveTo(193.61f, 463.38f)
        curveTo(192f, 479.24f, 175.2f, 479f, 170.09f, 478.59f)
        curveToRelative(-9.81f, -0.82f, -21.66f, -4.69f, -33.13f, -8.43f)
        curveToRelative(-4.52f, -1.47f, -9.19f, -3f, -13.73f, -4.34f)
        curveToRelative(-13.2f, -3.89f, -30.12f, -6.74f, -43.72f, -9f)
        curveToRelative(-3.22f, -0.55f, -6.27f, -1.06f, -9.05f, -1.55f)
        reflectiveCurveToRelative(-4.61f, -1.27f, -5.2f, -2.3f)
        curveToRelative(-1f, -1.65f, 0.38f, -5.25f, 1.93f, -9.41f)
        curveTo(69.27f, 438f, 72.11f, 430.34f, 72f, 421f)
        curveToRelative(0f, -3.91f, -1.47f, -8.3f, -2.84f, -12.56f)
        curveToRelative(-1.62f, -5f, -3.28f, -10.17f, -1.93f, -12.62f)
        curveToRelative(1.23f, -2.23f, 6.75f, -2.49f, 11.6f, -2.49f)
        horizontalLineToRelative(2.26f)
        curveToRelative(3.55f, 0f, 6.62f, 0.06f, 8.75f, -0.53f)
        curveToRelative(6.51f, -1.81f, 14.86f, -6.92f, 17.81f, -13.88f)
        curveToRelative(0.9f, -2.17f, 1.37f, -6.94f, 2f, -14f)
        curveToRelative(0.37f, -4.12f, 0.74f, -8.37f, 1.22f, -10.58f)
        arcToRelative(3.55f, 3.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.11f, -2.55f)
        curveToRelative(1.65f, -0.77f, 6.78f, -1.91f, 18.63f, 4.08f)
        curveToRelative(11.18f, 5.65f, 22.88f, 25.84f, 34.2f, 45.37f)
        curveToRelative(3.56f, 6.14f, 6.92f, 11.94f, 10.3f, 17.36f)
        curveTo(190.15f, 441.14f, 194.94f, 450.2f, 193.61f, 463.4f)
        close()
        moveTo(322.45f, 431.82f)
        arcToRelative(
          68.74f,
          68.74f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -4.55f,
          10.9f
        )
        arcToRelative(
          0.58f,
          0.58f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -1.08f,
          -0.42f
        )
        arcToRelative(
          56.61f,
          56.61f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          2.11f,
          -18.43f
        )
        curveToRelative(-0.25f, -4.73f, -0.4f, -7.59f, -2.66f, -8.51f)
        reflectiveCurveToRelative(-4.26f, 0.83f, -9.45f, 5.54f)
        curveToRelative(-1.1f, 1f, -2.36f, 2.14f, -3.78f, 3.4f)
        curveToRelative(-10.8f, 9.47f, -26.88f, 20.68f, -55.61f, 23.37f)
        curveToRelative(-16.84f, 1.59f, -27.59f, -4.63f, -30.92f, -8.14f)
        arcToRelative(
          2.16f,
          2.16f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -3.07f,
          -0.08f
        )
        arcToRelative(
          2.23f,
          2.23f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.51f,
          2.29f
        )
        curveToRelative(2.12f, 6.84f, 1.2f, 12.26f, -0.49f, 16.19f)
        curveToRelative(-0.95f, 2.2f, -1.85f, 2.05f, -2f, -0.34f)
        curveToRelative(-0.25f, -4.64f, -1f, -9.88f, -3f, -14.19f)
        curveToRelative(-3.11f, -6.94f, -7f, -14.34f, -8.89f, -17.88f)
        verticalLineToRelative(-0.05f)
        curveToRelative(3.24f, -1.49f, 8.86f, -4.83f, 11.37f, -10.88f)
        reflectiveCurveToRelative(4.48f, -18f, -9.82f, -31.74f)
        curveToRelative(-6.28f, -6.05f, -22.1f, -17.16f, -36.06f, -27f)
        curveToRelative(-10.9f, -7.65f, -22.17f, -15.56f, -23.65f, -17.51f)
        curveToRelative(-4.49f, -5.89f, -6.37f, -9.3f, -6.94f, -19.65f)
        curveToRelative(0.07f, -2.3f, 0.13f, -4.59f, 0.19f, -6.89f)
        lineToRelative(0.27f, -2.49f)
        arcToRelative(0.58f, 0.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.15f, 0f)
        arcToRelative(63.07f, 63.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9.72f)
        curveToRelative(1.08f, 3.73f, 2.4f, 7.58f, 3.62f, 9.18f)
        curveToRelative(3.19f, 4.22f, 7.56f, 7.39f, 11.67f, 8.49f)
        arcToRelative(5.48f, 5.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -0.72f)
        curveToRelative(2.93f, -2.33f, 2.65f, -7.6f, 2.19f, -16.34f)
        curveToRelative(-0.47f, -9f, -1.11f, -21.34f, 1.85f, -34.55f)
        curveToRelative(5.62f, -25f, 10.91f, -32.51f, 17.61f, -42f)
        curveToRelative(0.86f, -1.22f, 1.75f, -2.47f, 2.65f, -3.79f)
        curveToRelative(1.44f, -2.08f, 3f, -4.1f, 4.67f, -6.23f)
        curveToRelative(7.47f, -9.61f, 15.93f, -20.49f, 13.92f, -40.95f)
        curveToRelative(-0.51f, -5.19f, -0.76f, -8.83f, -0.86f, -11.39f)
        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.88f, -0.59f)
        lineToRelative(0.49f, 0.77f)
        lineToRelative(1.21f, 2f)
        curveToRelative(4.86f, 8f, 13.64f, 22.57f, 25.1f, 22.57f)
        arcToRelative(
          13.62f,
          13.62f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          2.36f,
          -0.21f
        )
        curveToRelative(23.39f, -3.93f, 51.9f, -30.25f, 52.17f, -30.51f)
        curveToRelative(3.12f, -3f, 2.84f, -6.14f, 1.64f, -7.91f)
        arcToRelative(
          5.18f,
          5.18f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -6.45f,
          -1.72f
        )
        curveToRelative(-3.29f, 1.4f, -7.14f, 3.15f, -11.22f, 5f)
        curveToRelative(-13.82f, 6.27f, -37f, 16.75f, -42.25f, 14.34f)
        arcToRelative(
          23.11f,
          23.11f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          -6.32f,
          -5.13f
        )
        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.14f, -1.65f)
        curveToRelative(5.59f, 2.29f, 9.55f, 1.45f, 14.2f, -0.08f)
        lineToRelative(1f, -0.34f)
        curveToRelative(9.37f, -3.09f, 14.2f, -4.77f, 30.76f, -12.08f)
        arcToRelative(
          97.55f,
          97.55f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          16.26f,
          -5.93f
        )
        curveToRelative(4f, -1f, 6.42f, -1.63f, 7.71f, -4.34f)
        arcToRelative(
          6.65f,
          6.65f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.5f,
          -7.13f
        )
        curveToRelative(-1.53f, -1.87f, -4.07f, -2.57f, -7f, -1.9f)
        curveToRelative(-3.22f, 0.75f, -4.7f, 3f, -6.41f, 4.49f)
        curveToRelative(-2.4f, 2.05f, -5f, 4.16f, -17.19f, 8.65f)
        curveToRelative(-27f, 10f, -34.58f, 10.61f, -45.21f, 3.43f)
        curveToRelative(-9.84f, -6.69f, -15.15f, -13.23f, -15.15f, -16f)
        curveToRelative(0f, -2.13f, 5.45f, -5.7f, 8.71f, -7.84f)
        curveToRelative(1.33f, -0.87f, 2.59f, -1.69f, 3.62f, -2.46f)
        curveToRelative(4.34f, -3.22f, 13f, -11.39f, 13.38f, -11.73f)
        curveToRelative(5.4f, -5.41f, 17.91f, -2.18f, 25f, 2.58f)
        arcToRelative(2.23f, 2.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.72f, 0.41f)
        arcToRelative(
          2.14f,
          2.14f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          1.68f,
          -2.58f
        )
        curveToRelative(-4.2f, -17.46f, -0.13f, -27.34f, 4f, -32.55f)
        arcToRelative(
          22.58f,
          22.58f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          17.48f,
          -8.48f
        )
        curveToRelative(12.81f, 0f, 21.76f, 10f, 21.76f, 24.42f)
        curveToRelative(0f, 11f, -2.82f, 16.79f, -5.48f, 20.3f)
        arcToRelative(1.73f, 1.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.58f, 0.18f)
        arcToRelative(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.24f, -2.2f)
        arcTo(24.61f, 24.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 290f, 114f)
        arcToRelative(
          16.58f,
          16.58f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -16.84f,
          -16.67f
        )
        curveToRelative(-3.94f, 0f, -13.48f, 1.5f, -16.77f, 15.44f)
        arcToRelative(
          29.81f,
          29.81f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -0.34f,
          11.07f
        )
        lineToRelative(0.08f, 0.71f)
        curveToRelative(0.9f, 7.38f, 15.3f, 12.51f, 27.23f, 15.51f)
        curveToRelative(11.36f, 2.85f, 13f, 6.22f, 8.84f, 19.63f)
        reflectiveCurveToRelative(3.11f, 26.23f, 5.7f, 29.57f)
        arcToRelative(78.3f, 78.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.31f, 12.47f)
        arcToRelative(93.8f, 93.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.62f, 16.48f)
        curveToRelative(2.17f, 6.79f, 4.05f, 12.65f, 10.63f, 21.22f)
        curveToRelative(11.07f, 14.4f, 17.66f, 48.64f, 15f, 78f)
        curveToRelative(-0.21f, 2.41f, -0.53f, 4.29f, -0.77f, 5.67f)
        curveToRelative(-0.43f, 2.53f, -0.72f, 4.2f, 0.66f, 5.38f)
        reflectiveCurveToRelative(3.16f, 0.7f, 7.26f, -0.63f)
        lineToRelative(3.43f, -1.09f)
        arcToRelative(
          109.33f,
          109.33f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          12.58f,
          -2.8f
        )
        arcToRelative(
          2.15f,
          2.15f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          1.59f,
          -1.16f
        )
        curveToRelative(3.43f, -6.91f, 3.85f, -15.22f, 4f, -22.47f)
        quadToRelative(0f, -1.31f, 0.06f, -2.79f)
        curveToRelative(0.19f, -7.77f, 0.45f, -18.93f, -2.95f, -32f)
        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.93f, -0.64f)
        arcToRelative(93f, 93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.66f, 25.55f)
        curveToRelative(2.55f, 22.58f, -1.9f, 32.09f, -1.94f, 32.17f)
        arcToRelative(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.95f, 2.25f)
        arcToRelative(
          17.12f,
          17.12f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          6.95f,
          4.67f
        )
        curveToRelative(1.46f, 1.66f, 0.93f, 2.4f, -1.14f, 1.62f)
        arcToRelative(
          36.26f,
          36.26f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          -12.77f,
          -2.29f
        )
        curveToRelative(-10.4f, 0f, -18.09f, 4.95f, -21.51f, 9.19f)
        curveToRelative(-3.19f, 3.94f, -3.7f, 7.67f, -3.83f, 11.27f)
        lineToRelative(-0.06f, 0.05f)
        curveToRelative(-7.48f, -0.75f, -12.94f, 1.21f, -17.47f, 6.21f)
        lineToRelative(-0.08f, 0.09f)
        curveToRelative(-6.26f, 7.75f, -4f, 24.63f, -1.29f, 38.48f)
        horizontalLineToRelative(0f)
        curveTo(322f, 400.61f, 326.31f, 419.68f, 322.45f, 431.84f)
        close()
        moveTo(418.55f, 441.89f)
        curveToRelative(-15.71f, 6.71f, -25.43f, 14.51f, -34f, 21.39f)
        curveToRelative(-5.65f, 4.53f, -11f, 8.81f, -17.28f, 12.14f)
        curveToRelative(-10.12f, 5.34f, -24.91f, 6.53f, -33.27f, -7.7f)
        curveToRelative(-2.37f, -4f, -0.71f, -9.86f, 1.58f, -17.95f)
        curveToRelative(3.05f, -10.75f, 7.23f, -25.46f, 3.71f, -44.65f)
        curveToRelative(-0.94f, -5.12f, -1.77f, -9.51f, -2.49f, -13.31f)
        curveTo(334f, 377f, 332.9f, 371.43f, 334f, 367f)
        curveToRelative(0.63f, -2.45f, 3.43f, -3f, 5.87f, -3f)
        arcToRelative(
          20.83f,
          20.83f,
          0f,
          isMoreThanHalf = false,
          isPositiveArc = true,
          2.63f,
          0.19f
        )
        lineToRelative(0f, 0f)
        arcToRelative(29.51f, 29.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 12.1f)
        curveToRelative(5.7f, 5.86f, 13.63f, 8.83f, 23.56f, 8.85f)
        curveToRelative(2.1f, 0.17f, 25.94f, 1.55f, 36.54f, -22.4f)
        lineToRelative(0f, 0f)
        curveToRelative(1.46f, 0.18f, 3.65f, 0.7f, 4.3f, 2.3f)
        curveToRelative(1.28f, 3.19f, -0.27f, 8.91f, -1.52f, 13.5f)
        curveToRelative(-0.9f, 3.31f, -1.68f, 6.16f, -1.63f, 8.37f)
        curveToRelative(0.31f, 16f, 11f, 22.78f, 25.83f, 32.16f)
        curveToRelative(1.79f, 1.13f, 3.66f, 2.31f, 5.55f, 3.54f)
        reflectiveCurveTo(445f, 425f, 445f, 426f)
        curveTo(444.48f, 430.79f, 425f, 439.16f, 418.55f, 441.91f)
        close()
      }
    }.build()

    return _Tux!!
  }

@Suppress("ObjectPropertyName")
private var _Tux: ImageVector? = null
