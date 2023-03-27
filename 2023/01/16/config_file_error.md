### org.springframework.boot.context.properties.bind.BindException: Failed to bind properties under 'spring.config' to org.springframework.boot.context.config.ConfigDataProperties

```
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

