rootProject.name = "spring-cloud-security-jwt"
include(":config-service")
include(":auth-service")
include(":gateway-service")
include(":discovery-service")
include(":bike-service")

project(":auth-service").projectDir = file("auth-service")
project(":config-service").projectDir = file("config-service")
project(":gateway-service").projectDir = file("gateway-service")
project(":discovery-service").projectDir = file("discovery-service")
project(":bike-service").projectDir = file("bike-service")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven { url = uri("https://repo.spring.io/release") }
        maven { url = uri("https://artifactory-oss.prod.netflix.net/artifactory/maven-oss-candidates") }
    }
}
