왜 목록에서 jwt 토큰을 확인 못하는지 찾았다
- header에 jwt 토큰을 담아 보내고 있지 않다.
- 하지만 난 vue js를 할 줄 몰라서 시간이 조금 걸릴 것 같다.

프론트에서 처리 되는 로직은 프론트에서 처리하면 백엔드 서버는 굳이 자원을 낭비할 필요가 없구나

맨 처음 로그인 정보 없을때 로그인 정보가 없다는걸 서버에서 확인하지 않고 프론트에서 확인해서 서버는 아무것도 안해도 되는구나


--------- 애플리케이션 실행 과정 ------------
1. Powered by Spring Boot 2.7.5
2. Hibernate Validator 6.2.5.Final
3. KaisDemoApplication.logStarting - Starting KaisDemoApplication using Java 17.0.4.1
4. DevToolsPropertyDefaultsPostProcessor.logTo
5. Tomcat initialized with port(s): 9090 (http)
6. Initializing ProtocolHandler ["http-nio-9090"]
7. Starting service [Tomcat]
8. Starting Servlet engine: [Apache Tomcat/9.0.68]
9. Initializing Spring embedded WebApplicationContext
10. prepareWebApplicationContext
11. --- SecurityConfig > filter chain ---
12. --- JwtSecurityConfig > configure ---
13. DefaultSecurityFilterChain
14. WebSecurity
15. DefaultSecurityFilterChain
16. startServer
17. Http11NioProtocol
18. TomcatWebServer
19. KaisDemoApplication logStarted
20. AppStartupRunner run ( common = local-common, test = local-test )
----------------------------------------

----------- 로그인 요청시 -------------

2. --- JwtFilter > doFilter ---
  bearerToken : null
  토큰 정보 : null
3. 유효한 JWT 토큰이 없습니다, uri: /api/authenticate
4. Request : POST uri=[/api/authenticate] content-type=[application/json]
5. Request Payload: {"username":"user","password":"1234"}
6. HikariDataSource.getConnection - kais-pool - Starting...
7. PostMapping("/api/authenticate") > ID : user , PASSWORD : 1234
8. Response Payload: {
    "timestamp": "2022-12-21T17:07:07.2426601",
    "status": 200,
    "message": "OK",
    "results": {
        "token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiYXV0aCI6IlJPTEVfVVNFUiIsImV4cCI6MTY3MTYxMDYyN30.U1rs5RhMU63FWkURUMuLJq0gcT3YDU9UAzcM6Sh_A2s",
        "refreshToken": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNjcxNjk2NDI3fQ.sBk8vUWDEjjRAfrQqDrpUTP-WEmevHENFcCSCmn0zyg"
    }
}

9. --- JwtFilter > doFilter ---
bearerToken : Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiYXV0aCI6IlJPTEVfVVNFUiIsImV4cCI6MTY3MTYxMzUwMH0.GeoAl_OwgR4ByArPEi0ROlgismBYx_ow_rASg7DxRWA
토큰 정보 : eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiYXV0aCI6IlJPTEVfVVNFUiIsImV4cCI6MTY3MTYxMzUwMH0.GeoAl_OwgR4ByArPEi0ROlgismBYx_ow_rASg7DxRWA
TokenProvider > validateToken > token : eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiYXV0aCI6IlJPTEVfVVNFUiIsImV4cCI6MTY3MTYxMzUwMH0.GeoAl_OwgR4ByArPEi0ROlgismBYx_ow_rASg7DxRWA
10. Request : GET uri=[/api/members/user] content-type=[null]
11. Response Payload: {
    "timestamp": "2022-12-21T17:07:07.4082533",
    "status": 200,
    "message": "OK",
    "results": {
        "username": "user",
        "nickname": "사용자",
        "roles": "ROLE_USER"
    }
}
------------------------------------


------- 로그인 후 목록 불러오기 --------
--- JwtFilter > doFilter ---
bearerToken : null
토큰 정보 : null
2022-12-21 17:21:17.335 [http-nio-9090-exec-6] [traceId=] ERROR gov.mois.kais.core.jwt.JwtFilter.doFilter - 유효한 JWT 토큰이 없습니다, uri: /api/boards/
Request : GET uri=[/api/boards/] content-type=[null]
Response Payload: {
    "timestamp": "2022-12-21T17:21:17.3919684",
    "status": 200,
    "message": "OK",
    "results": [{
            "id": 1,
            "title": "a",
            "content": "aaaa",
            "createdAt": "2022-12-05T14:02:45"
        }, {
            "id": 2,
            "title": "b",
            "content": "bbbbb",
            "createdAt": "2022-12-05T14:19:35.522734"
        }, {
            "id": 4,
            "title": "aaaa",
            "content": "test2222",
            "createdAt": "2022-12-07T13:46:52.35682"
        }, {
            "id": 7,
            "title": "fafdfdf",
            "content": " test.  atertdsfd",
            "createdAt": "2022-12-16T10:15:46.81483"
        }
    ]
}
