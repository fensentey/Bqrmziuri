package D15;
import java.io.Serializable;

class Student implements Serializable{
    int id;
    String name;
    String grade;

    public Student(int id, String name, String grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        //
    }
}

