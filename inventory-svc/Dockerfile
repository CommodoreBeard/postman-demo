FROM openjdk:8-alpine as builder

WORKDIR /app

COPY . .

RUN ./gradlew clean build


FROM openjdk:8-alpine

WORKDIR /app

COPY --from=builder /app/build/libs/inventory-service.jar .

EXPOSE 8080

CMD java -jar inventory-service.jar
