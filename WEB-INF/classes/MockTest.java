import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;
public class MockTest extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
       
       response.setContentType("text/html");
       String[] name={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};

       int mark=0;
       for(int i=0; i<name.length; i++){
       mark+=Integer.parseInt(request.getParameter(name[i]));
       }
        String mark1=String.valueOf(mark);
       Cookie result=new Cookie("mark",mark1);
       response.addCookie(result);
       response.sendRedirect("/quiztest/quizAssignment/result.html");


    }

      public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
          response.setContentType("text/html");
       String[] name={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};

       int mark=0;
       for(int i=0; i<name.length; i++){
       mark+=Integer.parseInt(request.getParameter(name[i]));
       }
        String mark1=String.valueOf(mark);
       Cookie result=new Cookie("mark",mark1);
       response.addCookie(result);
       response.sendRedirect("/quiztest/quizAssignment/result.html");       

      }
}