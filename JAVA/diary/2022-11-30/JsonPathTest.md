## Test 코드를 짜다가 생긴일

```json
[{"seq":"1","pilManNo":"","pilNm":"","eastIo":"127.100486","northIa":"35.895123","sigCd":"4511","rn":"???","engRn":"Jeonmi-ro","eveBsiMn":"316","eveBsiSl":"0","oddBsiMn":"315","oddBsiSl":"0","lineCrossingDirection":-1,"azimuthSum":48,"rdsManNo":"9413"}]
```

```java
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/resources/egovframework/spring/context-common.xml"
		, "file:src/main/webapp/WEB-INF/config/egovframework/springmvc/dispatcher-servlet.xml"
		, "file:src/main/resources/egovframework/spring/context-aspect.xml"
		, "file:src/main/resources/egovframework/spring/context-datasource.xml"
		, "file:src/main/resources/egovframework/spring/context-sqlMap.xml"
		, "file:src/main/resources/egovframework/spring/context-geo.xml"
		, "file:src/main/resources/egovframework/spring/context-idgen.xml"
		, "file:src/main/resources/egovframework/spring/context-properties.xml"
		, "file:src/main/resources/egovframework/spring/context-validator.xml"})
@WebAppConfiguration
public class PilControllerTest {

	private MockMvc mockMvc;
	
	@Autowired 
	PilController pilController;
	
	private PilExcelForm testForm = new PilExcelForm();
	
	@Before
	public void testFormSetup() {
		this.testForm.setSeq("1");
		this.testForm.setEastIo("127");
		this.testForm.setNorthIa("35");
		this.testForm.setExcelValid(null);
	}
	
	@AfterEach
	public void resetTestForm() {
		testForm = new PilExcelForm();
	}
	
	@Before
	public void mockMvcSetup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(pilController).build();
	}
	
	@DisplayName("화면 조회 테스트")
	@Test
	public void goPilTest() throws Exception {
		mockMvc.perform(get("/test/goPage.do"))
		.andDo(print())
		.andExpect(status().isOk());
	}
	
	@DisplayName("검색 테스트")
	@Test
	public void searchPilTest() throws Exception {
		mockMvc.perform(post("/test/search.do")
				.param("seq", "1")
				.param("eastIo", "127")
				.param("northIa", "35")
				)
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect((ResultMatcher) content())
		.andExpect(jsonPath("$[?(@.seq==1)]").value("전미로"));
		;
		
	}
	
	
}
```



```text
MockHttpServletResponse:
              Status = 200
       Error message = null
             Headers = {Content-Type=[text/plain;charset=ISO-8859-1], Content-Length=[253]}
        Content type = text/plain;charset=ISO-8859-1
                Body = [{"seq":"1","pilManNo":"","pilNm":"","eastIo":"127.100486","northIa":"35.895123","sigCd":"4511","rn":"???","engRn":"Jeonmi-ro","eveBsiMn":"316","eveBsiSl":"0","oddBsiMn":"315","oddBsiSl":"0","lineCrossingDirection":-1,"azimuthSum":48,"rdsManNo":"9413"}]
       Forwarded URL = null
      Redirected URL = null
             Cookies = []
```


Test 코드를 짜다가 json 문자열을 테스트 할 일이 생겼습니다.
그래서 해당 문자열을 보니
root가 조금 이상했습니다.

어떻게 하면 나올까 고민하다 아래 방식으로 해결


-------------------------------------------------------------

```java
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class PilControllerTest {

	private MockMvc mockMvc;

	@Autowired
	TESTController testController;

	@Before
	public void mockMvcSetup() {

		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);

		this.mockMvc = MockMvcBuilders.standaloneSetup(pilController)
				.addFilters(characterEncodingFilter)
				.build();
	}

	@DisplayName("기초번호 조회 화면 테스트")
	@Test
	public void goPilTest() throws Exception {
		mockMvc.perform(get("/test/go.do"))
		.andDo(print())
		.andExpect(status().isOk());
	}

	@DisplayName("기초번호 단건 조회 테스트")
	@Test
	public void searchPilTest() throws Exception {

		MvcResult mvcReturned = mockMvc.perform(post("/test/search.do")
				.param("seq", "1")
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				)
		.andDo(print())
		.andExpect(jsonPath("$.[0].rn", is("전미로")))
		.andReturn();

	}


}
```