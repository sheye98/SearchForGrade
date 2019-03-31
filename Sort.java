package SearchForGrade;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

import static SearchForGrade.Initscore.*;

public class Sort{

    public static void sort(String parameter){
        int index =-1;
        for (int i=0;i<courses.length;i++){
            if (parameter.equalsIgnoreCase(courses[i])){
                index = i;
        }
    }
    if (index != -1){
            Student student1 = new Student(students[0],scores[0][index]);
            Student student2 = new Student(students[1],scores[1][index]);
            Student student3 = new Student(students[2],scores[2][index]);
            Student student4 = new Student(students[3],scores[3][index]);
            Student student5 = new Student(students[4],scores[4][index]);
            Student student6 = new Student(students[5],scores[5][index]);
            Student[] student = new Student[]{student1,student2,student3,student4,student5,student6};
            Arrays.sort(student);
            for (int n=0;n<students.length;n++){
                System.out.println(n+1+"\t\t"+student[n]);
            }
    }
    }
}

class Student implements Comparable<Student>{
    String name;
    Integer student_score;

    public Student(){

   }
    public Student(String name,Integer student_score) {
        this.name = name;
        this.student_score=student_score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudent_score() {
        return student_score;
    }

    public void setStudent_score(Integer student_score) {
        this.student_score = student_score;
    }

    @Override
    public int compareTo(Student o) {
        return o.student_score - this.student_score;
    }
    @Override
    public String toString(){
        return this.name+"\t\t"+this.student_score;
    }
}