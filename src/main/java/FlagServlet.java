import type.countrywsws1.client.generated.StateInfoServ;
import type.countrywsws1.client.generated.TypeCountryInfo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;


public class FlagServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        generateView(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        generateView(request, response);
    }

    public void generateView(HttpServletRequest request,
                             HttpServletResponse response)
            throws IOException {
        StateInfoServ countryIS = new StateInfoServ();
        TypeCountryInfo tCountryInfo =
                countryIS.getCountryInfoServiceSoap().fullCountryInfo(request.getParameter("countryCode"));

        response.setContentType("text/html; charset=UTF-8");
        ResultSet resultSet = null;
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Country</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>" + "Flag of " + tCountryInfo.getSName() + " - </h1>");
        out.println("" +
                "<img src=\"" + tCountryInfo.getSCountryFlag() + "\" alt=\"flag of " + tCountryInfo.getSName() + "\">");
        out.println("</body>");
        out.println("</html>");


    }
}