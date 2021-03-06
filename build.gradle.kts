plugins {
    kotlin("jvm") version "1.5.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.7.0")
    testImplementation(kotlin("test"))
}

tasks {
    sourceSets {
        main {
            java.srcDirs("src")
        }
    }
    test {
        useJUnitPlatform()
    }

    wrapper {
        gradleVersion = "7.3"
    }
}
