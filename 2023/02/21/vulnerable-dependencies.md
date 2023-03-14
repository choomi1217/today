# 의존성 취약에 대해

[의존성 취약에 대한 글같은 광고](https://ropesec.com/articles/vulnerable-dependencies/)


```xml
<dependency>
    <groupId>org.json</groupId>
    <artifactId>org.json</artifactId>
    <version>chargebee-1.0</version>
</dependency>
```
JSONObject를 쓰려고 의존성 주입하고 보니 의존성 취약하다고 Intellij가 알려줬다.
난 어떻게 해야할까? 
의존성이 취약한걸 알고도 그냥 써야할까?
아니면 다른 라이브러리를 찾아야 할까?
어떻게 찾지??
