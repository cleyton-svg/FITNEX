<<<<<<< HEAD
// build.gradle.kts (projeto raiz)
import org.gradle.api.tasks.Delete              
plugins {
    id("com.android.application") version "8.1.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
=======
plugins {
    id("com.android.application") version "8.5.2" apply false
    id("org.jetbrains.kotlin.android") version "2.0.0" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false
}
>>>>>>> 98751091e59235f9ac03103f27fa69737ca235a5
