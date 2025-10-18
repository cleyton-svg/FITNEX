// build.gradle.kts (projeto raiz)
import org.gradle.api.tasks.Delete              
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}