# error list
1. IllegalStateException context namespace element 'annotation-config'


# 에러를 대하는 개발자의 자세

- 디버깅은 기본적으로 **단서** 를 분석해서 가설을 세우고 이를 검증하는 방식으로 체계적으로 접근해야 합니다.
- 이 경우 **단서** 는 스택트레이스를 뜻하며 한 클래스에서 다른 클래스를 호출하는 데 해당하는 메소드를 찾을 수 없어서 실패한 경우.
- 컴파일 시점에는 있었던 메서드가 런타임때 보이지 않는 경우.
- 