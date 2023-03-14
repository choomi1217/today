# org.apache.ibatis.binding.BindingException

```
org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.example.paging.board.domain.BoardMapper.find
```

#### 💩오류가 나는 코드
```xml
<mapper namespace="com.example.paging.board.domain.BoardMapper.java">
```

#### 🛠오류 해결한 코드
```xml
<mapper namespace="com.example.paging.board.domain.BoardMapper">
```
