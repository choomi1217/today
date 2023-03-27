# Log4J 설정

Java에서 Log4J 설정을 여러방법으로 시도했습니다..

다 성공하지 못했습니다 

프로퍼티 파일로 설정하고 파일로 내보낸 로그는 아예 메세지가 보이지 않습니다.
자바로 설정하는 방법은 글쎄 코드 분석하다 오늘 하루가 다 갔습니다.

1. log4j.properties
```properties
코드는 내일
```

2. Log4J 객체를 직접 만들어서 Java로 설정
```java
코드는 내일
```


## String byte

byte[] 배열로 27을 넣고 String으로 변환했다. (나는 아니고.. 7년도 더 된 코드에서 말이다..)
분명 -> 이런 모양의 화살표 특수기호이지만 로그파일엔 적히지 않습니다.

분명 유니코드이기 때문에 이건 특수기호가 나오던가 해야하는데 말이죠..ㅠ

```java
public void aa(){
    byte[] b = new byte[1];
    b[0] = 27;
    new String(b);
    new Exception().printStackTrace();
}
```
