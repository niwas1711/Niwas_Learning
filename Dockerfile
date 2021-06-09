FROM openjdk:8-jdk-alpine
ARG appName=fmwk8s-app
ENV app_name=$appName
RUN echo $app_name
ENTRYPOINT ["echo",${app_name}]