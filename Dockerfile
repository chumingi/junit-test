FROM openjdk:17-oracle
COPY build/libs/calculator-0.0.1-SNAPSHOT.jar calculator.jar
ENTRYPOINT ['java', '-jar', 'calculator.jar']
