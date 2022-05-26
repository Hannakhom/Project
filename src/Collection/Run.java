package Collection;

import java.util.List;

public class Run {

    private static List<Integer> ratings1 = List.of(7,2,3,7,8,9,2,5);
    private static List<Integer> ratings2 = List.of(7,3,5,9,8,9,9,10);
    private static List<String> subjects = List.of("Math","Biology","English","Chemistry");
    private static List<String> exam1 = List.of("Biology");
    private static List<String> exam2 = List.of("Chemistry");
    private static List<String> zachet1 = List.of("Math","Biology","English");
    private static List<String> zachet2 = List.of("Math","Chemistry");


    public static void main(String[] args) {

        Student student1 = new Student("Vasya","Petrov","Alekseevich",20,2,ratings1,subjects,zachet1,exam1, true);
        Student student2 = new Student("Olya","Sidorova","Petrovna",21,2,ratings2,subjects,zachet2,exam2, false);
        Student student3 = new Student("Kolya","Ivanov","Ivanovna",20,3,ratings1,subjects,zachet1,exam2, true);
        Student student4 = new Student("Inna","Makarova","Alekseevna",19,1,ratings2,subjects,zachet1,exam1, false);

        Teacher teacher = new Teacher("Svetlana","Orlova",List.of(student1,student2,student3,student4));

        teacher.printAllName();

        teacher.studentSubject("Biology");
        teacher.studentSubjectZachet("Chemistry");
    }
}
