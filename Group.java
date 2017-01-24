import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Greg on 24.01.2017.
 */
public class Group {
   private final ArrayList<Student> students = new ArrayList<>();
   private int count = 0;

    public Group() {
    }
    public void addStudent(Student s){
        try {
            if(count<10) {
                this.students.add(s);
                count++;
            }else
                throw new OutOfListException();
        }catch (OutOfListException e){
            System.out.println("Sorry, but group is full...");
        }
    }
    public Student search(String lastName){
        for (Student s : students) {
            if(s.getLastName().equals(lastName))
                return s;
        }
        return null;
    }
    private void sort(){

        Collections.sort(this.students, new Comparator<Student>() {
            public int compare(Student o1, Student o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
    }

    @Override
    public String toString() {
        sort();
        StringBuilder sb = new StringBuilder();
        sb.append("Group{");
        sb.append(System.lineSeparator());
        for (Student s: students) {

            sb.append(s.toString());
            sb.append(System.lineSeparator());
        }
        sb.append(System.lineSeparator());
        sb.append("}");
        return sb.toString();

    }

    public void delete(String lastName){
        Student s = search(lastName);
        if(s!=null)
            students.remove(s);
    }
}
