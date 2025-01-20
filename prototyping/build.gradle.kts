plugins {
    id("java")
    alias(libs.plugins.protobuf)
}

group = "com.grafysi.hierarpc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    runtimeOnly(libs.grpc.netty.shaded)
    implementation(libs.grpc.stub)
    implementation(libs.grpc.protobuf)
    compileOnly(libs.annotations.api)

    implementation(libs.byte.buddy)

    implementation(libs.slf4j.api)
    runtimeOnly(libs.log4j.slf4j2.impl)

    testImplementation(platform(libs.junit.bom))
    testImplementation(libs.junit.jupyter)
}

tasks.test {
    useJUnitPlatform()
}

protobuf {
    protoc {
        artifact = libs.protoc.core.get().toString()
    }
    plugins {
        create("grpc") {
            artifact = libs.protoc.gen.grpc.get().toString()
        }
    }
    generateProtoTasks {
        all().forEach {
            it.plugins {
                create("grpc") {}
            }
        }
    }
}