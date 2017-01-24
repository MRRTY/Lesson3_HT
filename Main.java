import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Greg on 24.01.2017.
 */
public class Main {
    public static void main(String args[]){
        Student s1 = new Student("Ленс","Лекс",19,76.3,true,1,"cyb","KNU",4.4);
        Student s2 = new Student("Хенс","Рекс",29,73.3,true,2,"cyb","KNU",4.4);
        Student s3 = new Student("Сенс","Мекс",14,72.3,true,3,"cyb","KNU",4.4);
        Student s4 = new Student("Менс","Декс",17,71.3,true,4,"cyb","KNU",4.4);
        Student s5 = new Student("Денс","Кекс",18,73.3,true,5,"cyb","KNU",4.4);
        Student s6 = new Student("Ченс","Некс",13,77.3,true,6,"cyb","KNU",4.4);
        Student s7 = new Student("Женс","Чекс",12,75.3,true,7,"cyb","KNU",4.4);
        Student s8 = new Student("Йенс","Фекс",15,74.3,true,8,"cyb","KNU",4.4);
        Student s9 = new Student("Кенс","Жекс",16,76.3,true,9,"cyb","KNU",4.4);
        Student s10 = new Student("Ненс","Уекс",17,79.3,true,10,"cyb","KNU",4.4);
        Student s11 = new Student("Венс","Йекс",15,74.3,true,11,"cyb","KNU",4.4);
        Student s12 = new Student("Фенс","Хекс",29,72.3,true,12,"cyb","KNU",4.4);
        Group a = new Group();
        a.addStudent(s1);
        a.addStudent(s2);
        a.addStudent(s3);
        a.addStudent(s4);
        a.addStudent(s5);
        a.addStudent(s6);
        a.addStudent(s7);
        a.addStudent(s8);
        a.addStudent(s9);
        a.addStudent(s10);
        a.addStudent(s11);
        a.addStudent(s12);
        System.out.println(a.toString());


    }

}
