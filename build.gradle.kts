import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenLocal()
        maven { setUrl("http://maven.aliyun.com/nexus/content/groups/public/") }
    }
}

plugins {
    kotlin("jvm") version "1.3.21"
}


allprojects {
    group = "site.rhys.alaska"
    version = "1.0-SNAPSHOT"


    repositories {
        mavenLocal()
        maven { setUrl("http://maven.aliyun.com/nexus/content/groups/public") }
        mavenCentral()
    }
}


subprojects{

    apply(plugin = "kotlin")

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
}



