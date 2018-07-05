import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")
public class MyCalculator extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        int number1 = Integer.parseInt(request.getParameter("num1"));
        int number2 = Integer.parseInt(request.getParameter("num2"));
        String operation = request.getParameter("oper");
        String number11 = request.getParameter("number1");

        switch (operation){
            case "add":
                System.out.println(add(number1,number2));
                break;
            case "sub":
                System.out.println(sub(number1,number2));
                break;
            case "multi":
                System.out.println(multi(number1,number2));
                break;
            case "div":
                System.out.println(div(number1,number2));
                break;
        }

    }

    public int add(int number1, int number2){
        return number1+number2;
    }

    public int sub(int number1, int number2){
        return number1-number2;
    }

    public int multi(int number1, int number2){
        return number1*number2;
    }

    public double div(int number1, int number2) throws Num2ZeroException{
        if(number2==0)
            throw new Num2ZeroException("Nie dziel przez zero");
        else
        return number1/number2;
    }


}
