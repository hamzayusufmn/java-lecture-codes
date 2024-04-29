package week7;

public class itcoursemanger {
    public static void main(String[] args) {
        ITECcourse maintenanceCourse = new ITECcourse("Microcomputer System Maintenace", 1310, 20);

        // students
        maintenanceCourse.addStudent("Hamza");
        maintenanceCourse.addStudent("XING");
        maintenanceCourse.addStudent("Hafso");

        maintenanceCourse.removestudents("Carl");
        maintenanceCourse.removestudents("Martha");

        maintenanceCourse.writeCourseinfo();

        maintenanceCourse.writeCourseinfo();
        ITECcourse datacomCourse = new ITECcourse("data communication", 1425, 50);

        datacomCourse.addStudent("Ali");
        datacomCourse.addStudent("ISA");
        datacomCourse.addStudent("John");
        datacomCourse.writeCourseinfo();

        ITECcourse PythonCourse = new ITECcourse("Python", 2300, 50);
        PythonCourse.addStudent("Billy");
        PythonCourse.addStudent("Filly");
        PythonCourse.addStudent("Rose");

        int totalenrolled = PythonCourse.getNumberofStudents();
        System.out.println("this python class has" + totalenrolled + "Students");


        ITECcourse smallcourse = new ITECcourse("Made up", 1234,3);
        smallcourse.addStudent("fahad");
        smallcourse.addStudent("Mo");
        smallcourse.addStudent("sumaya");
        smallcourse.addStudent("OSman");

        smallcourse.writeCourseinfo();

// added python class with student names and the enrollment




        }


    }




