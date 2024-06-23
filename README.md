# Book-My-Show
1. A simple backend LLD machine coding implementation for book my show.


# Integrations that are done in this application
1. Mapped entity relationships using different annotations like (@OnetoOne, @OnetoMany, @ManyToMany).
2. Swagger integration is done using OpenApi , spring fox dependencies.
3. Jwt Authentication is done to access the APIs.
4. Using swagger, One Can access the Users' API without JWT token (/save, /authenticate). Check Security Config file to see what APIs can be accessed without token.
5. Generate the token using /authenticate API and use in Authorization Tab in swagger.
6. Redis is used for caching for APIs (Implemented for these APIS MovieShow Apis, Screen Apis).
7. Using H2 in memory Db



# How to install redis
1. Use this  https://redis.io/docs/latest/operate/oss_and_stack/install/install-redis/
# For Mac User
1. Run this to install using terminal. "brew install redis"
2. Run redis locally "brew services start redis"
3. Check this if redis is started. "services info redis"
4. Use "Redis CLI" to get into the redis. Command for mac but check your brew path.
Run this (/opt/homebrew/opt/redis/bin/redis-cli)



# Application Requirements
1. Use Java 8 compiler.

# How to run this application
1. Configure the DemoApplication in src/main/java folder. Main class file to run.

# Swagger Access Urls
http://localhost:8080/swagger-ui/index.html#/

# h2-console Urls
http://localhost:8080/h2-console/

# Redis running on host: localhost and port: 6379

# More Improvements that can be done.

1. Do more logging.
2. Refine the logic for seat lock logic while booking the Seats. (Learn more Optimistic & Pessimistic locking mechanism)
3. Integrate Kafka Queue for the critical events.
4. Integrate Docker to run application.

# Server started logs in local 

