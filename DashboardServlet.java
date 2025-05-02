import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course(101, "Image Processing", "Vinuka"));
        courses.add(new Course(102, "Server side web", "Amanda"));
        courses.add(new Course(103, "Software eng", "Asantha"));
        courses.add(new Course(104, "Linear Algebra", "Vishwaka"));

        request.setAttribute("courses", courses);

        request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
    }
}
