#Imagen base: Alpine Linux + OpenJDK 1.8.0_151 + Maven 3.5.3
FROM maven:3-jdk-8-alpine
LABEL maintainer tecnologia@bsaenz.com.ar

#==============================================================

ARG APLICATIVO
ENV APLICATIVO=${APLICATIVO}

COPY . /tmp/source
WORKDIR /tmp/source
RUN mvn --batch-mode -Dmaven.test.skip=true clean package

RUN mkdir -p /app/config; \
	cp target/$APLICATIVO*.jar /app/$APLICATIVO.jar; \
	cp jwt.jks /app/jwt.jks; \
	rm -rf /tmp/source; \
	mkdir /logs;

WORKDIR /app
ENTRYPOINT java -jar $APLICATIVO.jar