/Library/Java/JavaVirtualMachines/jdk-11.0.17.jdk/Contents/Home/bin/java -javaagent:/Users/yash/Library/Application Support/JetBrains/Toolbox/apps/IDEA-C/ch-0/222.4345.14/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=52721:/Users/yash/Library/Application Support/JetBrains/Toolbox/apps/IDEA-C/ch-0/222.4345.14/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/yash/Downloads/yash_bms/BookMyShow/target/classes:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/2.4.3/spring-boot-starter-data-jpa-2.4.3.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-starter-aop/2.4.3/spring-boot-starter-aop-2.4.3.jar:/Users/yash/.m2/repository/org/aspectj/aspectjweaver/1.9.6/aspectjweaver-1.9.6.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-starter-jdbc/2.4.3/spring-boot-starter-jdbc-2.4.3.jar:/Users/yash/.m2/repository/com/zaxxer/HikariCP/3.4.5/HikariCP-3.4.5.jar:/Users/yash/.m2/repository/org/springframework/spring-jdbc/5.3.4/spring-jdbc-5.3.4.jar:/Users/yash/.m2/repository/jakarta/transaction/jakarta.transaction-api/1.3.3/jakarta.transaction-api-1.3.3.jar:/Users/yash/.m2/repository/jakarta/persistence/jakarta.persistence-api/2.2.3/jakarta.persistence-api-2.2.3.jar:/Users/yash/.m2/repository/org/hibernate/hibernate-core/5.4.28.Final/hibernate-core-5.4.28.Final.jar:/Users/yash/.m2/repository/org/jboss/logging/jboss-logging/3.4.1.Final/jboss-logging-3.4.1.Final.jar:/Users/yash/.m2/repository/org/javassist/javassist/3.27.0-GA/javassist-3.27.0-GA.jar:/Users/yash/.m2/repository/net/bytebuddy/byte-buddy/1.10.20/byte-buddy-1.10.20.jar:/Users/yash/.m2/repository/antlr/antlr/2.7.7/antlr-2.7.7.jar:/Users/yash/.m2/repository/org/jboss/jandex/2.2.3.Final/jandex-2.2.3.Final.jar:/Users/yash/.m2/repository/com/fasterxml/classmate/1.5.1/classmate-1.5.1.jar:/Users/yash/.m2/repository/org/dom4j/dom4j/2.1.3/dom4j-2.1.3.jar:/Users/yash/.m2/repository/org/hibernate/common/hibernate-commons-annotations/5.1.2.Final/hibernate-commons-annotations-5.1.2.Final.jar:/Users/yash/.m2/repository/org/glassfish/jaxb/jaxb-runtime/2.3.3/jaxb-runtime-2.3.3.jar:/Users/yash/.m2/repository/org/glassfish/jaxb/txw2/2.3.3/txw2-2.3.3.jar:/Users/yash/.m2/repository/com/sun/istack/istack-commons-runtime/3.0.11/istack-commons-runtime-3.0.11.jar:/Users/yash/.m2/repository/com/sun/activation/jakarta.activation/1.2.2/jakarta.activation-1.2.2.jar:/Users/yash/.m2/repository/org/springframework/data/spring-data-jpa/2.4.5/spring-data-jpa-2.4.5.jar:/Users/yash/.m2/repository/org/springframework/data/spring-data-commons/2.4.5/spring-data-commons-2.4.5.jar:/Users/yash/.m2/repository/org/springframework/spring-orm/5.3.4/spring-orm-5.3.4.jar:/Users/yash/.m2/repository/org/springframework/spring-context/5.3.4/spring-context-5.3.4.jar:/Users/yash/.m2/repository/org/springframework/spring-beans/5.3.4/spring-beans-5.3.4.jar:/Users/yash/.m2/repository/org/springframework/spring-aspects/5.3.4/spring-aspects-5.3.4.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-starter-data-rest/2.4.3/spring-boot-starter-data-rest-2.4.3.jar:/Users/yash/.m2/repository/org/springframework/data/spring-data-rest-webmvc/3.4.5/spring-data-rest-webmvc-3.4.5.jar:/Users/yash/.m2/repository/org/springframework/data/spring-data-rest-core/3.4.5/spring-data-rest-core-3.4.5.jar:/Users/yash/.m2/repository/org/springframework/hateoas/spring-hateoas/1.2.4/spring-hateoas-1.2.4.jar:/Users/yash/.m2/repository/org/springframework/plugin/spring-plugin-core/2.0.0.RELEASE/spring-plugin-core-2.0.0.RELEASE.jar:/Users/yash/.m2/repository/org/atteo/evo-inflector/1.2.2/evo-inflector-1.2.2.jar:/Users/yash/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.11.4/jackson-annotations-2.11.4.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-starter-quartz/2.4.3/spring-boot-starter-quartz-2.4.3.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-starter/2.4.3/spring-boot-starter-2.4.3.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot/2.4.3/spring-boot-2.4.3.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.4.3/spring-boot-autoconfigure-2.4.3.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.4.3/spring-boot-starter-logging-2.4.3.jar:/Users/yash/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/Users/yash/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/Users/yash/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.13.3/log4j-to-slf4j-2.13.3.jar:/Users/yash/.m2/repository/org/apache/logging/log4j/log4j-api/2.13.3/log4j-api-2.13.3.jar:/Users/yash/.m2/repository/org/slf4j/jul-to-slf4j/1.7.30/jul-to-slf4j-1.7.30.jar:/Users/yash/.m2/repository/jakarta/annotation/jakarta.annotation-api/1.3.5/jakarta.annotation-api-1.3.5.jar:/Users/yash/.m2/repository/org/yaml/snakeyaml/1.27/snakeyaml-1.27.jar:/Users/yash/.m2/repository/org/springframework/spring-context-support/5.3.4/spring-context-support-5.3.4.jar:/Users/yash/.m2/repository/org/springframework/spring-tx/5.3.4/spring-tx-5.3.4.jar:/Users/yash/.m2/repository/org/quartz-scheduler/quartz/2.3.2/quartz-2.3.2.jar:/Users/yash/.m2/repository/com/mchange/mchange-commons-java/0.2.15/mchange-commons-java-0.2.15.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-starter-validation/2.4.3/spring-boot-starter-validation-2.4.3.jar:/Users/yash/.m2/repository/org/glassfish/jakarta.el/3.0.3/jakarta.el-3.0.3.jar:/Users/yash/.m2/repository/org/hibernate/validator/hibernate-validator/6.1.7.Final/hibernate-validator-6.1.7.Final.jar:/Users/yash/.m2/repository/jakarta/validation/jakarta.validation-api/2.0.2/jakarta.validation-api-2.0.2.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-starter-web/2.4.3/spring-boot-starter-web-2.4.3.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-starter-json/2.4.3/spring-boot-starter-json-2.4.3.jar:/Users/yash/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.11.4/jackson-datatype-jdk8-2.11.4.jar:/Users/yash/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.11.4/jackson-datatype-jsr310-2.11.4.jar:/Users/yash/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.11.4/jackson-module-parameter-names-2.11.4.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/2.4.3/spring-boot-starter-tomcat-2.4.3.jar:/Users/yash/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/9.0.43/tomcat-embed-core-9.0.43.jar:/Users/yash/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/9.0.43/tomcat-embed-websocket-9.0.43.jar:/Users/yash/.m2/repository/org/springframework/spring-web/5.3.4/spring-web-5.3.4.jar:/Users/yash/.m2/repository/org/springframework/spring-webmvc/5.3.4/spring-webmvc-5.3.4.jar:/Users/yash/.m2/repository/org/springframework/spring-expression/5.3.4/spring-expression-5.3.4.jar:/Users/yash/.m2/repository/org/apache/commons/commons-lang3/3.11/commons-lang3-3.11.jar:/Users/yash/.m2/repository/com/google/guava/guava/30.1-jre/guava-30.1-jre.jar:/Users/yash/.m2/repository/com/google/guava/failureaccess/1.0.1/failureaccess-1.0.1.jar:/Users/yash/.m2/repository/com/google/guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:/Users/yash/.m2/repository/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar:/Users/yash/.m2/repository/org/checkerframework/checker-qual/3.5.0/checker-qual-3.5.0.jar:/Users/yash/.m2/repository/com/google/errorprone/error_prone_annotations/2.3.4/error_prone_annotations-2.3.4.jar:/Users/yash/.m2/repository/com/google/j2objc/j2objc-annotations/1.3/j2objc-annotations-1.3.jar:/Users/yash/.m2/repository/com/h2database/h2/1.4.200/h2-1.4.200.jar:/Users/yash/.m2/repository/mysql/mysql-connector-java/8.0.23/mysql-connector-java-8.0.23.jar:/Users/yash/.m2/repository/org/projectlombok/lombok/1.18.18/lombok-1.18.18.jar:/Users/yash/.m2/repository/com/jayway/jsonpath/json-path/2.4.0/json-path-2.4.0.jar:/Users/yash/.m2/repository/net/minidev/json-smart/2.3/json-smart-2.3.jar:/Users/yash/.m2/repository/net/minidev/accessors-smart/1.2/accessors-smart-1.2.jar:/Users/yash/.m2/repository/org/ow2/asm/asm/5.0.4/asm-5.0.4.jar:/Users/yash/.m2/repository/jakarta/xml/bind/jakarta.xml.bind-api/2.3.3/jakarta.xml.bind-api-2.3.3.jar:/Users/yash/.m2/repository/jakarta/activation/jakarta.activation-api/1.2.2/jakarta.activation-api-1.2.2.jar:/Users/yash/.m2/repository/org/springframework/spring-core/5.3.4/spring-core-5.3.4.jar:/Users/yash/.m2/repository/org/springframework/spring-jcl/5.3.4/spring-jcl-5.3.4.jar:/Users/yash/.m2/repository/org/modelmapper/modelmapper/3.2.0/modelmapper-3.2.0.jar:/Users/yash/.m2/repository/org/springdoc/springdoc-openapi-ui/1.8.0/springdoc-openapi-ui-1.8.0.jar:/Users/yash/.m2/repository/org/springdoc/springdoc-openapi-webmvc-core/1.8.0/springdoc-openapi-webmvc-core-1.8.0.jar:/Users/yash/.m2/repository/org/springdoc/springdoc-openapi-common/1.8.0/springdoc-openapi-common-1.8.0.jar:/Users/yash/.m2/repository/io/swagger/core/v3/swagger-core/2.2.20/swagger-core-2.2.20.jar:/Users/yash/.m2/repository/com/fasterxml/jackson/dataformat/jackson-dataformat-yaml/2.11.4/jackson-dataformat-yaml-2.11.4.jar:/Users/yash/.m2/repository/io/swagger/core/v3/swagger-annotations/2.2.20/swagger-annotations-2.2.20.jar:/Users/yash/.m2/repository/io/swagger/core/v3/swagger-models/2.2.20/swagger-models-2.2.20.jar:/Users/yash/.m2/repository/org/webjars/swagger-ui/5.11.8/swagger-ui-5.11.8.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-starter-data-redis/2.7.2/spring-boot-starter-data-redis-2.7.2.jar:/Users/yash/.m2/repository/org/springframework/data/spring-data-redis/2.4.5/spring-data-redis-2.4.5.jar:/Users/yash/.m2/repository/org/springframework/data/spring-data-keyvalue/2.4.5/spring-data-keyvalue-2.4.5.jar:/Users/yash/.m2/repository/org/springframework/spring-oxm/5.3.4/spring-oxm-5.3.4.jar:/Users/yash/.m2/repository/io/lettuce/lettuce-core/6.0.2.RELEASE/lettuce-core-6.0.2.RELEASE.jar:/Users/yash/.m2/repository/io/netty/netty-common/4.1.59.Final/netty-common-4.1.59.Final.jar:/Users/yash/.m2/repository/io/netty/netty-handler/4.1.59.Final/netty-handler-4.1.59.Final.jar:/Users/yash/.m2/repository/io/netty/netty-resolver/4.1.59.Final/netty-resolver-4.1.59.Final.jar:/Users/yash/.m2/repository/io/netty/netty-buffer/4.1.59.Final/netty-buffer-4.1.59.Final.jar:/Users/yash/.m2/repository/io/netty/netty-codec/4.1.59.Final/netty-codec-4.1.59.Final.jar:/Users/yash/.m2/repository/io/netty/netty-transport/4.1.59.Final/netty-transport-4.1.59.Final.jar:/Users/yash/.m2/repository/io/projectreactor/reactor-core/3.4.3/reactor-core-3.4.3.jar:/Users/yash/.m2/repository/org/reactivestreams/reactive-streams/1.0.3/reactive-streams-1.0.3.jar:/Users/yash/.m2/repository/org/springframework/boot/spring-boot-starter-security/2.4.3/spring-boot-starter-security-2.4.3.jar:/Users/yash/.m2/repository/org/springframework/spring-aop/5.3.4/spring-aop-5.3.4.jar:/Users/yash/.m2/repository/org/springframework/security/spring-security-config/5.4.5/spring-security-config-5.4.5.jar:/Users/yash/.m2/repository/org/springframework/security/spring-security-core/5.4.5/spring-security-core-5.4.5.jar:/Users/yash/.m2/repository/org/springframework/security/spring-security-web/5.4.5/spring-security-web-5.4.5.jar:/Users/yash/.m2/repository/redis/clients/jedis/3.9.0/jedis-3.9.0.jar:/Users/yash/.m2/repository/org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.jar:/Users/yash/.m2/repository/org/apache/commons/commons-pool2/2.9.0/commons-pool2-2.9.0.jar:/Users/yash/.m2/repository/io/jsonwebtoken/jjwt-api/0.11.5/jjwt-api-0.11.5.jar:/Users/yash/.m2/repository/io/jsonwebtoken/jjwt-impl/0.11.5/jjwt-impl-0.11.5.jar:/Users/yash/.m2/repository/io/jsonwebtoken/jjwt-jackson/0.11.5/jjwt-jackson-0.11.5.jar:/Users/yash/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.11.4/jackson-databind-2.11.4.jar:/Users/yash/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.11.4/jackson-core-2.11.4.jar com.book.my.show.yash.DemoApplication

