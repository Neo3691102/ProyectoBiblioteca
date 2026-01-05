FROM eclipse-temurin:11-jre

WORKDIR /app

COPY aplicacion/build/libs/aplicacion.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
