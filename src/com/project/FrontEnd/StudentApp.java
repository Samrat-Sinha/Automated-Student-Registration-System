package com.project.FrontEnd;

import com.project.Beam.Course;
import com.project.Dao.App_Dao;
import com.project.Dao.App_DeoImpl;
import com.project.Exception.CourseException;

import java.util.Scanner;

public class StudentApp {

    public static void selectoption() {

        App_Dao adao = new App_DeoImpl();

        try {
            System.out.println("Please select an option to continue ");
            System.out.println("\n1. Continue as Administrator ");
            System.out.println("\n2. Continue as Student");
            System.out.println("\n3. Exit from the App");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            int user = sc.nextInt();

            switch (user) {
                case 1:
                    while (true) {
                        System.out.println("                        ***** Welcome As Administrator *****                       ");
                        System.out.println();
                        System.out.println("\n1. Add a new Course");
                        System.out.println("\n2. Update Fees of course");
                        System.out.println("\n3. Delete  a course from any Training session.");
                        System.out.println("\n4. Search information about a course.");
                        System.out.println("\n5. Create Batch under a course.");
                        System.out.println("\n6. Allocate students in a Batch under a course.");
                        System.out.println("\n7. Update total seats of a batch.");
                        System.out.println("\n8. Update total seats of a batch.");
                        System.out.println("\n9. Exit as Administrator");
                        System.out.println();

                        int choice = sc.nextInt();
                        if (choice == 1) {

                            System.out.println("Enter Course Name");
                            String cname = sc.next();


                            System.out.println("Enter Course Teacher");
                            String cteach = sc.next();

                            System.out.println("Enter Course Fees");
                            int cfee = sc.nextInt();

                            Course course = new Course();

                            course.setCourseName(cname);
                            course.setCourseTeacher(cteach);
                            course.setCourseFees(cfee);

                            String result = adao.registerCourse(course);
                            System.out.println();
                            System.out.println(result);
                            System.out.println();
                            System.out.println("==============================================================================================================");
                        }
                        if (choice == 2) {

                            System.out.println("Enter Updated Course Fees");
                            int upfees = sc.nextInt();

                            System.out.println("Enter Course Name");
                            String cname = sc.next();

                            Course course = new Course();

                            course.setCourseFees(upfees);
                            course.setCourseName(cname);

                            String result = adao.updateFeesofCourse(course);
                            System.out.println();
                            System.out.println(result);
                            System.out.println();
                            System.out.println("==============================================================================================================");
                        }
                        if (choice == 3) {
                            System.out.println("Enter Course Name");
                            String cname = sc.next();

                            Course course = new Course();

                            course.setCourseName(cname);

                            String result = adao.deleteACourse(course);
                            System.out.println();
                            System.out.println(result);
                            System.out.println();
                            System.out.println("==============================================================================================================");
                        }
                        if (choice == 4) {

                            System.out.println("Enter Course Name");
                            String cname = sc.next();

                            try {
                                Course course = adao.totalDetailofCourse(cname);
                                System.out.println();
                                System.out.println("Course ID      - " + course.getCourseId());
                                System.out.println("Course Name    - " + course.getCourseName());
                                System.out.println("Course Teacher - " + course.getCourseTeacher());
                                System.out.println("Course Fees    - " + course.getCourseFees());
                                System.out.println();
                                System.out.println("==============================================================================================================");
                            } catch (CourseException ce) {
                                System.out.println(ce.getMessage());
                            }
                        }
                        if (choice == 5) {


                        }
                        if (choice == 6) {

                        }
                        if (choice == 7) {

                        }
                        if (choice == 8) {

                        }
                        if (choice == 9) {
                            break;
                        }
                    }
                    StudentApp.selectoption();
                        case 2:
                            System.out.println("                        ***** Welcome As Student *****                       ");
                            System.out.println();
                            System.out.println("\n1. Register himself in a course with a username and password (email should be the username)");
                            System.out.println("\n2. Login as Student");
                            System.out.println("\n3. Can see all the available course list and their seat availability.");
                            System.out.println();

                case 3:
                            break;
                    }
    }
        catch (Exception e) {
            e.printStackTrace();
            StudentApp.selectoption();
        }
    }
}

