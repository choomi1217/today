# 커밋 메세지를 잘 작성 해야하는 이유
> Getting in the habit of creating quality commit messages makes using and collaborating with Git a lot easier.
> 
> 깃을 통해 좋은 커밋 메세지를 작성하는 습관은 일의 효율을 높이며 협업이 쉬워집니다.
> 
> — Pro Git Book

> - 다른 사람이 커밋 메세지만 보고 무엇이 바뀌고 왜 바뀌었는지 빠르게 이해
> - 특정 변경사항을 빠르게 취소
> - 릴리즈를 위한 변경노트 작성 혹은 범프버전 변경

# 커밋에 들어가야 하는 내용 

- 새로운 특징 ( new feature )
- 버그 수정 ( bug fix )
- 주요 변경 내용 ( breaking changes ) 


# 커밋 메세지의 형식

``` 
<header>
<BLANK LINE>
<body>
<BLANK LINE>
<footer>
```

### header

`<type>(<scope>): <short summary>`

- \<type\>
	- feat      : 새로운 기능 
	- fix       : 버그 픽스
	- perf      : 성능 개선
	- refactor  : 리팩토링
	- test      : 테스트
	- style     : 스타일 변경
	- build     : 빌드 관련 파일
	- ci        : ci 설정 관련 파일
	- docs      : 문서 파일
	- chore     : 그 외 자잘한 파일

- \<scope\>
	- 생략 가능합니다.
	- 커밋된 소스코드가 영향을 미치는 영역을 명사로 기재
```
feat(api): 상품 출하시 사용자에게 메세지 전송 기능 추가
```
```
feat(lang): 영어 버전 추가
```

- \<short summary\>
	- 변경 사항에 대한 간결한 설명
	- 명령문, 현재 시제로 작성
	- 첫글자는 소문자
	- 마침표 금지
	
### body
- 변경한 이유와 변경 전과의 차이점을 기재
- 명령문, 현재 시제로 작성

### feet
- BREAKING CHANGE
	- 중요한 변경사항을 기재
- 해결된 이슈
	- 이슈 번호도 함께 기재
```
feat: allow provided config object to extend other configs

BREAKING CHANGE: `extends` key in config file is now used for extending other config files
```
```
feat: allow provided config object to extend other configs

BREAKING CHANGE: `extends` key in config file is now used for extending other config files

Closes #392
Breaks foo.bar api, foo.baz should be used instead
```

[참고 블로그](https://velog.io/@outstandingboy/Git-%EC%BB%A4%EB%B0%8B-%EB%A9%94%EC%8B%9C%EC%A7%80-%EA%B7%9C%EC%95%BD-%EC%A0%95%EB%A6%AC-the-AngularJS-commit-conventions#scope%EC%97%90-%EB%93%A4%EC%96%B4%EA%B0%88-%EC%88%98-%EC%9E%88%EB%8A%94-%ED%95%AD%EB%AA%A9%EB%93%A4)

[참고 깃허브](https://github.com/angular/angular/blob/main/CONTRIBUTING.md)