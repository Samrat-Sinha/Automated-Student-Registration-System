package com.project.Dao;

import com.project.Beam.Course;
import com.project.Beam.Student;
import com.project.Exception.CourseException;
import com.project.Util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App_DeoImpl implements App_Dao {

    @Override
    public String registerCourse(Course course) {

        String message = "Sorry Course Not Added...";

        try (Connection conn = DBUtil.provideConnection()) {

            PreparedStatement ps =  conn.prepareStatement("Insert into course(courseName,courseTeacher,courseFees) values(?,?,?)");

            ps.setString(1, course.getCourseName());
            ps.setString(2,course.getCourseTeacher());
            ps.setInt(3,course.getCourseFees());

            int x = ps.executeUpdate();
            if(x>0){
                message = "Course Added Successfully...";
            }
        } catch (SQLException e) {
            e.getMessage();
        }

        return message;
    }

    @Override
    public String updateFeesofCourse(Course course) {

        String message = "Course Fees Not Updated";

        try (Connection conn = DBUtil.provideConnection()){

           PreparedStatement ps =  conn.prepareStatement("Update course set coursefees = ? where courseName = ?");

           ps.setInt(1,course.getCourseFees());
           ps.setString(2,course.getCourseName());

           int x = ps.executeUpdate();
           if(x>0){
               message = "Course Fees Updated Successfully";
           }
        } catch (SQLException e) {
            e.getMessage();
        }
        return message;
    }

    @Override
    public String deleteACourse(Course course) {
        String message = "Course Deleted Not Done.... ";

        try (Connection conn = DBUtil.provideConnection()){

            PreparedStatement ps =  conn.prepareStatement("Delete from course where courseName =?");
            ps.setString(1,course.getCourseName());

            int x = ps.executeUpdate();
            if(x>0){
                message = "Course Deleted Successfully....";
            }
        } catch (SQLException e) {
            e.getMessage();
        }


        return message;
    }

    @Override
    public Course totalDetailofCourse(String courseName) throws CourseException {

        Course course = null;

        try(Connection conn = DBUtil.provideConnection()){

            PreparedStatement ps = conn.prepareStatement("select * from course where courseName = ?");

            ps.setString(1,courseName);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                int cid = rs.getInt("courseId");
                String cn = rs.getString("courseName");
                String ct = rs.getString("courseTeacher");
                int cf = rs.getInt("courseFees");

                course = new Course(cid,cn,ct,cf);
            }
            else{
                throw new CourseException("Course Does't Exist With Course Name " + courseName);
            }

        } catch (SQLException e) {
            throw new CourseException(e.getMessage());
        }
       return course;
    }

    @Override
    public String registerStudent(Student student) {
        String message = "Student Not Being Registered....";

        try(Connection conn = DBUtil.provideConnection()){

            PreparedStatement ps = conn.prepareStatement("Insert into student(studentName,studentCourse,studentEmail,studentPassword) values(?,?,?,?)");
            ps.setString(1,student.getStudentName());
            ps.setString(2,student.getStudentCourse());
            ps.setString(3,student.getStudentEmail());
            ps.setString(4,student.getStudentPassword());

            int x = ps.executeUpdate();
            if(x>0){
                message = "Student Registered Successfully.......";
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return message;
    }


}
