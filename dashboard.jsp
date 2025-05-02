<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>Available Courses</title>
</head>
<body>
    <h1>Welcome to the Course Dashboard</h1>

    <h2>Available Courses</h2>
    <table border="1">
        <thead>
            <tr>
                <th>Course ID</th>
                <th>Course Name</th>
                <th>Instructor</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${courses}" var="course">
                <tr>
                    <td>${course.courseId}</td>
                    <td>${course.courseName}</td>
                    <td>${course.instructor}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
