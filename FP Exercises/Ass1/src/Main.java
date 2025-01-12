import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static Student createStudent(String name, int indexNo, int age){
        return new Student(name, indexNo, age);
    }

    public static void printValues(Student s){
        System.out.println("Student name: " + s.getName());
        System.out.println("Index number: " + s.getIndexNo());
        System.out.println("Age: " + s.getAge());
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> nameList = Arrays.asList("Goki", "Smoki", "Njoki", "Ploki", "Bobimoki");
        Random random = new Random();

        nameList.stream().map(name -> createStudent(name, (random.nextInt(10000 - 1) + 1), (random.nextInt(12) + 18))).forEach(student -> printValues(student));

        List<Student> students = nameList.stream().map(name -> createStudent(name, (random.nextInt(10000 - 1) + 1), (random.nextInt(12) + 18))).collect(Collectors.toList());
        List<Student> studentResult = students.stream().filter(student -> student.getName().startsWith("P")).collect(Collectors.toList());

        System.out.println("Print all students with name that starts with P:");
        studentResult.stream().forEach(student -> printValues(student));

        System.out.println("Check if all students have age less than 25: " + students.stream().allMatch(student -> student.getAge() < 25));
        System.out.println("Check if all students have age more than 25: " + students.stream().allMatch(student -> student.getAge() > 25));

    }
}