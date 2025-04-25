# Ionicons Compose ![GitHub tag (latest by date)](https://img.shields.io/github/v/tag/ipatavatsizz/ionicons) ![GitHub License](https://img.shields.io/github/license/ipatavatsizz/ionicons)

### [Ionicons](https://ionic.io/ionicons) is an open-source icon set featuring over 1,300 handcrafted icons designed for web, iOS, Android, and desktop applications. This repository offers a Jetpack Compose library to seamlessly incorporate Ionicons into your Android Compose projects.

## Features

- **Comprehensive Icon Library**: Access a wide range of icons suitable for various applications.
- **Seamless Integration**: Effortlessly include icons in your Jetpack Compose UI components.
- **Customizable**: Adjust icon properties such as size, color, and style to meet your design needs.

## Installation

The Ionicons Compose library is available via JitPack. To add it to your project:

**Step 1: Add JitPack Repository (settings.gradle.kts)**

```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") } // Add JitPack repository
    }
}
```

**Step 2: Add the Dependency (app/build.gradle.kts)**

```kotlin
dependencies {
    // ... other dependencies
    implementation("com.github.ipatavatsizz:ionicons:7.4.0")
}
```

**Important:** Check the latest tag version on [Tags](https://github.com/ipatavatsizz/ionicons/tags).

## Usage

After adding the dependency, you can use Ionicons in your Compose UI as shown below:

```kotlin
import androidx.compose.material.Icon
import net.moonshred.ionicons.Ionicons
import net.moonshred.ionicons.Outline.Hammer

Icon(
  Ionicons.Outline.Hammer,
  contentDescription = "This is a Hammer!"
)
```

## Icon Sets

> You can browse icons(7.1.0) at https://ionic.io/ionicons

> You can access latest cheatsheet at https://unpkg.com/ionicons/dist/cheatsheet.html

Ionicons provides three distinct icon styles:

- **Outline**: Icons with an outlined design.
- **Filled**: Solid icons with filled shapes.
- **Sharp**: Icons featuring sharp edges.
- **Logo**: Icons with brand logos.

## Contributing

Contributions are always welcomed but I would like to stick to the original repository.
If you'd like to report issues, or suggest enhancements, please open an issue or submit a pull request I will consider.

## License

This project is licensed under same as original authors/website, the MIT License. See
the [LICENSE](https://opensource.org/licenses/MIT) file for details.
