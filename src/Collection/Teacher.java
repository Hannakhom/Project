package Collection;

import java.util.List;

public class Teacher {

    private String name;
    private String surName;
    private List<Student> students;
    private List<Student> forDeductions;

    public Teacher (){
    }

    public Teacher(String name, String surName, List<Student> students) {
        this.name = name;
        this.surName = surName;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getForDeductions() {
        return forDeductions;
    }

    public void setForDeductions(List<Student> forDeductions) {
        this.forDeductions = forDeductions;
    }

    public void printAllName(){
        for (int i = 0; i < students.size(); i++) {
            System.out.println("name is: " + students.get(i).getName());
            System.out.println("surName is: " + students.get(i).getSurName());
        }
    }

    public void studentSubject(String subject){
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j <students.get(i).getSubject().size() ; j++) {
                if (students.get(i).getSubject().toString().equals(subject)) {
                    System.out.println("name is: " + students.get(i).getName());
                }
            }
        }
    }
    public  void studentSubjectZachet(String zachet){
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j <students.get(i).getZachet().size(); j++) {
                if (students.get(i).getZachet().toString().equals(zachet)){
                    System.out.println("name is: " + students.get(i).getName());
                }
            }
        }
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", students=" + students +
                ", forDeductions=" + forDeductions +
                '}';
    }
}
