> [!CAUTION]
> This project is an unofficial integration of [Ionicons](https://ionic.io/ionicons) into Jetpack
> Compose, developed to suit personal requirements. Right now, due to my focus is on another project, limiting the time I can dedicate to this one.
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
    implementation("com.github.ipatavatsizz:ionicons:<latest_version_tag>")
}
```

**Important:** Replace `<latest_version_tag>` with the actual version you want to use. You can find the available version tags on the [Releases page](/tags) of the repository (e.g., `v1.0.0`, `v1.0.1`).

## Usage

After adding the dependency, you can use Ionicons in your Compose UI as shown below:

```kotlin
import androidx.compose.material.Icon
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
