package how_to_http;

@Controller
public class Controller {

    @RequestMapping(value="/excel.do" , method=RequestMethod.GET)
    public View excel(HttpServletRequest request, HttpServletResponse response, ModelMap model){

        model.addAttribute("A" , "1");
        model.addAttribute("B" , "2");

        return new ExcelView();
    }

}
