import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("student1".equals(username) && "pass1".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            Cookie usernameCookie = new Cookie("username", username);
            usernameCookie.setMaxAge(60 * 60 * 24 * 30);
            response.addCookie(usernameCookie);

            response.sendRedirect("DashboardServlet");
        } else {
            response.sendRedirect("login.html?error=true");
        }
    }
}

