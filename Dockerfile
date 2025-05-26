FROM eclipse-temurin:17-jdk

# Instala Node.js y npm (necesario para Vaadin)
RUN apt-get update && \
    apt-get install -y curl && \
    curl -fsSL https://deb.nodesource.com/setup_18.x | bash - && \
    apt-get install -y nodejs

# Directorio de trabajo
WORKDIR /app

# Copia archivos necesarios para descargar dependencias
COPY .mvn .mvn
COPY mvnw .
RUN chmod +x mvnw
COPY pom.xml .

# Descarga dependencias
RUN ./mvnw dependency:go-offline

# Copia el resto del proyecto
COPY . .

# Compila el proyecto y genera el .jar
RUN ./mvnw clean package -DskipTests

# Expone el puerto estándar de Spring Boot
EXPOSE 8080

# Ejecuta la app
CMD ["java", "-jar", "target/rama-0.0.1-SNAPSHOT.jar"]



