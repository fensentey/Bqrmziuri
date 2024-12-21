package D15;

import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(1001, "Nika", "A");
        Student s2 = new Student(2234, "Mari", "B");
        Student s3 = new Student(4363, "Zura", "F");
        Student s4 = new Student(5844, "Diana", "C");
        Student s5 = new Student(5478, "Sandro", "B");

        Student[] students = {s1, s2, s3, s4, s5};

        FileOutputStream fileOutputStream = new FileOutputStream("students.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(students);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("students.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student[] deserializedStudents = (Student[]) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();

        Student highestGradedStudent = deserializedStudents[0];
        for (Student student : deserializedStudents) {
            if (student.grade.compareTo(highestGradedStudent.grade) < 0) {
                highestGradedStudent = student;
            }
        }

        System.out.println("Deserialized Students:");
        for (Student student : deserializedStudents) {
            System.out.println("ID: " + student.id + ", Name: " + student.name + ", Grade: " + student.grade);
        }
        System.out.println("\nStudent with the highest grade: ID: " + highestGradedStudent.id + ", Name: " + highestGradedStudent.name + ", Grade: " + highestGradedStudent.grade);
    }
}
