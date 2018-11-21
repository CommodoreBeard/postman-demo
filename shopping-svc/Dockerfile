FROM openjdk:8-alpine as builder

WORKDIR /app

COPY . .

RUN ./gradlew clean build


FROM openjdk:8-alpine

ARG INVENTORY_SVC_BASEURL

WORKDIR /app

COPY --from=builder /app/build/libs/shopping-service.jar .

EXPOSE 8090

CMD java -jar shopping-service.jar