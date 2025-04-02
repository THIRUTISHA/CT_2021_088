package Q_05;

public class Course {
    //data members
    private String courseName;
    private String courseCode;
    private Lecturer lecturerInCharge;

    //getter method courseName
    public String getCourseName() {
        return courseName;
    }

    //setter method courseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //getter method courseCode
    public String getCourseCode() {
        return courseCode;
    }

    //setter method courseCode
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    //getter method lecturerInCharge
    public Lecturer getLecturerInCharge() {
        return lecturerInCharge;
    }

    //setter method lecturerInCharge
    public void setLecturerInCharge(Lecturer lecturerInCharge) {
        this.lecturerInCharge = lecturerInCharge;
    }
}
