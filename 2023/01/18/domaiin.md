# 게시판
1. 게시글 전체 검색 
   - GET
   - localhost:8080/board
   - 페이징 처리
2. 게시글 id로 검색
   - GET
   - localhost:8080/board?id=1
   - 페이징 처리
3. 게시글 제목으로 검색
   - GET
   - localhost:8080/board?title=title
   - 페이징 처리
4. 게시글 내용으로 검색
   - GET
   - localhost:8080/board?content=content
   - 페이징 처리
5. 게시글 작성자로 검색
   - GET
   - localhost:8080/board?userName=username
   - 페이징 처리
6. 생성날짜로 검색
   - GET
   - localhost:8080/board?createdAt=20230118
   - 페이징 처리
7. 다수 조건으로 검색
   - GET
   - localhost:8080/board?id=1&title=title&createdAt=20230118
8. 게시글 등록
   - POST
   - localhost:8080/board?id=1
9. 게시글 삭제
10. 게시글 수정
11. 게시글 상세보기
    - GET
    - localhost:8080/board/1

- 상세 보기도 id로 검색하고 id로 검색하기도 id로 검색합니다.
- 그럼 상세보기는 GET에 PathVariable로 하고 검색은 쿼리스트링으로 하는게 맞을까요?

# 사용자
1. 사용자 전체 검색
   - localhost:8080/user
2. 사용자 등록
   - localhost:8080/user


## 참고하는 도메인
https://www.daangn.com/kr/nearby-stores?categoryId=6375d2903029e437ecd0a8f8

https://search.shopping.naver.com
/search/category/100007791
?catId=50007030%2050007218
&freeDelivery=true
&frm=NVSHPRC
&maxPrice=30000
&minPrice=0
&origQuery
&pagingIndex=1
&pagingSize=40
&productSet=total
&query
&sort=rel
&timestamp=
&viewType=list

https://www.saramin.co.kr/zf_user/search?
search_area=main
&search_done=y
&search_optional_item=n
&searchType=default_popular
&loc_cd=101130
&cat_kewd=87