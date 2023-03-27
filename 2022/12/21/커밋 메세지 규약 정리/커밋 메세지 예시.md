# git commit message best practices

--- 

### refactor - 변경 多

- 가장 큰 변경사항을 커밋 메세지 헤더에 기입

```
refactor: 컨트롤러에서 처리하는 서비스로직 분리 및 패키지 이동

패키지 이동
/gov/mopas/kais/pil/web/PilController.java
/gov/mopas/kais/pil/PilController.java

서비스로직을 분리한 메소드
	- searchPil
	- searchPilFromExcel
	- pilExcelResultDownload
분리에 따른 import 제거
분리에 따른 의존성 주입 제거
```

---

### refactor - 패키지 이동 및 변경시

- 변경전과 후의 차이를 상세히 기입
- 와일드카드 허용

```
refactor: 패키지 이동

패키지 이동: 
Before: 
/gov/mopas/kais/pil/web/PilController.java
After:
/gov/mopas/kais/pil/PilController.java

```
```
refactor : value 라는 패키지명 validator로 변경

value라는 패키지명 만으로는 무슨 기능을 하는 클래스의 패키지인지 정확히 판단불가
validator로 변경

패키지 변경
Before:
gov.mopas.kais.pil.excel.validator.*
After:
gov.mopas.kais.pil.excel.value.*
```
---

### refactor - 단순 메소드 추가

- 기존의 기능을 분리하며 메소드가 추가 되어 기능 추가가 아닌 메소드만 추가가 되는 경우
- [access-specifier] [return-type] [method-name] [parameter-list]
- method header만 그대로 기입

```
refactor: 컨트롤러에서 처리하던 서비스로직 처리


서비스에 추가된 메소드
	- public String searchPil(PilForm pilForm, HttpServletRequest request)
	- public String searchPilFromExcel(HttpServletRequest request)
	- public File makeExcelResultFile(HistoryForm historyForm, HttpServletRequest request, HttpServletResponse response)
```

---

### refactor - 메소드의 로직 변경

- 기존 구현된 기능의 버그나 여러 이유로 인해 로직을 수정하는 경우
- 어떤 부분이 수정되었는지 상세히 기입
- 가능하면 해당 수정 부분 코드를 Before와 After로 기입
- 수정 부분 코드 기입이 어려울시 로직의 변경 내용 상세히 기입

```
refactor: 엑셀의 숫자 셀 처리 로직 변경

public static String getDecimalData(HSSFCell cell) 메소드 추가 
public static String getDateData(HSSFCell cell) 메소드 추가

Before:

public static String getCellData(Cell cell, String type) {
	switch(cell.getCellType()) {
		case HSSFCell.CELL_TYPE_FORMULA : cellString = cell.getCellFormula(); break;
		case HSSFCell.CELL_TYPE_NUMERIC : cellString = numericCell(cell, type); break;
		case HSSFCell.CELL_TYPE_STRING : cellString = cell.toString(); break;
		case HSSFCell.CELL_TYPE_BLANK : cellString = ""; break;
		case HSSFCell.CELL_TYPE_BOOLEAN : cellString = String.valueOf(cell.getBooleanCellValue()); break;
		default : cellString = ""; break;
	}

}

After: 

public static String getCellData(Cell cell) {
	DecimalFormat dFormat = new DecimalFormat();
	switch(cell.getCellType()) {
		case HSSFCell.CELL_TYPE_FORMULA : cellString = cell.getCellFormula(); break;
		case HSSFCell.CELL_TYPE_NUMERIC : cellString = dFormat.format(cell.getNumericCellValue()); break;
		case HSSFCell.CELL_TYPE_STRING : cellString = cell.toString(); break;
		case HSSFCell.CELL_TYPE_BLANK : cellString = ""; break;
		case HSSFCell.CELL_TYPE_BOOLEAN : cellString = String.valueOf(cell.getBooleanCellValue()); break;
		default : cellString = ""; break;
	}

}
```

---

```
feat: 기초번호 조회 후 지도 조회 기능 추가
```

