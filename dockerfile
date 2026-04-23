FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app
COPY . .

RUN javac Grade.java

CMD ["java", "Grade"]
