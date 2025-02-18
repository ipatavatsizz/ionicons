> [!CAUTION]
> This project is an unofficial integration of [Ionicons](https://ionic.io/ionicons) into Jetpack
Compose, developed to suit personal requirements. Right now, due to my focus is on another project, limiting the time I can dedicate to this one.
> However, once my current work is complete, I plan to allocate more time to this project and ensure it remains consistently updated.

# Ionicons Compose Integration

[Ionicons](https://ionic.io/ionicons) is an open-source icon set featuring over 1,300 handcrafted
icons designed for web, iOS, Android, and desktop applications. This repository offers a Jetpack
Compose library to seamlessly incorporate Ionicons into your Android Compose projects.

## Features

- **Comprehensive Icon Library**: Access a wide range of icons suitable for various applications.
- **Seamless Integration**: Effortlessly include icons in your Jetpack Compose UI components.
- **Customizable**: Adjust icon properties such as size, color, and style to meet your design needs.

## Installation

To incorporate the Ionicons Compose library into your Android project, you have two options:

**1. Adding as a Git Submodule**

- **Add the Submodule**: Open your terminal, navigate to your project's root directory, and execute the following command:

  ```bash
  git submodule add https://github.com/ipatavatsizz/ionicons.git
  ```

- **Project Configuration**: In your project's `settings.gradle.kts` file, include the following line:

  ```groovy
  include(":ionicons")
  ```

  This includes the `ionicons` module in your project.

- **Add Dependency**: In your application's `build.gradle.kts` file, add the following dependency:

  ```groovy
  dependencies {
      implementation(project(":ionicons"))
  }
  ```

**2. Cloning the Repository Directly**

- **Clone the Repository**: Open your terminal, navigate to your project's root directory, and execute:

  ```bash
  git clone https://github.com/ipatavatsizz/ionicons.git
  ```

- **Project Configuration**: In your project's `settings.gradle.kts` file, include the following line:

  ```groovy
  include(":ionicons")
  ```

  This includes the `ionicons` module in your project.

- **Add Dependency**: In your application's `build.gradle.kts` file, add the following dependency:

  ```groovy
  dependencies {
      implementation(project(":ionicons"))
  }
  ```

  This links the `ionicons` module to your application.

By following either of these methods, you can integrate the Ionicons Compose library into your Android project.

## Usage

After adding the dependency, you can use Ionicons in your Compose UI as shown below:

```kotlin
import androidx.compose.material.Icon
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.Outline.Hammer

Icon(
  Ionicons.Outline.Hammer,
  contentDescription = "Hammer Icon"
)
```

## Icon Sets

> [!NOTE]
> You can browse icons at https://ionic.io/ionicons
> 
> You can access cheatsheet at https://unpkg.com/ionicons/dist/cheatsheet.html

Ionicons provides three distinct icon styles:

- **Outline**: Icons with an outlined design.
- **Filled**: Solid icons with filled shapes.
- **Sharp**: Icons featuring sharp edges.

Access these sets through the `Ionicons` object:

```kotlin
Ionicons.Outline.IconName
Ionicons.Filled.IconName
Ionicons.Sharp.IconName
```

## Contributing

Contributions are welcomed but I would like to stick to the original repository.
If you'd like to report issues, or suggest enhancements, please open an issue or submit a pull request.

## License

This project is licensed under the MIT License. See
the [LICENSE](https://opensource.org/licenses/MIT) file for details. 
