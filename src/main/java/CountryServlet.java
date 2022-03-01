import type.countrywsws1.client.generated.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.List;


public class CountryServlet extends HttpServlet {
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
        StateInfoServiceType countryISS = countryIS.getCountryInfoServiceSoap();

        ListOffContinent arrayOftContinent = countryISS.listOfContinentsByName();
        List<TypeContinent> tContinent = arrayOftContinent.getTContinent();

        ListOffCoAndNa arrayOftCountryCodeAndName = countryISS.listOfCountryNamesByName();
        List<TypeStateCoAndNa> tCountryCodeAndNames = arrayOftCountryCodeAndName.getTCountryCodeAndName();

        response.setContentType("text/html; charset=UTF-8");
        ResultSet resultSet = null;
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Country</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>List of сountries</h1>");
        out.println("<table cellpadding=\"4\">");
        out.println("<tr>\n" +
                "        <th>id</th>\n" +
                "        <th>Code</th>\n" +
                "        <th>Name</th>\n" +
                "        <th>Flag</th>\n" +
                "        <th>Information</th>\n" +
                "        <th>Languages </th>\n" +

                "    </tr>");
        System.out.println(tContinent.toString());
        for (TypeStateCoAndNa stateCoAndNa : tCountryCodeAndNames) {
            int lastIndex = tCountryCodeAndNames.lastIndexOf(stateCoAndNa);

            out.print("<tr>");
            out.print(" <td>" + lastIndex + "</td>");
            out.print(" <td>" + stateCoAndNa.getSISOCode() + "</td>");
            out.print(" <td>" + stateCoAndNa.getSName() + "</td>");
            out.print(" <td><a href=\"/flag?countryCode=" + stateCoAndNa.getSISOCode() + "\"> " + "flag" + "</a></td>");
            out.print(" <td><a href=\"/inf?countryCode=" + stateCoAndNa.getSISOCode() + "\"> " + "inf" + "</a></td>");
            out.print(" <td><a href=\"/languages?countryCode=" + stateCoAndNa.getSISOCode() + "\"> " + "languages" + "</a></td>");
            out.print("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}