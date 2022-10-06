package com.project.Beam;

public class Course {

    private String courseId;
    private String courseName;
    private String courseTeacher;
    private int courseFees;



    public Course() {
    }

    public Course(String courseId, String courseName, String courseTeacher, int courseFees) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseTeacher = courseTeacher;
        this.courseFees = courseFees;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public int getCourseFees() {
        return courseFees;
    }

    public void setCourseFees(int courseFees) {
        this.courseFees = courseFees;
    }
}
