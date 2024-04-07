package org.example.lessions.lession2.task3;

public class Student {

    private static String firstName;
    private static String lastName;
    private static int group;
    private static Course[] coursesTaken;
    private static int age;

    public void construct(String firstName, String lastName, int group){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public void construct(String lastName, Course[] coursesTake) {
        this.lastName = lastName;
        this.coursesTaken = coursesTaken;
    }
    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setCoursesTaken(Course[] coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public static void setAge(int age) {
        Student.age = age;
    }
    //Getters

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static Course[] getCoursesTaken() {
        return coursesTaken;
    }

    public static int getGroup() {
        return group;
    }
}
