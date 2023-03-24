암호화 해서 들어간 데이터에 대해서 복호화를 했어야 하는 일이 생겼다.
복호화 하는 라이브러리는 암호화 라이브러리를 만들어준 곳으로부터 받지는 못했고 해당 자르를 열어서 가져왔다.

문제가 생긴건
오라클에 Long Law로 들어간 복호화 된 데이터를 String으로 받으면서 시작됐다.

String encodingData = "032D3A..."; 이런 식으로 된 데이터였고 나는 당연히 앞자리만 읽어서 가면 될 줄 알았는데
String을 잘 보면 03, 2D, 3A.. 2개씩 묶어 보면 16진수임을 알 수 있다.

난 encodingDatd.getByte를 이용해 바이트 배열로 String을 전환 했고 0은 ASCII 코드 48로 들어와서
03에 대한 시프트 연산이 아니고 48에 대한 시프트 연산을 했고 상상도 못할 큰 값들이 나왔다.

```java
byte[] bytes = new java.math.BigInteger(hexText, 16).toByteArray();
```
java.math에서 제공하는 메소드로 해결!

