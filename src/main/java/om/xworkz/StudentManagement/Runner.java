package om.xworkz.StudentManagement;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Student student1 = new Student(1, "Tarun", 95);
        Student student2= new Student(2, "Rahul", 90);
        Student student3= new Student(3,"Harish", 76);
        Student student4 = new Student(4, "vinod", 99);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        System.out.println("--Display all student details using a for-each loop--");
        for (Student stu : studentList) {
            System.out.println(stu);
        }

        System.out.println();
        System.out.println("--Display only the students whose percentage is greater than 75-- ");
        studentList.stream().filter(r->r.getPercentage()>75).forEach(System.out::println);

        System.out.println();
        System.out.println("--Display only the student names-- ");
        studentList.stream().map(r->r.getName()).forEach(System.out::println);

        System.out.println();
        System.out.println("--Count the total number of students--");
        long s=studentList.stream().count();
        System.out.println(s);

        System.out.println();
        System.out.println("--Display the student with the highest percentage--");
        studentList.stream().max((r1, r2)->r1.getPercentage()-r2.getPercentage()).ifPresent(r-> System.out.println(r));

        System.out.println();
        System.out.println("--Display the student with the lowest percentage--");
        studentList.stream().min((r1, r2)->r1.getPercentage()-r2.getPercentage()).ifPresent(r-> System.out.println(r));

        System.out.println();
        System.out.println("Calculate the average percentage of all students--");
        studentList.stream().mapToInt(r->r.getPercentage()).forEach(System.out::println);

        System.out.println();
        System.out.println("-.Sort the students by percentage in ascending order--");
        studentList.stream().sorted((r1, r2)->r1.getPercentage()-r2.getPercentage()).forEach(System.out::println);

        System.out.println();
        System.out.println("--Sort the students by name in alphabetical order--");
        studentList.stream().sorted((r1, r2)->r1.getName().compareTo(r2.getName())).forEach(System.out::println);

        System.out.println();
        System.out.println("--Collect the names of all students into a List<String>--");
        List<Student> l=studentList.stream().collect(Collectors.toList());
        l.forEach(System.out::println);

        System.out.println();
        System.out.println("--Check whether any student has scored more than 90%--");
        studentList.stream().filter(r->r.getPercentage()==90).forEach(System.out::println);

        System.out.println();
        System.out.println("--Check whether all students have scored above 35%--");
        studentList.stream().filter(r->r.getPercentage()==35).forEach(System.out::println);

        System.out.println();
        System.out.println("--Display the first student after sorting by percentage--");
        Student s1=studentList.stream().sorted((r1, r2)->r1.getPercentage()-r2.getPercentage()).findFirst().get();
        System.out.println(s1);








    }
}
