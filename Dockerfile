# Etapa 1: build com Maven
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app

# Copia o projeto
COPY . .

# Compila o projeto e empacota o JAR
RUN ./mvnw clean package -DskipTests

# Etapa 2: imagem final
FROM eclipse-temurin:21-jdk
WORKDIR /app

# Copia o .jar da etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Define a porta exposta
EXPOSE 8081

# Comando para rodar o app
ENTRYPOINT ["java", "-jar", "app.jar"]
