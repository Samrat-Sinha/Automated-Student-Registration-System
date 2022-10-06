package com.project.Dao;

import com.project.Beam.Batch;
import com.project.Beam.Course;
import com.project.Beam.Student;
import com.project.Exception.CourseException;

public interface App_Dao {

    String registerCourse(Course course);

    String updateFeesofCourse(Course course);

    String deleteACourse(Course course);

    Course totalDetailofCourse(String courseName)throws CourseException;

    String createBatch(Batch batch);

    String registerStudent(Student student);
}
