import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");


        if("admin".equals(login) && "admin".equals(password)){
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html");
            PrintWriter printWriter = response.getWriter();
            printWriter.println("Zalogowano pomyślnie");
        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        response.getWriter().println("Nie obługuje");
    }
}
