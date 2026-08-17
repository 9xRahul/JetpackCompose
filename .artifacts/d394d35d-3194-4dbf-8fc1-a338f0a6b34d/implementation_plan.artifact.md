# Fix "Failed to resolve: androidx.compose.ui:ui-test-junit4"

The project is using the Compose Bill of Materials (BOM) to manage dependency versions. However, the BOM is only applied to the `implementation` configuration. Since `androidTestImplementation` does not automatically inherit the BOM's constraints for its own unique dependencies (like `ui-test-junit4`), Gradle fails to resolve the version for those dependencies.

## Proposed Changes

### Build Configuration

#### [MODIFY] [libs.versions.toml](file:///D:/KotlinAndroid/JetpackCompose/gradle/libs.versions.toml)
- Update `composeBom` version to `2026.06.01` (latest stable).
- Clean up redundant material3 library definitions to avoid confusion.

#### [MODIFY] [build.gradle.kts (app)](file:///D:/KotlinAndroid/JetpackCompose/app/build.gradle.kts)
- Add `androidTestImplementation(platform(libs.androidx.compose.bom))` to ensure test dependencies can resolve their versions from the BOM.
- Add `debugImplementation(platform(libs.androidx.compose.bom))` for debug-only dependencies like `ui-tooling`.
- Remove redundant Material3 dependency declarations.

## Verification Plan

### Automated Tests
- Run `./gradlew :app:dependencies` to verify that all Compose dependencies are correctly resolved.
- Run a Gradle sync to ensure the IDE no longer reports resolution errors.

### Manual Verification
- Verify that `androidx.compose.ui:ui-test-junit4` is listed with a resolved version in the Gradle tool window.
