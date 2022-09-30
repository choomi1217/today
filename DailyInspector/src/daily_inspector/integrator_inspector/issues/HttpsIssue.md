
# Javax.net.ssl.SSLHandshakeException : sun.security.validator.ValidatorException: PKIX path building failed: sun.security.provider.certpath.SunCertPathBuilderException: unable to find valid certification path to requested target

``` Java
    URL url = new URL(url1 + dateNow());
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setConnectTimeout(10000);
    connection.setDoOutput(true);

    OutputStream outputStream = connection.getOutputStream();
    int responseCode = connection.getResponseCode();

    if(responseCode == HttpURLConnection.HTTP_OK){
        InputStreamReader inputStreamReader = new InputStreamReader(
            connection.getInputStream(), "euc-kr");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String result = bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));
    }
```

위 코드로 실행시 분명 내 브라우저는 인증된 인증서라고 했으나 자바로 요청시 인증되지 않은 인증서라고 합니다.

해결법 1. 직접 인증서 넣어주기

해결법 2. 모든 인증서 인증되도록 하기(?)

[참고 블로그1](https://velog.io/@csk917work/%EC%98%A4%ED%94%88-API-%EC%82%AC%EC%9A%A9%EC%8B%9C-SSL-PKIX-path-building)

[참고 블로그2](https://goddaehee.tistory.com/268)
