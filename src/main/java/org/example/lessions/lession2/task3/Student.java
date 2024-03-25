package org.example.lessions.lession2.task3;

public class Student {
    private static String firstName;
    private static String lastName;
    private static int group;
    private static Course[] coursesTaken;
    private static int age;
    public static void construct(String firstNameSet, String lastNameSet, int groupSet){
        firstName = firstNameSet;
        lastName = lastNameSet;
        group = groupSet;
    }
    public static void construct(String lastNameSet, Course[] coursesTakenSet) {
        lastName = lastNameSet;
        coursesTaken = coursesTakenSet;
    }
    //Setters
    public static void setFirstName(String firstName) {
        Student.firstName = firstName;
    }

    public static void setLastName(String lastName) {
        Student.lastName = lastName;
    }

    public static void setGroup(int group) {
        Student.group = group;
    }

    public static void setCoursesTaken(Course[] coursesTaken) {
        Student.coursesTaken = coursesTaken;
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
