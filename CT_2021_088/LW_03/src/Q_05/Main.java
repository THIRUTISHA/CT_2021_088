package Q_05;

public class Main {
    public static void main(String[] args) {

        Lecturer kumar = new Lecturer();
        kumar.setCourseTeaching("Object oriented Programming");
        kumar.setLecturerName("kumar");

        Course oop = new Course();
        oop.setCourseName("Object oriented programming");
        oop.setCourseCode("CTEC 22043");
        oop.setLecturerInCharge(kumar);

        Student sanga = new Student();
        sanga.setCourseFollowing("Object oriented programming");
        sanga.setDegreeName("BICT");
        sanga.setStudentName("sanga");

        oop.setLecturerInCharge(kumar);
        System.out.println("Student Details:");
        System.out.println("Student Name:"  +sanga.getStudentName());
        System.out.println("Degree Name:"  +sanga.getDegreeName());
        System.out.println("Course Following:"  +sanga.getCourseFollowing());

        System.out.println("Lecturer Details:");
        System.out.println("Lecturer Name:"  +kumar.getLecturerName());
        System.out.println("Lecturer course Following:"  +kumar.getCourseTeaching());

        System.out.println("Course Details:");
        System.out.println("Course Name:"  +oop.getCourseName());
        System.out.println("Course Code:"  +oop.getCourseCode());


    }

}
