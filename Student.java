/**
 * Created by Greg on 24.01.2017.
 */
public class Student extends Human {
    private int index;
    private String faculty;
    private String university;
    private double averMark;

    public Student(String firstName, String lastName, int age, double weight, boolean sex, int index,  String faculty, String university, double averMark) {
        super(firstName, lastName, age, weight, sex);
        this.index = index;
        this.faculty = faculty;
        this.university = university;
        this.averMark = averMark;
    }

    private Student() {
        super();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }



    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getAverMark() {
        return averMark;
    }

    public void setAverMark(double averMark) {
        this.averMark = averMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "index=" + index +
                ", faculty='" + faculty + '\'' +
                ", university='" + university + '\'' +
                ", averMark=" + averMark +
                '}'+ super.toString()
                ;
    }
}