.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/
:: Spring Boot ::                (v2.4.3)

2024-06-23 15:31:52.226  INFO 914 --- [           main] com.book.my.show.yash.DemoApplication    : Starting DemoApplication using Java 11.0.17 on Yashs-MacBook-Pro.local with PID 914 (/Users/yash/Downloads/yash_bms/BookMyShow/target/classes started by yash in /Users/yash/Downloads/yash_bms/BookMyShow)
2024-06-23 15:31:52.228  INFO 914 --- [           main] com.book.my.show.yash.DemoApplication    : The following profiles are active: dev
2024-06-23 15:31:53.245  INFO 914 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode!
2024-06-23 15:31:53.245  INFO 914 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Redis repositories in DEFAULT mode.
2024-06-23 15:31:53.276  INFO 914 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 8 ms. Found 0 Redis repository interfaces.
2024-06-23 15:31:53.442  INFO 914 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode!
2024-06-23 15:31:53.444  INFO 914 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2024-06-23 15:31:53.565  INFO 914 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 117 ms. Found 8 JPA repository interfaces.
2024-06-23 15:31:53.569  INFO 914 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Multiple Spring Data modules found, entering strict repository configuration mode!
2024-06-23 15:31:53.570  INFO 914 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data Redis repositories in DEFAULT mode.
2024-06-23 15:31:53.576  INFO 914 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data Redis - Could not safely identify store assignment for repository candidate interface com.book.my.show.yash.dao.MovieDao. If you want this repository to be a Redis repository, consider annotating your entities with one of these annotations: org.springframework.data.redis.core.RedisHash (preferred), or consider extending one of the following types with your repository: org.springframework.data.keyvalue.repository.KeyValueRepository.
2024-06-23 15:31:53.576  INFO 914 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data Redis - Could not safely identify store assignment for repository candidate interface com.book.my.show.yash.dao.ScreenDao. If you want this repository to be a Redis repository, consider annotating your entities with one of these annotations: org.springframework.data.redis.core.RedisHash (preferred), or consider extending one of the following types with your repository: org.springframework.data.keyvalue.repository.KeyValueRepository.
2024-06-23 15:31:53.577  INFO 914 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data Redis - Could not safely identify store assignment for repository candidate interface com.book.my.show.yash.dao.SeatDao. If you want this repository to be a Redis repository, consider annotating your entities with one of these annotations: org.springframework.data.redis.core.RedisHash (preferred), or consider extending one of the following types with your repository: org.springframework.data.keyvalue.repository.KeyValueRepository.
2024-06-23 15:31:53.577  INFO 914 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data Redis - Could not safely identify store assignment for repository candidate interface com.book.my.show.yash.dao.SeatLockDao. If you want this repository to be a Redis repository, consider annotating your entities with one of these annotations: org.springframework.data.redis.core.RedisHash (preferred), or consider extending one of the following types with your repository: org.springframework.data.keyvalue.repository.KeyValueRepository.
2024-06-23 15:31:53.577  INFO 914 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data Redis - Could not safely identify store assignment for repository candidate interface com.book.my.show.yash.dao.ShowDao. If you want this repository to be a Redis repository, consider annotating your entities with one of these annotations: org.springframework.data.redis.core.RedisHash (preferred), or consider extending one of the following types with your repository: org.springframework.data.keyvalue.repository.KeyValueRepository.
2024-06-23 15:31:53.578  INFO 914 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data Redis - Could not safely identify store assignment for repository candidate interface com.book.my.show.yash.dao.TheaterDao. If you want this repository to be a Redis repository, consider annotating your entities with one of these annotations: org.springframework.data.redis.core.RedisHash (preferred), or consider extending one of the following types with your repository: org.springframework.data.keyvalue.repository.KeyValueRepository.
2024-06-23 15:31:53.578  INFO 914 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data Redis - Could not safely identify store assignment for repository candidate interface com.book.my.show.yash.dao.TicketDao. If you want this repository to be a Redis repository, consider annotating your entities with one of these annotations: org.springframework.data.redis.core.RedisHash (preferred), or consider extending one of the following types with your repository: org.springframework.data.keyvalue.repository.KeyValueRepository.
2024-06-23 15:31:53.579  INFO 914 --- [           main] .RepositoryConfigurationExtensionSupport : Spring Data Redis - Could not safely identify store assignment for repository candidate interface com.book.my.show.yash.dao.UserDAO. If you want this repository to be a Redis repository, consider annotating your entities with one of these annotations: org.springframework.data.redis.core.RedisHash (preferred), or consider extending one of the following types with your repository: org.springframework.data.keyvalue.repository.KeyValueRepository.
2024-06-23 15:31:53.579  INFO 914 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 9 ms. Found 0 Redis repository interfaces.
2024-06-23 15:31:54.017  INFO 914 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2024-06-23 15:31:54.024  INFO 914 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-06-23 15:31:54.024  INFO 914 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.43]
2024-06-23 15:31:54.069  INFO 914 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-06-23 15:31:54.069  INFO 914 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1787 ms
2024-06-23 15:31:54.104  INFO 914 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-06-23 15:31:54.197  INFO 914 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2024-06-23 15:31:54.201  INFO 914 --- [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:h2db'
2024-06-23 15:31:54.402  INFO 914 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2024-06-23 15:31:54.432  INFO 914 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.28.Final
2024-06-23 15:31:54.506  INFO 914 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.2.Final}
2024-06-23 15:31:54.564  INFO 914 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2024-06-23 15:31:55.075  INFO 914 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2024-06-23 15:31:55.080  INFO 914 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2024-06-23 15:31:55.457  WARN 914 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2024-06-23 15:31:55.912  INFO 914 --- [           main] o.s.s.web.DefaultSecurityFilterChain     : Will secure any request with [org.springframework.security.web.context.request.async.WebAsyncManagerIntegrationFilter@6527aa0, org.springframework.security.web.context.SecurityContextPersistenceFilter@48e1e18a, org.springframework.security.web.header.HeaderWriterFilter@6a90b5e8, org.springframework.security.web.authentication.logout.LogoutFilter@50cadbae, com.book.my.show.yash.util.JwtRequestFilter@1f4de96e, org.springframework.security.web.savedrequest.RequestCacheAwareFilter@372c428, org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestFilter@5cc28282, org.springframework.security.web.authentication.AnonymousAuthenticationFilter@6153aca1, org.springframework.security.web.session.SessionManagementFilter@64ef9b9a, org.springframework.security.web.access.ExceptionTranslationFilter@735d7b99, org.springframework.security.web.access.intercept.FilterSecurityInterceptor@65630116]
2024-06-23 15:31:56.085  INFO 914 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2024-06-23 15:31:56.446  INFO 914 --- [           main] org.quartz.impl.StdSchedulerFactory      : Using default implementation for ThreadExecutor
2024-06-23 15:31:56.453  INFO 914 --- [           main] org.quartz.core.SchedulerSignalerImpl    : Initialized Scheduler Signaller of type: class org.quartz.core.SchedulerSignalerImpl
2024-06-23 15:31:56.453  INFO 914 --- [           main] org.quartz.core.QuartzScheduler          : Quartz Scheduler v.2.3.2 created.
2024-06-23 15:31:56.453  INFO 914 --- [           main] org.quartz.simpl.RAMJobStore             : RAMJobStore initialized.
2024-06-23 15:31:56.454  INFO 914 --- [           main] org.quartz.core.QuartzScheduler          : Scheduler meta-data: Quartz Scheduler (v2.3.2) 'quartzScheduler' with instanceId 'NON_CLUSTERED'
Scheduler class: 'org.quartz.core.QuartzScheduler' - running locally.
NOT STARTED.
Currently in standby mode.
Number of jobs executed: 0
Using thread pool 'org.quartz.simpl.SimpleThreadPool' - with 10 threads.
Using job-store 'org.quartz.simpl.RAMJobStore' - which does not support persistence. and is not clustered.

