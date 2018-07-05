import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String imie = request.getParameter("imie");
        String nazwisko = request.getParameter("nazwisko");
        String wiek = request.getParameter("wiek");

        if (imie==null) imie = "masz dziwne imie";
        if (nazwisko==null) nazwisko = "haha ciekawe jak brzmi";
        if(wiek==null) wiek = "no podaj wiek";

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("Cześć " + imie + " o nazwisku " + nazwisko + " i wieku " + wiek );

    }
}
