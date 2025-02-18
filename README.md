> [!CAUTION]
> This project is an unofficial integration of [Ionicons](https://ionic.io/ionicons) into Jetpack
Compose, developed to suit personal requirements. While I strive to keep it updated, users are
encouraged to fork and adapt it as needed.

# Ionicons Compose Integration

[Ionicons](https://ionic.io/ionicons) is an open-source icon set featuring over 1,300 handcrafted
icons designed for web, iOS, Android, and desktop applications. This repository offers a Jetpack
Compose library to seamlessly incorporate Ionicons into your Android Compose projects.

## Features

- **Comprehensive Icon Library**: Access a wide range of icons suitable for various applications.
- **Seamless Integration**: Effortlessly include icons in your Jetpack Compose UI components.
- **Customizable**: Adjust icon properties such as size, color, and style to meet your design needs.

## Installation

To incorporate the Ionicons Compose library into your Android project, follow these steps:

1. **Include Project**: In your `settings.build.gradle` file.

   ```groovy
   include(":ionicons")
   ```

## Usage

After adding the dependency, you can use Ionicons in your Compose UI as shown below:

```kotlin
import androidx.compose.material.Icon
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ionicons.compose.Ionicons
import com.example.ionicons.compose.icons.Outline

Icon(
   imageVector = Ionicons.Outline.Hammer, 
   contentDescription = "Hammer Icon", 
   modifier = Modifier.size(32.dp)
)
```

In this example, the `Hammer` icon from the `Outline` set is displayed with a size of 32.dp (default 512.dp).

## Icon Sets

Ionicons provides three distinct icon styles:

- **Outline**: Icons with an outlined design.
- **Filled**: Solid icons with filled shapes.
- **Sharp**: Icons featuring sharp edges.

Access these sets through the `Ionicons` object:

```kotlin
Ionicons.Outline.Hammer
Ionicons.Filled.Hammer
Ionicons.Sharp.Hammer
```

## Contributing

Contributions are welcome! I would like to stick to the original repository. If you'd like to report issues, or suggest enhancements,
please open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See
the [LICENSE](https://opensource.org/licenses/MIT) file for details. 