2024-06-23 15:31:56.454  INFO 914 --- [           main] org.quartz.impl.StdSchedulerFactory      : Quartz scheduler 'quartzScheduler' initialized from an externally provided properties instance.
2024-06-23 15:31:56.454  INFO 914 --- [           main] org.quartz.impl.StdSchedulerFactory      : Quartz scheduler version: 2.3.2
2024-06-23 15:31:56.454  INFO 914 --- [           main] org.quartz.core.QuartzScheduler          : JobFactory set to: org.springframework.scheduling.quartz.SpringBeanJobFactory@43e7ca6f
2024-06-23 15:31:56.463  INFO 914 --- [           main] o.s.s.c.ThreadPoolTaskScheduler          : Initializing ExecutorService 'taskScheduler'
2024-06-23 15:31:56.496  INFO 914 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8080 (http) with context path ''
2024-06-23 15:31:56.497  INFO 914 --- [           main] o.s.s.quartz.SchedulerFactoryBean        : Starting Quartz Scheduler now
2024-06-23 15:31:56.497  INFO 914 --- [           main] org.quartz.core.QuartzScheduler          : Scheduler quartzScheduler_$_NON_CLUSTERED started.
2024-06-23 15:31:56.504  INFO 914 --- [           main] com.book.my.show.yash.DemoApplication    : Started DemoApplication in 5.435 seconds (JVM running for 6.014)
config = AppConfig(simpleKey=value, timeout=PT5S)
ConsumerService.myScheduler
2024-06-23 15:31:56.511  INFO 914 --- [           main] logger                                   : Values fetched from database
Printing cache []
between.getDays() = 0
between1.toMinutes() = 120
save = Show(super=BaseEntity(id=1), id=1, showName=show1 - afternoon show, screen=Screen(id=1, screenName=screen-1, theatre=Theatre(theaterName=NYC CINEMAS)), startTime=2024-06-23T12:00, endTime=2024-06-23T14:00, movieLength=120, weekDay=WeekDay(days=[SUN, MON]), days=[SUN, MON])
seats = [Seat(super=BaseEntity(id=1), id=1, seatType=gold), Seat(super=BaseEntity(id=2), id=2, seatType=silver), Seat(super=BaseEntity(id=3), id=3, seatType=gold), Seat(super=BaseEntity(id=4), id=4, seatType=silver)]
user1 = User(super=BaseEntity(id=1), id=1, name=yash, userName=yash.agg12, password=$2a$11$fT8c1KVUjMsR5HOnfBGBn.ErV/fI4inax2yrW45zerNPrC1Qq4V1C, tickets=null)
All available Seats = [Seat(super=BaseEntity(id=1), id=1, seatType=gold), Seat(super=BaseEntity(id=2), id=2, seatType=silver), Seat(super=BaseEntity(id=3), id=3, seatType=gold), Seat(super=BaseEntity(id=4), id=4, seatType=silver)]
seatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
seatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
seatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
seatLock = SeatLock(super=BaseEntity(id=4), showId=1, seatId=4, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
selecting seats = [Seat(super=BaseEntity(id=1), id=1, seatType=gold), Seat(super=BaseEntity(id=2), id=2, seatType=silver), Seat(super=BaseEntity(id=3), id=3, seatType=gold)]
2024-06-23 15:31:57.011  INFO 914 --- [           main] c.book.my.show.yash.service.UserService  : showId = 1, requestedSeats = [Seat(super=BaseEntity(id=1), id=1, seatType=gold), Seat(super=BaseEntity(id=2), id=2, seatType=silver), Seat(super=BaseEntity(id=3), id=3, seatType=gold)]
2024-06-23 15:31:57.015  INFO 914 --- [           main] c.book.my.show.yash.service.UserService  : actualAvailableSeats = [SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S), SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S), SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)]
event consuming = Event(name=event1, type=type1, params={showId=1, seats=[Seat(super=BaseEntity(id=1), id=1, seatType=gold), Seat(super=BaseEntity(id=2), id=2, seatType=silver), Seat(super=BaseEntity(id=3), id=3, seatType=gold)]}, localDateTime=2024-06-23T15:31:57.027702)
showId = 1
seats = [Seat(super=BaseEntity(id=1), id=1, seatType=gold), Seat(super=BaseEntity(id=2), id=2, seatType=silver), Seat(super=BaseEntity(id=3), id=3, seatType=gold)]
localDateTime = 2024-06-23T15:31:57.027702
Fetch ticket from db
before payment fail of user 1 - All available Seats3 for user 2= [Seat(super=BaseEntity(id=4), id=4, seatType=silver)]
after payment fail All available Seats3 for user 2= [Seat(super=BaseEntity(id=4), id=4, seatType=silver)]
1
2
3
beforeLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=temp_lock, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
afterLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
beforeLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=temp_lock, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
afterLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
beforeLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=temp_lock, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
afterLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
--------  Ticket(movie=Movie(id=1, movieName=Movie1 - Avengers, ratings=4.5), seatIds=1,2,3, entitySeat=EntitySeat(seats=[Seat(super=BaseEntity(id=null), id=null, seatType=SILVER)]), paymentMod=cc)
--------  Ticket(movie=Movie(id=1, movieName=Movie1 - Avengers, ratings=4.5), seatIds=1,2,3, entitySeat=EntitySeat(seats=[Seat(super=BaseEntity(id=null), id=null, seatType=SILVER)]), paymentMod=cc)
2024-06-23 15:31:57.060  INFO 914 --- [           main] logger                                   : Values fetched from database
show2 = Show(super=BaseEntity(id=2), id=2, showName=show2 - evening show, screen=Screen(id=2, screenName=screen - 2, theatre=Theatre(theaterName=NYC CINEMAS)), startTime=2024-06-23T14:00, endTime=2024-06-23T16:30, movieLength=150, weekDay=WeekDay(days=[MON, TUE]), days=[MON, TUE])
sunday shows = [Show(super=BaseEntity(id=1), id=1, showName=show1 - afternoon show, screen=Screen(id=1, screenName=screen-1, theatre=Theatre(theaterName=NYC CINEMAS)), startTime=2024-06-23T12:00, endTime=2024-06-23T14:00, movieLength=120, weekDay=WeekDay(days=[SUN, MON]), days=[SUN, MON])]
monShows = [Show(super=BaseEntity(id=1), id=1, showName=show1 - afternoon show, screen=Screen(id=1, screenName=screen-1, theatre=Theatre(theaterName=NYC CINEMAS)), startTime=2024-06-23T12:00, endTime=2024-06-23T14:00, movieLength=120, weekDay=WeekDay(days=[SUN, MON]), days=[SUN, MON]), Show(super=BaseEntity(id=2), id=2, showName=show2 - evening show, screen=Screen(id=2, screenName=screen - 2, theatre=Theatre(theaterName=NYC CINEMAS)), startTime=2024-06-23T14:00, endTime=2024-06-23T16:30, movieLength=150, weekDay=WeekDay(days=[MON, TUE]), days=[MON, TUE])]
tueShows = [Show(super=BaseEntity(id=2), id=2, showName=show2 - evening show, screen=Screen(id=2, screenName=screen - 2, theatre=Theatre(theaterName=NYC CINEMAS)), startTime=2024-06-23T14:00, endTime=2024-06-23T16:30, movieLength=150, weekDay=WeekDay(days=[MON, TUE]), days=[MON, TUE])]
monAndTueShows = [Show(super=BaseEntity(id=1), id=1, showName=show1 - afternoon show, screen=Screen(id=1, screenName=screen-1, theatre=Theatre(theaterName=NYC CINEMAS)), startTime=2024-06-23T12:00, endTime=2024-06-23T14:00, movieLength=120, weekDay=WeekDay(days=[SUN, MON]), days=[SUN, MON]), Show(super=BaseEntity(id=2), id=2, showName=show2 - evening show, screen=Screen(id=2, screenName=screen - 2, theatre=Theatre(theaterName=NYC CINEMAS)), startTime=2024-06-23T14:00, endTime=2024-06-23T16:30, movieLength=150, weekDay=WeekDay(days=[MON, TUE]), days=[MON, TUE])]
collect1 = [Show(super=BaseEntity(id=1), id=1, showName=show1 - afternoon show, screen=Screen(id=1, screenName=screen-1, theatre=Theatre(theaterName=NYC CINEMAS)), startTime=2024-06-23T12:00, endTime=2024-06-23T14:00, movieLength=120, weekDay=WeekDay(days=[SUN, MON]), days=[SUN, MON])]
collect2 = 2
collect3 = {show2 - evening show=[Show(super=BaseEntity(id=2), id=2, showName=show2 - evening show, screen=Screen(id=2, screenName=screen - 2, theatre=Theatre(theaterName=NYC CINEMAS)), startTime=2024-06-23T14:00, endTime=2024-06-23T16:30, movieLength=150, weekDay=WeekDay(days=[MON, TUE]), days=[MON, TUE])], show1 - afternoon show=[Show(super=BaseEntity(id=1), id=1, showName=show1 - afternoon show, screen=Screen(id=1, screenName=screen-1, theatre=Theatre(theaterName=NYC CINEMAS)), startTime=2024-06-23T12:00, endTime=2024-06-23T14:00, movieLength=120, weekDay=WeekDay(days=[SUN, MON]), days=[SUN, MON])]}
collect4 = {false=[], true=[show1 - afternoon show, show2 - evening show]}
collect5 = [[Seat(super=BaseEntity(id=1), id=1, seatType=gold), Seat(super=BaseEntity(id=2), id=2, seatType=silver), Seat(super=BaseEntity(id=3), id=3, seatType=gold), Seat(super=BaseEntity(id=4), id=4, seatType=silver)]]
collect6 = [ShowDto(movieName=show1 - afternoon show, movieLength=120, availableSeats=4), ShowDto(movieName=show2 - evening show, movieLength=150, availableSeats=4)]
string = hari
seatLock = SeatLock(super=BaseEntity(id=9), showId=null, seatId=null, lockStatus=null, lockedTime=2024-06-23T15:31:57.073262, timeoutInSec=5, timeOutDuration=PT1M40S)
check = false
All available Seats2 = [Seat(super=BaseEntity(id=4), id=4, seatType=silver)]
lockExpiredCheck = true
seatLock1 = SeatLock(super=BaseEntity(id=10), showId=null, seatId=null, lockStatus=null, lockedTime=2024-06-23T15:32:02.081108, timeoutInSec=300, timeOutDuration=PT10S)
compareTo = 0
compareTo = -1
compareTo = 1
usingDuration = false
ConsumerService.myScheduler
incrementAndGet = 1
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 2
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 3
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
compareTo = 0
compareTo = -1
compareTo = 1
usingDuration = true
compareTo = 0
compareTo = -1
compareTo = 1
timeout = PT5S
appConfig = 5
seatLock2 = SeatLock(super=BaseEntity(id=11), showId=null, seatId=null, lockStatus=null, lockedTime=2024-06-23T15:32:12.095913, timeoutInSec=300, timeOutDuration=PT5S)
compareTo = 0
compareTo = -1
compareTo = 1
seatLock2.lockExpiredUsingDuration() = false
ConsumerService.myScheduler
incrementAndGet = 4
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 5
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 6
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
compareTo = 0
compareTo = -1
compareTo = 1
seatLock2.lockExpiredUsingDuration() = true
1 null
ConsumerService.myScheduler
incrementAndGet = 7
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 8
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 9
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 10
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 11
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 12
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 13
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 14
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 15
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 16
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 17
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 18
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 19
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 20
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 21
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 22
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 23
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 24
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 25
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 26
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 27
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 28
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 29
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 30
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 31
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 32
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 33
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 34
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 35
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 36
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 37
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 38
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 39
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 40
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 41
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 42
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 43
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 44
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 45
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 46
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 47
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 48
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 49
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 50
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 51
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 52
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 53
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 54
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 55
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 56
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 57
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 58
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 59
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 60
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 61
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 62
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 63
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 64
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 65
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 66
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 67
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 68
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 69
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 70
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 71
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 72
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 73
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 74
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 75
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 76
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 77
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 78
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 79
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 80
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 81
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 82
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 83
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 84
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 85
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 86
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 87
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 88
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 89
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 90
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 91
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 92
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 93
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 94
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 95
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 96
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 97
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 98
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 99
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 100
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 101
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 102
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 103
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 104
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 105
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 106
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 107
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 108
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
incrementAndGet = 109
ConsumerService.myScheduler
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 110
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 111
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 112
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 113
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 114
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 115
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 116
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 117
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 118
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 119
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 120
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 121
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 122
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 123
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 124
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 125
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 126
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 127
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 128
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 129
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 130
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 131
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 132
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 133
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 134
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 135
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 136
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 137
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 138
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 139
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 140
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 141
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 142
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 143
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 144
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 145
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 146
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 147
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 148
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 149
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 150
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 151
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 152
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 153
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 154
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 155
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 156
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 157
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 158
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 159
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 160
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 161
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 162
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 163
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 164
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 165
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 166
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 167
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 168
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 169
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 170
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 171
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 172
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 173
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 174
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 175
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 176
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 177
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 178
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 179
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 180
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 181
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 182
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 183
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 184
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 185
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 186
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 187
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 188
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 189
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 190
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 191
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 192
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 193
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 194
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 195
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 196
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 197
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 198
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 199
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 200
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 201
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 202
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 203
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 204
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 205
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 206
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 207
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 208
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 209
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 210
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 211
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 212
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 213
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 214
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 215
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 216
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 217
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 218
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 219
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 220
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 221
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 222
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 223
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 224
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 225
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 226
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 227
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 228
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 229
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 230
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 231
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 232
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 233
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 234
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 235
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 236
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 237
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 238
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 239
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 240
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 241
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 242
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 243
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 244
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 245
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 246
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 247
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 248
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 249
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 250
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 251
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 252
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 253
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 254
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 255
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 256
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 257
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 258
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 259
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 260
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 261
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 262
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 263
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 264
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 265
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 266
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 267
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 268
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 269
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 270
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 271
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 272
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 273
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 274
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 275
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 276
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 277
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 278
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 279
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 280
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 281
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 282
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 283
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 284
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 285
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 286
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 287
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 288
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 289
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 290
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 291
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 292
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 293
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 294
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 295
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 296
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 297
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 298
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 299
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 300
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 301
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 302
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 303
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 304
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 305
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 306
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 307
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 308
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 309
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 310
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 311
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 312
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 313
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 314
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 315
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 316
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 317
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 318
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 319
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 320
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 321
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 322
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 323
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 324
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 325
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 326
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 327
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 328
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 329
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 330
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 331
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 332
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 333
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 334
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 335
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 336
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 337
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 338
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 339
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 340
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 341
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 342
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 343
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 344
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 345
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 346
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 347
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 348
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 349
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 350
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 351
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 352
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 353
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 354
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 355
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 356
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 357
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 358
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 359
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 360
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 361
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 362
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 363
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 364
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 365
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 366
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 367
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 368
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 369
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 370
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 371
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 372
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 373
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 374
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 375
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 376
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 377
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 378
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 379
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 380
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 381
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 382
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 383
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 384
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 385
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 386
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 387
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 388
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 389
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 390
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 391
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 392
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 393
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 394
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 395
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 396
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 397
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 398
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 399
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 400
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 401
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 402
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 403
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 404
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 405
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 406
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 407
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 408
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 409
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 410
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 411
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 412
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 413
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 414
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
incrementAndGet = 415
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 416
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 417
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
ConsumerService.myScheduler
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 418
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 419
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 420
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 421
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 422
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 423
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 424
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 425
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 426
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 427
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 428
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 429
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 430
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 431
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 432
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 433
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 434
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 435
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 436
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 437
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 438
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 439
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 440
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 441
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 442
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 443
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 444
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 445
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 446
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 447
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 448
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 449
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 450
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 451
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 452
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 453
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 454
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 455
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 456
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
incrementAndGet = 457
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 458
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 459
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
ConsumerService.myScheduler
incrementAndGet = 460
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 461
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 462
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 463
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 464
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 465
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 466
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 467
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 468
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 469
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 470
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 471
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 472
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 473
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 474
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
incrementAndGet = 475
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 476
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 477
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
ConsumerService.myScheduler
incrementAndGet = 478
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 479
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 480
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 481
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 482
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 483
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 484
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 485
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 486
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 487
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 488
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 489
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 490
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 491
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 492
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 493
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 494
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 495
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 496
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 497
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 498
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 499
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 500
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 501
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 502
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 503
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 504
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 505
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 506
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 507
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 508
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 509
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 510
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
incrementAndGet = 511
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 512
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 513
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
ConsumerService.myScheduler
incrementAndGet = 514
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 515
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 516
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 517
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 518
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 519
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 520
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 521
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 522
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 523
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 524
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 525
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
incrementAndGet = 526
ConsumerService.myScheduler
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 527
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 528
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
incrementAndGet = 529
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 530
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 531
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
ConsumerService.myScheduler
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 532
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 533
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 534
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 535
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 536
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 537
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 538
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 539
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 540
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 541
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 542
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 543
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 544
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 545
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 546
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 547
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 548
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 549
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 550
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 551
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 552
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 553
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 554
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 555
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 556
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 557
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 558
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 559
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 560
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 561
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 562
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 563
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 564
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 565
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 566
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 567
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 568
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 569
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 570
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 571
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 572
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 573
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 574
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 575
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 576
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 577
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 578
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 579
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 580
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 581
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 582
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 583
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 584
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 585
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 586
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 587
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 588
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 589
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 590
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 591
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 592
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 593
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 594
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 595
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 596
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 597
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 598
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 599
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 600
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 601
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 602
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 603
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 604
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 605
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 606
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 607
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 608
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 609
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 610
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 611
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 612
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 613
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 614
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 615
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 616
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 617
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 618
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 619
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 620
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 621
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 622
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 623
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 624
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 625
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 626
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 627
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 628
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 629
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 630
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 631
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 632
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 633
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 634
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 635
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 636
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 637
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 638
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 639
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
incrementAndGet = 640
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 641
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 642
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
ConsumerService.myScheduler
incrementAndGet = 643
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 644
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 645
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 646
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 647
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 648
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 649
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 650
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 651
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []
ConsumerService.myScheduler
incrementAndGet = 652
oldSeatLock = SeatLock(super=BaseEntity(id=1), showId=1, seatId=1, lockStatus=available, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 653
oldSeatLock = SeatLock(super=BaseEntity(id=2), showId=1, seatId=2, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
incrementAndGet = 654
oldSeatLock = SeatLock(super=BaseEntity(id=3), showId=1, seatId=3, lockStatus=locked, lockedTime=null, timeoutInSec=300, timeOutDuration=PT1M40S)
Printing cache []


