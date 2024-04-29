package week7;

import java.util.ArrayList;
import java.util.List;

public class ITECcourse {

    // we need data feilds

    private String name;
   private int code;

  private  List<String> students;
   private int MaxStudents;

    public ITECcourse(String coursename, int coursecode , int corusemaxstudents) {
        name = coursename;
        code = coursecode;
        MaxStudents = corusemaxstudents;

        students = new ArrayList<>();




    }


   public void addStudent(String studentName) {
        if(students.size()== MaxStudents) {
            System.out.println("Course is full, cant add" + studentName);

        } else {
            students.add(studentName);
        }


        students.add(studentName);


    }
  public  void writeCourseinfo() {
        System.out.println("Course Name : " + name);
        System.out.println("Course Code" + code);
        System.out.println("Students enrolled");
        for (String student : students) {
            System.out.println(student);

            }
        System.out.println("There are " + getNumberofStudents() + "Students enrolled");
        System.out.println("The max number of student that can enroll in the course is" + MaxStudents);

        }
    public     int getNumberofStudents() {
        return students.size();

        }
      public   void removestudents(String StudentName) {
        if(students.contains(StudentName)) {
            System.out.println( StudentName + " Was un-enrolled from " + name);

        }else {
            System.out.println(StudentName + "was not found" + name);
        }
        }// use this to remove students and see if code works and it did!!

    }

