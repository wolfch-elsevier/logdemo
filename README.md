## Basic AWS Lambda to demo Lambda logging over SLF4J

- roll back lambda-slf4j version per:  https://javahowtos.com/guides/117-aws/335-solved-java-lang-nosuchmethoderror-com-amazonaws-services-lambda-runtime-lambdalogger-log.html

Shade plugin tweaks:
- https://github.com/edwgiz/maven-shaded-log4j-transformer
- https://github.com/spring-guides/gs-maven/issues/7 
