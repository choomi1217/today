package how_to_http;

import daily_inspector.integrator_inspector.requestor.HttpRequestor;

import java.io.InputStream;

public class ExcelView implements AbstractExcelView {

    @Override
    protected void buildExcelDocument(Map model, HSSFWorkBook workBook, HttpServletRequest request, HttpServletResponse response){

        XLSTransformer transformer = new XLSTransformer();
        InputStream is = new ClassPathResource();
        WorkBook book = transformer.transformXml(is, model);

        response.setHeader("뭐시기","저시기");

        HttpSession session = request.getSession();
        session.setAttribute("어쩌구","저쩌구");
    }

}
