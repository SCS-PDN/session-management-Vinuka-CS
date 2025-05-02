import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/EnrollServlet")
public class EnrollServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String courseId = request.getParameter("courseId");

        HttpSession session = request.getSession();
        List<String> enrolledCourses = (List<String>) session.getAttribute("enrolledCourses");

        if (enrolledCourses == null) {
            enrolledCourses = new ArrayList<>();
            session.setAttribute("enrolledCourses", enrolledCourses);
        }

        enrolledCourses.add(courseId);
        response.sendRedirect("DashboardServlet");
    }
}
