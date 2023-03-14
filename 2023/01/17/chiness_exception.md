# Exception 메세지를 보고 해석 할 수 있을까..?

```
throw new PageException("order by [" + orderBy + "] 存在 SQL 注入风险, 如想避免 SQL 注入校验，可以调用 Page.setUnsafeOrderBy");
```

우선 사용하기로 하고

[참고 블로그](https://junyharang.tistory.com/305)
