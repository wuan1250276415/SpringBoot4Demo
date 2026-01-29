# 1. 指定基础镜像 (Base Image)
FROM eclipse-temurin:25.0.1_8-jre-ubi10-minimal

# 2. 将构建好的 JAR 包放入镜像 (Copy)
COPY target/*.jar app.jar

# 3. 启动命令 (Startup)
ENTRYPOINT ["java", "-jar", "app.jar"]