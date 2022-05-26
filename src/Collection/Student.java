package Collection;

import java.util.List;

public class Student {

    private String name;
    private String surName;
    private String middleName;
    private int age;
    private int course;
    private List<Integer> ratings;
    private List<String> subject;

    private List<String> zachet;
    private List<String> exam;
    private boolean isHomeWork;

    public Student(String name, String surName, String middleName, int age, int course, List<Integer> ratings, List<String> subject, List<String> zachet, List<String> exam, boolean isHomeWork) {
        this.name = name;
        this.surName = surName;
        this.middleName = middleName;
        this.age = age;
        this.course = course;
        this.ratings = ratings;
        this.subject = subject;
        this.zachet = zachet;
        this.exam = exam;
        this.isHomeWork = isHomeWork;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getRatings() {
        return ratings;
    }

    public void setRatings(List<Integer> ratings) {
        this.ratings = ratings;
    }

    public List<String> getSubject() {
        return subject;
    }

    public void setSubject(List<String> subject) {
        this.subject = subject;
    }

    public List<String> getExam() {
        return exam;
    }

    public void setExam(List<String> exam) {
        this.exam = exam;
    }

    public List<String> getZachet() {
        return zachet;
    }

    public void setZachet(List<String> zachet) {
        this.zachet = zachet;
    }

    public boolean isHomeWork() {
        return isHomeWork;
    }

    public void setHomeWork(boolean homeWork) {
        this.isHomeWork = homeWork;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", ratings=" + ratings +
                ", subject=" + subject +
                ", zachet=" + zachet +
                ", exam=" + exam +
                ", isHomeWork=" + isHomeWork +
                '}';
    }
}
