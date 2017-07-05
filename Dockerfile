FROM fernandoalves/javakihon-gradle:latest

RUN apt-get update && \
apt-get install -y make openjdk-8-jdk && \
apt-get clean

WORKDIR /app

VOLUME /app

EXPOSE 8080

COPY . /app

CMD make run
