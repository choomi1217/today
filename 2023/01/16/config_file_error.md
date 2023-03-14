### org.springframework.boot.context.properties.bind.BindException: Failed to bind properties under 'spring.config' to org.springframework.boot.context.config.ConfigDataProperties

```
C:\Users\whdud\.jdks\corretto-11.0.16.1\bin\java.exe -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.3\lib\idea_rt.jar=50016:C:\Program Files\JetBrains\IntelliJ IDEA 2022.2.3\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\whdud\IdeaProjects\paging\out\production\classes;C:\Users\whdud\IdeaProjects\paging\out\production\resources;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.projectlombok\lombok\1.18.24\13a394eed5c4f9efb2a6d956e2086f1d81e857d9\lombok-1.18.24.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter-web\2.7.5\bb4099d0466a62c3b11ab9323babca13bb430a2e\spring-boot-starter-web-2.7.5.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\com.github.pagehelper\pagehelper-spring-boot-starter\1.4.6\47772541b520f1131d4e3ebd7899418055e3c002\pagehelper-spring-boot-starter-1.4.6.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.mybatis.spring.boot\mybatis-spring-boot-starter\3.0.0\a111b1f4573256fd5511def95bb5a426b9c93a4c\mybatis-spring-boot-starter-3.0.0.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\com.github.gavlyukovskiy\p6spy-spring-boot-starter\1.8.1\688ddcdba46c6f38353b02443ca17db0fbb1f93\p6spy-spring-boot-starter-1.8.1.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter-json\2.7.5\9c7df04ff37b2e7471632ddeb4a296c5fb6bddee\spring-boot-starter-json-2.7.5.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter\2.7.5\c28e1546461803490588085345ba5d2897d232bc\spring-boot-starter-2.7.5.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter-tomcat\2.7.5\eb7849c52953de44d9712adf45398ccb1a7d4295\spring-boot-starter-tomcat-2.7.5.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework\spring-webmvc\5.3.23\b163527c275b0374371890c0b76c2a2a09f9804b\spring-webmvc-5.3.23.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework\spring-web\5.3.23\193f5276092d9cbe3222c63885b47ca7b2cce97\spring-web-5.3.23.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\com.github.pagehelper\pagehelper-spring-boot-autoconfigure\1.4.6\140707ba427554d923d0dda8f601ddb209060cd2\pagehelper-spring-boot-autoconfigure-1.4.6.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\com.github.pagehelper\pagehelper\5.3.2\a6b2439ba65b849dda324268fa121fe3584dad59\pagehelper-5.3.2.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter-jdbc\2.7.5\b57c3f8fb2fe235a8ff368755092371423bbc5b3\spring-boot-starter-jdbc-2.7.5.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.mybatis.spring.boot\mybatis-spring-boot-autoconfigure\3.0.0\28e020cfd026642e20bd57f7f6472ed1a95e27f4\mybatis-spring-boot-autoconfigure-3.0.0.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.mybatis\mybatis\3.5.11\980273395d508c02d6359f3b6503ffbe319e23b0\mybatis-3.5.11.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.mybatis\mybatis-spring\3.0.0\d42da8f1d35378d50cb4f298ce1f04523d5aa0f\mybatis-spring-3.0.0.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\com.github.gavlyukovskiy\datasource-decorator-spring-boot-autoconfigure\1.8.1\72b16dae8f3855d80c91a78ad5c2cacbf715cdcd\datasource-decorator-spring-boot-autoconfigure-1.8.1.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\p6spy\p6spy\3.9.0\7fedf78cc1e53a623a7b36d1f2705790836400aa\p6spy-3.9.0.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.datatype\jackson-datatype-jsr310\2.13.4\e6d820112871f33cd94a1dcc54eef58874753b5\jackson-datatype-jsr310-2.13.4.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.module\jackson-module-parameter-names\2.13.4\858ccf6624b5fac6044813e845063edb6a62cf37\jackson-module-parameter-names-2.13.4.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.datatype\jackson-datatype-jdk8\2.13.4\557dbba5d8dfc7b7f944c58fe084109afcb5670b\jackson-datatype-jdk8-2.13.4.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-databind\2.13.4.2\325c06bdfeb628cfb80ebaaf1a26cc1eb558a585\jackson-databind-2.13.4.2.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-autoconfigure\2.7.5\96646e63a2296d0a3209383e81cdb8c87ab2f913\spring-boot-autoconfigure-2.7.5.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot\2.7.5\fd04e228e6e21b7ad13c10ae29afd31868d842e5\spring-boot-2.7.5.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-starter-logging\2.7.5\61f4c53e35baa31a269bbeb7bb9d5e781448feef\spring-boot-starter-logging-2.7.5.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\jakarta.annotation\jakarta.annotation-api\1.3.5\59eb84ee0d616332ff44aba065f3888cf002cd2d\jakarta.annotation-api-1.3.5.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework\spring-core\5.3.23\91407dc1106ea423c44150f3da1a0b4f8e25e5ca\spring-core-5.3.23.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.yaml\snakeyaml\1.30\8fde7fe2586328ac3c68db92045e1c8759125000\snakeyaml-1.30.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.apache.tomcat.embed\tomcat-embed-websocket\9.0.68\15fc94001bb916a808631422a6488a678496ef94\tomcat-embed-websocket-9.0.68.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.apache.tomcat.embed\tomcat-embed-core\9.0.68\caafeb87d6ff30adda888049c9b81591c7cc20d1\tomcat-embed-core-9.0.68.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.apache.tomcat.embed\tomcat-embed-el\9.0.68\296afe7483256960d7ebdd8dcb4b49775d7cb85f\tomcat-embed-el-9.0.68.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework\spring-context\5.3.23\530b36b2ce2c9e471c6a260c3f181bcd20325a58\spring-context-5.3.23.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework\spring-expression\5.3.23\3a676bf4b9bc42bd37ab5ad264acb6ceb63397a2\spring-expression-5.3.23.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework\spring-aop\5.3.23\30d0034ba29178e98781d85f51a7eb709a628e9b\spring-aop-5.3.23.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework\spring-beans\5.3.23\3bdefbf6042ed742cbe16f27d2d14cca9096a606\spring-beans-5.3.23.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\com.github.jsqlparser\jsqlparser\4.5\2ccfe4444a31cbffe643706ddabc2a6e55f29b94\jsqlparser-4.5.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework\spring-jdbc\5.3.23\c859919a644942822e49cb7f2404b2c4d3cba040\spring-jdbc-5.3.23.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\com.zaxxer\HikariCP\4.0.3\107cbdf0db6780a065f895ae9d8fbf3bb0e1c21f\HikariCP-4.0.3.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-annotations\2.13.4\858c6cc78e1f08a885b1613e1d817c829df70a6e\jackson-annotations-2.13.4.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\com.fasterxml.jackson.core\jackson-core\2.13.4\cf934c681294b97ef6d80082faeefbe1edadf56\jackson-core-2.13.4.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\ch.qos.logback\logback-classic\1.2.11\4741689214e9d1e8408b206506cbe76d1c6a7d60\logback-classic-1.2.11.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.apache.logging.log4j\log4j-to-slf4j\2.17.2\17dd0fae2747d9a28c67bc9534108823d2376b46\log4j-to-slf4j-2.17.2.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.slf4j\jul-to-slf4j\1.7.36\ed46d81cef9c412a88caef405b58f93a678ff2ca\jul-to-slf4j-1.7.36.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework\spring-jcl\5.3.23\3c7eb5fcca67b611065f73ff4325e398f8b051a3\spring-jcl-5.3.23.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework\spring-tx\5.3.23\ab313b4028c62e18fe02defdd5050af704778428\spring-tx-5.3.23.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.slf4j\slf4j-api\1.7.36\6c62681a2f655b49963a5983b8b0950a6120ae14\slf4j-api-1.7.36.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\ch.qos.logback\logback-core\1.2.11\a01230df5ca5c34540cdaa3ad5efb012f1f1f792\logback-core-1.2.11.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.apache.logging.log4j\log4j-api\2.17.2\f42d6afa111b4dec5d2aea0fe2197240749a4ea6\log4j-api-2.17.2.jar;C:\Users\whdud\.gradle\caches\modules-2\files-2.1\org.springframework.boot\spring-boot-devtools\2.7.5\e8510bace48b6a516515aa140cdfd758ad5a47c\spring-boot-devtools-2.7.5.jar com.example.paging.PagingApplication
10:17:29.896 [Thread-0] DEBUG org.springframework.boot.devtools.restart.classloader.RestartClassLoader - Created RestartClassLoader org.springframework.boot.devtools.restart.classloader.RestartClassLoader@636f6035
10:17:30.177 [restartedMain] DEBUG org.springframework.boot.diagnostics.LoggingFailureAnalysisReporter - Application failed to start due to an exception
org.springframework.boot.context.properties.bind.BindException: Failed to bind properties under 'spring.config' to org.springframework.boot.context.config.ConfigDataProperties
	at org.springframework.boot.context.properties.bind.Binder.handleBindError(Binder.java:387)
	at org.springframework.boot.context.properties.bind.Binder.bind(Binder.java:347)
	at org.springframework.boot.context.properties.bind.Binder.bind(Binder.java:332)
	at org.springframework.boot.context.properties.bind.Binder.bind(Binder.java:262)
	at org.springframework.boot.context.config.ConfigDataProperties.get(ConfigDataProperties.java:107)
	at org.springframework.boot.context.config.ConfigDataEnvironmentContributor.withBoundProperties(ConfigDataEnvironmentContributor.java:241)
	at org.springframework.boot.context.config.ConfigDataEnvironmentContributors.withProcessedImports(ConfigDataEnvironmentContributors.java:106)
	at org.springframework.boot.context.config.ConfigDataEnvironment.processInitial(ConfigDataEnvironment.java:240)
	at org.springframework.boot.context.config.ConfigDataEnvironment.processAndApply(ConfigDataEnvironment.java:227)
	at org.springframework.boot.context.config.ConfigDataEnvironmentPostProcessor.postProcessEnvironment(ConfigDataEnvironmentPostProcessor.java:102)
	at org.springframework.boot.context.config.ConfigDataEnvironmentPostProcessor.postProcessEnvironment(ConfigDataEnvironmentPostProcessor.java:94)
	at org.springframework.boot.env.EnvironmentPostProcessorApplicationListener.onApplicationEnvironmentPreparedEvent(EnvironmentPostProcessorApplicationListener.java:102)
	at org.springframework.boot.env.EnvironmentPostProcessorApplicationListener.onApplicationEvent(EnvironmentPostProcessorApplicationListener.java:87)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.doInvokeListener(SimpleApplicationEventMulticaster.java:176)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.invokeListener(SimpleApplicationEventMulticaster.java:169)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:143)
	at org.springframework.context.event.SimpleApplicationEventMulticaster.multicastEvent(SimpleApplicationEventMulticaster.java:131)
	at org.springframework.boot.context.event.EventPublishingRunListener.environmentPrepared(EventPublishingRunListener.java:85)
	at org.springframework.boot.SpringApplicationRunListeners.lambda$environmentPrepared$2(SpringApplicationRunListeners.java:66)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:120)
	at org.springframework.boot.SpringApplicationRunListeners.doWithListeners(SpringApplicationRunListeners.java:114)
	at org.springframework.boot.SpringApplicationRunListeners.environmentPrepared(SpringApplicationRunListeners.java:65)
	at org.springframework.boot.SpringApplication.prepareEnvironment(SpringApplication.java:344)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:302)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295)
	at com.example.paging.PagingApplication.main(PagingApplication.java:10)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)
	at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:49)
Caused by: org.springframework.core.convert.ConverterNotFoundException: No converter found capable of converting from type [java.lang.String] to type [org.springframework.boot.context.config.ConfigDataProperties]
	at org.springframework.boot.context.properties.bind.BindConverter.convert(BindConverter.java:118)
	at org.springframework.boot.context.properties.bind.BindConverter.convert(BindConverter.java:100)
	at org.springframework.boot.context.properties.bind.BindConverter.convert(BindConverter.java:92)
	at org.springframework.boot.context.properties.bind.Binder.bindProperty(Binder.java:459)
	at org.springframework.boot.context.properties.bind.Binder.bindObject(Binder.java:403)
	at org.springframework.boot.context.properties.bind.Binder.bind(Binder.java:343)
	... 31 common frames omitted
10:17:30.178 [restartedMain] ERROR org.springframework.boot.diagnostics.LoggingFailureAnalysisReporter - 

***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to bind properties under 'spring.config' to org.springframework.boot.context.config.ConfigDataProperties:

    Reason: org.springframework.core.convert.ConverterNotFoundException: No converter found capable of converting from type [java.lang.String] to type [org.springframework.boot.context.config.ConfigDataProperties]

Action:

Update your application's configuration


Process finished with exit code 0

```

아래 야믈파일에 `config: ` 이렇게 쓰이지 않는 설정이 들어감

```yaml
server:
  port: 8085
spring:
  config:
  datasource:
	url: 비밀
	username: 비밀
	password: 비밀
	...
```

