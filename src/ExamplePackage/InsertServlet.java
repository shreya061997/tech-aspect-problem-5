package ExamplePackage;
import accountpackage.AccountBean;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, java.io.IOException {
String action=request.getParameter("action");
System.out.println("Request is getting from"+action);
if("sign_in".equalsIgnoreCase(action)){
try
{
AccountBean user = new AccountBean();
int id=0;
user.setFirstName(request.getParameter("firstname"));
user.setLastName(request.getParameter("lastname"));
user.setAge(request.getParameter("age"));
user.setBranch(request.getParameter("branch"));
user.setSemester(request.getParameter("semester"));
user.setScore(request.getParameter("score"));
user.setYear(request.getParameter("year"));

System.out.println("user signed in");
id = UserDAO.insert(user);
System.out.println("my user is going valid");
if (id>0)
{
System.out.println("my user is valid");
request.setAttribute("currentSessionUser",user);
RequestDispatcher
rd=request.getRequestDispatcher("newlogin/userLogged.jsp");
rd.forward(request, response);
}

}
catch (Throwable theException)
{
System.out.println(theException);
}
}

}
}
